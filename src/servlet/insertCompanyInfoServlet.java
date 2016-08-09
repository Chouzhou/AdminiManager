package servlet;

import dao.CompanyDao;
import vo.company;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by paiopiao on 2015/7/3.
 */
@WebServlet("/insComInfo")
public class insertCompanyInfoServlet extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //System.out.print("2222222222222");
        request.setCharacterEncoding("utf-8");
        // if (request.getParameter("type") == "管理员") {
        try {
            //System.out.println("2222222222222");
            company com = new company();
            com.setE_case_Party(request.getParameter("party1"));
            com.setE_case_Source(request.getParameter("source1"));
            com.setE_case_Email(request.getParameter("Email1"));
            com.setE_case_linkman(request.getParameter("linkman1"));
            com.setE_case_linkman_Phone(request.getParameter("linkman_phone1"));
            com.setE_case_linkman_Tel(request.getParameter("linkman_tel1"));
            com.setE_case_Agent(request.getParameter("agent1"));
            com.setE_case_Time(request.getParameter("time1"));
            com.setE_case_describe(request.getParameter("describe1"));
            com.setE_case_discretion(request.getParameter("discretion1"));
            com.setE_case_punish_basis(request.getParameter("pubnish_basis1"));
            com.setE_case_Upload(request.getParameter("upload1"));
            CompanyDao comd = new CompanyDao();
            comd.insertCase(com);
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
