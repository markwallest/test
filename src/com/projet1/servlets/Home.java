package com.projet1.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.projet1.beans.Personne;

/**
 * Servlet implementation class Home
 */
@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Home() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		this.getServletContext().getRequestDispatcher("/WEB-INF/home.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		Personne p =  new Personne ();
		p.setNom(request.getParameter("nom"));
		p.setPrenom(request.getParameter("prenom"));
		
		p.save();
		//System.out.println(request.getParameter("nom"));
	    
		HttpSession session = (HttpSession) request.getSession();
		session.setAttribute("login","kakarot");
		Cookie ck = new Cookie("cookie","mouad123");
		ck.setMaxAge(-1);
		response.addCookie(ck);

		this.getServletContext().getRequestDispatcher("/WEB-INF/home.jsp").forward(request, response);
		
		
		
	}

}
