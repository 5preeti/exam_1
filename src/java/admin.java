
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class admin extends HttpServlet {

    
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String angle = null;
       
       String name=request.getParameter("box1");
        String psw=request.getParameter("box2");
      if(psw.equals("angle")||name.equals("admin"))
      {
          response.sendRedirect("choiceqb.jsp");
      }
          else
           {
               out.println("<center>");
               out.print("<span style=\"font-size: 50px; font-family: serif;font-weight: bold;color:red;\">"); 
               out.println("<a href=\"first.jsp\"><img src=\"error-icon.png\" width=\"350\" height=\"350\" /></a>");
               out.println("</span>");
               out.println("</center>");
           }
           }
    }

            