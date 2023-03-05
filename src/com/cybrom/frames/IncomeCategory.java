/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.cybrom.frames;
import com.cybrom.beans.*;
import com.cybrom.dao.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author hp-pc
 */
public class IncomeCategory extends javax.swing.JFrame {
String username, choice="";
    /**
     * Creates new form IncomeCategory
     */
    public IncomeCategory() {
        initComponents();
    }
    public IncomeCategory(String username) {
        initComponents();
        this.username = username;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        op1 = new javax.swing.JOptionPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        r1 = new javax.swing.JRadioButton();
        r2 = new javax.swing.JRadioButton();
        r3 = new javax.swing.JRadioButton();
        r4 = new javax.swing.JRadioButton();
        r5 = new javax.swing.JRadioButton();
        r6 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 400));
        setUndecorated(true);
        getContentPane().setLayout(null);

        tb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Income Category ID", "Income Category Name", "Income Category Details", "User ID"
            }
        ));
        jScrollPane1.setViewportView(tb);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 212, 630, 170);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("HOME");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1);
        jLabel1.setBounds(540, 10, 60, 30);

        buttonGroup1.add(r1);
        r1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        r1.setForeground(new java.awt.Color(255, 255, 255));
        r1.setText("Create");
        r1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1ActionPerformed(evt);
            }
        });
        getContentPane().add(r1);
        r1.setBounds(0, 6, 98, 24);

        buttonGroup1.add(r2);
        r2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        r2.setForeground(new java.awt.Color(255, 255, 255));
        r2.setText("Edit");
        r2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2ActionPerformed(evt);
            }
        });
        getContentPane().add(r2);
        r2.setBounds(0, 32, 98, 24);

        buttonGroup1.add(r3);
        r3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        r3.setForeground(new java.awt.Color(255, 255, 255));
        r3.setText("Remove");
        r3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3ActionPerformed(evt);
            }
        });
        getContentPane().add(r3);
        r3.setBounds(0, 58, 98, 24);

        buttonGroup1.add(r4);
        r4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        r4.setForeground(new java.awt.Color(255, 255, 255));
        r4.setText("Find");
        r4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4ActionPerformed(evt);
            }
        });
        getContentPane().add(r4);
        r4.setBounds(0, 84, 98, 24);

        buttonGroup1.add(r5);
        r5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        r5.setForeground(new java.awt.Color(255, 255, 255));
        r5.setText("Find all");
        r5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5ActionPerformed(evt);
            }
        });
        getContentPane().add(r5);
        r5.setBounds(0, 110, 98, 24);

        buttonGroup1.add(r6);
        r6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        r6.setForeground(new java.awt.Color(255, 255, 255));
        r6.setText("Find all by ID");
        r6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r6ActionPerformed(evt);
            }
        });
        getContentPane().add(r6);
        r6.setBounds(0, 136, 120, 24);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("PRESS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(10, 170, 72, 22);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exp cat.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 630, 380);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void r5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r5ActionPerformed
        // TODO add your handling code here:
        if(r5.isSelected())
            choice = "findall";
    }//GEN-LAST:event_r5ActionPerformed

    private void r1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1ActionPerformed
        // TODO add your handling code here:
        if(r1.isSelected())
            choice = "create";
    }//GEN-LAST:event_r1ActionPerformed

    private void r2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2ActionPerformed
        // TODO add your handling code here:
        if(r2.isSelected())
            choice = "edit";
    }//GEN-LAST:event_r2ActionPerformed

    private void r3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3ActionPerformed
        // TODO add your handling code here:
        if(r3.isSelected())
            choice="remove";
    }//GEN-LAST:event_r3ActionPerformed

    private void r4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4ActionPerformed
        // TODO add your handling code here:
        if(r4.isSelected())
            choice="find";
    }//GEN-LAST:event_r4ActionPerformed

    private void r6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r6ActionPerformed
        // TODO add your handling code here:
        if(r6.isSelected())
            choice="findallbyid";
    }//GEN-LAST:event_r6ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        Dashboard db = new Dashboard(username);
        db.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel d = (DefaultTableModel) tb.getModel();
        String inc_catname, inc_catdetails;
        int userid, inc_catid;
        IncomeCategoryBeans icb = new IncomeCategoryBeans();
        IncomeCategoryDAO icd = new IncomeCategoryDAO();
        UsersDAO ud = new UsersDAO();
        ArrayList al = new ArrayList();
        int row = d.getRowCount();
        boolean x;
        switch(choice)
        {
            case "create":
                inc_catid = Integer.parseInt(op1.showInputDialog(this,"Please enter the Income Category ID"));
                inc_catname = op1.showInputDialog(this,"Plase enter the Income Category Name");
                inc_catdetails = op1.showInputDialog(this,"Please enter the Income Category Details");
                userid = Integer.parseInt(op1.showInputDialog(this,"Please enter the userid"));
                icb.setInc_catdetails(inc_catdetails);
                icb.setInc_catid(inc_catid);
                icb.setInc_catname(inc_catname);
                icb.setUserid(userid);
                x = icd.create(icb);
                if(x)
                    op1.showMessageDialog(this, "Record added successfully");
                else
                    op1.showMessageDialog(this, "Record couldn't be added");
                break;
            case "edit":
                inc_catid = Integer.parseInt(op1.showInputDialog(this,"Please enter the Income Category ID"));
                inc_catname = op1.showInputDialog(this,"Please enter the Income Category Name to update");
                inc_catdetails = op1.showInputDialog(this,"Please enter the Income Category Details to update");
                userid = Integer.parseInt(op1.showInputDialog(this,"Please enter the userid to update"));
                icb.setInc_catdetails(inc_catdetails);
                icb.setInc_catid(inc_catid);
                icb.setInc_catname(inc_catname);
                icb.setUserid(userid);
                x = icd.create(icb);
                if(x)
                    op1.showMessageDialog(this, "Record updated successfully");
                else
                    op1.showMessageDialog(this, "Record couldn't be updated");
                break;
            case "remove":
                inc_catid = Integer.parseInt(op1.showInputDialog(this,"Please enter the Income Category ID"));
                icb.setInc_catid(inc_catid);
                x = icd.create(icb);
                if(x)
                    op1.showMessageDialog(this, "Record deleted successfully");
                else
                    op1.showMessageDialog(this, "Record couldn't be deleted");
                break;
            case "find":
                d.setRowCount(0);
                inc_catid = Integer.parseInt(op1.showInputDialog(this,"Please enter the Income Category ID"));
                icb.setInc_catid(inc_catid);
                al = icd.find(icb);
                System.out.println(al);
                for(int i = 0; i<al.size(); i+=4)
                {
                    d.addRow(new Object []{al.get(i), al.get(i+1), al.get(i+2), al.get(i+3)});
                }
                tb.setModel(d);
                al.removeAll(al);
                break;
            case "findall":
                d.setRowCount(0);
                al = icd.findall(icb);
                for(int i = 0; i<al.size(); i+=4)
                {
                    d.addRow(new Object []{al.get(i), al.get(i+1), al.get(i+2), al.get(i+3)});
                }
                tb.setModel(d);
                al.removeAll(al);
                break;
            case "findallbyid":
               d.setRowCount(0);
                userid = Integer.parseInt(op1.showInputDialog(this,"Please enter the userid"));
                al = icd.findAllById(userid);
                for(int i = 0; i<al.size(); i+=3)
                {
                    d.addRow(new Object []{al.get(i), al.get(i+1), al.get(i+2),userid});
                }
                tb.setModel(d);
                al.removeAll(al);
                break;
            default:
                op1.showMessageDialog(this,"Please select an operation");
                break;
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void refresh(DefaultTableModel d, JTable tb)
//    {
//        int row = d.getRowCount();
//        for(int i = 0; i<row; i++)
//        {
//            d.removeRow(i);
//        }
//        tb.setModel(d);
//    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IncomeCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IncomeCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IncomeCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IncomeCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IncomeCategory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JOptionPane op1;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r2;
    private javax.swing.JRadioButton r3;
    private javax.swing.JRadioButton r4;
    private javax.swing.JRadioButton r5;
    private javax.swing.JRadioButton r6;
    private javax.swing.JTable tb;
    // End of variables declaration//GEN-END:variables
}
