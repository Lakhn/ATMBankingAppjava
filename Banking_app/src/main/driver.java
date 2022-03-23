package main;

import java.util.Scanner;


import model.custmor;
import service.banking;

public class driver {
	public static void main(String[] args) {
		banking banking1=new banking();
		
		
		
		
		
		
		
       System.out.println("welcome to our bank login page");
		System.out.println("");
       System.out.println("Enter the bank account no");
		Scanner sc=new Scanner(System.in);
		
		String bankacccount;
		bankacccount=sc.nextLine();
		
		System.out.println("Enter the bank pasword");
		
		String pasword;
		pasword=sc.nextLine();
		
		custmor custmor1=new custmor("Hdfc001","greatlearn");
		if(custmor1.getBankacccount().equals(bankacccount) && custmor1.getPasword().equals(pasword)) {
			System.out.println("welcome to HDFFC Bank");
	    int option;
		do {
				System.out.println("");
				System.out.println("_ _ _ _ _ _ _ _ _ _");
				System.out.println("enter the operation you want to perform");
				System.out.println("1.Deposite");
				System.out.println("2.Withdrawl");
				System.out.println("3.Transfer");
				System.out.println("4.Logout");
				System.out.println("_ _ _ _ _ _ _ _ _ _");
				
				option=sc.nextInt();
				switch(option){
				case 1:
					System.out.println("performing deposite option");
					banking1.deposite();
					 break;
				case 2:
					System.out.println("performing  Withdrwal");
					banking1.withdrawl();
					 break;
				case 3:
					System.out.println("performing  Transfer");
					banking1.transfer();
					 break;
				case 4:
					System.out.println("performing Logout");
				   break;
				default:
					System.out.println("enter valid option");
				}
		}while(option!=4);
	    }else {
	    	System.out.println("Enter correct user id or pasword");
	    }
		
		
		System.out.println("Exiting application");
		sc.close();
		
	}
	}
