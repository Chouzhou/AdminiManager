package dao;

import vo.company;
import vo.person;

import java.sql.*;
import java.util.ArrayList;

/**
 * Created by paiopiao on 2015/7/1.
 */
public class CompanyDao extends DataBase {

    public company getCompanyById(String id) throws Exception {
        company com = null;
        String sql = "";
        initConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
            com = new company();
            com.setId(id);
            com.setPassword(rs.getString("user_Password"));
            com.setCname(rs.getString("user_Name"));
        }
        rs.close();
        stmt.close();
        closeConnection();
        return com;
    }

    public void insertCase(company com) throws Exception {
        this.initConnection();
        String sql = "insert into enterprise_caseinfo(e_case_Party,e_case_Source,e_case_Email,e_case_linkman,e_case_linkman_Phone,e_case_linkman_Tel,e_case_Agent,e_case_Time,e_case_describe,e_case_discretion,e_case_punish_basis,e_case_Upload) values(?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, com.getE_case_Party());
        ps.setString(2, com.getE_case_Source());
        ps.setString(3, com.getE_case_Email());
        ps.setString(4, com.getE_case_linkman());
        ps.setString(5, com.getE_case_linkman_Phone());
        ps.setString(6, com.getE_case_linkman_Tel());
        ps.setString(7, com.getE_case_Agent());
        ps.setString(8, com.getE_case_Time());
        ps.setString(9, com.getE_case_describe());
        ps.setString(10, com.getE_case_discretion());
        ps.setString(11, com.getE_case_punish_basis());
        ps.setString(12, com.getE_case_Upload());
        ps.executeUpdate();
        this.closeConnection();
    }

    public void updateCase(company com) throws Exception {
        this.initConnection();
        String sql = "update set enterprise_caseinfo e_case_Party=?,e_case_Source=?,e_case_Email=?,e_case_linkman=?,e_case_linkman_Phone=?,e_case_linkman_Tel=?,e_case_Agent=?,e_case_Time=?,e_case_describe=?,e_case_discretion=?,e_case_punish_basis=?,e_case_Upload=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, com.getE_case_Party());
        ps.setString(2, com.getE_case_Source());
        ps.setString(3, com.getE_case_Email());
        ps.setString(4, com.getE_case_linkman());
        ps.setString(5, com.getE_case_linkman_Phone());
        ps.setString(6, com.getE_case_linkman_Tel());
        ps.setString(7, com.getE_case_Agent());
        ps.setString(8, com.getE_case_Time());
        ps.setString(9, com.getE_case_describe());
        ps.setString(10, com.getE_case_discretion());
        ps.setString(11, com.getE_case_punish_basis());
        ps.setString(12, com.getE_case_Upload());
        ps.executeUpdate();
        this.closeConnection();
    }

    public ArrayList getCaseBySerialnum(int serialnum) throws Exception {
        this.initConnection();
        ArrayList al = new ArrayList();
        Statement stat = conn.createStatement();
        String sql = "select e_case_Recedepart,e_case_State from enterprise_caseinfo where e_case_Serialnum='" + serialnum + "'";
        ResultSet rs = stat.executeQuery(sql);
        while (rs.next()) {
            company com = new company();
            com.setE_case_Recedepart("e_case_Recedepart");
            com.setE_case_State("e_case_State");
            al.add(com);
        }
        this.closeConnection();
        return al;
    }


}
