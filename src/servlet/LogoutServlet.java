package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by paiopiao on 2015/7/2.
 */
@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*��������session����ת�ص�¼����*/
        response.setHeader("Cache-Control", "no-cache");
        request.getSession().invalidate();
        request.getSession().setAttribute("flush", "logout");
        request.getSession().setAttribute("type", "�ο�");
        response.sendRedirect("Login.jsp");
    }
}
