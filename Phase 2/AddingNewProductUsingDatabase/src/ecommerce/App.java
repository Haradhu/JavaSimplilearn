package ecommerce;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
	
	public static void main( String[] args ){
		// Get the SessionFactory
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Product.class)
				.buildSessionFactory();
		//Get the Session
		Session theSession = factory.getCurrentSession();
		try {
			// Add a new learner
			Product theproduct = new Product("Redme 10pro ",25000,01);
			theSession.beginTransaction();
			theSession.save(theproduct);
			theSession.getTransaction().commit();
			}
		finally
		{
			factory.close();
			}
		}

	

}
