package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.HomeSlider;
import model.Menu;
import model.ProductCategories;
import model.Products;

import java.io.IOException;
import java.util.List;

import dal.HomeSliderDAO;
import dal.MenuDAO;
import dal.ProductCategoriesDAO;
import dal.ProductsDAO;

/**
 * Servlet implementation class HomeServlet
 */
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
		//HomeSlider
		HomeSliderDAO sd = new HomeSliderDAO();
		List<HomeSlider> listSlider = sd.getAll();
		request.setAttribute("HomeSliderData", listSlider);
				
		//Products
		ProductsDAO pd = new ProductsDAO(); 
		List<Products> listProduct = pd.getAll(); 
		request.setAttribute("ProductData",listProduct);
				
		//Product Categories
		ProductCategoriesDAO cd = new ProductCategoriesDAO();
		List<ProductCategories> listPCategory = cd.getAll();
		request.setAttribute("PCategoryData", listPCategory);
				
		//Menu
		MenuDAO md = new MenuDAO();
		List<Menu> listMenu = md.getAll();
		request.setAttribute("MenuData", listMenu);
		
		//CategoryBanner
		ProductCategoriesDAO cdbanner = new ProductCategoriesDAO();
		List<ProductCategories> listPCategory3 = cdbanner.getProductCategoriesLimit3();
		request.setAttribute("CategoryBannerData", listPCategory3);
				
				
		request.getRequestDispatcher("/mainweb/views/index.jsp").forward(request, response);
	}

}
