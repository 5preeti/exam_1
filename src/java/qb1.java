
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class qb1 extends HttpServlet {

    
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String p   =  request.getParameter("ques");
   String q   =  request.getParameter("a");
    String r  =  request.getParameter("b");
    String s  =  request.getParameter("c");
   String t   =  request.getParameter("d");
   String u   =  request.getParameter("e");
   try
   {
String sql="insert into cpp_lang values(?,?,?,?,?,?)";
      Class.forName("oracle.jdbc.driver.OracleDriver");
      Connection m= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system","pakhisingh");
      PreparedStatement k=m.prepareStatement(sql);
               k.setString(1, p);
               k.setString(2, q);
                k.setString(3, r);
                k.setString(4, s);
                k.setString(5, t);
                k.setString(6, u);
                 k.executeUpdate();
out.println("<center>");
    out.print("<span style=\"font-size: 30px; font-family: papyrus;\">");
     out.println("VALUES ARE INSERTED SUCCESSFULLY ");
    out.println("</span>");
    out.println("</centre>");
    out.println("<br>");
    out.println("<br>");
    out.println("<a href=\"first.jsp\">HOME </a>");
   }
   catch(Throwable t1)
   {
       
   }
    }
}