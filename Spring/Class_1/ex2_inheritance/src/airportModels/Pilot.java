package airportModels;

import ex2_inheritance.Airport;

public class Pilot extends Airport {
	private int licenseNum;
	private int seniority;
	
	public Pilot() {}
	
	public Pilot(String firstName, String surname, int licenseNum, int seniority) {
		super(firstName, surname);
		this.licenseNum = licenseNum;
		this.seniority = seniority;
	}

	public int getLicenseNum() {
		return licenseNum;
	}
	
	public void setLicenseNum(int licenseNum) {
		this.licenseNum = licenseNum;
	}
	
	public int getSeniority() {
		return seniority;
	}
	
	public void setSeniority(int seniority) {
		this.seniority = seniority;
	}

	public String display() {
		return ("Pilot [" + super.display() + ", licenseNum=" + licenseNum + ", seniority=" + seniority + "]");
	}
}
