package world;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import world.domain.City;

public class JPADemo {
	/**
	 * Find cities in database by name.
	 * 
	 * @param name
	 *            is the name of city to find.
	 */
	public static void findCity(String name) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JpaTest");

		EntityManager em = factory.createEntityManager();
		Query query = em.createQuery("SELECT c from City c where c.name = :name");

		query.setParameter("name", name);

		List<City> cities = query.getResultList();
		System.out.printf("Found %d matches for %s\n", cities.size(), name);

		for (City c : cities)
			System.out.println(c);
	}

	public static void main(String[] args) {

		// JPADemo demo = new JPADemo();
		JPADemo.findCity("New York");
		JPADemo.findCity("Mombasa");

	}
}
