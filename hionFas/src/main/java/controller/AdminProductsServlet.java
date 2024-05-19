package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.AdminMenu;
import model.Products;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import dal.AdminMenuDAO;
import dal.ProductsDAO;

/**
 * Servlet implementation class AdminProductsServlet
 */
public class AdminProductsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminProductsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AdminMenuDAO amd = new AdminMenuDAO();
		List<AdminMenu> adminMenuList = amd.getAll();
		request.setAttribute("AdminMenuData", adminMenuList);
		
		ProductsDAO pd = new ProductsDAO();
		List<Products> productList = new ArrayList<Products>();
		productList = pd.getAll();
		request.setAttribute("ProductData", productList);
		
		request.getRequestDispatcher("/adminweb/views/products.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
