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
 * Servlet implementation class AdminProductsEditServlet
 */
public class AdminProductsEditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminProductsEditServlet() {
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
		System.out.println(p.isActive());
		request.setAttribute("ProductDataToUpdate", p);
		
		ProductCategoriesDAO cd = new ProductCategoriesDAO();
		List<ProductCategories> listPCategory = cd.getAll();
		request.setAttribute("PCategoryData", listPCategory);
		
		AdminMenuDAO amd = new AdminMenuDAO();
		List<AdminMenu> adminMenuList = amd.getAll();
		request.setAttribute("AdminMenuData", adminMenuList);
		
		request.getRequestDispatcher("/adminweb/views/productsEDIT.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pid_S = request.getParameter("pid");
		String cid_S = request.getParameter("cid");
		String name = request.getParameter("name");
		String image = request.getParameter("image");
		String shortDes = request.getParameter("shortDes");
		String description = request.getParameter("des");
		String price_S = request.getParameter("price");
		String weight = request.getParameter("weight");
		String material = request.getParameter("material");
		String origin = request.getParameter("origin");
		String dimension = request.getParameter("dimension");
		String isActive_S = request.getParameter("isActive");
		String isNew_S = request.getParameter("isNew");
		String isBestSeller_S = request.getParameter("isBestSeller");
		
		
		//Convert String to other datatype
		Double price = Double.parseDouble(price_S);
		int pid = Integer.parseInt(pid_S);
		int cid = Integer.parseInt(cid_S);
		boolean isActive = isActive_S != null && isActive_S.equals("on");
		boolean isNew = isNew_S != null && isNew_S.equals("on");
		boolean isBestSeller = isBestSeller_S != null && isBestSeller_S.equals("on");

		//Get Category from categoryID
		ProductCategoriesDAO pcd = new ProductCategoriesDAO();
		ProductCategories cate = pcd.getProductCategoriesById(cid);
		
		//image Path
		String insertImage = "mainweb/assets/images/products/" + image;
		
		//Declare Products class
		ProductsDAO pd = new ProductsDAO();
		Products p = new Products(pid, name, insertImage, cate, shortDes, description, price, weight, material, origin, dimension, isActive, isNew, isBestSeller);
		
		//Update to database
		pd.update(p);
		
		request.getRequestDispatcher("AdminProductsServlet").forward(request, response);
	}

}
