package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.ProductColorJoinColors;
import model.Products;

import java.io.IOException;
import java.util.List;

import dal.ProductColorJoinColorsDAO;
import dal.ProductsDAO;

/**
 * Servlet implementation class QuickViewServlet
 */
public class QuickViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QuickViewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id_S = request.getParameter("id");
		int id = Integer.parseInt(id_S);
		
		ProductsDAO pd = new ProductsDAO();
		Products p = pd.getProductById(id);
		request.setAttribute("QuickViewProduct", p);
		
		ProductColorJoinColorsDAO procolod = new ProductColorJoinColorsDAO();
		List<ProductColorJoinColors> listProColor = procolod.getByProductID(id);
		request.setAttribute("ProductColorData", listProColor);
		
		System.out.println(p.getProductName());
		
		request.getRequestDispatcher("HomeServlet").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
