package app;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/temp-serv")
public class JSPServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("https://javarush.ru/groups/posts/2287-chto-takoe-xml");
        getServletContext().getRequestDispatcher("first-app.jsp").forward(req, resp);

        List<User> users = new ArrayList<>();
        users.add(new User("Vasia", "UK", 18));
        users.add(new User("Nasia", "UA", 35));
        users.add(new User("Katia", "BE", 45));

        req.setAttribute("users", users);
    }
}
