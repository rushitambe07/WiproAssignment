package com.wipro.hibernatedemo.repo;

import java.util.List;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.wipro.hibernatedemo.entity.Pan;
import com.wipro.hibernatedemo.util.HibernateUtil;

public class PanRepo {

    // Create new PAN record
    public static void createPan() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter PAN holder name:");
        String name = sc.next();
        System.out.println("Enter PAN number:");
        String number = sc.next();

        Pan pan = new Pan(name, number);
        save(pan);
    }

    // Update existing PAN record
    public static void updatePan() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter PAN ID to update:");
        int id = sc.nextInt();
        System.out.println("Enter new PAN holder name:");
        String name = sc.next();
        System.out.println("Enter new PAN number:");
        String number = sc.next();

        Pan pan = new Pan(name, number);
        pan.setId(id);  // Ensure ID is set
        save(pan);
    }

    // Save or Update PAN
    public static void save(Pan p) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();

        if (p.getId() != 0) { 
            Pan existing = session.find(Pan.class, p.getId());
            if (existing != null) {
                existing.setPanholderName(p.getPanholderName());
                existing.setPanNumber(p.getPanNumber());
                session.persist(existing);
            }
        } else { 
            session.persist(p);
        }

        tx.commit();
    }

    // Find PAN by ID
    public static Pan findById(int id) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        Pan pan = session.find(Pan.class, id);
        tx.commit();
        return pan;
    }

    // Delete PAN by ID
    public static Pan deleteById(int id) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        Pan pan = session.find(Pan.class, id);
        if (pan != null) {
            session.remove(pan);
        }
        tx.commit();
        return pan;
    }

    // Find all PAN records
    public static List<Pan> findAll() {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        Query<Pan> query = session.createQuery("from Pan", Pan.class);
        List<Pan> list = query.list();
        tx.commit();
        return list;
    }

    // Find all PAN holder names
    public static List<String> findAllHolderNames() {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        Query<String> query = session.createQuery("select panholderName from Pan", String.class);
        List<String> list = query.list();
        tx.commit();
        return list;
    }

    // Find by PAN number
    public static List<Pan> findByPanNumber(String panNumber) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        Query<Pan> query = session.createQuery("from Pan where panNumber = :panNum", Pan.class);
        query.setParameter("panNum", panNumber);
        List<Pan> list = query.list();
        tx.commit();
        return list;
    }
}

