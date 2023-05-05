package com.masai.Ui;

import java.util.Scanner;

import dao.InterfaceUSE;
import dao.userDb;
import dto.Address;
import dto.Signup;

public class Ui {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int c=0;
		do {
		System.out.println("1. Admin login");
		System.out.println("2. user login");
		System.out.println("3. user SignUp ");
		System.out.println("0. Exit ");
		System.out.println("Enter");
		c=sc.nextInt();
			switch(c) {
		case 1:
			adminLogin(sc);
			break;
		case 2:
			userLogin(sc);
			break;
		case 3:
			userSignUp(sc);
			break;
		case 4:
			System.out.println("Exit");
			break;
		}
		}while(c!=0);
		
	}

	private static void userSignUp(Scanner sc) {
		System.out.println("Enter first name");
		 String FirstNmae=sc.next();
		System.out.println("Enter last name");
		 String LastNmae=sc.next();
		 System.out.println("Enter Email");
		String email=sc.next();
		System.out.println("Enter Password");
		String password=sc.next();
		System.out.println("Please Enter your address");
		System.out.println();
		System.out.println("Enter houseNo");
		 String houseNo=sc.next() ;
			System.out.println("Enter city");
		 String city=sc.next() ;
			System.out.println("Enter state");
		 String state=sc.next() ;
			System.out.println("Enter pincode");
		 int pincode =sc.nextInt();
		 
		 Address a=new Address(houseNo,city,state,pincode);
		 
		Signup s=new Signup(FirstNmae,LastNmae,password,email,a);
		InterfaceUSE se=new userDb();
	boolean g=	se.addCustomer(s);
	if(g) {
		System.out.println("Done");
	}else {
		System.out.println("Not Done");
	}
	}

	private static void userLogin(Scanner sc) {
		
	
	}

	private static void adminLogin(Scanner sc) {
		String Id ="admin";
		String Password ="Admin";
		System.out.println("Enter Admin Id");
		String id =sc.next();
		System.out.println("Enter password");
		String password =sc.next();
		if(Id.equals(id) && password.equals(Password)) {
			System.out.println("Welcome admin");
		}else {
			System.out.println("Some thing went wrong");
		}
	}

}
