package servlet;

import dao.CompanyDao;
import dao.ManagerDao;
import dao.PersonDao;
import vo.company;
import vo.manager;
import vo.person;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by paiopiao on 2015/6/30.
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //String code=request.getParameter("code");//��֤��
        String password = request.getParameter("password");//����
        String username = request.getParameter("username");//�û���
        String type = request.getParameter("type");//��ݣ�����Ա�����ˡ���ҵ��
        if (username != null && !username.equals("")) {
            //����Ա��¼
            if (type.equals("m")) {
                ManagerDao dmana = new ManagerDao();
                type = "����Ա";
                try {
                    //��֤����Ա��Ϣ�Ƿ���ȷ
                    // System.out.println("555555555555555555555");
                    manager mana = dmana.getManaById(username);
                    // System.out.println("555555555555555555555");
                    if (mana == null || !mana.getPassword().equals(password)) {
                        System.out.println("555555555555555555555");
                        request.getSession().setAttribute("msg", "��¼�������������������룡");
                        request.getSession().setAttribute("dir", "/Login.jsp");
                        RequestDispatcher dispatcher = request.getRequestDispatcher("/alert.jsp");
                        dispatcher.forward(request, response);
                    } else {
                        //System.out.println("555555555555555555555");
                        request.getSession().setAttribute("mana", mana);
                        request.getSession().setAttribute("mname", mana.getMname());
                        request.getSession().setAttribute("type", type);
                        request.getSession().setAttribute("flush", "Login");
                        response.sendRedirect("/index.jsp");
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            } else if (type.equals("p")) {
                PersonDao dper = new PersonDao();
                type = "����";
                try {
                    //�ж��Ƿ��Ǹ����û�
                    person per = dper.getPersonById(username);
                    if (per == null || !per.getPassword().equals(password)) {
                        request.getSession().setAttribute("msg", "��������������������룡");
                        request.getSession().setAttribute("dir", "Login.jsp");
                        RequestDispatcher dispatcher = request.getRequestDispatcher("mainSurface/alert.jsp");
                        dispatcher.forward(request, response);
                    } else {
                        request.getSession().setAttribute("per", per);
                        request.getSession().setAttribute("pname", per.getPname());
                        request.getSession().setAttribute("type", type);
                        request.getSession().setAttribute("flush", "Login");
                        response.sendRedirect("mainSurface/index.jsp");
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            } else if (type.equals("c")) {
                CompanyDao comd = new CompanyDao();
                type = "��ҵ";
                try {
                    //�ж��Ƿ�����ҵ�û�
                    company com = comd.getCompanyById(username);
                    if (com == null || !com.getPassword().equals(password)) {
                        request.getSession().setAttribute("msg", "��������������������룡");
                        request.getSession().setAttribute("dir", "Login.jsp");
                        RequestDispatcher dispatcher = request.getRequestDispatcher("mainSurface/alert.jsp");
                        dispatcher.forward(request, response);
                    } else {
                        request.getSession().setAttribute("com", com);
                        request.getSession().setAttribute("cname", com.getCname());
                        request.getSession().setAttribute("type", type);
                        request.getSession().setAttribute("flush", "Login");
                        response.sendRedirect("mainSurface/index.jsp");
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
