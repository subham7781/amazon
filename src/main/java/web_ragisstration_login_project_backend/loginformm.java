package web_ragisstration_login_project_backend;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/loginform12")
public class loginformm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public loginformm() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String email = request.getParameter("email1");
		String pass = request.getParameter("pass1");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","Subham@123");
			Statement stmnt = con.createStatement();
			ResultSet result = stmnt.executeQuery("select * from registrtion where email='"+email+"' and password='"+pass+"'");
			if (result.next()) {
				HttpSession session = request.getSession();
				session.setAttribute("session_name",result.getString("Name"));
				RequestDispatcher rd = request.getRequestDispatcher("/profile.jsp");
	            rd.include(request, response);
			} else {
             out.print("<h3 style='color:red'> Email id and password did not matched</h3>");
             RequestDispatcher rd = request.getRequestDispatcher("/login.jsp");
             rd.include(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
