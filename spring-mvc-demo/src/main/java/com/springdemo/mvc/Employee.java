package com.springdemo.mvc;

import java.util.LinkedHashMap;

public class Employee {
	
	private String firstName;
	private String lastName;
	
	private String country;
	
	private String favoriteLanguage;
	
	private LinkedHashMap<String, String> favoriteLanguageOptions;
	
	// collection of name value pairs (first value is key, second is the value), ordered
	private LinkedHashMap<String, String> countryOptions;
	
	// an array as the checkbox allows multiple selection
	private String[] operatingSystems;
	
	public Employee() {
		
		// populate country options: used ISO country code
		// when run read from the class, can be from file system, database etc.
		countryOptions = new LinkedHashMap<>();
		
		countryOptions.put("CL", "Chile");
		countryOptions.put("GRC", "Greece");
		countryOptions.put("RUS", "Russia");
		countryOptions.put("NAM", "Namibia");
		countryOptions.put("US", "United States of America");
		
		favoriteLanguageOptions = new LinkedHashMap<>();
		favoriteLanguageOptions.put("Java", "Java");
		favoriteLanguageOptions.put("C#", "C#");		
		favoriteLanguageOptions.put("PHP", "PHP");
		favoriteLanguageOptions.put("Ruby", "Ruby");		
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	// when form is loaded spring will call employee.getCountryOptions to populate
	// the drop down
	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public LinkedHashMap<String, String> getFavoriteLanguageOptions() {
		return favoriteLanguageOptions;
	}
	
	public String[] getOperatingSystems() {
		return operatingSystems;
	}
	
	// as aformentioned the setter will be called on form submit
	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}
	
	
	
	
	
	
	
}
