package Dao;

import java.util.ArrayList;

public class User {

	
	private String name;
	 private String dob;
	 private String address;
	 private ArrayList<String> achievements;
	 private String objective;
	 private ArrayList<Education> education;
	 private String email;
	 private long contact;
	 private String motherName;
	 private String fatherName;
	 private ArrayList<String> technicalSkills;
	 private ArrayList<String> languages;

	 public User(String name, String dob, String address, ArrayList<String> achievements, String objective,ArrayList<Education> education,
				String email, long contact, String motherName, String fatherName, ArrayList<String> technicalSkills,
				ArrayList<String> languages) {
			super();
			this.name = name;
			this.dob = dob;
			this.address = address;
			this.achievements = achievements;
			this.objective = objective;
			this.education = education;
			this.email = email;
			this.contact = contact;
			this.motherName = motherName;
			this.fatherName = fatherName;
			this.technicalSkills = technicalSkills;
			this.languages = languages;
		}
	 
	 public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public ArrayList<String> getAchievements() {
		return achievements;
	}
	public void setAchievements(ArrayList<String> achievements) {
		this.achievements = achievements;
	}
	public String getObjective() {
		return objective;
	}
	public void setObjective(String objective) {
		this.objective = objective;
	}
	public ArrayList<Education> getEducation() {
		return education;
	}
	public void setEducation(ArrayList<Education> education) {
		this.education = education;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public ArrayList<String> getTechnicalSkills() {
		return technicalSkills;
	}
	public void setTechnicalSkills(ArrayList<String> technicalSkills) {
		this.technicalSkills = technicalSkills;
	}
	public ArrayList<String> getLanguages() {
		return languages;
	}
	public void setLanguages(ArrayList<String> languages) {
		this.languages = languages;
	}
	 
	 @Override
	public String toString() {
			return "User [name=" + name + ", dob=" + dob + ", address=" + address + ", achievements=" + achievements
					+ ", objective=" + objective + ", education=" + education + ", email=" + email + ", contact=" + contact
					+ ", motherName=" + motherName + ", fatherName=" + fatherName + ", technicalSkills=" + technicalSkills
					+ ", languages=" + languages + "]";
		}
	 
 
}
