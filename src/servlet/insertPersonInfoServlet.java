package servlet;

import dao.PersonDao;
import sun.rmi.server.Dispatcher;
import vo.person;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by paiopiao on 2015/7/3.
 */
@WebServlet("/insPerInfo")
public class insertPersonInfoServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //System.out.print("2222222222222");
        request.setCharacterEncoding("utf-8");
        // if (request.getParameter("type") == "管理员") {
        try {
            //System.out.println("2222222222222");
            person per = new person();
            per.setP_case_Party(request.getParameter("party"));
            per.setP_case_Source(request.getParameter("source"));
            per.setP_case_Email(request.getParameter("Email"));
            per.setP_case_linkman(request.getParameter("linkman"));
            per.setP_case_linkman_Phone(request.getParameter("linkman_phone"));
            per.setP_case_linkman_Tel(request.getParameter("linkman_tel"));
            per.setP_case_Agent(request.getParameter("agent"));
            per.setP_case_Time(request.getParameter("time"));
            per.setP_case_describe(request.getParameter("describe"));
            per.setP_case_discretion(request.getParameter("discretion"));
            per.setP_case_punish_basis(request.getParameter("pubnish_basis"));
            per.setP_case_Upload(request.getParameter("upload"));
            PersonDao perd = new PersonDao();
            perd.insertCase(per);
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
