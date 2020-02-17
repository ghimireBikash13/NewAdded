package com.school.graduate.pojos;

import java.util.Map;

public class SchoolGraduate {
	private String studentName;
	private String passedYear;
	private String totalYearsAttended;
	
	private Map<String,School> schoolattended;


	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getPassedYear() {
		return passedYear;
	}

	public void setPassedYear(String passedYear) {
		this.passedYear = passedYear;
	}

	public String getTotalYearsAttended() {
		return totalYearsAttended;
	}

	public void setTotalYearsAttended(String totalYearsAttended) {
		this.totalYearsAttended = totalYearsAttended;
	}

	public Map<String, School> getSchoolattended() {
		return schoolattended;
	}

	public void setSchoolattended(Map<String, School> schoolattended) {
		this.schoolattended = schoolattended;
	}

	@Override
	public String toString() {
		return "SchoolGraduate [studentName=" + studentName + ", passedYear="
				+ passedYear + ", totalYearsAttended=" + totalYearsAttended + ", schoolattended=" + schoolattended
				+ "]";
	}

}
