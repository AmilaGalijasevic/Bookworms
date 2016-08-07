package bO;

import dto.worms;

public class Helper {

	public static boolean isValidWorm(worms worm) {

		if (worm == null) {
			return false;
		} else {
			return true;
		}

	}

	public static boolean isValidMail(String mail) {

		if (mail.length()>4) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean isValidPass(String pass) {

		if (pass.length() > 6) {

			return true;
		} else {
			return false;
		}

	}

	public static boolean bookNotNull(String name) {

		if (name.length() >= 1) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean isValidWormId(int wormId) {

		if (wormId != 0) {
			return true;
		} else {
			return false;
		}
	}

}
