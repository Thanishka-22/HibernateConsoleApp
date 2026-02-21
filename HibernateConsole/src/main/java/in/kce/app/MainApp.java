package in.kce.app;

import java.util.Date;

import in.kce.dao.BookingDAO;
import in.kce.dao.CustomerDAO;
import in.kce.entity.Booking;
import in.kce.entity.Customer;

public class MainApp {

	public static void main(String[] args) {

		System.out.println("--- Photography Studio Booking Console ---");

		CustomerDAO customerDAO = new CustomerDAO();
		BookingDAO bookingDAO = new BookingDAO();
		Customer c = customerDAO.findCustomer("CUST1001");

		if (c != null) {
			Booking b = new Booking();
			b.setCustomerID("CUST1002");
			b.setShootDate(new Date());
			b.setStartTime("09:00");
			b.setEndTime("12:00");
			b.setPackageType("PORTRAIT");
			b.setStatus("BOOKED");

			bookingDAO.saveBooking(b);
			System.out.println("BOOKING SUCCESS");
			bookingDAO.updateStatus(b.getBookingID(), "RESCHEDULED");
			System.out.println("RESCHEDULE SUCCESS");
			bookingDAO.updateStatus(b.getBookingID(), "CANCELLED");
			System.out.println("CANCEL SUCCESS");

		} else {
			System.out.println("BOOKING FAILED");
		}
	}
}