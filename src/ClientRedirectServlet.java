import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name="ClientRedirectServlet",value = "/send")
public class ClientRedirectServlet extends HttpServlet{
    public  void    doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException{
       request.getSession().setAttribute("session","这是一个客户端跳转呀传递的session");
       request.setAttribute("request","这是一个客户端跳转呀传递的request");
       getServletContext().setAttribute("application","这是一个客户端跳转呀传递的application");
       response.sendRedirect("Revice_info.jsp");
    }
}
