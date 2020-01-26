

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class choiceqb extends HttpServlet {

  
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
            String var=request.getParameter("technology");
            if(var.equals("qbc"))
            {
              response.sendRedirect("qb.jsp");
            }
            if(var.equals("qbcpp"))
            {
                response.sendRedirect("qb1.jsp");
            }
            if(var.equals("qbjava"))
            {
                response.sendRedirect("qb2.jsp");
            }
        
        }
    }

    