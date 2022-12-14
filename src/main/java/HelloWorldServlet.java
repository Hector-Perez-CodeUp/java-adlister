import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {
    private int hitCount;

    public void init() {
        hitCount = 0;
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        hitCount++;
        PrintWriter countOut = res.getWriter();
        String title = "Total number of hits:";
        countOut.println(title + hitCount);

        String name = req.getParameter("name");
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        String cust = name == null || name.isEmpty()?"World!":name;
        out.printf("<h1>Hello, %s", cust);
        out.println("<h1>Hello, World qt3.14</h1>");
        out.printf("<h1>Hello, %s", cust);
    }
}
