
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class jkl extends HttpServlet {

    
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
           try{     
        String a[]= new String[11];
    for(int i=1;i<11;i++){
      a[i]=request.getParameter("radio"+i);
      System.out.println(a[i]);
    }
    
   
    String b[]= new String[11];
    for(int j=1;j<11;j++){
     b[j]=request.getParameter("ans"+j);
      System.out.println(b[j]);
    }

    int count=0;

    for(int i=1;i<b.length;i++){
     if(a[i].equals(b[i])){
{

      count++;

     
    
     System.out.println(a[i]);
   }
     }
    }
    out.println("<center>");
    out.print("<span style=\"font-size: 40px; font-family: papyrus;\">");
     out.println("Your "+count+" answers are correct");
    out.println("</span>");
    out.println("</centre>");
    out.println("<br>");
    out.println("<br>");
    out.println("<a href=\"tys.jsp\"> TAKE ANOTHER EXAM</a>");
    
    }  
        
      catch(Throwable t)  
      {
          out.println(t);
      }
    }
}