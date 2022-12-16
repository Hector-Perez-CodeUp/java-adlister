import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="PizzaOrderServlet", urlPatterns = "/pizza-order")
public class PizzaOrderServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String crust = request.getParameter("crust");
        String sauce = request.getParameter("sauce");
        String size = request.getParameter("size");
        String[] topping = request.getParameterValues("checkbox");
        String address = request.getParameter("address");

        PrintWriter out = response.getWriter();
        out.println("<h1>You chose Crust: " + crust + ".  Sauce: " + sauce + ". Size: " + size + "</h1>");
        for (int i = 0; i < topping.length; i++) {
            out.println(topping[i]);
        }

        out.println(address);
    }
}
