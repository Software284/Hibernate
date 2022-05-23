package com.lamichhane.relation.hold.by.instructor_detail.example.reade.delete.insert.from.instructor;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.lamichhane.one.to.one.entity.Instructor;
import com.lamichhane.one.to.one.entity.InstructorDetail;

public class InsertFromInstructor {

	public static void main(String[] args) {
		
		//create session factory
				SessionFactory factory = new Configuration()
											.configure("hibernate.cfg.xml")
											.addAnnotatedClass(Instructor.class)
											.addAnnotatedClass(InstructorDetail.class)
											.buildSessionFactory();
				
				//create session
				Session session = factory.getCurrentSession();
				
				try {
					
					Instructor tempInstructor1 = new Instructor("Mahesh","Lamichhane","mahesh@gmail.com");
					
					
//					tempInstructor1.setInstructorDetail(tempInstructorDetail1);
				
					
					// start a transaction
				    session.beginTransaction();
								
								
					//save the instructor
					session.save(tempInstructor1);
					
					
					
					
					//commit transaction
					session.getTransaction().commit();
					
					System.out.println("Done");
					
					
				}
				finally {
					factory.close();
				}

	}

}
