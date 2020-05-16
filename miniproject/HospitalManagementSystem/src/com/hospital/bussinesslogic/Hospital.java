package com.hospital.bussinesslogic;

public class Hospital 
{
	private String patientName;
	private String doctorName;
	private String diseaseName;
	public Hospital(String patientName, String doctorName, String diseaseName)
	{
		super();
		this.patientName = patientName;
		this.doctorName = doctorName;
		this.diseaseName = diseaseName;
	}
	public String getPatientName() {
		return this.patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getDoctorName() {
		return this.doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getDiseaseName() {
		return this.diseaseName;
	}
	public void setDiseaseName(String diseaseName) {
		this.diseaseName = diseaseName;
	}
	@Override
	public String toString() {
		return "Hospital [patientName=" + this.patientName + ", doctorName=" + this.doctorName + ", diseaseName=" + this.diseaseName
				+ "]";
	}
	public boolean equals(Object o1)
	{
		Hospital h=(Hospital)o1;
		return this.doctorName==this.doctorName;
	}
}
