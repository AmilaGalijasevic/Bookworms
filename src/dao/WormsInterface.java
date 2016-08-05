package dao;

import dto.worms;

public interface WormsInterface {

	public boolean register(worms worm);
	
	public boolean logIn(String email, String password);
}
