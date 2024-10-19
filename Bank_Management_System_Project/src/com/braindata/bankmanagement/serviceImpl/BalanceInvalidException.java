package com.braindata.bankmanagement.serviceImpl;

public class BalanceInvalidException extends RuntimeException
{
  public BalanceInvalidException(String s)
  {
	  super(s);
  }
}
