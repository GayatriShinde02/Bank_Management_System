package com.braindata.bankmanagement.client;
import com.braindata.bankmanagement.service.*;
import com.braindata.bankmanagement.serviceImpl.*;
import java.util.*;
//using if else 
public class Test 
{
  public static void main(String args[]) throws MobileInvalidException,AccountInvalidException,AadharnoInvalidException,AgeInvalidException,BalanceInvalidException
  {
	 
	  Scanner sc=new Scanner(System.in);
	  Rbi s=new Sbi();
	  while(true)
	  {
		System.out.println("------select----- \n" 
	     + "1.createAccount \n" 
	     + "2.displayAllDetails \n" 
	     + "3.depositeMoney \n"
	     + "4.withdrawal \n"
	     + "5.balanceCheck \n"
	     + "6.exit");  
		System.out.println("Enter a choice:");
		  int ch=sc.nextInt();
	/*  if(ch==1)
	  {
		  s.createAccount();
	  }*/
		  try
		  {
			  if(ch==1)
			  {
				  s.createAccount();
			  }
			  
		  }
		  catch(AccountInvalidException e)
		  {
			  System.out.println(e);
		  }
		  catch(MobileInvalidException e)
		  {
			  System.out.println(e);
		  }
	      catch(AadharnoInvalidException e)
		  {
	    	  System.out.println(e);
		  }
		  catch(GenderInvalidException e)
		  {
			  System.out.println(e);
		  }
          catch(AgeInvalidException e)
		  {
        	  System.out.println(e);
		  }
		  catch(BalanceInvalidException e)
		  {
			  System.out.println(e);
		  }  

	  if(ch==2)
	  {
		  s.displayAllDetails();
	  }
	  else if(ch==3)
	  {
		 s.depositeMoney();	  
	  }
	  else if(ch==4)
	  {
		  s.withdrawal();
	  }
	  else if(ch==5)
	  {
		  s.balanceCheck();
	  }
	  else if(ch==6)
	  {
		  break;
	  }
	  else
	  {
		  System.out.println("Wrong choice");
	  }
   }
  }
}
  
