import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Admin on 2017.07.12..
 */

@WebServlet("/test")
public class Test extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter writer = resp.getWriter();
        resp.setContentType("text/html");
        writer.print("<html><body>");
        writer.print("<h3>Hello" + req.getParameter("name") + " Servlet</h3>");
        writer.print("</body></html>");


        writer.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        resp.setContentType("text/html");
        writer.print("<html><body>");
        writer.print("<h3>do post" + req.getParameter("name") + " Servlet</h3>");
        writer.print("</body></html>");


        writer.close();
    }
}
