package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bO.BooksBO;
import dto.book;
import dto.worms;

/**
 * Servlet implementation class ListBooksServlet
 */
@WebServlet("/ListBooksServlet")
public class ListBooksServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListBooksServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		worms worm = (worms) request.getSession(false).getAttribute("worm");
		
		BooksBO books = new BooksBO();
		
		ArrayList<book> booklist = books.listBooks(worm.getIdworms());
		
		request.setAttribute("booklist", booklist);
		request.getSession().setAttribute("worm", worm);
		request.getRequestDispatcher("home.jsp").forward(request, response);
	
	}

}
