package bO;

import dto.worms;

public interface WormsInterface {

	public boolean register(worms worm);

	public worms logIn(String email, String password);

}
