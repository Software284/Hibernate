package com.lamichhane.many.to.one.holds.realationship.by.course.bi.directional.instructor.method;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.lamichhane.one.to.many.many.to.one.entity.Course;
import com.lamichhane.one.to.many.many.to.one.entity.Instructor;



public class InsertInstructor {

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
					
					
					
					
					// start a transaction
				    session.beginTransaction();
								
								
					//save the instructor
				    Instructor i = new Instructor("huma","kumari","huma@gmail.com");
				    
				    Course c = new Course("Spring");
				    Course c2 = new Course("Java");
				    
				    i.add(c);
				    i.add(c2);
				    
				    // we can't even insert data from insertInstructor in this case now
				    
				   
				    
				    
				   
				    
				    session.save(i);
				   
				    
				   
					
					
					//commit transaction
					session.getTransaction().commit();
					
					System.out.println("Done");
					
					
				}
				finally {
					factory.close();
				}

	}

}
