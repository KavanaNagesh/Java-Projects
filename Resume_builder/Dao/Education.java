package Dao;

public class Education {
	private String qualification;
	private String eduInstitution;
	private double percentage;
	public Education(String qualification, String eduInstitution, double percentage) {
		super();
		this.qualification = qualification;
		this.eduInstitution = eduInstitution;
		this.percentage = percentage;
	}
	
	
	public String getQualification() {
		return qualification;
	}
	public void setQualifiction(String qualifaction) {
		this.qualification = qualifaction;
	}
	public String getEduInstitution() {
		return eduInstitution;
	}
	public void setEduInstitution(String eduInstitution) {
		this.eduInstitution = eduInstitution;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	
	
}
