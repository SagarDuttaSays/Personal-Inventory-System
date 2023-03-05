 package com.cybrom.dao;
import java.sql.*;
import java.util.*;
import com.cybrom.beans.*;
import com.cybrom.utility.ConnectionPool;

public class IncomeCategoryDAO 
{ 
    static Connection con = ConnectionPool.connectionDB();
    int x = 0;
    public boolean create(IncomeCategoryBeans ic)
    {
        String q = "insert into income_category values ('"+ic.getInc_catid()+"','"+ic.getInc_catname()+"','"+ic.getInc_catdetails()+"','"+ic.getUserid()+"')";
        try
        {
            Statement st = con.createStatement();
            x = st.executeUpdate(q);
            st.close();
            System.out.println("Data inserted into the system successfully.");
            return true;
        }
        catch (Exception e)
        {
            System.out.println("Data couldn't be inserted due to "+e);
            return false;
        }
        
    }
    public boolean edit (IncomeCategoryBeans ic)
    {
        String q = "update income_category set userid = '"+ic.getUserid()+"', inc_catname = '"+ic.getInc_catname()+"', inc_catdetails = '"+ic.getInc_catdetails()+"' where inc_catid = '"+ic.getInc_catid()+"'";
        try
        {
            Statement st = con.createStatement();
            x = st.executeUpdate(q);
            st.close();
            System.out.println("Data updated into the system successfully");
            return true;
        }
        catch (Exception e)
        {
            System.out.println("Data couldn't be updated due to "+e);
            return false;
        }
    }
    public boolean remove (IncomeCategoryBeans ic)
    {
        String q = "Delete from income_category where inc_catid = '"+ic.getInc_catid()+"'";
        try
        {
            Statement st = con.createStatement();
            x = st.executeUpdate(q);
            st.close();
            System.out.println("Record deleted successfully.");
            return true;
        }
        catch (Exception e)
        {
            System.out.println("Record could not be deleted due to "+e);
            return false;
        }
    }
    public ArrayList find (IncomeCategoryBeans ic)
    {
        String q = "Select * from income_category where inc_catid = '"+ic.getInc_catid()+"'";
        ArrayList al = new ArrayList();
        try
        {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(q);
            while (rs.next())
            {
                al.add(rs.getInt("inc_catid"));
                al.add(rs.getString("inc_catname"));
                al.add(rs.getString("inc_catdetails"));
                al.add(rs.getInt("userid"));
                System.out.print("Income Category ID = "+rs.getInt("inc_catid")+"\tName = "+rs.getString("inc_catname")+"\tDetails = "+rs.getString("inc_catdetails")+"\tUser ID = "+rs.getInt("userid"));
                System.out.println("\n");
            }
            System.out.println(al);
            st.close();
        }
        catch (Exception e)
        {
            System.out.println("Record couldn't be loaded due to "+e);
        }
        return al;
    }
    public ArrayList findall (IncomeCategoryBeans ic)
    {
        String q = "Select * from income_category";
        ArrayList al = new ArrayList();
        try
        {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(q);
            while (rs.next())
            {
                al.add(rs.getInt("inc_catid"));
                al.add(rs.getString("inc_catname"));
                al.add(rs.getString("inc_catdetails"));
                al.add(rs.getInt("userid"));
                System.out.print("Income Category ID = "+rs.getInt("inc_catid")+"\tName = "+rs.getString("inc_catname")+"\tDetails = "+rs.getString("inc_catdetails")+"\tUser ID = "+rs.getInt("userid"));
                System.out.println("\n");
            }
            st.close();
        }
        catch (Exception e)
        {
            System.out.println("Record couldn't be loaded due to "+e);
        }
        return al;
    }
    public ArrayList findAllById (int userid)
    {
        String q = "Select * from income_category where userid = '"+userid+"'";
        ArrayList al = new ArrayList();
        try
        {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(q);
            while(rs.next())
            {
                al.add(rs.getInt("inc_catid"));
                al.add(rs.getString("inc_catname"));
                al.add(rs.getString("inc_catdetails"));
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
        IncomeCategoryBeans ic = new IncomeCategoryBeans();
        ic.setInc_catid(2);
//        ic.setInc_catname("Funds");
//        ic.setInc_catdetails("Donation to Church");
//        ic.setUserid(1);
        IncomeCategoryDAO icd = new IncomeCategoryDAO();
        icd.find(ic);
//        ArrayList al = new ArrayList();
//        al = icd.findAllById(1);
//        for(int i = 0; i<al.size(); i+=3)
//        {
//            for(int j = i; j<i+3; j++)
//            {
//                System.out.print(al.get(j)+"\t");
//            }
//            System.out.println("\n");
//        }
    }
}
