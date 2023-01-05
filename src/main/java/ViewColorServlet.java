import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ViewColorServlet", urlPatterns = "/view-color")
public class ViewColorServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String favColor = request.getParameter("favColor");
        request.setAttribute("color", favColor);
        request.getRequestDispatcher("/view-color.jsp").forward(request, response);
    }
}
