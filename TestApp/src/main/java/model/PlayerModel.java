//Almicke Navarro 
//CST-323
//January 10, 2020 
//This is my own work.

//PlayerModel will contain the Player attributes
package model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class PlayerModel {
	
	private int ID; 
	
	@NotNull(message = "Name cannot be null.")
	@Size(min=3, max=30, message="Name must be between 3 and 45 characters.")
	private String Name;
	
	@NotNull(message = "Password cannot be null.")
	@Size(min=3, max=30, message="Password must be between 3 and 30 characters.")
	private String Password;

	public PlayerModel() { }
	
	public PlayerModel(int iD, String name, String password) {
		super();
		ID = iD;
		Name = name;
		Password = password;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	} 
	
	
	
}
