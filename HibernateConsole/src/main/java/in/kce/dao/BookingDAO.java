package in.kce.dao;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import in.kce.entity.Booking;
import in.kce.util.HibernateUtil;

public class BookingDAO {

	public void saveBooking(Booking b) {
		Session s = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = s.beginTransaction();
		s.save(b);
		tx.commit();
		s.close();
	}

	public void updateStatus(int id, String status) {
		Session s = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = s.beginTransaction();
		Booking b = s.get(Booking.class, id);
		if (b != null) {
			b.setStatus(status);
			s.update(b);
		}
		tx.commit();
		s.close();
	}

	public List<Booking> getBookingsByDate(Date d) {
		Session s = HibernateUtil.getSessionFactory().openSession();
		List<Booking> list = s.createQuery("from Booking where shootDate = :d", Booking.class).setParameter("d", d)
				.list();
		s.close();
		return list;
	}
}