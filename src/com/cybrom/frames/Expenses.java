/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.cybrom.frames;

import com.cybrom.beans.ExpensesBeans;
import com.cybrom.dao.ExpensesDAO;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hp-pc
 */
public class Expenses extends javax.swing.JFrame {
String username, choice="";
    /**
     * Creates new form Expenses
     */
    public Expenses() {
        initComponents();
    }
    public Expenses(String username) {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tb = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        r1 = new javax.swing.JRadioButton();
        r2 = new javax.swing.JRadioButton();
        r3 = new javax.swing.JRadioButton();
        r4 = new javax.swing.JRadioButton();
        r5 = new javax.swing.JRadioButton();
        r6 = new javax.swing.JRadioButton();
        r7 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(950, 550));
        setUndecorated(true);
        getContentPane().setLayout(null);

        tb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Expense ID", "Expense Acc", "User ID", "Expense Category ID", "Amount", "Transaction Date", "Pay by", "Remark"
            }
        ));
        jScrollPane1.setViewportView(tb);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 309, 950, 241);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("HOME");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1);
        jLabel1.setBounds(878, 6, 66, 34);

        jPanel1.setOpaque(false);

        r1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        r1.setForeground(new java.awt.Color(255, 255, 255));
        r1.setText("Create");
        r1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1ActionPerformed(evt);
            }
        });

        r2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        r2.setForeground(new java.awt.Color(255, 255, 255));
        r2.setText("Update");
        r2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2ActionPerformed(evt);
            }
        });

        r3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        r3.setForeground(new java.awt.Color(255, 255, 255));
        r3.setText("Delete");
        r3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3ActionPerformed(evt);
            }
        });

        r4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        r4.setForeground(new java.awt.Color(255, 255, 255));
        r4.setText("Find");
        r4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4ActionPerformed(evt);
            }
        });

        r5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        r5.setForeground(new java.awt.Color(255, 255, 255));
        r5.setText("Find All");
        r5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5ActionPerformed(evt);
            }
        });

        r6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        r6.setForeground(new java.awt.Color(255, 255, 255));
        r6.setText("Find by ID");
        r6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r6ActionPerformed(evt);
            }
        });

        r7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        r7.setForeground(new java.awt.Color(255, 255, 255));
        r7.setText("Find by date");
        r7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("SUBMIT");
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(r5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r7))
                        .addGap(422, 422, 422))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(r1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(r2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(r3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(r4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(r1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(r2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(r3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(r4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(r5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(r6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(r7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(17, 12, 535, 291);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pexels-pixabay-259200 (1).jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, -10, 970, 570);

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
            choice="create";
    }//GEN-LAST:event_r1ActionPerformed

    private void r2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2ActionPerformed
        // TODO add your handling code here:
        if(r2.isSelected())
            choice="update";
    }//GEN-LAST:event_r2ActionPerformed

    private void r3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3ActionPerformed
        // TODO add your handling code here:
        if(r3.isSelected())
            choice="delete";
    }//GEN-LAST:event_r3ActionPerformed

    private void r4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4ActionPerformed
        // TODO add your handling code here:
        if(r4.isSelected())
            choice="find";
    }//GEN-LAST:event_r4ActionPerformed

    private void r5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r5ActionPerformed
        // TODO add your handling code here:
        if(r5.isSelected())
            choice="findall";
    }//GEN-LAST:event_r5ActionPerformed

    private void r6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r6ActionPerformed
        // TODO add your handling code here:
        if(r6.isSelected())
            choice="findbyid";
    }//GEN-LAST:event_r6ActionPerformed

    private void r7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r7ActionPerformed
        // TODO add your handling code here:
        if(r7.isSelected())
            choice="bydate";
    }//GEN-LAST:event_r7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ExpensesBeans eb;
        ExpensesDAO ed = new ExpensesDAO();
        ArrayList al = new ArrayList();
        DefaultTableModel d = (DefaultTableModel) tb.getModel();
        int exp_id, exp_ac, userid, exp_catid, amount;
        String payby, remark, t_date, sDate, eDate;
        boolean b = false;
        switch(choice)
        {
            case "create":
                exp_id = Integer.parseInt(op1.showInputDialog(this,"Enter the Expense ID"));
                exp_ac = Integer.parseInt(op1.showInputDialog(this,"Enter the Expense Account"));
                userid = Integer.parseInt(op1.showInputDialog(this,"Enter the User ID"));
                exp_catid = Integer.parseInt(op1.showInputDialog(this,"Enter the Expense Category ID"));
                amount = Integer.parseInt(op1.showInputDialog(this,"Enter the amount"));
                t_date = op1.showInputDialog(this,"Enter the date(YYYY-MM-DD) of transaction");
                payby = op1.showInputDialog(this,"Enter the mode of transaction (Cash/Cheque/DD/NEFT-RTGS/UPI)");
                remark = op1.showInputDialog(this,"Enter remarks concerning the transaction");
                eb = new ExpensesBeans(exp_id, exp_ac, exp_catid, amount, userid, t_date, payby, remark);
                b = ed.create(eb);
                if(b)
                    op1.showMessageDialog(this,"Record created successfully");
                else
                    op1.showMessageDialog(this,"Record could not be created");
                break;
            case "update":
                exp_id = Integer.parseInt(op1.showInputDialog(this,"Enter the Expense ID"));
                exp_ac = Integer.parseInt(op1.showInputDialog(this,"Enter the new Expense Account to update"));
                userid = Integer.parseInt(op1.showInputDialog(this,"Enter the new User ID  to update"));
                exp_catid = Integer.parseInt(op1.showInputDialog(this,"Enter the new Expense Category ID  to update"));
                amount = Integer.parseInt(op1.showInputDialog(this,"Enter the new amount  to update"));
                t_date = op1.showInputDialog(this,"Enter the new date (YYYY-MM-DD) of transaction  to update");
                payby = op1.showInputDialog(this,"Enter the new mode of transaction (Cash/Cheque/DD/NEFT-RTGS/UPI)to update");
                remark = op1.showInputDialog(this,"Enter new remarks concerning the transaction to update");
                eb = new ExpensesBeans(exp_id, exp_ac, exp_catid, amount, userid, t_date, payby, remark);
                b = ed.edit(eb);
                if(b)
                    op1.showMessageDialog(this,"Record updated successfully");
                else
                    op1.showMessageDialog(this,"Record could not be updated");
                break;
            case "delete":
                exp_id = Integer.parseInt(op1.showInputDialog(this,"Enter the Expense ID"));
                eb = new ExpensesBeans();
                eb.setExp_id(exp_id);
                b = ed.remove(eb);
                if(b)
                    op1.showMessageDialog(this,"Record deleted successfully");
                else
                    op1.showMessageDialog(this,"Record could not be deleted");
                break;
            case "find":
                d.setRowCount(0);
                tb.setModel(d);
                exp_id = Integer.parseInt(op1.showInputDialog(this,"Enter the Income ID"));
                eb = new ExpensesBeans();
                eb.setExp_id(exp_id);
                al = ed.find(eb);
                for(int i = 0; i<al.size(); i+=8)
                {
                    d.addRow(new Object [] {al.get(i),al.get(i+1),al.get(i+2),al.get(i+3),al.get(i+4),al.get(i+5),al.get(i+6),al.get(i+7)});
                    tb.setModel(d);
                }
                al.removeAll(al);
                break;
            case "findall":
                d.setRowCount(0);
                tb.setModel(d);
                al = ed.findall();
                System.out.println("frame "+al);
                for(int i = 0; i<al.size(); i+=8)
                {
                    d.addRow(new Object [] {al.get(i),al.get(i+1),al.get(i+2),al.get(i+3),al.get(i+4),al.get(i+5),al.get(i+6),al.get(i+7)});
                    tb.setModel(d);
                }
                al.removeAll(al);
                break;
            case "findbyid":
                d.setRowCount(0);
                tb.setModel(d);
                userid = Integer.parseInt(op1.showInputDialog(this,"Enter the User ID"));
                al = ed.findAllById(userid);
                for(int i = 0; i<al.size(); i+=8)
                {
                    d.addRow(new Object [] {al.get(i),al.get(i+1),al.get(i+2),al.get(i+3),al.get(i+4),al.get(i+5),al.get(i+6),al.get(i+7)});
                    tb.setModel(d);
                }
                al.removeAll(al);
                break;
            case "bydate":
                d.setRowCount(0);
                tb.setModel(d);
                sDate = op1.showInputDialog(this,"Enter the starting date (YYYY-MM-DD)");
                eDate = op1.showInputDialog(this,"Enter the ending date (YYYY-MM-DD)");
                userid = Integer.parseInt(op1.showInputDialog(this,"Enter the User ID"));
                al = ed.findAllDateWise(sDate, eDate, userid);
                for(int i = 0; i<al.size(); i+=8)
                {
                    d.addRow(new Object [] {al.get(i),al.get(i+1),al.get(i+2),al.get(i+3),al.get(i+4),al.get(i+5),al.get(i+6),al.get(i+7)});
                    tb.setModel(d);
                }
                al.removeAll(al);
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
            java.util.logging.Logger.getLogger(Expenses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Expenses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Expenses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Expenses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Expenses().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JRadioButton r7;
    private javax.swing.JTable tb;
    // End of variables declaration//GEN-END:variables
}