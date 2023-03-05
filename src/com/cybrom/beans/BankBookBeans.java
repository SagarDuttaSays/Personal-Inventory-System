package com.cybrom.beans;
public class BankBookBeans {
    private int acid, amount, userid;
    private String transaction_date, operation, account;
    
    public BankBookBeans(int acid, String account, int amount, String transaction_date, int userid, String operation) {
        this.acid = acid;
        this.account = account;
        this.amount = amount;
        this.transaction_date = transaction_date;
        this.userid = userid;
        this.operation = operation;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public BankBookBeans() {
    }

    public int getAcid() {
        return acid;
    }

    public void setAcid(int acid) {
        this.acid = acid;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getTransaction_date() {
        return transaction_date;
    }

    public void setTransaction_date(String transaction_date) {
        this.transaction_date = transaction_date;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    
}
