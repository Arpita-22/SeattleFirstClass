package org.softwareDeveloperClubProjects;

public class ClubMember {
	private String name;
	private String city;
	private String state;
	private String favoriteLanguage;
	
	
	public ClubMember(String name, String city, String state, String favoriteLanguage ){
		this.name = name;
		this.city = city;
		this.state = state;
		this.favoriteLanguage = favoriteLanguage;
		
	}


	public String getName() {
		return name;
	}


	public String getCity() {
		return city;
	}
	
	public String getState() {
		return state;
	}


	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public void setState(String state) {
		this.state = state;
	}


	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}



}
