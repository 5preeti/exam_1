
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class cp extends HttpServlet {

    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String name = request.getParameter("nm");
        String old = request.getParameter("op");
        String nw = request.getParameter("np");
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection m1 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "pakhi singh");
            Statement st = m1.createStatement();
            String query = "select password from onln where name='" + name + "'";
           
            ResultSet rs = st.executeQuery(query);
          

      
                while (rs.next() == true) {
                    String pass = rs.getString("password");
                    if (old.equals(pass)) {

                        String sql = "update onln set password='" + nw + "'where name='" + name + "'";
                        Statement s = m1.createStatement();
                        s.executeUpdate(sql);
                        out.println(" <script>\n"
                                + "            alert(\"password changed successfully\");\n"
                                + "            window.location=\"index.html\";\n"
                                + "        </script>");

                    } else if (!old.equals(pass)) {

                        out.println(" <script>\n"
                                + "            alert(\"old password does not match\");\n"
                                + "            window.location=\"cp.jsp\";\n"
                                + "        </script>");
                    }
                }
            

        } catch (Throwable t) {
            out.println(t.getMessage());
        }

    }

}
