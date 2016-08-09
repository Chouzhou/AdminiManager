package servlet;

import dao.ManagerDao;
import vo.manager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by paiopiao on 2015/7/3.
 */
@WebServlet("/updPerInfo")
public class updatePersonInfoServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//System.out.print("2222222222222");
        request.setCharacterEncoding("utf-8");
        // if (request.getParameter("type") == "管理员") {
        try {
            //System.out.println("2222222222222");
            manager mana = new manager();
            mana.setUser_id(request.getParameter("id"));
            mana.setUser_Name(request.getParameter("name"));
            mana.setUser_Password(request.getParameter("password"));
            mana.setUser_Email(request.getParameter("Email"));
            mana.setUser_Tel(request.getParameter("Tel"));
            mana.setUser_Card(request.getParameter("card"));
            mana.setUser_Tname(request.getParameter("Tname"));
            mana.setUser_address(request.getParameter("address"));
            mana.setUser_Tel(request.getParameter("user.Tel"));
            mana.setUser_Office(request.getParameter("user_office"));
            mana.setComment(request.getParameter("comment"));
            ManagerDao manad = new ManagerDao();
            //manad.upateUser(mana);
            response.sendRedirect("/index.jsp");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        /*} else {
            //System.out.print("2222222222222");
            request.getSession().setAttribute("msg", "对不起你的权限不够");
            request.getSession().setAttribute("dir", "#");
            RequestDispatcher dispatcher = request.getRequestDispatcher("/mainSurface/alert.jsp");
        }*/
    }
}
