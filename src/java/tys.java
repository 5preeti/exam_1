

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class tys extends HttpServlet {

  
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
            String var=request.getParameter("technology");
            if(var.equals("c"))
            {
              response.sendRedirect("lfk.jsp");
            }
            if(var.equals("cpp"))
            {
                response.sendRedirect("lfk1.jsp");
            }
            if(var.equals("java"))
            {
                response.sendRedirect("lfk2.jsp");
            }
        
        }
    }

    