package com.lamichhane.many.to.one.holds.realationship.by.course.bi.directional.instructor.method;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.lamichhane.one.to.many.many.to.one.entity.Course;
import com.lamichhane.one.to.many.many.to.one.entity.Instructor;

public class ReadInstructor {

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
			
		
			
			session.beginTransaction();
			// create the objects
			Instructor c = session.get(Instructor.class, 9);
			System.out.println("Instrucotr:"+c);
			System.out.println("Courses:"+c.getCourses());
			
			
			
			
			

			// save the object
			
			//commit transaction
			session.getTransaction().commit();
			
			
			
			System.out.println("Done");
			
			
		}
		finally {
			session.close();
			factory.close();
		}
	}

}
