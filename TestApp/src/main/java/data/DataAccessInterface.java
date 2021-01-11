//Almicke Navarro 
//CST-323
//January 9, 2020 
//This is my own work.


//DataAccessInterface will maintain the CRUD operations
package data;

public interface DataAccessInterface<P> {
	//create will be used to create a new player to the database
	public boolean create(P p); 
	
	//read will be used to read a player from the database
	public P read(P p); 
	
	//update will be used to update a player in the the database
	public boolean update(P p); 
	
	//delete will be used to delete a player from the database
	public boolean delete(int id); 
}
