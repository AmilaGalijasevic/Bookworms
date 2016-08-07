package bO;

import java.util.ArrayList;

import dto.book;

public interface BooksInterface {

	boolean addBook(book book, int wormID);

	public ArrayList<book> listBooks(int userID);

	public boolean editBook(book book);

	public boolean deleteBook(int wormId);

}
