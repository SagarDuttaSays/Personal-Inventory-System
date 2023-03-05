package com.cybrom.dao;
import java.util.ArrayList;
import com.cybrom.beans.*;
import java.sql.*;
import com.cybrom.utility.ConnectionPool;

public class ExpensesCategoryDAO 
{
    static Connection con = ConnectionPool.connectionDB();
    public boolean create (ExpensesCategoryBeans ec)
    {
        int x = 0;
        String q = "insert into expenses_category values ('"+ec.getExp_catid()+"','"+ec.getExp_catname()+"','"+ec.getExp_catdetails()+"','"+ec.getUserid()+"')";
        try
        {
            Statement st = con.createStatement();
            x = st.executeUpdate(q);
            st.close();
            System.out.println("Data fed into system successfully");
            return true;
        }
        catch(Exception e)
        {
            System.out.println("Data couldn't be loaded into the system due to "+e);
            return false;
        }
    }
    public boolean edit(ExpensesCategoryBeans ec)
    {
        int x = 0;
        String q = "Update expenses_category set exp_catname = '"+ec.getExp_catname()+"', exp_catdetails = '"+ec.getExp_catdetails()+"', userid = '"+ec.getUserid()+"' where exp_catid = '"+ec.getExp_catid()+"'";
        try
        {
            Statement st = con.createStatement();
            x = st.executeUpdate(q);
            st.close();
            System.out.println("Data updated successfully.");
            return true;
        }
        catch(Exception e)
        {
            System.out.println("Data couldn't be updated due to "+e);
            return false;
        }
    }
    public boolean remove (ExpensesCategoryBeans ec)
    {
        int x = 0;
        String q = "delete from expenses_category where exp_catid = '"+ec.getExp_catid()+"'";
        try
        {
            Statement st = con.createStatement();
            x = st.executeUpdate(q);
            st.close();
            System.out.println("Data of user with expense category "+ec.getExp_catid()+" deleted successfully.");
            return true;
        }
        catch(Exception e)
        {
            System.out.println("Data of user with expense category "+ec.getExp_catid()+" couldn't be deleted due to "+e);
            return false;
        }
    }
    public ArrayList find (ExpensesCategoryBeans ec)
    {
        String q = "select * from expenses_category where exp_catid = '"+ec.getExp_catid()+"'";
        ArrayList al = new ArrayList();
        try
        {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(q);
            while(rs.next())
            {
                al.add(rs.getInt("exp_catid"));
                al.add(rs.getString("exp_catname"));
                al.add(rs.getString("exp_catdetails"));
                al.add(rs.getInt("userid"));
                System.out.print("Expense Category ID = "+rs.getInt("exp_catid")+"\tExpense Category Name = "+rs.getString("exp_catname")+"\tExpense Category Details = "+rs.getString("exp_catdetails")+"\tUser ID = "+rs.getInt("userid"));  
            }
            st.close();
            return al;
        }
        catch(Exception e)
        {
            System.out.println("Data couldn't be displayed due to "+e);
            return al;
        }
        
    }
    public ArrayList findall(ExpensesCategoryBeans ec)
    {
      String q = "select * from expenses_category";
      ArrayList al = new ArrayList();
        try
        {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(q);
            while(rs.next())
            {
                al.add(rs.getInt("exp_catid"));
                al.add(rs.getString("exp_catname"));
                al.add(rs.getString("exp_catdetails"));
                al.add(rs.getInt("userid"));
                System.out.print("Expense Category ID = "+rs.getInt("exp_catid")+"\tExpense Category Name = "+rs.getString("exp_catname")+"\tExpense Category Details = "+rs.getString("exp_catdetails")+"\tUser ID = "+rs.getInt("userid"));   
                System.out.println("\n");
            }
            st.close();
            return al;
        }
        catch(Exception e)
        {
            System.out.println("Data couldn't be displayed due to "+e);
            return al;
        }  
    }
    public ArrayList findAllById (int userid)
    {
        String q = "Select * from expenses_category where userid = '"+userid+"'";
        ArrayList al = new ArrayList();
        try
        {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(q);
            while(rs.next())
            {
                al.add(rs.getInt("exp_catid"));
                al.add(rs.getString("exp_catname"));
                al.add(rs.getString("exp_catdetails"));
            }
            st.close();
            return al;
        }
        catch(Exception e)
        {
            al.add("Records couldn't be displayed due to "+e);
            return al;
        }
    }
    public static void main(String[] args) {
        ExpensesCategoryBeans ec = new ExpensesCategoryBeans();
//        ec.setExp_catid(1);
//        ec.setExp_catname("Bags");
//        ec.setExp_catdetails("Skybags Trolley");
//        ec.setUserid(1);
        ExpensesCategoryDAO ecd = new ExpensesCategoryDAO();
//        ecd.findall(ec);
        ArrayList al = new ArrayList();
        al = ecd.findAllById(1);
        for(int i = 0; i<al.size(); i+=3)
        {
            for(int j = i; j<i+3; j++)
            {
                System.out.print(al.get(j)+"\t");
            }
            System.out.println("\n");
        }
    }
}
