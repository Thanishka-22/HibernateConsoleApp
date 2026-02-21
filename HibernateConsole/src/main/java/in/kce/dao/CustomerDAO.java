package in.kce.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import in.kce.entity.Customer;
import in.kce.util.HibernateUtil;

public class CustomerDAO {

	public void insertCustomer(Customer c) {
		Session s = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = s.beginTransaction();
		s.save(c);
		tx.commit();
		s.close();
	}

	public Customer findCustomer(String id) {
		Session s = HibernateUtil.getSessionFactory().openSession();
		Customer c = s.get(Customer.class, id);
		s.close();
		return c;
	}
}