package com.cybrom.dao;
import java.sql.*;
import com.cybrom.beans.*;
import com.cybrom.utility.ConnectionPool;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
public class IncomesDAO 
{
 static Connection con = ConnectionPool.connectionDB();
 public boolean create (IncomesBeans ib)
 {
     int x = 0;
     String q = "insert into incomes values ('"+ib.getInc_id()+"','"+ib.getInc_ac()+"','"+ib.getUserid()+"','"+ib.getInc_catid()+"','"+ib.getAmount()+"','"+ib.getTransaction_date()+"','"+ib.getReceiveby()+"','"+ib.getRemark()+"')";
     try
     {
         Statement st = con.createStatement();
         x = st.executeUpdate(q);
         st.close();
         System.out.println("Data fed into the system successfully.");
         return true;
     }
     catch(Exception e)
     {
         System.out.println("Data couldn't be loaded into the system due to "+e);
         return false;
     }
}
 public boolean edit(IncomesBeans ib)
 {
     int x = 0;
     String q ="Update incomes set inc_ac = '"+ib.getInc_ac()+"', userid = '"+ib.getUserid()+"', amount = '"+ib.getAmount()+"', transaction_date = '"+ib.getTransaction_date()+"', remark = '"+ib.getRemark()+"', receivedby = '"+ib.getRemark()+"' where inc_id = '"+ib.getInc_id()+"'";
     try
     {
         Statement st = con.createStatement();
         x = st.executeUpdate(q);
         st.close();
         System.out.println("Data updated successfully");
         return true;
     }
     catch(Exception e)
     {
         System.out.println("Data couldn't be updated due to "+e);
         return false;
     }
 }
 public boolean delete (IncomesBeans ib)
 {
     int x = 0;
     String q = "delete from incomes where inc_id = '"+ib.getInc_id()+"'";
     try
     {
         Statement st = con.createStatement();
         x = st.executeUpdate(q);
         st.close();
         System.out.println("Data deleted successfully");
         return true;
     }
     catch (Exception e)
     {
         System.out.println("Data couldn't be deleted due to "+e);
         return false;
     }
 }
 public ArrayList find(IncomesBeans ib)
 {
      String q = "select * from incomes where inc_id = '"+ib.getInc_id()+"'";
      ArrayList al = new ArrayList();
      try
      {
          Statement st = con.createStatement();
          ResultSet rs  = st.executeQuery(q);
          while(rs.next())
          {
              al.add(rs.getInt("inc_id"));
              al.add(rs.getInt("inc_ac"));
              al.add(rs.getInt("userid"));
              al.add(rs.getInt("inc_catid"));
              al.add(rs.getInt("amount"));
              al.add(rs.getDate("transaction_date"));
              al.add(rs.getString("recieveby"));
              al.add(rs.getString("remark"));
              System.out.print("Income ID = "+rs.getInt("inc_id")+"\tIncome Account = "+rs.getInt("inc_ac")+"\tUser ID = "+rs.getInt("userid")+"\tIncome Category ID = "+rs.getInt("inc_catid")+"\tAmount = "+rs.getInt("amount")+"\tTransaction Date = "+rs.getDate("transaction_date")+"\tRecieve by = "+rs.getString("recieveby")+"\tRemark = "+rs.getString("remark"));
          }
          st.close();
      }
      catch(Exception e)
      {
          System.out.println("Couldn't display the data due to "+e);
      }
      return al;
 }
 public ArrayList findall()
 {
     ArrayList al = new ArrayList();
     String q = "select * from incomes";
      try
      {
          Statement st = con.createStatement();
          ResultSet rs  = st.executeQuery(q);
          while(rs.next())
          {
              al.add(rs.getInt("inc_id"));
              al.add(rs.getInt("inc_ac"));
              al.add(rs.getInt("userid"));
              al.add(rs.getInt("inc_catid"));
              al.add(rs.getInt("amount"));
              al.add(rs.getDate("transaction_date"));
              al.add(rs.getString("recieveby"));
              al.add(rs.getString("remark"));
              System.out.print("Income ID = "+rs.getInt("inc_id")+"\tIncome Account = "+rs.getInt("inc_ac")+"\tUser ID = "+rs.getInt("userid")+"\tIncome Category ID = "+rs.getInt("inc_catid")+"\tAmount = "+rs.getInt("amount")+"\tTransaction Date = "+rs.getDate("transaction_date")+"\tRecieve by = "+rs.getString("recieveby")+"\tRemark = "+rs.getString("remark"));
              System.out.println("\n");
          }
          st.close();
      }
      catch(Exception e)
      {
          System.out.println("Couldn't display the data due to "+e);
      }
      return al;
 }
 public ArrayList findAllById (int userid)
    {
        ArrayList al = new ArrayList();
        String q = "Select * from incomes where userid = '"+userid+"'";
        try
        {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(q);
            while(rs.next())
            {
                al.add(rs.getInt("inc_id"));
                al.add(rs.getInt("inc_ac"));
                al.add(rs.getInt("inc_catid"));
                al.add(rs.getInt("amount"));
                al.add(rs.getDate("transaction_date"));
                al.add(rs.getString("recieveby"));
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
     String q = "Select * from incomes having (userid = '"+userid+"') and (transaction_date between '"+sDate+"' and '"+eDate+"')";
     try
        {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(q);
            while(rs.next())
            {
                al.add(rs.getInt("inc_id"));
                al.add(rs.getInt("inc_ac"));
                al.add(rs.getInt("inc_catid"));
                al.add(rs.getInt("amount"));
                al.add(rs.getDate("transaction_date"));
                al.add(rs.getString("recieveby"));
                al.add(rs.getString("remark"));
                System.out.println(al);
                
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
    public static void main(String[] args) 
    {
        IncomesBeans ib = new IncomesBeans();
//        ib.setUserid(1);
//        ib.setAmount(1000);
//        ib.setInc_ac(12345);
//        ib.setInc_catid(12345);
//        ib.setInc_id(12345);
//        ib.setReceiveby("Rajesh Shukla");
//        ib.setRemark("Nil");
        ib.setTransaction_date("2022-02-17");
        IncomesDAO id = new IncomesDAO();
//        id.create(ib);
        ArrayList al = new ArrayList();
//        al = id.findAllById(1);
        
//        LocalDate x1 = LocalDate.of(2020, Month.SEPTEMBER, 21);
//        LocalDate x2 = LocalDate.of(2020, Month.SEPTEMBER, 25);
        al = id.findAllDateWise("2020-09-21", "2020-09-25", 1);
        System.out.println(al);
//        
//        for(int i = 0; i<al.size(); i+=7)
//        {
//            for(int j = i; j<i+7; j++)
//            {
//                System.out.print(al.get(j)+"\t");
//            }
//            System.out.println("\n");
//        }
    }
}
