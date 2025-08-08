package com.wipro.hibernatedemo;


import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.wipro.hibernatedemo.entity.Pan;
import com.wipro.hibernatedemo.repo.PanRepo;
import com.wipro.hibernatedemo.util.HibernateUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        Session session= HibernateUtil.getSessionFactory().getCurrentSession();
//    	Transaction transaction=session.beginTransaction();
//    	Pan p= new Pan("Rushikesh Tambe","ABD683");   
//    	session.persist(p);
//    	transaction.commit();   	
//    	
    	
    	Scanner sc = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("--- PAN Management Menu ---");
            System.out.println("1. Create PAN Record");
            System.out.println("2. Find PAN by ID");
            System.out.println("3. Update PAN Record");
            System.out.println("4. Delete PAN by ID");
            System.out.println("5. Find All PAN Records");
            System.out.println("6. Find All PAN Holder Names");
            System.out.println("7. Find PAN by PAN Number");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    PanRepo.createPan();
                    break;
                    
                case 2:
                    System.out.print("Enter PAN ID: ");
                    int id = sc.nextInt();
                    Pan pan = PanRepo.findById(id);
                    System.out.println(pan);
                    break;
                    
                case 3:
                    PanRepo.updatePan();
                    break;
                    
                case 4:
                    System.out.print("Enter PAN ID to delete: ");
                    int delId = sc.nextInt();
                    Pan deleted = PanRepo.deleteById(delId);
                    System.out.println("Deleted: " + deleted);
                    break;
                    
                case 5:
                    List<Pan> allPan = PanRepo.findAll();
                    allPan.forEach(System.out::println);
                    break;
                    
                case 6:
                    List<String> names = PanRepo.findAllHolderNames();
                    names.forEach(System.out::println);
                    break;
                    
                case 7:
                    System.out.print("Enter PAN Number to search: ");
                    String panNumber = sc.next();
                    List<Pan> panList = PanRepo.findByPanNumber(panNumber);
                    panList.forEach(System.out::println);
                    break;
                    
                case 9:
                    System.out.println("Exiting...");
                    return;
                    
                default:
                    System.out.println("Invalid option. Please try again.");
            }

        } while (choice != 9);
    }
}
