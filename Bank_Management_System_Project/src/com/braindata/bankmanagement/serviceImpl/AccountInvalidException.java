package com.braindata.bankmanagement.serviceImpl;

public class AccountInvalidException extends RuntimeException
{
public AccountInvalidException(String msg) 
{
	super(msg);
}
}
