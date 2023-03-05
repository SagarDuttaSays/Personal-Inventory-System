package com.cybrom.beans;
public class IncomesBeans {
private int inc_id, inc_ac, inc_catid,userid, amount;
private String  transaction_date, receiveby, remark;

    public IncomesBeans() {
    }

    public IncomesBeans(int inc_id, int inc_ac, int inc_catid, int amount, int userid, String transaction_date, String receiveby, String remark) {
        this.inc_id = inc_id;
        this.inc_ac = inc_ac;
        this.inc_catid = inc_catid;
        this.amount = amount;
        this.userid = userid;
        this.transaction_date = transaction_date;
        this.receiveby = receiveby;
        this.remark = remark;
    }

    public int getInc_id() {
        return inc_id;
    }

    public void setInc_id(int inc_id) {
        this.inc_id = inc_id;
    }

    public int getInc_ac() {
        return inc_ac;
    }

    public void setInc_ac(int inc_ac) {
        this.inc_ac = inc_ac;
    }

    public int getInc_catid() {
        return inc_catid;
    }

    public void setInc_catid(int inc_catid) {
        this.inc_catid = inc_catid;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getTransaction_date() {
        return transaction_date;
    }

    public void setTransaction_date(String transaction_date) {
        this.transaction_date = transaction_date;
    }

    public String getReceiveby() {
        return receiveby;
    }

    public void setReceiveby(String receiveby) {
        this.receiveby = receiveby;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
