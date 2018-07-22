package Servlet;


import java.io.IOException;   
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controller.Controller;
import DatabaseENUM.NameENUM;
import Model.Model;


@WebServlet(urlPatterns="/RegistrationServlet", description="Описание", displayName="displayName")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Controller controller = new Controller();
	private Model model = new Model();
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
														throws ServletException, IOException {
		NameENUM[] names = NameENUM.values();
		String name = request.getParameter("firstName");
		if(!controller.checkValidation(controller.name_regex, name)){
			response.sendRedirect(request.getContextPath() + "/WrongInput.html");
			return;
		}
		for(NameENUM DBname : names){
			if(model.checkInputbyEquailty(name, DBname)){
				response.sendRedirect(request.getContextPath() + "/WrongInput.html");
				return;
			}
		}
		String surname = request.getParameter("secondName");
		if(!controller.checkValidation(controller.surname_regex, surname)){
			response.sendRedirect(request.getContextPath() + "/WrongInput.html");
			return;
		}
		String email = request.getParameter("email");
		if(!controller.checkValidation(controller.email_regex, email)){
			response.sendRedirect(request.getContextPath() + "/WrongInput.html");
			return;
		}
		else{
			response.setContentType("text/html;charset=utf-8");
			PrintWriter out = response.getWriter();
			out.println("<h3>Здравствуйте, " + name + "</h3>");
			out.close();
		}
	}	
	/*protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
	}*/
}