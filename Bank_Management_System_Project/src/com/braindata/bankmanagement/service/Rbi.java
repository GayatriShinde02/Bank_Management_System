package com.braindata.bankmanagement.service;

import com.braindata.bankmanagement.serviceImpl.AadharnoInvalidException;
import com.braindata.bankmanagement.serviceImpl.AccountInvalidException;
import com.braindata.bankmanagement.serviceImpl.AgeInvalidException;
import com.braindata.bankmanagement.serviceImpl.BalanceInvalidException;
import com.braindata.bankmanagement.serviceImpl.GenderInvalidException;
import com.braindata.bankmanagement.serviceImpl.MobileInvalidException;

public interface Rbi 
{
 public void createAccount();
 public void displayAllDetails();
 public void depositeMoney();
 public void withdrawal();
 public void balanceCheck();
}
