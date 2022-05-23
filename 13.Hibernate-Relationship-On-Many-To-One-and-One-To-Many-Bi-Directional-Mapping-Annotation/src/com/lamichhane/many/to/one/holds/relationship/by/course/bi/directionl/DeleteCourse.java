package com.lamichhane.many.to.one.holds.relationship.by.course.bi.directionl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.lamichhane.one.to.many.many.to.one.entity.Course;
import com.lamichhane.one.to.many.many.to.one.entity.Instructor;

public class DeleteCourse {

	public static void main(String[] args) {
	
		
		//create session factory
		SessionFactory factory = new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(Course.class)
									.addAnnotatedClass(Instructor.class)
									.buildSessionFactory();
		
		//create session
		Session session = factory.getCurrentSession();
		
		try {
			int id = 32;
			
			session.beginTransaction();
			// create the objects
			Course c = session.get(Course.class, id);
			session.delete(c);
			
	
			

			// save the object
			
			//commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done");
			
			
		}
		finally {
			
			factory.close();
		}
	}

}
