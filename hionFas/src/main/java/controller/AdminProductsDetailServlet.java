package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.AdminMenu;
import model.ProductCategories;
import model.Products;

import java.io.IOException;
import java.util.List;

import dal.AdminMenuDAO;
import dal.ProductCategoriesDAO;
import dal.ProductsDAO;

/**
 * Servlet implementation class AdminProductsDetailServlet
 */
public class AdminProductsDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminProductsDetailServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id_S = request.getParameter("id");
		int productID = Integer.parseInt(id_S);
		
		ProductsDAO pd = new ProductsDAO();
		Products p = pd.getProductById(productID);
		request.setAttribute("ProductDataToDetail", p);
		
		ProductCategoriesDAO cd = new ProductCategoriesDAO();
		List<ProductCategories> listPCategory = cd.getAll();
		request.setAttribute("PCategoryData", listPCategory);
		
		AdminMenuDAO amd = new AdminMenuDAO();
		List<AdminMenu> adminMenuList = amd.getAll();
		request.setAttribute("AdminMenuData", adminMenuList);
		
		request.getRequestDispatcher("/adminweb/views/productsDETAIL.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
