package model;

import java.sql.Timestamp;

import javax.persistence.*;

public class KundeAnlegen {

	public static void main(String[] args) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("wws-2-jpa");
		EntityManager entityManager = emfactory.createEntityManager();
		entityManager.getTransaction().begin();
		
		TKunde kunde = new TKunde();
		kunde.setCustomerId(5);
		kunde.setCustomermatchcode("blubb");
		kunde.setFirstName("Hugo");
		kunde.setLastName("Hirsch");
		
		Timestamp tstamp = new Timestamp(System.currentTimeMillis()); 
		kunde.setLastUpdate(tstamp);
		
		entityManager.persist(kunde);
		entityManager.getTransaction().commit();	

		entityManager.close();
		emfactory.close();
	}
}
