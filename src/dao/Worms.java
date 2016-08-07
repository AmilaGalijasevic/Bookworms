package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dto.worms;

public class Worms implements WormsInterface {

	Connection connection = ConnManager.getInstance().getConnection();

	// method for registering new user
	@Override
	public boolean register(worms worm) throws SQLException {
		String query = "INSERT INTO worms (name, lastname, mail, password, sex, address, phone) VALUES (?,?,?,?,?,?,?);";

		PreparedStatement statement = connection.prepareStatement(query);

		statement.setString(1, worm.getName());
		statement.setString(2, worm.getLastname());
		statement.setString(3, worm.getMail());
		statement.setString(4, worm.getPassword());
		statement.setString(5, worm.getSex());
		statement.setString(6, worm.getAddres());
		statement.setString(7, worm.getPhone());

		statement.executeUpdate();

		return true;
	}

	// method that returns user if it exists in db
	@Override
	public worms logIn(String email, String password) throws SQLException {
		worms worm = null;
		String query = "SELECT * FROM worms WHERE mail= ? AND password = ?";

		PreparedStatement statement = connection.prepareStatement(query);

		statement.setString(1, email);
		statement.setString(2, password);

		ResultSet rs = statement.executeQuery();

		if (rs.next()) {

			worm = new worms();
			worm.setIdworms(rs.getInt(1));
			worm.setName(rs.getString("name"));
			worm.setLastname(rs.getString("lastname"));
			worm.setMail(rs.getString("mail"));
			worm.setPassword(rs.getString("password"));
			worm.setSex(rs.getString("sex"));
			worm.setAddres(rs.getString("address"));
			worm.setPhone(rs.getString("phone"));

		}

		return worm;
	}
	

}
