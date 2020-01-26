

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class wall extends HttpServlet {

    
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
       String name=request.getParameter("box1");
        String psw=request.getParameter("box2");
      
        try
        {
          Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection m= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system","pakhi singh");
            Statement s=m.createStatement();
            String sql="select password from onln where name='"+name+"'";
            ResultSet rs=s.executeQuery(sql);
             String h="";
            while(rs.next()==true)
            {
                h=rs.getString("password");
            }
           if(h.equals(psw))
           {
              response.sendRedirect("first.jsp");
           }
           else
           {
               response.sendRedirect("index.html");
           }
            
              
        }
        catch(Throwable t)
        {
            System.out.println(t);
        }
    }
}