 package com.cybrom.dao;
import java.util.ArrayList;
import com.cybrom.beans.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import com.cybrom.utility.ConnectionPool;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.Month;
public class BankBookDAO 
{
    static Connection con = ConnectionPool.connectionDB();
    public boolean create(BankBookBeans bb)
    {
        int x = 0;
        String q = "Insert into bank_book values ('"+bb.getAcid()+"','"+bb.getAccount()+"','"+bb.getTransaction_date()+"','"+bb.getAmount()+"','"+bb.getUserid()+"','"+bb.getOperation()+"')";
        try
        {
         Statement st = con.createStatement();
         x = st.executeUpdate(q);
         st.close();
         con.close();
            System.out.println("Data inserted successfully");
            return true;
        }
        catch (Exception e)
        {
            System.out.println("Data insertion failed due to "+e);
            return false;
        }
    }
    public boolean edit(BankBookBeans bb)
    {
        int x = 0;
        String q = "Update bank_book set userid = '"+bb.getUserid()+"' , account = '"+bb.getAccount()+"', transaction_date = '"+bb.getTransaction_date()+"', amount = '"+bb.getAmount()+"', operation = '"+bb.getOperation()+"' where acid = '"+bb.getAcid()+"'";
        try
        {
            Statement st = con.createStatement();
            x = st.executeUpdate(q);
            st.close();
            con.close();
            System.out.println("Data updated successfully.");
            return true;
        }
        catch (Exception e)
        {
            System.out.println("Data couldn't be updated due to "+e);
            return false;
        }
    }
    public boolean remove (BankBookBeans bb)
    {
        int x = 0;
        String q = "Delete from bank_book where acid = '"+bb.getAcid()+"'";
        try
        {
            Statement st = con.createStatement();
            x = st.executeUpdate(q);
            st.close();
            con.close();
            System.out.println("Data of User with user ID = "+bb.getUserid()+" deleted successfully.");
            return true;
        }
        catch (Exception e)
        {
            System.out.println("Data couldn't be deleted due to "+e);
            return false;
        }
    }
    public ArrayList find (BankBookBeans bb)
    {
        String q = "Select * from bank_book where acid = '"+bb.getAcid()+"'";
        ArrayList al = new ArrayList();
        try
        {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(q);
            while(rs.next())
            {
                al.add(rs.getInt("acid"));
                al.add(rs.getInt("acid"));
                al.add(rs.getDate("transaction_date"));
                al.add(rs.getInt("Amount"));
                al.add(rs.getInt("userid"));
                al.add(rs.getString("operation"));
                System.out.println("Account ID = "+rs.getInt("acid")+"\tAccount = "+rs.getString("account")+"\tTransaction Date = "+rs.getDate("transaction_date")+"\tAmount = "+rs.getInt("amount")+"\tUser ID = "+rs.getInt("userid")+"\tOperation = "+rs.getString("operation"));
            }
            st.close();
            con.close();
        }
        catch (Exception e)
        {
           System.out.println("Data couldn't be displayed due to "+e);
        }
        return al;
    }
    public ArrayList findall (BankBookBeans bb)
    {
        String q = "Select * from bank_book ";
        ArrayList al = new ArrayList();
        try
        {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(q);
            while(rs.next())
            {
                al.add(rs.getInt("acid"));
                al.add(rs.getInt("acid"));
                al.add(rs.getDate("transaction_date"));
                al.add(rs.getInt("Amount"));
                al.add(rs.getInt("userid"));
                al.add(rs.getString("operation"));
                System.out.print("Account ID = "+rs.getInt("acid")+"\tAccount = "+rs.getInt("account")+"\tTransaction Date = "+rs.getDate("transaction_date")+"\tAmount = "+rs.getInt("amount")+"\tUser ID = "+rs.getInt("userid")+"\tOperation = "+rs.getString("operation"));
                System.out.println("\n");
            }
            st.close();
        }
        catch (Exception e)
        {
           System.out.println("Data couldn't be displayed due to "+e);
        }
        return al;
    }
    public ArrayList findAllDateWise (LocalDate sDate, LocalDate eDate, int userid)
    {
        ArrayList al = new ArrayList();
        System.out.println("sdate = "+sDate);
        String q = "Select * from bank_book having transaction_date between '"+sDate+"' and '"+eDate+"' order by transaction_date";
        try
        {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(q);
            while(rs.next())
            {
                al.add(rs.getInt("acid"));
                al.add(rs.getInt("account"));
                al.add(rs.getDate("transaction_date"));
                al.add(rs.getInt("amount"));
                al.add(rs.getInt("userid"));
                al.add(rs.getString("operation"));
                
            }
            
            st.close();
            con.close();
        }
        catch (Exception e)
        {
           System.out.println("Data couldn't be displayed due to "+e);
        }
        return al;
    }
    public int closingStatement(int userid)
    {
        String q = "select sum(amount) as x from bank_book where userid = '"+userid+"' and operation = 'credit' ";
        try
        {
            int x = 0;
            Statement st = con.createStatement();
            ResultSet rs  = st.executeQuery(q);
            while(rs.next())
            {
                x= rs.getInt("x");
            }
            return x;
        }
        catch (Exception e)
        {
            System.out.println("Closing statement couldn't be displayed due to "+e);
            return -1;
        }
        
    }
    public static void main(String[] args) throws ParseException 
    {
        BankBookBeans bb = new BankBookBeans();
        bb.setUserid(1);
        bb.setAcid(12345);
        bb.setAccount("12345");
        bb.setTransaction_date("2020-09-23");
        bb.setAmount(5345);
        bb.setOperation("Credit");
        BankBookDAO bbd = new BankBookDAO();
        bbd.findall(bb);
//        ArrayList al = new ArrayList();
//        
//        LocalDate x1 = LocalDate.of(2020, Month.SEPTEMBER, 21);
//        LocalDate x2 = LocalDate.of(2020, Month.SEPTEMBER, 25);
        
//        al = bbd.findAllDateWise(x1, x2, 1);
//        for(int i = 0; i<al.size(); i+=6)
//        {
//        for(int j = i; j<i+6; j++)
//        {
//            System.out.print(al.get(j)+"\t");
//        }
//            System.out.println("\n");
//        }
//        System.out.println("Closing Balance = INR "+bbd.closingStatement(1));
    }
}
