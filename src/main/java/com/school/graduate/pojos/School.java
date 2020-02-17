package com.school.graduate.pojos;

public class School {
	private String principalName;
	private String schoolAddress;
	private String phoneNo;
	private String establishDate;
	
	public String getPrincipalName() {
		return principalName;
	}
	public void setPrincipalName(String principalName) {
		this.principalName = principalName;
	}
	public String getSchoolAddress() {
		return schoolAddress;
	}
	public void setSchoolAddress(String schoolAddress) {
		this.schoolAddress = schoolAddress;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getEstablishDate() {
		return establishDate;
	}
	public void setEstablishDate(String establishDate) {
		this.establishDate = establishDate;
	}
	@Override
	public String toString() {
		return "School [principalName=" + principalName + ", schoolAddress=" + schoolAddress + ", phoneNo=" + phoneNo
				+ ", establishDate=" + establishDate + "]";
	}

}
