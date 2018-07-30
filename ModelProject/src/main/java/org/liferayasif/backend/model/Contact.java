package org.liferayasif.backend.model;

public class Contact {

	 private int phoneNumber;
	 private int mobNumber;
	 private String email;
	 
	 public void setPhoneNumber(int phoneNumber)
	 {
		 this.phoneNumber=phoneNumber;
	 }
	 public int getPhoneNumber()
	 {
		 return phoneNumber;
	 }
	 public void setMobNumber(int mobNumber)
	 {
		 this.mobNumber=mobNumber;
	 }
	 public int getMobNumber()
	 {
		 return mobNumber;
	 }
	 public void setEmail(String email)
	 {
		 this.email=email;
	 }
	 public String getEmail()
	 {
		 return email;
	 }
	 
	 
}
