/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbms_app;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author Akarsh
 */
public class update_name extends javax.swing.JFrame {

    /**
     * Creates new form update_name
     */
    int k;
    public update_name() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        ntxt = new javax.swing.JTextField();
        submitbtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        mtxt = new javax.swing.JTextField();
        srchbtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        idl = new javax.swing.JLabel();
        ml = new javax.swing.JLabel();
        pl = new javax.swing.JLabel();
        nl = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        nl2 = new javax.swing.JLabel();
        il2 = new javax.swing.JLabel();
        ml2 = new javax.swing.JLabel();
        pl2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Enter New Name: ");

        ntxt.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        ntxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ntxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ntxtActionPerformed(evt);
            }
        });

        submitbtn.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 20)); // NOI18N
        submitbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbms_app/Accept-icon.png"))); // NOI18N
        submitbtn.setText("SUBMIT");
        submitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitbtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Enter Mobile No.: ");

        mtxt.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        mtxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        srchbtn.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 20)); // NOI18N
        srchbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbms_app/Start-Menu-Search-icon.png"))); // NOI18N
        srchbtn.setText("Search");
        srchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                srchbtnActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Customer ID: ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Mobile No.: ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Points Earned: ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Name: ");

        idl.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        idl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        ml.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        ml.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        pl.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        pl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        nl.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        nl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jButton3.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 20)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbms_app/back-icon.png"))); // NOI18N
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        nl2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        il2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        ml2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        pl2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(ntxt, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                                .addComponent(mtxt))
                            .addComponent(srchbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel5)))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pl)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pl2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ml))
                            .addComponent(nl2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ml2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(nl)
                                    .addComponent(idl)))
                            .addComponent(il2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addComponent(submitbtn)
                        .addGap(136, 136, 136)
                        .addComponent(jButton3)))
                .addContainerGap(250, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(mtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(srchbtn)
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(il2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(nl2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(ml2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(pl2)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(idl)
                                .addGap(18, 18, 18)
                                .addComponent(nl)
                                .addGap(18, 18, 18)
                                .addComponent(ml)
                                .addGap(18, 18, 18)
                                .addComponent(pl)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(ntxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(139, 139, 139))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(submitbtn))))
                .addGap(124, 124, 124))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ntxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ntxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ntxtActionPerformed

    private void submitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitbtnActionPerformed
        // TODO add your handling code here:
        if(k==1)
        {
            Connection con = ConnectData.MyData();
            String q1 = "SELECT * FROM customer";
            String q2 = "UPDATE customer SET name='"+ntxt.getText()+"' WHERE mobile="+mtxt.getText();
            String a = mtxt.getText();
            try
            {
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(q1);
                while(rs.next())
                {
                    if(a.equals(rs.getString("mobile")))
                    {
                        st.execute(q2);
                        JOptionPane.showMessageDialog(null, "Data UPDATED..");
                    }
                }
            }
            catch(Exception e)
            {
                
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "NO DATA FOUND TO UPDATE");
       }
    }//GEN-LAST:event_submitbtnActionPerformed

    private void srchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_srchbtnActionPerformed
        // TODO add your handling code here:
        Connection con = ConnectData.MyData();
        String q1 = "SELECT * FROM customer where mobile="+mtxt.getText();
        String a = mtxt.getText();
        //int k=0;
        try
        {
            PreparedStatement pst = con.prepareStatement(q1);
            ResultSet rs = pst.executeQuery();
            while(rs.next())
            {
                if(a.equals(rs.getString("mobile")))
                {
                    JOptionPane.showMessageDialog(null,"Data FOUND..");
                    k=1;
                    il2.setText(rs.getString("cust_id"));
                    nl2.setText(rs.getString("name"));
                    ml2.setText(rs.getString("mobile"));
                    pl2.setText(rs.getString("point"));

                    
                }
            }
            if(k==0)
            {
                JOptionPane.showMessageDialog(null, "Data NOT Found..");
            }
        }
        catch(Exception e)
        {
            
        }
    }//GEN-LAST:event_srchbtnActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        main_page mp = new main_page();
        mp.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(update_name.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(update_name.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(update_name.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(update_name.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new update_name().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel idl;
    private javax.swing.JLabel il2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel ml;
    private javax.swing.JLabel ml2;
    private javax.swing.JTextField mtxt;
    private javax.swing.JLabel nl;
    private javax.swing.JLabel nl2;
    private javax.swing.JTextField ntxt;
    private javax.swing.JLabel pl;
    private javax.swing.JLabel pl2;
    private javax.swing.JButton srchbtn;
    private javax.swing.JButton submitbtn;
    // End of variables declaration//GEN-END:variables
}
