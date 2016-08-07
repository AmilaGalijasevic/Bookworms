package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dto.book;

public class Books implements BooksInterface {

	Connection connection = ConnManager.getInstance().getConnection();

	// method that adds a book in the db
	@Override
	public boolean addBook(book book, int wormID) throws SQLException {

		String query = "INSERT INTO books (name, description, wormId) VALUES (?,?,?)";

		PreparedStatement statement = connection.prepareStatement(query);

		statement.setString(1, book.getName());
		statement.setString(2, book.getDescription());
		statement.setInt(3, wormID);

		statement.executeUpdate();

		return false;
	}

	// method for listing books from db
	@Override
	public ArrayList<book> listBooks(int wormID) throws SQLException {

		ArrayList<book> booklist = new ArrayList<>();
		book book = null;

		String query = "SELECT * FROM books WHERE wormId = ? LIMIT 10";

		PreparedStatement statement = connection.prepareStatement(query);

		statement.setInt(1, wormID);

		ResultSet rs = statement.executeQuery();

		while (rs.next()) {
			book = new book();
			book.setIdbooks(rs.getInt(1));
			book.setName(rs.getString("name"));
			book.setDescription(rs.getString("description"));
			book.setWormId(rs.getInt("wormId"));

			booklist.add(book);

		}

		return booklist;
	}

	@Override
	public boolean editBook(book book) throws SQLException {

		String query = "UPDATE books SET name = ?, description = ? WHERE idbooks= ?";

		PreparedStatement statement = connection.prepareStatement(query);

		statement.setString(1, book.getName());
		statement.setString(2, book.getDescription());
		statement.setInt(3, book.getIdbooks());
		
		statement.executeUpdate();

		return true;
	}

	@Override
	public boolean deleteBook(int wormId) throws SQLException {

		String query = "DELETE FROM books WHERE idbooks = ?";

		PreparedStatement statement = connection.prepareStatement(query);

		statement.setInt(1, wormId);

		statement.executeUpdate();

		return true;
	}

}
