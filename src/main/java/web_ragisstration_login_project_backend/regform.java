package web_ragisstration_login_project_backend;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/regform")
public class regform extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
        public regform() {
        super();
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		    PrintWriter out = response.getWriter();
		    response.setContentType("text/html");
			String name = request.getParameter("name1");
			String email = request.getParameter("email1");
			String pass = request.getParameter("pass1");
			String gender = request.getParameter("gender1");
			String city = request.getParameter("city1");
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","Subham@123");
				Statement stmnt = con.createStatement();
				int count = stmnt.executeUpdate("insert into registrtion values('"+name+"','"+email+"','"+pass+"','"+gender+"','"+city+"')");
				if (count > 0) {
					out.print("<h3 style='color:white'> registration successfull</h3>");
					RequestDispatcher rd = request.getRequestDispatcher("/ragistration.jsp");
					rd.include(request, response);
				} else {
					 response.setContentType("text/html");
					out.print("<h3 style='color:red'> registration not successfull</h3>");
					RequestDispatcher rd = request.getRequestDispatcher("/ragistration.jsp");
					rd.include(request, response);
				}
			} catch (Exception e) {
				e.printStackTrace();			}
	}

}
