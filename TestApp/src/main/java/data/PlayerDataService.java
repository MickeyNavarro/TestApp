//Almicke Navarro 
//CST-323
//January 9, 2020 
//This is my own work.

//PlayerDataService will deal with any CRUD operations to the database 

package data;

import model.PlayerModel;

public class PlayerDataService implements PlayerDataInterface{

	//create a player to the database; returns if successful or not
	@Override
	public boolean create(PlayerModel p) {
		// TODO Auto-generated method stub
		return false;
	}

	//read a player from the database; returns the player info
	@Override
	public PlayerModel read(PlayerModel p) {
		// TODO Auto-generated method stub
		return null;
	}

	//update a player in the database; returns if successful or not
	@Override
	public boolean update(PlayerModel p) {
		// TODO Auto-generated method stub
		return false;
	}

	//delete a player in the database; returns if successful or not
	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
