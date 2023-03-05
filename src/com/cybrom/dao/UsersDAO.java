package com.cybrom.dao;
import com.cybrom.beans.UsersBeans;
import java.sql.*;
import java.util.Vector;
import com.cybrom.utility.ConnectionPool;
import java.util.ArrayList;
public class UsersDAO {
    static Connection con = ConnectionPool.connectionDB();
    public boolean create(UsersBeans ub)
    {
        String q = "insert into users (Userid, Username, password,name, address, mobile, email) values ('"+ub.getUserid()+"','"+ub.getUsername()+"','"+ub.getPassword()+"','"+ub.getName()+"','"+ub.getAddress()+"','"+ub.getMobile()+"','"+ub.getEmail()+"')";
        int x = 0;
        try
        {
            Statement st = con.createStatement();
            x = st.executeUpdate(q);
            st.close();
            System.out.println("Account created successfully.");
            return true;
        }
        catch(Exception e)
        {
            System.out.println("Account not created due to "+e);
            return false;
        }
        
   }
    public boolean edit(UsersBeans ub)
    {
       int x = 0;
       try
       {
           String q = "Update users set username = '"+ub.getUsername()+"', name = '"+ub.getName()+"', password = '"+ub.getPassword()+"', address = '"+ub.getAddress()+"', mobile = '"+ub.getMobile()+"', email = '"+ub.getEmail()+"' where userid = '"+ub.getUserid()+"'";
           Statement st = con.createStatement();
           x = st.executeUpdate(q);
           st.close();
           System.out.println("Details updated successfully.");
           return true;
       }
       catch(Exception e)
       {
           System.out.println("Details could not be updated due to "+e);
           return false;
       }
       
    }
    
    public boolean remove(UsersBeans ub)
    {
       int x = 0;
       try
       {
           String q = "delete from users where userid = '"+ub.getUserid()+"'";
           Statement st = con.createStatement();
           x = st.executeUpdate(q);
           st.close();
           System.out.println("Account deleted successfully.");
           return true;
       }
       catch(Exception e)
       {
           System.out.println("Account could not be deleted due to "+e);
           return false;
       }
    }
    
    public boolean find(UsersBeans ub)
    {
       try
       {
           String q = "select * from users where userid = '"+ub.getUserid()+"'";
           Statement st = con.createStatement();
           ResultSet rs = st.executeQuery(q);
           while(rs.next())
           {
               System.out.println("User ID = "+rs.getInt ("userid")+"\tUsername = "+rs.getString("username")+"\tName = "+rs.getString("name")+"\tAddress = "+rs.getString("address"+"\tPhone Number"+rs.getString("mobile")+"\tEmail ID = "+rs.getString("email")));
           }
           st.close();
           return true;
       }
       catch(Exception e)
       {
           System.out.println("Account details could not be displayed due to "+e);
           return false;
       }
    }
    
    public ArrayList findall()
    {
        ArrayList al = new ArrayList();
       try
       {
           String q = "select * from users";
           Statement st = con.createStatement();
           ResultSet rs = st.executeQuery(q);
           while(rs.next())
           {
               al.add(rs.getString("username"));
               al.add(rs.getInt("userid"));
               al.add(rs.getString("name"));
               al.add(rs.getString("address"));
               al.add(rs.getString("mobile"));
               al.add(rs.getString("email"));
               al.add(rs.getString("password"));
           }
           st.close();
       }
       catch(Exception e)
       {
           System.out.println("Account details could not be displayed due to "+e);
       }
       return al;
    }
    public int checkAvailability (String username)
    {
        String q = "Select username from users";
        int x = 0;
        try
        {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(q);
            while(rs.next())
            {
                if(rs.getString("username").equals(username))
                {
                    x=1;
                    break;
                }
            }
            st.close();
        }
        catch(Exception e)
        {
            System.out.println("Couldn't verify the username due to "+e);
            x = -1;
        }
        return x;
    }
    public int checkAvailability (String username, String pwd)
    {
        String q = "Select username, password from users";
        int x = 0;
        try
        {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(q);
            while(rs.next())
            {
                if(rs.getString("username").equalsIgnoreCase(username)&& rs.getString("password").equals(pwd))
                {
                    x=1;
                    break;
                }
            }
            st.close();
        }
        catch(Exception e)
        {
            System.out.println("Couldn't verify the username due to "+e);
            x = -1;
        }
        return x;
    }
    public UsersBeans authenticate(String username, String password)
    {
        UsersBeans ub = new UsersBeans();
        ArrayList <UsersBeans> al = new ArrayList <> ();
        return ub;
    }
    public static void main(String[] args) {
        UsersBeans ub = new UsersBeans();
//        ub.setUserid(10);
        ub.setUsername("AS1");
        ub.setPassword("12345");
        ub.setName("Amit Singh");
        ub.setMobile("+91-1234567890");
        ub.setAddress("Amravatti, AP");
        ub.setEmail("amit@hotmail1.com");
        UsersDAO ud = new UsersDAO ();
        ud.create(ub);
//        int x = ud.checkAvailability("SA1","1234");
//        if(x==1)
//            System.out.println("Valid username");
//        else
//            System.out.println("Invalid username");
        
        
    }
}
