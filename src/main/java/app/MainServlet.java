package app;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@WebServlet(urlPatterns = "/cool-test/*")
public class MainServlet extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        log("sraka");
    }
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        resp.getWriter().write("sraka2" + uri + "\nparams\n");
    }

    private void formatParams(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String params= req.getParameterMap()
                .entrySet()
                .stream()
                .map(entry -> {String param = String.join (" and " , entry.getValue());
                return entry.getKey() + "=>" + param;})
                .collect(Collectors.joining("\n"));
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // code copying - codesmell :((
        String uri = req.getRequestURI();
        resp.getWriter().write("sraka3" + uri + "\nparams\n");
    }

    @Override
    public void destroy() {

    }
}
