package dao;

import java.util.ArrayList;

import dto.book;

public interface BooksInterface {

	public boolean addBook(book book);
	
	public ArrayList<book> listBooks();
	
	
}
