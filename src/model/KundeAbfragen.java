package model;

import java.util.List;

import javax.persistence.*;

public class KundeAbfragen {

	public static void main(String[] args) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("wws-2-jpa");
		EntityManager entityManager = emfactory.createEntityManager();
		entityManager.getTransaction().begin();

		Query query = entityManager.createQuery("SELECT a FROM TKunde a");
		@SuppressWarnings("unchecked")
		List<TKunde> resultList = query.getResultList();
		for (TKunde a : resultList) {
			System.out.println("ID: " + a.getCustomerId() + ", Matchcode: " + a.getCustomermatchcode() + ", Vorname: "
					+ a.getFirstName()+ ", Nachname: " +a.getLastName() + ", letzte Änderung: " + a.getLastUpdate());
		}
		System.out.println();
		entityManager.close();
		emfactory.close();
	}
}