package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Servlet implements javax.servlet.Servlet {
	
	private ServletConfig servletConfig;
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		this.servletConfig = arg0;

	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		String username = arg0.getParameter("username");
		String password = arg0.getParameter("password");
		
		ServletContext servletContext = servletConfig.getServletContext();
		String initUserName = servletContext.getInitParameter("user");
		String initPassword = servletContext.getInitParameter("password");
		
		PrintWriter out = arg1.getWriter();
		
		
		if (username.equals(initUserName)&&password.equals(initPassword)) {
			
				System.out.println("µÇÂ½³É¹¦");
				out.println("Success"+username);
			
		}else {
			out.print("faile");
		}
	}

}
