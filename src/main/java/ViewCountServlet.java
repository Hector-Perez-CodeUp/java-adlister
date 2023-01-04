import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ViewCountServlet {
    @WebServlet(name = "viewCounterServlet", urlPatterns = "/showCount")
    public class viewCounterServlet extends HttpServlet {
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
            int pageCount = 0;
            pageCount += 1;
            response.getWriter().println(pageCount);
        }
    }
}
