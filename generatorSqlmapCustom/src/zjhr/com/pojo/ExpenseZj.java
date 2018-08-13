package zjhr.com.pojo;

public class ExpenseZj {
    private String bxid;

    private String accountid;

    private String accountname;

    private String expdate;

    private String stafftype;

    private String expComment;

    private String accountdate;

    private String accouttype="0";//0:未报销1：已报销

    private String bxMoney;//金额

    private String bxJob;//职位

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

    public String getExpdate() {
        return expdate;
    }

    public void setExpdate(String expdate) {
        this.expdate = expdate == null ? null : expdate.trim();
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

    public String getAccountdate() {
        return accountdate;
    }

    public void setAccountdate(String accountdate) {
        this.accountdate = accountdate == null ? null : accountdate.trim();
    }

    public String getAccouttype() {
        return accouttype;
    }

    public void setAccouttype(String accouttype) {
        this.accouttype = accouttype == null ? null : accouttype.trim();
    }

    public String getBxMoney() {
        return bxMoney;
    }

    public void setBxMoney(String bxMoney) {
        this.bxMoney = bxMoney == null ? null : bxMoney.trim();
    }

    public String getBxJob() {
        return bxJob;
    }

    public void setBxJob(String bxJob) {
        this.bxJob = bxJob == null ? null : bxJob.trim();
    }
}