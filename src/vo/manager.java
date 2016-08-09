package vo;

import java.io.Serializable;

/**
 * Created by paiopiao on 2015/6/30.
 */
public class manager implements Serializable {
    public static final long serialVersionUID = 1L;
    private String id;//管理员编号
    private String mname;//管理员姓名
    private String sex;//性别
    private String password;//密码
    private String user_Name;
    private String user_Password;
    private String user_Email;
    private String user_Tel;
    private String user_Card;
    private String user_Tname;
    private String user_address;
    private String center_Tel;
    private String comment;
    private String user_id;
    
    
    public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getUser_Name() {
		return user_Name;
	}

	public void setUser_Name(String user_Name) {
		this.user_Name = user_Name;
	}

	public String getUser_Password() {
		return user_Password;
	}

	public void setUser_Password(String user_Password) {
		this.user_Password = user_Password;
	}

	public String getUser_Email() {
		return user_Email;
	}

	public void setUser_Email(String user_Email) {
		this.user_Email = user_Email;
	}

	public String getUser_Tel() {
		return user_Tel;
	}

	public void setUser_Tel(String user_Tel) {
		this.user_Tel = user_Tel;
	}

	public String getUser_Card() {
		return user_Card;
	}

	public void setUser_Card(String user_Card) {
		this.user_Card = user_Card;
	}

	public String getUser_Tname() {
		return user_Tname;
	}

	public void setUser_Tname(String user_Tname) {
		this.user_Tname = user_Tname;
	}

	public String getUser_address() {
		return user_address;
	}

	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}

	public String getCenter_Tel() {
		return center_Tel;
	}

	public void setCenter_Tel(String center_Tel) {
		this.center_Tel = center_Tel;
	}

	public String getUser_Office() {
		return user_Office;
	}

	public void setUser_Office(String user_Office) {
		this.user_Office = user_Office;
	}

	private String user_Office;
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
