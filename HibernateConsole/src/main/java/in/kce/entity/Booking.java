package in.kce.entity;

import java.util.Date;
import jakarta.persistence.*;

@Entity
@Table(name = "BOOKING_TBL")
public class Booking {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "booking_seq")
	@SequenceGenerator(name = "booking_seq", sequenceName = "booking_seq", allocationSize = 1)
	@Column(name = "BOOKING_ID")
	private int bookingID;

	@Column(name = "CUSTOMER_ID")
	private String customerID;

	@Temporal(TemporalType.DATE)
	@Column(name = "SHOOT_DATE")
	private Date shootDate;

	@Column(name = "START_TIME")
	private String startTime;

	@Column(name = "END_TIME")
	private String endTime;

	@Column(name = "PACKAGE_TYPE")
	private String packageType;

	@Column(name = "STATUS")
	private String status;

	// getters & setters
	public int getBookingID() {
		return bookingID;
	}

	public void setBookingID(int bookingID) {
		this.bookingID = bookingID;
	}

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public Date getShootDate() {
		return shootDate;
	}

	public void setShootDate(Date shootDate) {
		this.shootDate = shootDate;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getPackageType() {
		return packageType;
	}

	public void setPackageType(String packageType) {
		this.packageType = packageType;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}