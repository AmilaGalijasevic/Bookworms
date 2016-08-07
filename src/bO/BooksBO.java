package bO;

import java.sql.SQLException;
import java.util.ArrayList;

import dao.Books;
import dto.book;

public class BooksBO implements BooksInterface {
	Books books = new Books();

	@Override
	public boolean addBook(book book, int wormID) {
		if (Helper.bookNotNull(book.getName())) {
			try {
				books.addBook(book, wormID);
				return true;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			return false;
		}
		return false;
	}

	@Override
	public ArrayList<book> listBooks(int wormsID) {
		ArrayList<book> booklist = new ArrayList<>();
		if (Helper.isValidWormId(wormsID)) {
			try {
				booklist = books.listBooks(wormsID);
				return booklist;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			return null;
		}
		return booklist;
	}

	@Override
	public boolean editBook(book book) {

		if (Helper.bookNotNull(book.getName())) {

			try {
				books.editBook(book);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		return false;
	}

	@Override
	public boolean deleteBook(int wormId) {

		if (Helper.isValidWormId(wormId)) {

			try {
				books.deleteBook(wormId);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return false;
	}

}
