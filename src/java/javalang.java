
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class javalang extends HttpServlet {
        ResultSet rs=null;
    public void init()
    {try
    {
      String query="select * from java";
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection m1= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system","pakhisingh");
            Statement s= m1.prepareStatement(query);
            rs=s.executeQuery(query);  
    }
    catch(Throwable t)
    {
        System.out.println(t);   
    }
    }


    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter(); 
                        try
        {
          String s0 ="";
        String s1="";
         String s2="";
           String s3="";
           String s4="";
          
       
        

        rs.next();
          {
             s0=rs.getString("Question");
               s1=rs.getString("A");
               s2=rs.getString("B");
              s3=rs.getString("C");
              s4=rs.getString("D");
              out.println("<html>");
               out.println("<body>");
                out.println("<form action=javalang method=post>");
     out.println("<br>");         
     out.println("<br>"); 
     out.print("<h3 style=\"color: red;\">");
     out.println(s0);
     out.print("</h3>");
     out.println("<br>");
   
     
  out.println("<input type=radio name=r1 value=s1>");
  out.print("<span style=\"font-size: 20px; font-family: papyrus;\">");
     out.println(s1);
     out.println("</span>");
     out.println("<br>");
     
  out.println("<input type=radio name=r1>");
  
  out.print("<span style=\"font-size: 20px; font-family: papyrus;\">");
    out.println(s2);
      out.println("</span>");
    out.println("<br>");
    
  out.println("<input type=radio name=r1>");
  
  out.print("<span style=\"font-size: 20px; font-family: papyrus;\">");
   out.println(s3);
     out.println("</span>");
   out.println("<br>");
   
  out.println("<input type=radio name=r1>");
  
  out.print("<span style=\"font-size: 20px; font-family: papyrus;\">");
   out.println(s4);
     out.println("</span>");
     out.println("\n" +
"          <input style=\"margin-left: 40%; font-size: 25px;\" type=\"submit\" value=\"submit\">");
      out.println("</form>");
       out.println("</body>");
        out.println("</html>");
          }
        }
          catch(Throwable t)
                  {
                  
                  }


    }
}