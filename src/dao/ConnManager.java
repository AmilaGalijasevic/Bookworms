package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnManager {

	private static ConnManager instance = null;
	// DB credentials
	private final String USERNAME = "root";
	private final String PASSWORD = "root";
	private final String CONN_STRING = "jdbc:mysql://localhost/bookworms";
	private final String DRIVER = "com.mysql.jdbc.Driver";

	
	private Connection connection = null;

	
	private ConnManager() {

	}

	public static ConnManager getInstance() {

		if (instance == null) {
			instance = new ConnManager();
		}
		return instance;
	}

	private boolean openConnection() {
		try {
			
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
			return true;
		} catch (SQLException | ClassNotFoundException e) {
			System.err.println(e);
			return false;
		}
	}

	public Connection getConnection() {
		if (connection == null) {
			if (openConnection()) {
				return connection;
			} else {
				return null;
			}
		}
		return connection;
	}

	void close() {

		try {
			connection.close();
			connection = null;
		} catch (Exception e) {
			System.err.println(e);
		}
	}
}
