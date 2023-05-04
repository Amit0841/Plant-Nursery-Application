package dao;

import dto.Signup;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class userDb implements InterfaceUSE{

	@Override
	public boolean addCustomer(Signup signup) {
		EntityManager em= connectionDB.makeConnection();
		EntityTransaction et= em.getTransaction();
		try {
			et.begin();
		em.persist(signup);
		et.commit();
		em.close();
		return true;
		}catch(ClassCastException c) {
		return false;	
		}
		
		
	}

}
