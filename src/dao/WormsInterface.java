package dao;

import java.sql.SQLException;

import dto.worms;

public interface WormsInterface {

	public boolean register(worms worm) throws SQLException;
	
	public worms logIn(String email, String password) throws SQLException;
}
