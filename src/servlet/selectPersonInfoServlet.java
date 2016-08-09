package servlet;

import dao.PersonDao;

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
@WebServlet("/selPerInfo")
public class selectPersonInfoServlet extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //System.out.print("2222222222222");
        request.setCharacterEncoding("utf-8");
        PersonDao perd = new PersonDao();
        // if (request.getParameter("type") == "个人") {
        try {
            //System.out.println("2222222222222");
            ArrayList per = perd.getItemByNo(request.getParameter("item_No"));
            if (per.isEmpty()) {
                request.getSession().setAttribute("msg", "对不起,没有此id的信息！请重新输入！");
                request.getSession().setAttribute("dir", "selectPersonInputInfo.jsp");
                RequestDispatcher dispatcher = request.getRequestDispatcher("/alert.jsp");
                dispatcher.forward(request, response); //内部跳转，将处理信息存储在request中
            } else {
                /*若可以选课,从数据库获取所有课程,放入request中*/
                request.setAttribute("selectedpublish", per);
                RequestDispatcher dispatcher = request.getRequestDispatcher("/selectPersonInfo.jsp");
                dispatcher.forward(request, response); //内部跳转，将处理信息存储在request中
            }
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
