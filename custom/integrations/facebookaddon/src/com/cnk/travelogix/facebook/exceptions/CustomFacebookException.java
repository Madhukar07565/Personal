package com.cnk.travelogix.facebook.exceptions;

/**
 * Custom Facebook Exception
 */
public class CustomFacebookException extends RuntimeException
{

	public CustomFacebookException()
	{
		super();
	}

	public CustomFacebookException(final String message)
	{
		super(message);
	}

	public CustomFacebookException(final String s, final Throwable throwable)
	{
		super(s, throwable);
	}

	public CustomFacebookException(final Throwable throwable)
	{
		super(throwable);
	}
}
