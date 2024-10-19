package com.braindata.bankmanagement.client;
import java.util.Scanner;
import com.braindata.bankmanagement.service.*;
import com.braindata.bankmanagement.serviceImpl.*;
//using switch case
public class Test1 {

	public static void main(String[] args) {
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
				  switch(ch)
				  {
					  case 1:
						  s.createAccount();
						  break;
					  case 2:
						  s.displayAllDetails();
						  break;
					  case 3:
						  s.depositeMoney();	
						  break;
					  case 4:
						  s.withdrawal();	
						  break;
					  case 5:
						  s.balanceCheck();	
						  break;
					   default:
						   System.out.println("Invalid choice");
						   System.exit(0);
						  
						  
				  }
				 }
		}
	}
}
				