package dao;

import java.sql.SQLException;
import java.util.ArrayList;

import dto.book;

public interface BooksInterface {

	boolean addBook(book book, int wormID) throws SQLException;

	public ArrayList<book> listBooks(int userID) throws SQLException;
	
	public boolean editBook(book book) throws SQLException;
	
	public boolean deleteBook(int bookId)throws SQLException;
	
}
