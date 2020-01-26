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

public class clang extends HttpServlet {
 ResultSet rs=null;
    public void init()
    {try
    {
      String query="select * from clanguage";
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
         String s5=""; String s6=""; String s7=""; String s8=""; String s9="";String s11="";
        String s12="";String s13="";String s14="";String s15="";String a="";String b="";String c="";String d="";
        String e="";String f="";String g="";String h="";String i="";String j="";String k="";String l="";String m="";String n="";String o="";



          rs.next();
          {
             s0=rs.getString("Question");
               s1=rs.getString("A1");
               s2=rs.getString("A2");
              s3=rs.getString("A3");
              s4=rs.getString("A4");
              s5=rs.getString("A5");
              out.println("<html>");
               out.println("<body>");
                out.println("<form action=clang method=post>");
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

                {

        }



          }
        }
          catch(Throwable t)
                  {

                  }


out.println(" <a href=\"marks1\"> Finish</a>\n" +
"");
        }
}