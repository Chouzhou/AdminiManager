package dao;

import vo.person;

import java.sql.*;
import java.util.*;

/**
 * Created by paiopiao on 2015/7/3.
 */
//获取个人用户的所有信息
public class InformationDao extends DataBase {
    public ArrayList getPersonInfById(String id) throws Exception {
        ArrayList al = new ArrayList();
        this.initConnection();
        String sql = "select user_Password,user_Sex from personal_caseinfo where p_case_No='" + id + "'";
        Statement stat = conn.createStatement();
        ResultSet rs = stat.executeQuery(sql);
        while (rs.next()) {
            person per = new person();
            per.setId(id);
            per.setPassword(rs.getString("user_Password"));
            per.setSex(rs.getString("user_Sex"));
            //per.
            al.add(per);
        }
        return al;
    }
}
