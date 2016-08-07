package bO;

import java.sql.SQLException;

import dao.Worms;
import dto.worms;

public class WormsBO implements WormsInterface {

	private Worms wormss = new Worms();

	@Override
	public boolean register(worms worm) {

			try {
				wormss.register(worm);
					return true;
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return false;
		
		
	}

	@Override
	public worms logIn(String email, String password) {
		worms w = null;

		try {
			w = wormss.logIn(email, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return w;
	}

}
