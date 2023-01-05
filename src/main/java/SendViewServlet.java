import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SendViewServlet", urlPatterns = "/guess")
public class SendViewServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("/guess.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String userGuess = request.getParameter("user_guess");
        String result = "";

        if (userGuess.equals(2)) {
            result = "correct";
            request.setAttribute("results", result);
            request.getRequestDispatcher("/correct").forward(request, response);

        } else {
            result = "incorrect";
            request.setAttribute("results", result);
            request.getRequestDispatcher("/incorrect").forward(request, response);

        }
    }
}
