package com.masai.Ui;



import java.util.Scanner;

import dao.InterfaceUSE;
import dao.userDb;

public class UserUi {
	
	static void viewSeed(Scanner sc) {
		InterfaceUSE se=new userDb();
		boolean a=se.viewSeed();
		if(a) {
			System.out.println("Enter Seed id for booking");
			int c=sc.nextInt();
			System.out.println(" booking Success" );
		}else {
			
		}
	}
	static void viewPlants(Scanner sc){
		InterfaceUSE se=new userDb();
		boolean a=se.viewPlants();
		
		if(a) {
			System.out.println("Enter Seed id for booking");
			int c=sc.nextInt();
			System.out.println(" booking Success" );
		}else {
			
		}
	}
}
