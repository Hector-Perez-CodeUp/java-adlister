import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "loginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Hit login doGet");
        try {
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Hit login doPost");
        try {
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            System.out.println(username);
            System.out.println(password);
            if(username != null && password != null) {
                if(username.equalsIgnoreCase("admin") && password.equals("password")) {
                    System.out.println("Sending to profile");
                    request.getSession().setAttribute("isAdmin", true);
                    request.getRequestDispatcher("/WEB-INF/profile.jsp").forward(request, response);
                } else {
                    System.out.println("Sending back to login");
                    response.sendRedirect("/login.jsp");
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }
}
