package service;

import java.util.Scanner;
import service.otpgenrator;
public class banking {
	 OTPGenrator otpGenerator=new OTPGenrator();
	int bankbalance=1000;
	Scanner sc=new Scanner(System.in);
	
    public void deposite() {
    	System.out.println(" Enter the amount you want deposite");
    	int amount;
    	amount=sc.nextInt();
    	if (amount>0)
    	{
    	bankbalance=bankbalance+amount;
    	
    	System.out.println("Amount:"+amount+"is deposited to you account");
    	System.out.println(" Total Balance is:"+bankbalance+"");
    	}else {
    		System.out.println("Enter the correct amount");
    	
    }
}

public void  withdrawl() {
	System.out.println(" Enter the amount you want withdrwal");
	int amount;
	amount=sc.nextInt();
	if (amount<bankbalance)
	{
	bankbalance=bankbalance-amount;
	
	System.out.println("Amount:"+amount+"is withdrwal to you account");
	System.out.println(" Total Balance is:"+bankbalance+"");
	}else {
		System.out.println("Enter the correct amount");
	}
}
public void transfer() {
	int amount;
	int bankAccount;
	int genratedOTP;
	genratedOTP=otpGenerator.genrateOTP();
System.out.println(genratedOTP);
System.out.println("enter the otp");
int otp;
otp=sc.nextInt();
if(otp==genratedOTP) {
	System.out.println("otp verified succesfully");
	System.out.println("Enter the  amount and bankAcount no to tranfer amount");
	amount=sc.nextInt();
	bankAccount=sc.nextInt();
	if (amount<bankbalance)
	{
	bankbalance=bankbalance-amount;
	
	System.out.println("Amount:"+amount+"is transfer to you account");
	System.out.println(" remaning Balance is:"+bankbalance+"");
	}else {
		System.out.println("Insufficent amount");
	}
}
else {
	System.out.println("Invalid otp");
}
}
}

