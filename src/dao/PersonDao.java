package dao;

import sun.security.action.GetIntegerAction;
import sun.security.util.Password;
import vo.company;
import vo.person;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.*;
import java.util.ArrayList;

/**
 * Created by paiopiao on 2015/7/1.
 */

/**
 * @author Administrator
 */
public class PersonDao extends DataBase {
    public person getPersonById(String id) throws Exception {
        person per = null;
        String sql = "";
        initConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
            per = new person();
            per.setId(id);
            per.setPassword(rs.getString("user_Password"));
            per.setPname(rs.getString("user_Name"));
            /*per.setSex(rs.getString(sex));*/
        }
        stmt.close();
        rs.close();
        closeConnection();
        return per;
    }

    /**
     * FunName:           insertCase
     * Description :      添加案件
     *
     * @param： person per
     * @return： void
     */

    public void insertCase(person per) throws Exception {
        this.initConnection();
        String sql = "insert into personal_caseinfo(p_case_Party,p_case_Source,p_case_Email,p_case_linkman,p_case_linkman_Phone,p_case_linkman_Tel,p_case_Agent,p_case_Time,p_case_describe,p_case_discretion,p_case_punish_basis,p_case_Upload) values(?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, per.getP_case_Party());
        ps.setString(2, per.getP_case_Source());
        ps.setString(3, per.getP_case_Email());
        ps.setString(4, per.getP_case_linkman());
        ps.setString(5, per.getP_case_linkman_Phone());
        ps.setString(6, per.getP_case_linkman_Tel());
        ps.setString(7, per.getP_case_Agent());
        ps.setString(8, per.getP_case_Time());
        ps.setString(9, per.getP_case_describe());
        ps.setString(10, per.getP_case_discretion());
        ps.setString(11, per.getP_case_punish_basis());
        ps.setString(12, per.getP_case_Upload());
        ps.executeUpdate();
        this.closeConnection();
    }

    /**
     * FunName:           updateCase
     * Description :      修改案件
     *
     * @param： person per
     * @return： void
     */

    public void updateCase(person per) throws Exception {
        this.initConnection();
        String sql = "update set personal_caseinfo p_case_Party=?,p_case_Source=?,p_case_Email=?,p_case_linkman=?,p_case_linkman_Phone=?,p_case_linkman_Tel=?,p_case_Agent=?,p_case_Time=?,p_case_describe=?,p_case_discretion=?,p_case_punish_basis=?,p_case_Upload=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, per.getP_case_Party());
        ps.setString(2, per.getP_case_Source());
        ps.setString(3, per.getP_case_Email());
        ps.setString(4, per.getP_case_linkman());
        ps.setString(5, per.getP_case_linkman_Phone());
        ps.setString(6, per.getP_case_linkman_Tel());
        ps.setString(7, per.getP_case_Agent());
        ps.setString(8, per.getP_case_Time());
        ps.setString(9, per.getP_case_describe());
        ps.setString(10, per.getP_case_discretion());
        ps.setString(11, per.getP_case_punish_basis());
        ps.setString(12, per.getP_case_Upload());
        ps.executeUpdate();
        this.closeConnection();
    }

    /**
     * FunName:           getCaseBySerialnum
     * Description :      根据案件流水号获取案件接受部门和当前状态
     *
     * @param： int serialnum
     * @return： ArrayList
     */

    public ArrayList getCaseBySerialnum(int serialnum) throws Exception {
        this.initConnection();
        ArrayList al = new ArrayList();
        Statement stat = conn.createStatement();
        String sql = "select p_case_Recedepart,p_case_State from personal_caseinfo where p_case_Serialnum='" + serialnum + "'";
        ResultSet rs = stat.executeQuery(sql);
        while (rs.next()) {
            person per = new person();
            per.setP_case_Recedepart("p_case_Recedepart");
            per.setP_case_State("p_case_State");
            al.add(per);
        }
        this.closeConnection();
        return al;
    }

    /**
     * Funname: getItemByNo
     * Describe:通过事项编号查询
     *
     * @param no
     * @return
     * @throws Exception
     */
    public ArrayList getItemByNo(String no) throws Exception {
        this.initConnection();
        ArrayList al = new ArrayList();
        Statement state = conn.createStatement();
        String sql = "select item_Solvedepart,item_Punishcategory,item_Punishstandard from punish_info where item_No='no'";
        ResultSet rs = state.executeQuery(sql);
        while (rs.next()) {
            person per = new person();
            per.setItem_Solvedepart("item_Solvedepart");
            per.setItem_Punishcategory("item_Punishcategory");
            per.setItem_Punishstandard("item_Punishstandard");
            al.add(per);
        }
        this.closeConnection();
        return al;
    }

    public int getCaseByDepart(String Btime, String Ftime, String depart) throws Exception {
        this.initConnection();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date btime = null;
        Date ftime = null;
        try {
            btime = format.parse(Btime);
            ftime = format.parse(Ftime);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Statement state = conn.createStatement();
        String sql = "selcet count(p_case_No) as  from personal_caseinfo where p_case_Recedepart='" + depart + "'  and p_case_Time>btime and p_case_Finishtime<ftime ";
        ResultSet rs = state.executeQuery(sql);
        int totle_case = rs.getInt(1);
        return totle_case;
    }

}
