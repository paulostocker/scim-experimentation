package com.stocker.scimexperimentation.model;

public class User {
	
	private String name;
	private String jobtitle;
	
	public User() {
		this.setName("teste");
		this.setJobtitle("nan");
	}
	
	public User(String name, String jobtitle) {
		this.setName(name);
		this.setJobtitle(jobtitle);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJobtitle() {
		return jobtitle;
	}

	public void setJobtitle(String jobtitle) {
		this.jobtitle = jobtitle;
	}
}
