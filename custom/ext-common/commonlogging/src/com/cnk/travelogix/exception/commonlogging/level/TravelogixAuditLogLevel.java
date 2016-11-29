package com.cnk.travelogix.exception.commonlogging.level;

import org.apache.log4j.Level;


/**
 * The Class TravelogixAuditLogLevel.
 */
public class TravelogixAuditLogLevel extends Level
{

	/**
	 * Value of security level. This value is slightly higher than {@link org.apache.log4j.Priority#INFO_INT}.
	 */
	public static final int AUDIT_LEVEL_INT = Level.INFO_INT + 10;

	/** {@link Level} representing my log level. */
	public static final Level AUDIT = new TravelogixAuditLogLevel(AUDIT_LEVEL_INT, "AUDIT", 7);

	/** The Constant AUDIT_MSG. */
	private static final String AUDIT_MSG = "AUDIT";


	/**
	 * Instantiates a new corona audit log level.
	 *
	 * @param level
	 *           the level
	 * @param levelStr
	 *           the level str
	 * @param syslogEquivalent
	 *           the syslog equivalent
	 */
	protected TravelogixAuditLogLevel(final int level, final String levelStr, final int syslogEquivalent)
	{
		super(level, levelStr, syslogEquivalent);
		// TODO Auto-generated constructor stub
	}


	/**
	 * Checks whether <code>sArg</code> is "SECURITY" level. If yes then returns {@link SecurityLevel#SECURITY}, else
	 * calls {@link SecurityLevel#toLevel(String, Level)} passing it {@link Level#DEBUG} as the defaultLevel
	 *
	 * @param sArg
	 *           the s arg
	 * @return the level
	 * @see Level#toLevel(java.lang.String)
	 * @see Level#toLevel(java.lang.String, org.apache.log4j.Level)
	 */
	public static Level toLevel(final String sArg)
	{
		if (sArg != null && sArg.equalsIgnoreCase(AUDIT_MSG))
		{
			return AUDIT;
		}
		return toLevel(sArg, Level.DEBUG);
	}

	/**
	 * Checks whether <code>val</code> is {@link SecurityLevel#SECURITY_LEVEL_INT}. If yes then returns
	 * {@link SecurityLevel#SECURITY}, else calls {@link SecurityLevel#toLevel(int, Level)} passing it
	 * {@link Level#DEBUG} as the defaultLevel
	 *
	 * @param val
	 *           the val
	 * @return the level
	 * @see Level#toLevel(int)
	 * @see Level#toLevel(int, org.apache.log4j.Level)
	 */
	public static Level toLevel(final int val)
	{
		if (val == AUDIT_LEVEL_INT)
		{
			return AUDIT;
		}
		return toLevel(val, Level.DEBUG);
	}

	/**
	 * Checks whether <code>val</code> is {@link SecurityLevel#SECURITY_LEVEL_INT}. If yes then returns
	 * {@link SecurityLevel#SECURITY}, else calls {@link Level#toLevel(int, org.apache.log4j.Level)}
	 *
	 * @param val
	 *           the val
	 * @param defaultLevel
	 *           the default level
	 * @return the level
	 * @see Level#toLevel(int, org.apache.log4j.Level)
	 */
	public static Level toLevel(final int val, final Level defaultLevel)
	{
		if (val == AUDIT_LEVEL_INT)
		{
			return AUDIT;
		}
		return Level.toLevel(val, defaultLevel);
	}

	/**
	 * Checks whether <code>sArg</code> is "SECURITY" level. If yes then returns {@link SecurityLevel#SECURITY}, else
	 * calls {@link Level#toLevel(java.lang.String, org.apache.log4j.Level)}
	 *
	 * @param sArg
	 *           the s arg
	 * @param defaultLevel
	 *           the default level
	 * @return the level
	 * @see Level#toLevel(java.lang.String, org.apache.log4j.Level)
	 */
	public static Level toLevel(final String sArg, final Level defaultLevel)
	{
		if (sArg != null && sArg.equalsIgnoreCase(AUDIT_MSG))
		{
			return AUDIT;
		}
		return Level.toLevel(sArg, defaultLevel);
	}


}
