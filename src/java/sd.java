
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class sd extends HttpServlet {
   
    
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try
        {
            String name=request.getParameter("name");
             String query="select * from onln where name='"+name+"'";
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection m1= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system","pakhi singh");
            Statement s= m1.prepareStatement(query);
            ResultSet rs=s.executeQuery(query); 
          String s0 ="";
        String s1="";
         String s2="";
           String s3="";
           String s4="";
           out.println("<a href=\"first.jsp\"><img src=\"home-animated-pastels.gif\" width=\"50\" height=\"50\" /></a>");
           
           out.println("<head>");
           out.println("<center>");
           out.print("<span style=\"font-size: 80px; font-family: serif;font-weight: bold;\">");
           out.println("STUDENT DETAIL");
           out.println("</span>");
           out.println("</center>");
           out.println("<link rel=\"stylesheet\" href=\"sd.css\">");
           
           out.println("<center>");
           out.println("<table width=60% border=1>");
           out.println("<br>");
           out.println("<br>");
           out.println("<br>");
           out.println("<br>");
           out.println("<br>");
           out.println("<br>");
           out.println("<br>");
           out.println("<br>");
           out.println("<br>");
           out.println("<br>");
           out.println("<br>");out.println("<br>");
           out.println("<br>");
           out.println("<br>");
           
            ResultSetMetaData rsmd=rs.getMetaData();
            int total=rsmd.getColumnCount();
            out.println("<tr>");
            for(int i=1;i<=total;i++)
            {
                out.println("<th>"+rsmd.getColumnName(i)+"</th>");
            }
          out.println("</tr>");
       
        

        rs.next();
          {
             s0=rs.getString("name");
               s1=rs.getString("email");
               s2=rs.getString("mobile_no");
              s3=rs.getString("gender");
              s4=rs.getString("city");
              
            // out.print(s0);
            // out.print(s1);
            // out.print(s2);
           // out.print(s3);
            // out.print(s4);
             out.println("<tr><td>"+s0+"</td><td>"+s1+"</td><td>"+s2+"</td><td>"+s3+"</td><td>"+s4+"</td></tr>");
             
         out.println("</table>");
         out.println("</center>");
         out.println("</head>");
          }
        }
          catch(Throwable t)
                  {
                  out.print(t);
                  }

       
    }
}