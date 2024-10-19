package com.braindata.bankmanagement.serviceImpl;
import com.braindata.bankmanagement.model.Account;
import com.braindata.bankmanagement.service.*;
import java.util.Scanner;
public class Sbi implements Rbi
{
	Scanner sc=new Scanner(System.in);
	Account ac=new Account();
  public void createAccount() 
  {
	  while(true)
	  {
		  System.out.println("Enter Account no:");
		  //ac.setAccno(sc.nextLong()); 
		  long accno=sc.nextLong();
		  int count=0;
		  long acc=accno;
		  for(long i=acc;i>0;i=i/10)
		  {
			  count++;
		  }
		  if(count==12)
			  
		  {
			  ac.setAccno(acc);
			  break;
		  }
		  else
		  {
			  throw new AccountInvalidException("Enter valid account no");
			 // System.out.println("Enter valid account no");
		  }
	  }
	  
	  System.out.println("Enter Name:");
	  ac.setName(sc.next());
	  while(true)
	  {
		  System.out.println("Enter Mobno:");
		  //ac.setMobno(sc.next());
		  String mobno=sc.next();
		  long mobile=Long.parseLong(mobno);
		  int count=0;
		  long no1=mobile;
		  for(long i=mobile;i>0;i=i/10)
		  {
			  count++;
		  }
		  if(count==10)
		  {
			  ac.setMobno(mobno);
			  break;
		  }
		  else
		  {
			  throw new MobileInvalidException("Enter valid Mobilno");
			  //System.out.println("Enter valid mobileno");
		  }
	  }
	  
	  while(true)
	  {
	  System.out.println("Enter adharno:");
	  //ac.setAdharno(sc.next());
	  String adharno=sc.next();
	  long adharmo=Long.parseLong(adharno);
	  int count=0;
	  long no=adharmo;
	  for(long i=adharmo;i>0;i=i/10)
	  {
		  count++;
	  }
	  if(count==12)
	  {
		  ac.setAdharno(adharno);
		  break;
	  }
	  else
	  {
		  throw new AadharnoInvalidException("Enter valid aadhar number");
		  //System.out.println("Enter valid adharno number");
	  }
	  }
	 while(true)
	  {
	  System.out.println("Enter gender:");
	  //ac.setGender(sc.next());
	  String gender=sc.next();
	  if(gender.equals("female")|| gender.equals("male")||gender.equals("M") || gender.equals("F") || gender.equals("m") || gender.equals("f") ||gender.equals("MALE") ||gender.equals("FEMALE"))
	  {
		  ac.setGender(gender);
		  break;
	  } 
	  else
	  {
		  throw new GenderInvalidException("Enter valid Gender");
		  //System.out.println("Enter valid gender");
		
	  }
	  }
	  while(true)
	  {
	  System.out.println("Enter age:");
	  //ac.setAge(sc.nextInt());
	  int age=sc.nextInt();
	  if(age>18)
	  {
		 ac.setAge(age); 
		  break;
	  }
	  else
	  {
		  throw new AgeInvalidException("Age is not valid for create account");
		  //System.out.println("Age is not valid for create account");
		  
	  }
	  }
	  while(true)
	  {
	  System.out.println("Enter Balance:");
	  //ac.setBalance(sc.nextDouble());
	  double balance=sc.nextDouble();
	  if(balance>=500)
	  {
		 ac.setBalance(balance); 
		  break;
		 
	  }
	  else
	  {
		  throw new BalanceInvalidException("Enter Balance above 500");
		  //System.out.println("Balance above 500");
		
	  }
	  }
	  
  }
  public void displayAllDetails()
  {
	  System.out.println("Accont No:"+ac.getAccno());
	  System.out.println("Accont Name:"+ac.getName());
	  System.out.println("Accont Mobno:"+ac.getMobno());
	  System.out.println("Accont Adharno:"+ac.getAdharno());
	  System.out.println("Accont Gender:"+ac.getGender());
	  System.out.println("Accont Age:"+ac.getAge());
	  System.out.println("Accont Balance:"+ac.getBalance());
	    
  }
  public void depositeMoney()
  {
	  
	  System.out.println("Enter deposite money:");
	  //double balance=sc.nextDouble();
	  double total=ac.getBalance()+sc.nextDouble();
	  ac.setBalance(total);
	  System.out.println("Current Total balance:"+total);
  }
  public void withdrawal()
  {
	  System.out.println("Enter withdraw Ammount :");
	  double rembalance=ac.getBalance()-sc.nextDouble();
	  ac.setBalance(rembalance);
	  System.out.println("Remaining balnace:"+rembalance);
  }
  public void balanceCheck()
  {
	  System.out.println("Balance :"+ac.getBalance());
  }
}
