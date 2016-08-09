package vo;

import java.io.Serializable;

/**
 * Created by paiopiao on 2015/6/30.
 */
public class person implements Serializable {
    public static final long serialVersionUID = 1L;
    private String id;//个人编号
    private String pname;//个人姓名
    private String password;//密码
    private String sex;//性别
    private String p_case_Party;  //案件当事人
    private String p_case_Source;  //案件来源
    private String p_case_Email;   //邮件
    private String p_case_linkman;  //联系人
    private String p_case_linkman_Phone;  //联系人电话
    private String p_case_linkman_Tel;    //座机
    private String p_case_Agent;     //案件承办人
    private String p_case_Time;       //立案时间
    private String p_case_describe;     //案件描述
    private String p_case_discretion;   //自由裁量
    private String p_case_punish_basis;  //处罚依据
    private String p_case_Upload;    //立案附件上传
    private String p_case_Serialnum;
    private String p_case_Title;
    private String p_case_Recedepart;
    private String p_case_State;
    private String p_case_No;
    private String p_case_Finishtime;
    private String item_No;
    private String item_Name;
    private String item_Category;
    private String item_Punishcategory;
    private String item_Linkman;
    private String item_Linkmantel;
    private String item_Solvedepart;
    private String item_Punishstandard;


    public String getP_case_Finishtime() {
        return p_case_Finishtime;
    }

    public void setP_case_Finishtime(String p_case_Finishtime) {
        this.p_case_Finishtime = p_case_Finishtime;
    }

    public String getItem_No() {
        return item_No;
    }

    public void setItem_No(String item_No) {
        this.item_No = item_No;
    }

    public String getItem_Name() {
        return item_Name;
    }

    public void setItem_Name(String item_Name) {
        this.item_Name = item_Name;
    }

    public String getItem_Category() {
        return item_Category;
    }

    public void setItem_Category(String item_Category) {
        this.item_Category = item_Category;
    }

    public String getItem_Punishcategory() {
        return item_Punishcategory;
    }

    public void setItem_Punishcategory(String item_Punishcategory) {
        this.item_Punishcategory = item_Punishcategory;
    }

    public String getItem_Linkman() {
        return item_Linkman;
    }

    public void setItem_Linkman(String item_Linkman) {
        this.item_Linkman = item_Linkman;
    }

    public String getItem_Linkmantel() {
        return item_Linkmantel;
    }

    public void setItem_Linkmantel(String item_Linkmantel) {
        this.item_Linkmantel = item_Linkmantel;
    }

    public String getItem_Solvedepart() {
        return item_Solvedepart;
    }

    public void setItem_Solvedepart(String item_Solvedepart) {
        this.item_Solvedepart = item_Solvedepart;
    }

    public String getItem_Punishstandard() {
        return item_Punishstandard;
    }

    public void setItem_Punishstandard(String item_Punishstandard) {
        this.item_Punishstandard = item_Punishstandard;
    }

    public String getP_case_Serialnum() {
        return p_case_Serialnum;
    }

    public void setP_case_Serialnum(String p_case_Serialnum) {
        this.p_case_Serialnum = p_case_Serialnum;
    }

    public String getP_case_Title() {
        return p_case_Title;
    }

    public void setP_case_Title(String p_case_Title) {
        this.p_case_Title = p_case_Title;
    }

    public String getP_case_Recedepart() {
        return p_case_Recedepart;
    }

    public void setP_case_Recedepart(String p_case_Recedepart) {
        this.p_case_Recedepart = p_case_Recedepart;
    }

    public String getP_case_State() {
        return p_case_State;
    }

    public void setP_case_State(String p_case_State) {
        this.p_case_State = p_case_State;
    }

    public String getP_case_No() {
        return p_case_No;
    }

    public void setP_case_No(String p_case_No) {
        this.p_case_No = p_case_No;
    }

    public String getP_case_Party() {
        return p_case_Party;
    }

    public void setP_case_Party(String p_case_Party) {
        this.p_case_Party = p_case_Party;
    }

    public String getP_case_Source() {
        return p_case_Source;
    }

    public void setP_case_Source(String p_case_Source) {
        this.p_case_Source = p_case_Source;
    }

    public String getP_case_Email() {
        return p_case_Email;
    }

    public void setP_case_Email(String p_case_Email) {
        this.p_case_Email = p_case_Email;
    }

    public String getP_case_linkman() {
        return p_case_linkman;
    }

    public void setP_case_linkman(String p_case_linkman) {
        this.p_case_linkman = p_case_linkman;
    }

    public String getP_case_linkman_Phone() {
        return p_case_linkman_Phone;
    }

    public void setP_case_linkman_Phone(String p_case_linkman_Phone) {
        this.p_case_linkman_Phone = p_case_linkman_Phone;
    }

    public String getP_case_linkman_Tel() {
        return p_case_linkman_Tel;
    }

    public void setP_case_linkman_Tel(String p_case_linkman_Tel) {
        this.p_case_linkman_Tel = p_case_linkman_Tel;
    }

    public String getP_case_Agent() {
        return p_case_Agent;
    }

    public void setP_case_Agent(String p_case_Agent) {
        this.p_case_Agent = p_case_Agent;
    }

    public String getP_case_Time() {
        return p_case_Time;
    }

    public void setP_case_Time(String p_case_Time) {
        this.p_case_Time = p_case_Time;
    }

    public String getP_case_describe() {
        return p_case_describe;
    }

    public void setP_case_describe(String p_case_decribe) {
        this.p_case_describe = p_case_decribe;
    }

    public String getP_case_discretion() {
        return p_case_discretion;
    }

    public void setP_case_discretion(String p_case_discretion) {
        this.p_case_discretion = p_case_discretion;
    }

    public String getP_case_punish_basis() {
        return p_case_punish_basis;
    }

    public void setP_case_punish_basis(String p_case_punish_basis) {
        this.p_case_punish_basis = p_case_punish_basis;
    }

    public String getP_case_Upload() {
        return p_case_Upload;
    }

    public void setP_case_Upload(String p_case_Upload) {
        this.p_case_Upload = p_case_Upload;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
