package com.cybrom.dao;
import java.sql.*;
import com.cybrom.beans.*;
import com.cybrom.utility.ConnectionPool;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
public class ExpensesDAO 
{
    static Connection con = ConnectionPool.connectionDB();
    public boolean create (ExpensesBeans eb)
    {
        int x = 0;
        String q = "Insert into expenses values ('"+eb.getExp_id()+"','"+eb.getExp_ac()+"','"+eb.getUserid()+"','"+eb.getExp_catid()+"','"+eb.getAmount()+"','"+eb.getTransaction_date()+"','"+eb.getPayby()+"','"+eb.getRemark()+"')";
        try
        {
            Statement st = con.createStatement();
            x = st.executeUpdate(q);
            st.close();
            System.out.println("Data inserted successfully");
            return true;
        }
        catch(Exception e)
        {
            System.out.println("Data couldn't be inserted due to "+e);
            return false;
        }
    }
    public boolean edit(ExpensesBeans eb)
    {
        int x = 0;
        String q = "Update expenses set userid = '"+eb.getUserid()+"', exp_ac = '"+eb.getExp_ac()+"', exp_catid = '"+eb.getExp_catid()+"', amount = '"+eb.getAmount()+", transaction_date = '"+eb.getTransaction_date()+"', payby = '"+eb.getPayby()+"', remark = '"+eb.getRemark()+"' where exp_id = '"+eb.getExp_id()+"'";
        try
        {
            Statement st  = con.createStatement();
            x = st.executeUpdate(q);
            st.close();
            System.out.println("Data updated successfully");
            return true;
        }
        catch (Exception e)
        {
            System.out.println("Data couldn't be updated due to "+e);
            return false;
        }
    }
    public boolean remove (ExpensesBeans eb)
    {
        int x = 0;
        String q = "Delete from expenses where exp_id = '"+eb.getExp_id()+"'";
        try
        {
            Statement st = con.createStatement();
            x = st.executeUpdate(q);
            st.close();
            System.out.println("Data of user with expense ID = "+eb.getExp_id()+" has been deleted successfully");
            return true;
        }
        catch (Exception e)
        {
            System.out.println("Data of user with expense ID = "+eb.getExp_id()+" couldn't be deleted due to "+e);
            return false;
        }
    }
    public ArrayList find(ExpensesBeans eb)
    {
        ArrayList al = new ArrayList();
        String q = "Select * from expenses where  exp_id = '"+eb.getExp_id()+"'";
        try
        {
            
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(q);
            while(rs.next())
            {
                al.add(rs.getInt("exp_id"));
                al.add(rs.getInt("exp_ac"));
                al.add(rs.getInt("userid"));
                al.add(rs.getInt("exp_catid"));
                al.add(rs.getInt("amount"));
                al.add(rs.getDate("transaction_date"));
                al.add(rs.getString("payby"));
                al.add(rs.getString("remark"));
                System.out.print("Expense ID = "+rs.getInt("exp_id")+"\tExpense Account = "+rs.getInt("exp_ac")+"\t User ID = "+rs.getInt("userid")+"\tExpense Category ID = "+rs.getInt("exp_catid")+"\tAmount = "+rs.getInt("amount")+"\tTransaction Date = "+rs.getDate("transaction_date")+"\tPay by = "+rs.getString("payby")+"\tRemark = "+rs.getString("remark"));
                System.out.println(al);
            }
            st.close();
        }
        catch (Exception e)
        {
            System.out.println("Could not display the data due to "+e);
        }
        return al;
    }
    public ArrayList findall ()
    {
        String q = "Select * from expenses";
        ArrayList al = new ArrayList();
        try
        {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(q);
            while(rs.next())
            {
                al.add(rs.getInt("exp_id"));
                al.add(rs.getInt("exp_ac"));
                al.add(rs.getInt("userid"));
                al.add(rs.getInt("exp_catid"));
                al.add(rs.getInt("amount"));
                al.add(rs.getDate("transaction_date"));
                al.add(rs.getString("payby"));
                al.add(rs.getString("remark"));
                System.out.print("Expense ID = "+rs.getInt("exp_id")+"\tExpense Account = "+rs.getInt("exp_ac")+"\t User ID = "+rs.getInt("userid")+"\tExpense Category ID = "+rs.getInt("exp_catid")+"\tAmount = "+rs.getInt("amount")+"\tTransaction Date = "+rs.getDate("transaction_date")+"\tPay by = "+rs.getString("payby")+"\tRemark = "+rs.getString("remark"));
                System.out.println("\n");
            }
            st.close();
        }
        catch (Exception e)
        {
            System.out.println("Could not display the data due to "+e);
        }
        return al;
    }
    public ArrayList findAllById (int userid)
    {
        ArrayList al = new ArrayList();
        String q = "Select * from expenses where userid = '"+userid+"'";
        try
        {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(q);
            while(rs.next())
            {
                al.add(rs.getInt("exp_id"));
                al.add(rs.getInt("exp_ac"));
                al.add(rs.getInt("userid"));
                al.add(rs.getInt("exp_catid"));
                al.add(rs.getInt("amount"));
                al.add(rs.getDate("transaction_date"));
                al.add(rs.getString("payby"));
                al.add(rs.getString("remark"));
                
            }
            st.close();
            
        }
        catch(Exception e)
        {
            System.out.println(al.add("Data couldn.t be fetched due to "+e));
        }
        finally
        {
            return al;
        }
    }
    public ArrayList findAllDateWise (String sDate, String eDate, int userid)
 {
     ArrayList al = new ArrayList();
     String q = "Select * from expenses having (userid = '"+userid+"') and (transaction_date between '"+sDate+"' and '"+eDate+"')";
     try
        {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(q);
            while(rs.next())
            {
                al.add(rs.getInt("exp_id"));
                al.add(rs.getInt("exp_ac"));
                al.add(rs.getInt("userid"));
                al.add(rs.getInt("exp_catid"));
                al.add(rs.getInt("amount"));
                al.add(rs.getDate("transaction_date"));
                al.add(rs.getString("payby"));
                al.add(rs.getString("remark"));
                
            }
            st.close();
            
        }
        catch(Exception e)
        {
            System.out.println(al.add("Data couldn.t be fetched due to "+e));
        }
        finally
        {
            return al;
        }
 }
    public static void main(String[] args) {
        ExpensesBeans eb = new ExpensesBeans();
        eb.setUserid(1);
        eb.setExp_id(1);
        eb.setExp_ac(12345);
        eb.setExp_catid(12345);
        eb.setTransaction_date("2020-11-07");
        eb.setAmount(1000);
        eb.setPayby("Cash");
        eb.setRemark("Nil");
        ExpensesDAO ed = new ExpensesDAO();
//        ed.findall(eb);
        ArrayList al = new ArrayList ();
//        al = ed.findAllById(1);
        
//        LocalDate x1 = LocalDate.of(2022, Month.FEBRUARY, 16);
//        LocalDate x2 = LocalDate.of(2022, Month.FEBRUARY, 18);
//        al = ed.findAllDateWise(x1, x2, 1);
        
        for(int i = 0; i<al.size(); i+=7)
        {
            for(int j = i; j<i+7; j++)
            {
                System.out.print(al.get(j)+"\t");
            }
            System.out.println("\n");
        }
    }
}
