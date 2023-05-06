package com.masai.Ui;

import java.util.Scanner;

import dao.InterfaceUSE;
import dao.userDb;
import dto.Plant;
import dto.Seed;
public class AdminUi {
static void addSeed(Scanner sc) {
	
	 System.out.println("Enter Seed name");
	 String SeedNmae=sc.next();
	 System.out.println("Enter Difficulty Level");
	 String difficultyLevel=sc.next();
	 System.out.println("Enter Type Of Seed");
	 String typeOfSeed=sc.next();
	 System.out.println("Enter Seed Stock");
	 int SeedStock =sc.nextInt();
	 System.out.println("Enter Seed Cost");
	 int SeedCost=sc.nextInt();
	 System.out.println("Enter Seed Quentity");
	 int SeedQuentity=sc.nextInt();
	 Seed seed =new Seed( SeedNmae,  difficultyLevel,  typeOfSeed,  SeedStock,  SeedCost, SeedQuentity);
		InterfaceUSE se=new userDb();
		se.addSeed(seed);
		
}
static void  updateSeed(Scanner sc){
	
	 
	 System.out.println("Enter Seed id");
	 int id=sc.nextInt();
		InterfaceUSE se=new userDb();
		se.updateSeed(id,sc);
}
static void addPlant (Scanner sc) {
	 System.out.println("Enter Plant name");
	 String PlantNmae=sc.next();
	 System.out.println("Enter Plant height");
	 int height =sc.nextInt();
	 System.out.println("Enter Difficulty Level");
	 String difficultyLevel=sc.next();
	 System.out.println("Enter Type Of Plant");
	 String typeOfPlant=sc.next();
	
	 System.out.println("Enter Plant Cost");
	 int PlantCost=sc.nextInt();
	 System.out.println("Enter Plant Quentity");
	 int PlantQuentity=sc.nextInt();
	 
	 Plant plant=new Plant( PlantNmae,  height,  difficultyLevel,  typeOfPlant,  PlantCost,PlantQuentity);
		InterfaceUSE se=new userDb();
	se.addPlant(plant);
		
}
static void updatePlant (Scanner sc) {

	 System.out.println("Enter Plant id");
	 int id=sc.nextInt();
		InterfaceUSE se=new userDb();
		se.updatePlant(id,sc);
}
}
