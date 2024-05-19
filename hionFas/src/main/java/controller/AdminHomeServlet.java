package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.AdminMenu;

import java.io.IOException;
import java.util.List;

import dal.AdminMenuDAO;

/**
 * Servlet implementation class AdminHomeServlet
 */
public class AdminHomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminHomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Home(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	protected void Home(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AdminMenuDAO amd = new AdminMenuDAO();
		List<AdminMenu> adminMenuList = amd.getAll();
		request.setAttribute("AdminMenuData", adminMenuList);
		
		request.getRequestDispatcher("/adminweb/views/index.jsp").forward(request, response);
	}

}
