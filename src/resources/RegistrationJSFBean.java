package resources;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;


@Named(value = "registration")
@RequestScoped
public class RegistrationJSFBean {
	private String lastName;
	private String firstName;
	private String mi;
	private String gender;
	private String major;
	private String[] minor;
	private String[] hobby;
	private String remarks;
	
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMi() {
		return mi;
	}
	public void setMi(String mi) {
		this.mi = mi;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String[] getMinor() {
		return minor;
	}
	public void setMinor(String[] minor) {
		this.minor = minor;
	}
	public String[] getHobby() {
		return hobby;
	}
	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	private String getResponse() {
		String temp;
		if (lastName == null) {
			temp = "";
		}
		else {
			String allMinor = "";
			
			for (String s: minor) {
				allMinor += s + " ";
			}
			
			String allHobbies = "";
			
			for (String s: hobby) {
				allHobbies += s + " ";
			}
			
			temp = "<p style=\"color:red\">You entered: <br/>"
					+ "Last Name: " + lastName + "<br/>"
					+ "First Name: " + firstName + "<br/>";
		}
		
		return temp;
	}
}
