package dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class connectionDB {
	static EntityManagerFactory emf;
	static {
		emf=Persistence.createEntityManagerFactory("Plant_connect");
	}
	public static EntityManager makeConnection() {
		
		return emf.createEntityManager();
		
	}
}
