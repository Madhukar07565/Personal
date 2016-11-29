package com.cnk.travelogix.common.core.util;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Hex;
import org.apache.commons.codec.digest.DigestUtils;


public class HashUtil
{
	/**
	 * 与php中的hash_hmac('sha512', $data, $key)功能相同
	 *
	 * @param data
	 * @param key
	 * @return hash value
	 */
	private static String hmac(final String data, final String key, final String algorithm)
	{
		String result = "";
		final byte[] bytesKey = key.getBytes();
		final SecretKeySpec secretKey = new SecretKeySpec(bytesKey, algorithm);
		try
		{
			final Mac mac = Mac.getInstance(algorithm);
			mac.init(secretKey);
			final byte[] macData = mac.doFinal(data.getBytes());
			final byte[] hex = new Hex().encode(macData);
			result = new String(hex, "ISO-8859-1");
		}
		catch (final Exception e)
		{
			throw new RuntimeException(e);
		}
		return result;
	}

	public static String hmacMD5(final String data, final String key)
	{
		return hmac(data, key, "HmacMD5");
	}

	public static String hmacSHA256(final String data, final String key)
	{
		return hmac(data, key, "HmacSHA256");
	}

	public static void main(final String[] args)
	{
		final String s = hmacMD5("Hello World", "Welcome");
		System.out.println(s);
	}

	public static String md5(final String data)
	{
		return DigestUtils.md5Hex(data);
	}
}
