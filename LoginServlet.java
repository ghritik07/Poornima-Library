import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet{
    public void service(HttpServletRequest req ,HttpServletResponse res) throws IOException{
        String username=req.getParameter("name");
        String password=req.getParameter("pass");
        PrintWriter out=res.getWriter();
        //UNIVERSITY DATABASE KO ADD KRKE EMAILS LESKTE H
        if ("admin".equals(username) && "12345678".equals(password)) {
            RequestDispatcher dispatcher = req.getRequestDispatcher("LIBRARY.html");
                  dispatcher.forward(req, res);
            
        } else {
            out.println("<h1>Invalid Credentials</h1>");
            out.println("<p>Please try again.</p>");
        }
    }
    
    
}
