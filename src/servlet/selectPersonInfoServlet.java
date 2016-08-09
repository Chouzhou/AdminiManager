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
        // if (request.getParameter("type") == "����") {
        try {
            //System.out.println("2222222222222");
            ArrayList per = perd.getItemByNo(request.getParameter("item_No"));
            if (per.isEmpty()) {
                request.getSession().setAttribute("msg", "�Բ���,û�д�id����Ϣ�����������룡");
                request.getSession().setAttribute("dir", "selectPersonInputInfo.jsp");
                RequestDispatcher dispatcher = request.getRequestDispatcher("/alert.jsp");
                dispatcher.forward(request, response); //�ڲ���ת����������Ϣ�洢��request��
            } else {
                /*������ѡ��,�����ݿ��ȡ���пγ�,����request��*/
                request.setAttribute("selectedpublish", per);
                RequestDispatcher dispatcher = request.getRequestDispatcher("/selectPersonInfo.jsp");
                dispatcher.forward(request, response); //�ڲ���ת����������Ϣ�洢��request��
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        /*} else {
            //System.out.print("2222222222222");
            request.getSession().setAttribute("msg", "�Բ������Ȩ�޲���");
            request.getSession().setAttribute("dir", "#");
            RequestDispatcher dispatcher = request.getRequestDispatcher("/mainSurface/alert.jsp");
        }*/
    }
}
