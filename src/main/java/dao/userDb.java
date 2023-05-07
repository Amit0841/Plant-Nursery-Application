package dao;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dto.Address;
import dto.Plant;
import dto.Seed;
import dto.Signup;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;


public class userDb implements InterfaceUSE{
	@Override
	public boolean addCustomer(String houseNo, String city, String state, int pincode, String firstNmae,
			String lastNmae, String password, String email) {
		EntityManager em= connectionDB.makeConnection();
		Signup s=new Signup();
		s.setFirstNmae(firstNmae);
		s.setLastNmae(lastNmae);
		s.setEmail(email);
		s.setPassword(password);
    	s.getList().add(new Address(houseNo, city, state, pincode));
    	
    	EntityTransaction et = em.getTransaction();
    	et.begin();
    	
    		em.persist(s);
    	et.commit();
    	
    	em.close();
    	
		return true;
	}


	@Override
	public boolean login(String email, String password) {
		EntityManager em= connectionDB.makeConnection();
		
		String query="select e.Password from Signup e where e.Email = :email";
		
		
		Query que= em.createQuery(query);
		
		que.setParameter("email", email);
	
		String pass= (String) que.getSingleResult();

		if(pass.equals(password)) {
			System.out.println("login success");
			return true;
		}else {
			System.out.println("user not there");
			return false;
		}
	}
	@Override
	public boolean addSeed(Seed seed) {
		EntityManager em= connectionDB.makeConnection();
		EntityTransaction et = em.getTransaction();
    	et.begin();
    	em.persist(seed);
    	et.commit();
    	em.close();
		return true;
	}


	@Override
	public boolean addPlant(Plant plant) {
		EntityManager em= connectionDB.makeConnection();
		EntityTransaction et = em.getTransaction();
    	et.begin();
    	em.persist(plant);
    	et.commit();
    	em.close();
		return true;
	}

	@Override
	public void updateSeed(int id,Scanner sc) {
		EntityManager em= connectionDB.makeConnection();
		Seed seed =em.find(Seed.class, id);
		
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
		 
		seed.setSeedNmae(SeedNmae);
		seed.setDifficultyLevel(difficultyLevel);
		seed.setTypeOfSeed(typeOfSeed);
		seed.setSeedStock(SeedStock);
		seed.setSeedCost(SeedCost);
		seed.setSeedQuentity(SeedQuentity);
		em.merge(seed);
		em.close();
	}


	@Override
	public void updatePlant(int id, Scanner sc) {
		EntityManager em= connectionDB.makeConnection();
		Plant seed =em.find(Plant.class, id);
		
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
		 
		seed.setPlantNmae(SeedNmae);
		seed.setDifficultyLevel(difficultyLevel);
		seed.setTypeOfPlant(typeOfSeed);
		seed.setPlantCost(SeedCost);
		seed.setPlantQuentity(SeedQuentity);
		em.merge(seed);
		em.close();
		
	}


	@Override
	public boolean viewSeed() {
		EntityManager em= connectionDB.makeConnection();
        String query="select e from Seed e ";		
		Query que= em.createQuery(query);
		List <Seed> list=que.getResultList();
		if(list.size()!=0) {
			list.forEach(System.out::println);
			return true;
		}else {
			System.out.println("Empty");
			return false;
		}
		
	}


	@Override
	public boolean viewPlants() {
		EntityManager em= connectionDB.makeConnection();
		String query="select e from Plant e ";		
				Query que= em.createQuery(query);
				List <Plant> list=que.getResultList();
				if(list.size()!=0) {
					list.forEach(System.out::println);
					return true;
				}else {
					System.out.println("Empty");
					return false;
				}
	}

	
}
