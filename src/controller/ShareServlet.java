package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bO.BooksBO;
import dto.book;
import dto.worms;

/**
 * Servlet implementation class ShareServlet
 */
@WebServlet("/ShareServlet")
public class ShareServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShareServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		worms worm =  (worms) request.getSession(false).getAttribute("worm");
		
		String bookName = request.getParameter("book");
		String description = request.getParameter("description");

		book book = new book();
		
		book.setName(bookName);
		book.setDescription(description);
		
		BooksBO b = new BooksBO();
		
		if(b.addBook(book, worm.getIdworms()) ){
			
			request.getRequestDispatcher("home.jsp").forward(request, response);
				return;
		}else {
			request.getRequestDispatcher("home.jsp").forward(request, response);
			return;
		}
	}

}
