import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ProductDiscountCalculator", value = "/Converter")
public class ProductDiscountCalculator extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String description = request.getParameter("ProductDescription");
        float price = Float.parseFloat(request.getParameter("ListPrice"));
        float discount = Float.parseFloat(request.getParameter("DiscountPercent"));

        float total = price-price * discount;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>Product Description: " + description + "</h1>" + "<br>");
        writer.println("<h1>List Price: " + price + "</h1>" + "<br>");
        writer.println("<h1>Discount Percent: " + discount + "</h1>" + "<br>");
        writer.println("<h1>total price: " + total + "</h1>");
        writer.println("</html>");
    }
}
