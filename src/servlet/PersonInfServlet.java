package servlet;

import dao.InformationDao;
import dao.PersonDao;
import vo.person;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by paiopiao on 2015/7/3.
 */
@WebServlet("/PersonInf")
public class PersonInfServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //if (request.getParameter("type") == "个人") {
        person per = (person) request.getSession().getAttribute("person");
        InformationDao perd = new InformationDao();
        try {
            ArrayList selectpersoninf = perd.getPersonInfById(per.getId());
            if (selectpersoninf.size() == 0) {
                request.getSession().setAttribute("msg", "对不起没有你的处罚信息");
                request.getSession().setAttribute("dir", "#");
                RequestDispatcher dispatcher = request.getRequestDispatcher("/mainSurface/alert.jsp");
            } else {
                request.setAttribute("selectpersoninf", selectpersoninf);
                RequestDispatcher dispatcher = request.getRequestDispatcher("/person/personAllInfo.jsp");
                dispatcher.forward(request, response);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        /*}else{

        }*/
    }
}
