package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.ProductImage;
import model.Products;

import java.io.IOException;

import dal.ProductImageDAO;
import dal.ProductsDAO;

/**
 * Servlet implementation class AdminProductsImageAddServlet
 */
public class AdminProductsImageAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminProductsImageAddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String image = request.getParameter("image");
		String pid_S = request.getParameter("pid");
		int pid = Integer.parseInt(pid_S);
		
		//declare fake ProductImageID
		int piID = 99;
		
		//image Path
		String insertImage = "mainweb/assets/images/products/" + image;
		
		ProductsDAO pd = new ProductsDAO();
		Products p = pd.getProductById(pid);
		
		ProductImageDAO pidao = new ProductImageDAO();
		ProductImage pi = new ProductImage(piID, p, insertImage);
		
		pidao.insert(pi);
		
		request.getRequestDispatcher("AdminProductsImageServlet?id=" + pid).forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
