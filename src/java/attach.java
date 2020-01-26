

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class attach extends HttpServlet {

    
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String a= request.getParameter("nm");
        String b= request.getParameter("mail");
        Long c=Long.parseLong(request.getParameter("mb"));
     
        String d= request.getParameter("gen");
        String e= request.getParameter("ct");
        String f= request.getParameter("psw");
        String g= request.getParameter("psw1");
        
        try
        {
          String sql="insert into onln values(?,?,?,?,?,?,?)";
      Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection m= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system","pakhi singh");
               PreparedStatement p=m.prepareStatement(sql);
               p.setString(1, a);
               p.setString(2, b);
                p.setLong(3, c);
                p.setString(4, d);
                p.setString(5, e);
                p.setString(6, f);
                 p.setString(7, g);
                p.executeUpdate();
                if(f.equals(g))
                {
                    out.println("<center>");
    out.print("<span style=\"font-size: 30px; font-family: papyrus;\">");
     out.println("account is created");
    out.println("</span>");
    out.println("<br>");
    out.println("<a href=\"index.html\">LOGIN HERE</a>");
    out.println("</centre>");
                }
                else
                {
                 out.println("<center>");
    out.print("<span style=\"font-size: 30px; font-family: papyrus;\">");
     out.println("password is not match");
    out.println("</span>");
    
    out.println("</centre>");
                }
                
                System.out.println("successfully login");
             m.close();
           } catch (ClassNotFoundException | SQLException ex) {
           out.println(ex);
        }

            

        
    }
}      