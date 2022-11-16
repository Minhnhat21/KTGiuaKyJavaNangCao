package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import bean.tintucbean;
import bo.tintucbo;

/**
 * Servlet implementation class homeController
 */
@WebServlet("/home")
public class homeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public homeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
     	String key_title = request.getParameter("search-title");
     	String key_year = request.getParameter("search-year");
		tintucbo dbo = new tintucbo(); 
        ArrayList<tintucbean> ds = dbo.getTinTuc();
        
        if(key_title != null) ds = dbo.searchTitle(key_title);
      
        if(key_year != null) ds = dbo.searchByYear(key_year);
        
        String thongbao = "";
        
        if(ds.size() > 0) {
        	thongbao = "Số mẫu tìm được: " + ds.size();
        } else {
        	thongbao = "Không tìm thấy mẫu tin nào";
        }
   
        request.setAttribute("dsTin", ds);
        request.setAttribute("thongbaokq", thongbao);
        
        RequestDispatcher rp = request.getRequestDispatcher("/WEB-INF/views/Trangchu.jsp");
        rp.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
