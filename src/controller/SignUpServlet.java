package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bO.WormsBO;
import dto.worms;

/**
 * Servlet implementation class SignUpServlet
 */
@WebServlet("/SignUpServlet")
public class SignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SignUpServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("name");
		String lastname = request.getParameter("lastname");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String sex = request.getParameter("sex");
		String address = request.getParameter("address");
		String phone = request.getParameter("phone");

		worms worm = new worms(name, lastname, email, password, sex, address, phone);

		WormsBO wBO = new WormsBO();

		if (wBO.register(worm)) {
			wBO.logIn(worm.getMail(), worm.getPassword());
			request.getSession().setAttribute("worm", worm);
			request.getRequestDispatcher("home.jsp").forward(request, response);
			return;

		} else {
			request.getRequestDispatcher("index.jsp").forward(request, response);
			return;
		}

	}

}
