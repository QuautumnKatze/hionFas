package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.Login;

import java.io.IOException;

import dal.LoginDAO;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
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

		String u = request.getParameter("user");
		String p = request.getParameter("pass");
		String r = request.getParameter("remember");
		Login l = new LoginDAO().check(u, p);

		Cookie cu = new Cookie("cuser", u);
		Cookie cp = new Cookie("cpass", p);
		Cookie cr = new Cookie("crem", r);

		if (r != null) {
			cu.setMaxAge(7 * 60 * 60 * 24);
			cp.setMaxAge(7 * 60 * 60 * 24);
			cr.setMaxAge(7 * 60 * 60 * 24);
		} else {
			cu.setMaxAge(0);
			cp.setMaxAge(0);
			cr.setMaxAge(0);
		}
		response.addCookie(cu);
		response.addCookie(cp);
		response.addCookie(cr);

		HttpSession session = request.getSession();
		if (l == null) {
			request.setAttribute("error", "Tài khoản hoặc mật khẩu sai, vui lòng kiểm tra lại");
			request.getRequestDispatcher("/mainweb/views/login.jsp").forward(request, response);
		} else {
			session.setAttribute("account", l);
			if (l.getRole() == 1) {
				request.getRequestDispatcher("AdminHomeServlet").forward(request, response);

			} else {
				request.getRequestDispatcher("HomeServlet").forward(request, response);
			}
		}
	}
	/*
	 * public static void main(String[] args) {
	 * System.out.println(LoginDAO.check("admin", "123456")); }
	 */
}
