package Creational.Singelton;

public class User {
	
	private String name;
	private String surName;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}
	
	public User(String name , String surName) {
		this.setName(name);
		this.setSurName(surName);
	}
	
	public void getUserData() {
		
		Database database = Database.getInstance();
		database.getConnection();
		
		
		System.out.println(database.getUser()+"eklendi.");
		
	}

	

	

}
