package com.tus.athlone.hotel.models;

import java.util.Objects;

import org.hibernate.annotations.Type;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;


@Entity(name = "customers")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Customer {
	@Id
	@Column(unique=true)
	@GeneratedValue private Long customerId;
	@Column(nullable = false)
	private String customerName;
	@Column(unique=true,nullable = false)
	private String emailId;
	private String address;
	@Column(unique=true,nullable = false)
	private String passport;
	private String country;
	
	public Customer() {
		
		}

	public Customer(Long customerId, String customerName, String emailId, String address, String passport,
			String country) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.emailId = emailId;
		this.address = address;
		this.passport = passport;
		this.country = country;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPassport() {
		return passport;
	}

	public void setPassport(String passport) {
		this.passport = passport;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, country, customerId, customerName, emailId, passport);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(address, other.address) && Objects.equals(country, other.country)
				&& Objects.equals(customerId, other.customerId) && Objects.equals(customerName, other.customerName)
				&& Objects.equals(emailId, other.emailId) && Objects.equals(passport, other.passport);
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", emailId=" + emailId
				+ ", address=" + address + ", passport=" + passport + ", country=" + country + "]";
	}

	
	
	
}
