package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.AdminMenu;
import model.ProductImage;
import model.Products;

import java.io.IOException;
import java.util.List;

import dal.AdminMenuDAO;
import dal.ProductImageDAO;
import dal.ProductsDAO;

/**
 * Servlet implementation class AdminProductsImageServlet
 */
public class AdminProductsImageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminProductsImageServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id_S = request.getParameter("id");
		int productID = Integer.parseInt(id_S);
		
		ProductImageDAO pidao = new ProductImageDAO();
		List<ProductImage> pImageList = pidao.getByProductID(productID);
		request.setAttribute("ProductImageList", pImageList);
		
		ProductsDAO pd = new ProductsDAO();
		Products p = pd.getProductById(productID);
		request.setAttribute("ProductData", p);
		
		AdminMenuDAO amd = new AdminMenuDAO();
		List<AdminMenu> adminMenuList = amd.getAll();
		request.setAttribute("AdminMenuData", adminMenuList);
		
		request.getRequestDispatcher("/adminweb/views/productsIMAGE.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
