package dao;


import vo.manager;
import vo.person;

import java.sql.*;
//import java.util.*;

/**
 * Created by paiopiao on 2015/7/1.
 */
public class ManagerDao extends DataBase {
    public manager getManaById(String id) throws Exception {
        manager mana = null;
        String sql = "select Mname,password,sex from manager where id='" + id + "'";
        initConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
            mana = new manager();
            mana.setId(id);
            mana.setMname(rs.getString("Mname"));
            mana.setPassword(rs.getString("password"));
            mana.setSex(rs.getString("sex"));
        }
        rs.close();
        stmt.close();
        closeConnection();
        return mana;
    }

    /**
     * functionName inertUser
     * describe: 将用户信息插入到数据库中
     *
     * @param man
     * @throws Exception
     */

    public void inertUser(manager man) throws Exception {
        this.initConnection();
        String sql = "insert into user_baseinfo(user_Id,user_Name,user_Password,user_Email,user_Tel,user_Card,user_Tname,user_address,center_Tel,user_Office,comment) values(?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, man.getUser_id());
        ps.setString(2, man.getUser_Name());
        ps.setString(3, man.getUser_Password());
        ps.setString(4, man.getUser_Email());
        ps.setString(5, man.getUser_Tel());
        ps.setString(6, man.getUser_Card());
        ps.setString(7, man.getUser_Tname());
        ps.setString(8, man.getUser_address());
        ps.setString(9, man.getCenter_Tel());
        ps.setString(10, man.getUser_Office());
        ps.setString(11, man.getComment());
        ps.executeUpdate();
        this.closeConnection();
    }

    /**
     * function upateUser
     * describe:修改用户信息
     *
     * @param man
     * @throws Exception
     */
    public void upateUser(String id) throws Exception {
        this.initConnection();
        String sql = "update set user_baseinfo user_Name=?,user_Password=?,user_Email=?,user_Tel=?,user_Card=?,user_Tname=?,user_address=?,center_Tel=?,user_Office=?,comment=? WHERE user_Id='" + id + "'";
        PreparedStatement ps = conn.prepareStatement(sql);
       /* ps.setString(1, man.getUser_id());
        ps.setString(2, man.getUser_Name());
        ps.setString(3, man.getUser_Password());
        ps.setString(4, man.getUser_Email());
        ps.setString(5, man.getUser_Tel());
        ps.setString(6, man.getUser_Card());
        ps.setString(7, man.getUser_Tname());
        ps.setString(8, man.getUser_address());
        ps.setString(9, man.getCenter_Tel());
        ps.setString(10, man.getUser_Office());
        ps.setString(11, man.getComment());*/
        ps.executeQuery();
        this.closeConnection();
    }

    /**
     * functionName deleteUser
     * describe:删除数据
     *
     * @param id
     * @throws Exception
     */
    void deleteUser(String id) throws Exception {
        this.initConnection();
        manager man = new manager();
        String sql = "delete from user_baseinfo where user_id='" + id + "'";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, man.getUser_id());
        ps.executeQuery();
        this.closeConnection();
    }

    public person getPerById(String id) throws Exception {
        person per = null;
        String sql = "select Pname,password,sex from personal_caseinfo where p_case_No='" + id + "'";
        initConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
            per = new person();
            per.setId(id);
            per.setPname(rs.getString("Mname"));
            per.setPassword(rs.getString("password"));
            per.setSex(rs.getString("sex"));
        }
        rs.close();
        stmt.close();
        closeConnection();
        return per;
    }
}
