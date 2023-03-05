/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.cybrom.frames;

import com.cybrom.beans.ExpensesCategoryBeans;
import com.cybrom.dao.ExpensesCategoryDAO;
import com.cybrom.dao.UsersDAO;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ExpensesCategory extends javax.swing.JFrame {
String username, choice;
    /**
     * Creates new form ExpensesCategory
     */
    public ExpensesCategory() {
        initComponents();
    }
    public ExpensesCategory(String username) {
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

        op1 = new javax.swing.JOptionPane();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("HOME");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1);
        jLabel1.setBounds(540, 10, 70, 31);

        tb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Expense Category ID", "Expense Category Name", "Expense Category Details", "User ID"
            }
        ));
        tb.setGridColor(new java.awt.Color(51, 51, 51));
        jScrollPane1.setViewportView(tb);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 242, 650, 200);

        jPanel1.setOpaque(false);

        buttonGroup1.add(r1);
        r1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        r1.setForeground(new java.awt.Color(255, 255, 255));
        r1.setText("Create");
        r1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(r2);
        r2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        r2.setForeground(new java.awt.Color(255, 255, 255));
        r2.setText("Edit");
        r2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(r3);
        r3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        r3.setForeground(new java.awt.Color(255, 255, 255));
        r3.setText("Remove");
        r3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(r4);
        r4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        r4.setForeground(new java.awt.Color(255, 255, 255));
        r4.setText("Find");
        r4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4ActionPerformed(evt);
            }
        });

        buttonGroup1.add(r5);
        r5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        r5.setForeground(new java.awt.Color(255, 255, 255));
        r5.setText("Find all");
        r5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5ActionPerformed(evt);
            }
        });

        buttonGroup1.add(r6);
        r6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        r6.setForeground(new java.awt.Color(255, 255, 255));
        r6.setText("Find all by ID");
        r6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r6ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("PRESS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jButton1))
                    .addComponent(r6))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(r1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(r2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(r3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(r4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(r5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(r6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(0, 16, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 10, 180, 230);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exp cat.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, -30, 650, 470);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        Dashboard db = new Dashboard(username);
        db.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel1MouseClicked

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

    private void r5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r5ActionPerformed
        // TODO add your handling code here:
        if(r5.isSelected())
        choice = "findall";
    }//GEN-LAST:event_r5ActionPerformed

    private void r6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r6ActionPerformed
        // TODO add your handling code here:
        if(r6.isSelected())
        choice="findallbyid";
    }//GEN-LAST:event_r6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel d = (DefaultTableModel) tb.getModel();
        String inc_catname, inc_catdetails;
        int userid, inc_catid;
        ExpensesCategoryBeans icb = new ExpensesCategoryBeans();
        ExpensesCategoryDAO icd = new ExpensesCategoryDAO();
        UsersDAO ud = new UsersDAO();
        ArrayList al = new ArrayList();
        int row = d.getRowCount();
        boolean x;
        switch(choice)
        {
            case "create":
            inc_catid = Integer.parseInt(op1.showInputDialog(this,"Please enter the Expense Category ID"));
            inc_catname = op1.showInputDialog(this,"Plase enter the Expense Category Name");
            inc_catdetails = op1.showInputDialog(this,"Please enter the Expense Category Details");
            userid = Integer.parseInt(op1.showInputDialog(this,"Please enter the userid"));
            icb.setExp_catdetails(inc_catdetails);
            icb.setExp_catid(inc_catid);
            icb.setExp_catname(inc_catname);
            icb.setUserid(userid);
            x = icd.create(icb);
            if(x)
            op1.showMessageDialog(this, "Record added successfully");
            else
            op1.showMessageDialog(this, "Record couldn't be added");
            break;
            case "edit":
            inc_catid = Integer.parseInt(op1.showInputDialog(this,"Please enter the Expense Category ID"));
            inc_catname = op1.showInputDialog(this,"Please enter the Expense Category Name to update");
            inc_catdetails = op1.showInputDialog(this,"Please enter the Expense Category Details to update");
            userid = Integer.parseInt(op1.showInputDialog(this,"Please enter the userid to update"));
            icb.setExp_catdetails(inc_catdetails);
            icb.setExp_catid(inc_catid);
            icb.setExp_catname(inc_catname);
            icb.setUserid(userid);
            x = icd.create(icb);
            if(x)
            op1.showMessageDialog(this, "Record updated successfully");
            else
            op1.showMessageDialog(this, "Record couldn't be updated");
            break;
            case "remove":
            inc_catid = Integer.parseInt(op1.showInputDialog(this,"Please enter the Expense Category ID"));
            icb.setExp_catid(inc_catid);
            x = icd.create(icb);
            if(x)
            op1.showMessageDialog(this, "Record deleted successfully");
            else
            op1.showMessageDialog(this, "Record couldn't be deleted");
            break;
            case "find":
            d.setRowCount(0);
            inc_catid = Integer.parseInt(op1.showInputDialog(this,"Please enter the Expense Category ID"));
            icb.setExp_catid(inc_catid);
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
            java.util.logging.Logger.getLogger(ExpensesCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExpensesCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExpensesCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExpensesCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExpensesCategory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
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