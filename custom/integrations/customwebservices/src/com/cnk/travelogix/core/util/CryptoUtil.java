package com.cnk.travelogix.core.util;

import de.hybris.platform.servicelayer.config.ConfigurationService;

import java.io.UnsupportedEncodingException;
//EXCEPTIONS
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
//KEY SPECIFICATIONS
import java.security.spec.KeySpec;
import java.util.Base64;

import javax.annotation.PostConstruct;
import javax.crypto.BadPaddingException;
//CIPHER / GENERATORS
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * -----------------------------------------------------------------------------
 * The following class is used for encrypting and decrypting password strings
 * using MD5DES Cipher algorithms. The class is created with a key and can be
 * used repeatedly to encrypt and decrypt strings using that key.
 * 
 * @version 1.0
 */

public class CryptoUtil {

    private static final Logger LOG = LoggerFactory.getLogger(CryptoUtil.class);

    private  Cipher ecipher;
    private  Cipher dcipher;
    private static final String PASS_PHRASE_KEY = "passphrase.key";

    @Autowired
    private ConfigurationService configurationService;

    /**
     * Init method used to create this object. Responsible for setting and
     * initializing this object's encrypter and decrypter Chipher instances
     * given a Pass Phrase and algorithm.
     * 
     */
    @PostConstruct
    public void init() {

	// 8-bytes Salt
	byte[] salt = { (byte) 0xA9, (byte) 0x9B, (byte) 0xC8, (byte) 0x32, (byte) 0x56, (byte) 0x34, (byte) 0xE3, (byte) 0x03 };

	// Iteration count
	int iterationCount = 19;

	try {
	    final String passPhraseValue = configurationService.getConfiguration().getString(PASS_PHRASE_KEY);
	    KeySpec keySpec = new PBEKeySpec(passPhraseValue.toCharArray(), salt, iterationCount);
	    SecretKey key = SecretKeyFactory.getInstance("PBEWithMD5AndDES").generateSecret(keySpec);

	    ecipher = Cipher.getInstance(key.getAlgorithm());
	    dcipher = Cipher.getInstance(key.getAlgorithm());

	    // Prepare the parameters to the cipthers
	    AlgorithmParameterSpec paramSpec = new PBEParameterSpec(salt, iterationCount);

	    ecipher.init(Cipher.ENCRYPT_MODE, key, paramSpec);
	    dcipher.init(Cipher.DECRYPT_MODE, key, paramSpec);

	} catch (InvalidAlgorithmParameterException e) {
	    LOG.warn("EXCEPTION: InvalidAlgorithmParameterException",e);
	} catch (InvalidKeySpecException e) {
	    LOG.warn("EXCEPTION: InvalidKeySpecException",e);
	} catch (NoSuchPaddingException e) {
	    LOG.warn("EXCEPTION: NoSuchPaddingException",e);
	} catch (NoSuchAlgorithmException e) {
	    LOG.warn("EXCEPTION: NoSuchAlgorithmException",e);
	} catch (InvalidKeyException e) {
	    LOG.warn("EXCEPTION: InvalidKeyException",e);
	}
    }

    /**
     * Takes a single String as an argument and returns an Encrypted version of
     * that String.
     * 
     * @param str
     *            String to be encrypted
     * @return <code>String</code> Encrypted version of the provided String
     */
    public String encrypt(String str) {
	try {
	    // Encode the string into bytes using utf-8
	    byte[] utf8 = str.getBytes("UTF8");

	    // Encrypt
	    byte[] enc = ecipher.doFinal(utf8);

	    // Encode bytes to base64 to get a string
	    final String encodedString = new String(Base64.getEncoder().encode(enc));

	    return encodedString;
	} catch (BadPaddingException e) {
	    LOG.warn("EXCEPTION: BadPaddingException",e);
	} catch (IllegalBlockSizeException e) {
	    LOG.warn("EXCEPTION: IllegalBlockSizeException",e);
	} catch (UnsupportedEncodingException e) {
	    LOG.warn("EXCEPTION: UnsupportedEncodingException",e);
	}
	return null;
    }

    /**
     * Takes a encrypted String as an argument, decrypts and returns the
     * decrypted String.
     * 
     * @param str
     *            Encrypted String to be decrypted
     * @return <code>String</code> Decrypted version of the provided String
     */
    public String decrypt(String str) {

	try {

	    // Decode base64 to get bytes
	    byte[] dec = Base64.getDecoder().decode(str);

	    // Decrypt
	    byte[] utf8 = dcipher.doFinal(dec);

	    // Decode using utf-8
	    return new String(utf8, "UTF8");

	} catch (BadPaddingException e) {
	    LOG.warn("EXCEPTION: BadPaddingException",e);
	} catch (IllegalBlockSizeException e) {
	    LOG.warn("EXCEPTION: IllegalBlockSizeException",e);
	} catch (UnsupportedEncodingException e) {
	    LOG.warn("EXCEPTION: UnsupportedEncodingException",e);
	}
	return null;
    }
}
