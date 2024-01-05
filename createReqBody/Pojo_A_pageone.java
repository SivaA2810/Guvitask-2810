package domainA.createReqBody;

import java.util.ArrayList;
import java.util.List;

import groovyjarjarantlr4.v4.parse.ANTLRParser.throwsSpec_return;

public class Pojo_A_pageone {

	private String firstname;
	private String lastname;
	private String location;
	private String company;
	private String[] languageskills;
	private String[] frameworkskills;
	private String[] toolsskills;
	
	

	public String[] getLanguageskills() {
		return languageskills;
	}
	public void setLanguageskills(String[] languageskills) {
		this.languageskills = languageskills;
	}
	public String[] getFrameworkskills() {
		return frameworkskills;
	}
	public void setFrameworkskills(String[] frameworkskills) {
		this.frameworkskills = frameworkskills;
	}
	public String[] getToolsskills() {
		return toolsskills;
	}
	public void setToolsskills(String[] toolsskills) {
		this.toolsskills = toolsskills;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}

	
	
}
