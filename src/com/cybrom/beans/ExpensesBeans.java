package com.cybrom.beans;
public class ExpensesBeans {
    private int exp_id, exp_ac, exp_catid, userid,amount;
    private String  transaction_date, payby, remark;
    
    public ExpensesBeans() {
    }

    public ExpensesBeans(int exp_id, int exp_ac, int exp_catid, int amount, int userid, String transaction_date, String payby, String remark) {
        this.exp_id = exp_id;
        this.exp_ac = exp_ac;
        this.exp_catid = exp_catid;
        this.amount = amount;
        this.userid = userid;
        this.transaction_date = transaction_date;
        this.payby = payby;
        this.remark = remark;
    }

    public int getExp_id() {
        return exp_id;
    }

    public void setExp_id(int exp_id) {
        this.exp_id = exp_id;
    }

    public int getExp_ac() {
        return exp_ac;
    }

    public void setExp_ac(int exp_ac) {
        this.exp_ac = exp_ac;
    }

    public int getExp_catid() {
        return exp_catid;
    }

    public void setExp_catid(int exp_catid) {
        this.exp_catid = exp_catid;
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

    public String getPayby() {
        return payby;
    }

    public void setPayby(String payby) {
        this.payby = payby;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    
}
