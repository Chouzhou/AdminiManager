package vo;

import java.io.Serializable;

/**
 * Created by paiopiao on 2015/6/30.
 */
public class company implements Serializable {
    public static final long serialVersionUID = 1L;
    private String id;//公司编号
    private String cname;//公司名字
    private String type;//公司类型
    private String password;//密码
    private String e_case_Party;  //案件当事人
    private String e_case_Source;  //案件来源
    private String e_case_Email;   //邮件
    private String e_case_linkman;  //联系人
    private String e_case_linkman_Phone;  //联系人电话
    private String e_case_linkman_Tel;    //座机
    private String e_case_Agent;     //案件承办人
    private String e_case_Time;       //立案时间
    private String e_case_describe;     //案件描述
    private String e_case_discretion;   //自由裁量
    private String e_case_punish_basis;  //处罚依据
    private String e_case_Upload;    //立案附件上传
    private String e_case_Serialnum;
    private String e_case_Title;
    private String e_case_Recedepart;
    private String e_case_State;
    private String e_case_No;

    public String getE_case_Serialnum() {
		return e_case_Serialnum;
	}

	public void setE_case_Serialnum(String e_case_Serialnum) {
		this.e_case_Serialnum = e_case_Serialnum;
	}

	public String getE_case_Title() {
		return e_case_Title;
	}

	public void setE_case_Title(String e_case_Title) {
		this.e_case_Title = e_case_Title;
	}

	public String getE_case_Recedepart() {
		return e_case_Recedepart;
	}

	public void setE_case_Recedepart(String e_case_Recedepart) {
		this.e_case_Recedepart = e_case_Recedepart;
	}

	public String getE_case_State() {
		return e_case_State;
	}

	public void setE_case_State(String e_case_State) {
		this.e_case_State = e_case_State;
	}

	public String getE_case_No() {
		return e_case_No;
	}

	public void setE_case_No(String e_case_No) {
		this.e_case_No = e_case_No;
	}

	public String getE_case_Party() {
		return e_case_Party;
	}

	public void setE_case_Party(String e_case_Party) {
		this.e_case_Party = e_case_Party;
	}

	public String getE_case_Source() {
		return e_case_Source;
	}

	public void setE_case_Source(String e_case_Source) {
		this.e_case_Source = e_case_Source;
	}

	public String getE_case_Email() {
		return e_case_Email;
	}

	public void setE_case_Email(String e_case_Email) {
		this.e_case_Email = e_case_Email;
	}

	public String getE_case_linkman() {
		return e_case_linkman;
	}

	public void setE_case_linkman(String e_case_linkman) {
		this.e_case_linkman = e_case_linkman;
	}

	public String getE_case_linkman_Phone() {
		return e_case_linkman_Phone;
	}

	public void setE_case_linkman_Phone(String e_case_linkman_Phone) {
		this.e_case_linkman_Phone = e_case_linkman_Phone;
	}

	public String getE_case_linkman_Tel() {
		return e_case_linkman_Tel;
	}

	public void setE_case_linkman_Tel(String e_case_linkman_Tel) {
		this.e_case_linkman_Tel = e_case_linkman_Tel;
	}

	public String getE_case_Agent() {
		return e_case_Agent;
	}

	public void setE_case_Agent(String e_case_Agent) {
		this.e_case_Agent = e_case_Agent;
	}

	public String getE_case_Time() {
		return e_case_Time;
	}

	public void setE_case_Time(String e_case_Time) {
		this.e_case_Time = e_case_Time;
	}

	public String getE_case_describe() {
		return e_case_describe;
	}

	public void setE_case_describe(String e_case_describe) {
		this.e_case_describe = e_case_describe;
	}

	public String getE_case_discretion() {
		return e_case_discretion;
	}

	public void setE_case_discretion(String e_case_discretion) {
		this.e_case_discretion = e_case_discretion;
	}

	public String getE_case_punish_basis() {
		return e_case_punish_basis;
	}

	public void setE_case_punish_basis(String e_case_punish_basis) {
		this.e_case_punish_basis = e_case_punish_basis;
	}

	public String getE_case_Upload() {
		return e_case_Upload;
	}

	public void setE_case_Upload(String e_case_Upload) {
		this.e_case_Upload = e_case_Upload;
	}

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
