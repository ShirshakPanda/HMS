package com.cg.iter.viewcenter.entities;

import java.math.BigInteger;
import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "Appointments")
public class Appointment {
	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	@Column(length=10)
	private String userId;
	@Column(length=10)
	private BigInteger appointmentid;
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Test_centre_id")
	private Test test;
	@Column(length=10)
	private Date datetime;
	@Column(length=10)
	private boolean approved;
	

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public BigInteger getAppointmentid() {
		return appointmentid;
	}

	public void setAppointmentid(BigInteger appointmentid) {
		this.appointmentid = appointmentid;
	}

	public Test getTest() {
		return test;
	}

	public void setTest(Test test) {
		this.test = test;
	}

	public Date getDatetime() {
		return datetime;
	}

	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}

	public boolean isApproved() {
		return approved;
	}

	public void setApproved(boolean approved) {
		this.approved = approved;
	}

	@Override
	public String toString() {
		return "Appointment [userId=" + userId + ", appointmentid=" + appointmentid + ", test=" + test + ", datetime="
				+ datetime + ", approved=" + approved +  "]";
	}

}
