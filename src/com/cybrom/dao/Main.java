package com.cybrom.dao;
import com.cybrom.beans.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UsersBeans ub = new UsersBeans();
        UsersDAO ud = new UsersDAO();
        System.out.println("Enter 1 to login");
        System.out.println("Enter 2 to sign-up");
        int n = sc.nextInt();
        BankBookBeans bb = new BankBookBeans();
            BankBookDAO bd = new BankBookDAO();
            CashBookBeans cb = new CashBookBeans();
            CashBookDAO cd = new CashBookDAO();
            ExpensesCategoryBeans ecb = new ExpensesCategoryBeans();
            ExpensesCategoryDAO ecd = new ExpensesCategoryDAO();
            ExpensesBeans eb = new ExpensesBeans();
            ExpensesDAO ed = new ExpensesDAO();
            IncomeCategoryBeans icb = new IncomeCategoryBeans();
            IncomeCategoryDAO icd = new IncomeCategoryDAO();
            IncomesBeans inb = new IncomesBeans();
            IncomesDAO ind = new IncomesDAO();
        switch(n)
        {
            case 1:
                System.out.println("Enter your uusername");
                String username = sc.next();
                System.out.println("Enter your password");
                String pwd = sc.next();
                int x = ud.checkAvailability(username, pwd);
                if(x==0)
                 {
                  System.out.println("Username does not exists");
                 }
                else if(x==-1)
                 {
                  System.out.println("Invalid username or password");
                 }
                else if(x==1)
                 {
                  System.out.println("Logged in successfully");
                  System.out.println("-------------------------------------------\n");
            System.out.println("Press 1 to show BankBook");
            System.out.println("Press 2 to show CashBook");
            System.out.println("Press 3 to show ExpenseCategories");
            System.out.println("Press 4 to show Expenses");
            System.out.println("Press 5 to show IncomeCategories");
            System.out.println("Press 6 to show Incomes");
            System.out.println("Enter anything else to Exit.");
            System.out.println("\n-----------------------------------------\n");
            n = sc.nextInt();
            switch(n)
            {
                case 1:
                    bd.findall(bb);
                    break;
                case 2:
                    cd.findall(cb);
                    break;
                case 3:
                    ecd.findall(ecb);
                case 4:
                    ed.findall();
                    break;
                case 5:
                    icd.findall(icb);
                    break;
                case 6:
                    ind.findall();
                default:
                    System.out.println("EXIT");
                    break;
            }
                 }
                
                break;
            case 2:
                System.out.println("Enter your User ID");
                int uid = sc.nextInt();
                System.out.println("Enter your username");
                String uName = sc.next();
                System.out.println("Enter your password");
                String pass = sc.next();
                System.out.println("Enter your name");
                String name = sc.next();
                System.out.println("Enter your address");
                String add = sc.next();
                System.out.println("Enter your mobile number");
                String mno = sc.next();
                System.out.println("Enter your email id");
                String email = sc.next();
                ub.setUserid(uid);
                ub.setUsername(uName);
                ub.setPassword(pass);
                ub.setAddress(add);
                ub.setMobile(mno);
                ub.setName(name);
                ub.setEmail(email);
                int c = ud.checkAvailability(uName);
                if(c==1)
                    System.out.println("Username already in use");
                else if (c==0)
                    ud.create(ub);
                else
                    System.out.println("Database under restoration. Please try again later!");
                break;
            default:
                System.out.println("EXIT");
                break;
        }
    }
}
