package zjhr.com.pojo;

import java.util.Date;

public class ExpenseZj {
    private String bxid;

    private String accountid;//单据编号

    private String accountname;//报销人姓名

    private String expdate;//入职日期

    private String stafftype;//'0:离职1：在职'

    private String expComment;//报销原因

    private String accountdate;//报销日期

    private String accouttype;//报销状态

    private String accountcomment;//审批备注

    private String bxmoney;//报销金额

    private String bxjob;//报销职位

    public String getBxid() {
        return bxid;
    }

    public void setBxid(String bxid) {
        this.bxid = bxid == null ? null : bxid.trim();
    }

    public String getAccountid() {
        return accountid;
    }

    public void setAccountid(String accountid) {
        this.accountid = accountid == null ? null : accountid.trim();
    }

    public String getAccountname() {
        return accountname;
    }

    public void setAccountname(String accountname) {
        this.accountname = accountname == null ? null : accountname.trim();
    }


    public String getStafftype() {
        return stafftype;
    }

    public void setStafftype(String stafftype) {
        this.stafftype = stafftype == null ? null : stafftype.trim();
    }

    public String getExpComment() {
        return expComment;
    }

    public void setExpComment(String expComment) {
        this.expComment = expComment == null ? null : expComment.trim();
    }


    public String getExpdate() {
		return expdate;
	}

	public void setExpdate(String expdate) {
		this.expdate = expdate;
	}

	public String getAccountdate() {
		return accountdate;
	}

	public void setAccountdate(String accountdate) {
		this.accountdate = accountdate;
	}

	public String getAccouttype() {
        return accouttype;
    }

    public void setAccouttype(String accouttype) {
        this.accouttype = accouttype == null ? null : accouttype.trim();
    }

    public String getAccountcomment() {
        return accountcomment;
    }

    public void setAccountcomment(String accountcomment) {
        this.accountcomment = accountcomment == null ? null : accountcomment.trim();
    }

    public String getBxmoney() {
        return bxmoney;
    }

    public void setBxmoney(String bxmoney) {
        this.bxmoney = bxmoney == null ? null : bxmoney.trim();
    }

    public String getBxjob() {
        return bxjob;
    }

    public void setBxjob(String bxjob) {
        this.bxjob = bxjob == null ? null : bxjob.trim();
    }
}