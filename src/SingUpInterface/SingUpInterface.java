/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package SingUpInterface;

import DbConnection.CrudUtil;
import firstInterface.FirstInterface;
import javax.swing.JFrame;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Mr.Secreti
 */
public final class SingUpInterface extends javax.swing.JFrame {

//    Connection con;
//    PreparedStatement pst;
//    ResultSet rs;
    
    public void Connector(){   
        try {
    // Retrieve the last CUSTOMER_ID from the CUSTOMER table
    ResultSet cusid = CrudUtil.execute("SELECT * FROM CUSTOMER ORDER BY CUSTOMER_ID DESC LIMIT 1");

    if (cusid.next()) {
        String lastcusid = cusid.getString("CUSTOMER_ID");

        // Extract the numeric part of the last CUSTOMER_ID
        String numericPart = lastcusid.replaceAll("[^0-9]", "");

        // Convert the numeric part to an integer, increment it, and format it with leading zeros
        int nextNumericPart = Integer.parseInt(numericPart) + 1;
        String nextcusid = "CUS" + String.format("%03d", nextNumericPart);

        // Set the nextcusid as the text for cusidTxt
        cusidTxt.setText(nextcusid);
    } else {
        // Handle the case where no data is found in the CUSTOMER table
        JOptionPane.showMessageDialog(null, "No customer data found.");
    }
} catch (SQLException | ClassNotFoundException ex) {
    // Handle database-related exceptions
    JOptionPane.showMessageDialog(null, "Error accessing the database.");
}

    }
    /**
     * Creates new form SingUpInterface
   //  * @throws java.lang.ClassNotFoundException
    // * @throws java.sql.SQLException
     */
    public SingUpInterface(){
        initComponents();
        Connector();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        FirstNameTxt = new javax.swing.JTextField();
        EmailTxt = new javax.swing.JTextField();
        cusidTxt = new javax.swing.JTextField();
        ConformPasswordTxt = new javax.swing.JTextField();
        LastNameTxt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        PasswordTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SingUp");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setOpaque(false);
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(231, 8, 190));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FeedbackInterface/images/8542462_window_close_icon (1).png"))); // NOI18N
        jLabel4.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel4.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel4.setOpaque(true);
        jLabel4.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 0, 50, 50));

        jPanel5.setOpaque(false);
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(231, 8, 190));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FeedbackInterface/images/9110431_minus_rectangle_f_icon.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel1.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel1.setOpaque(true);
        jLabel1.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 0, 50, 50));

        jPanel6.setBackground(new java.awt.Color(231, 8, 190));

        jLabel5.setBackground(new java.awt.Color(66, 27, 195));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("FEEDBACK MANAGEMENT SYSTEM");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 950, 50));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0,92));
        jPanel3.setOpaque(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(2, 12, 130,200));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FirstNameTxt.setBackground(new java.awt.Color(255, 175, 241));
        FirstNameTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        FirstNameTxt.setForeground(new java.awt.Color(255, 255, 255));
        FirstNameTxt.setText("Enter your First name");
        FirstNameTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FirstNameTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                FirstNameTxtMouseExited(evt);
            }
        });
        jPanel7.add(FirstNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 340, 40));

        EmailTxt.setBackground(new java.awt.Color(255, 175, 241));
        EmailTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        EmailTxt.setForeground(new java.awt.Color(255, 255, 255));
        EmailTxt.setText("Enter your Email");
        EmailTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EmailTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EmailTxtMouseExited(evt);
            }
        });
        jPanel7.add(EmailTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 340, 40));

        cusidTxt.setBackground(new java.awt.Color(255, 175, 241));
        cusidTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cusidTxt.setForeground(new java.awt.Color(255, 255, 255));
        cusidTxt.setFocusable(false);
        jPanel7.add(cusidTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 340, 40));

        ConformPasswordTxt.setBackground(new java.awt.Color(255, 175, 241));
        ConformPasswordTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ConformPasswordTxt.setForeground(new java.awt.Color(255, 255, 255));
        ConformPasswordTxt.setText("Conform Password");
        ConformPasswordTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ConformPasswordTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ConformPasswordTxtMouseExited(evt);
            }
        });
        jPanel7.add(ConformPasswordTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 340, 40));

        LastNameTxt.setBackground(new java.awt.Color(255, 175, 241));
        LastNameTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LastNameTxt.setForeground(new java.awt.Color(255, 255, 255));
        LastNameTxt.setText("Enter your Last name");
        LastNameTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LastNameTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LastNameTxtMouseExited(evt);
            }
        });
        jPanel7.add(LastNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 340, 40));

        jButton1.setBackground(new java.awt.Color(255, 128, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Create ");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jPanel7.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 160, 40));

        jButton2.setBackground(new java.awt.Color(204, 0, 51));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Cancel");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel7.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 160, 40));

        PasswordTxt.setBackground(new java.awt.Color(255, 175, 241));
        PasswordTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        PasswordTxt.setForeground(new java.awt.Color(255, 255, 255));
        PasswordTxt.setText("Enter your Password");
        PasswordTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PasswordTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PasswordTxtMouseExited(evt);
            }
        });
        jPanel7.add(PasswordTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 340, 40));

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 390, 380));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 910, 420));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/firstInterface/purple-sunset-4vdctecz52uxuo4v.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 530));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setSize(new java.awt.Dimension(950, 530));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jPanel4MouseClicked

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        // TODO add your handling code here:
        this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jPanel5MouseClicked

    private void FirstNameTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FirstNameTxtMouseEntered
        // TODO add your handling code here:
        if("Enter your First name".equals(FirstNameTxt.getText())){
            FirstNameTxt.setText("");
        }
    }//GEN-LAST:event_FirstNameTxtMouseEntered

    private void FirstNameTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FirstNameTxtMouseExited
        // TODO add your handling code here:
            if("".equals(FirstNameTxt.getText())){
            FirstNameTxt.setText("Enter your First name");
        }
    }//GEN-LAST:event_FirstNameTxtMouseExited

    private void LastNameTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LastNameTxtMouseEntered
        // TODO add your handling code here:
        if("Enter your Last name".equals(LastNameTxt.getText())){
            LastNameTxt.setText("");
        }
    }//GEN-LAST:event_LastNameTxtMouseEntered

    private void LastNameTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LastNameTxtMouseExited
        // TODO add your handling code here:
        if("".equals(LastNameTxt.getText())){
            LastNameTxt.setText("Enter your Last name");
        }
    }//GEN-LAST:event_LastNameTxtMouseExited

    private void EmailTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmailTxtMouseEntered
        // TODO add your handling code here:
        if("Enter your Email".equals(EmailTxt.getText())){
            EmailTxt.setText("");
        }
    }//GEN-LAST:event_EmailTxtMouseEntered

    private void EmailTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmailTxtMouseExited
        // TODO add your handling code here:
        if("".equals(EmailTxt.getText())){
            EmailTxt.setText("Enter your Email");
        }
    }//GEN-LAST:event_EmailTxtMouseExited

    private void PasswordTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PasswordTxtMouseEntered
        // TODO add your handling code here:
        if("Enter your Password".equals(PasswordTxt.getText())){
            PasswordTxt.setText("");
        }
    }//GEN-LAST:event_PasswordTxtMouseEntered

    private void PasswordTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PasswordTxtMouseExited
        // TODO add your handling code here:
        if("".equals(PasswordTxt.getText())){
            PasswordTxt.setText("Enter your Password");
        }
    }//GEN-LAST:event_PasswordTxtMouseExited

    private void ConformPasswordTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConformPasswordTxtMouseEntered
        // TODO add your handling code here:
        if("Conform Password".equals(ConformPasswordTxt.getText())){
            ConformPasswordTxt.setText("");
        }
    }//GEN-LAST:event_ConformPasswordTxtMouseEntered

    private void ConformPasswordTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConformPasswordTxtMouseExited
        // TODO add your handling code here:
        if("".equals(ConformPasswordTxt.getText())){
            ConformPasswordTxt.setText("Conform Password");
        }
        
    }//GEN-LAST:event_ConformPasswordTxtMouseExited

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        // TODO add your handling code here:
        jButton1.setBackground(new java.awt.Color(231,8,190));
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        // TODO add your handling code here:
        jButton1.setBackground(new java.awt.Color(255,128,204));
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code he:
        String Cusid = cusidTxt.getText();
        String FName=FirstNameTxt.getText();
        String LName=LastNameTxt.getText();
        String Email = EmailTxt.getText();
        String Pas = PasswordTxt.getText();
        String ConPas = ConformPasswordTxt.getText();
        
        if(Pas == null ? ConPas != null : !Pas.equals(ConPas))
        {
            JOptionPane.showMessageDialog(this,"please check password that you enterd ");
        }else{
            try {
                CrudUtil.execute("INSERT INTO customer VALUES (?,?,?,?,?)", Cusid, FName, LName,Email,Pas);
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(SingUpInterface.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
            int response = JOptionPane.showConfirmDialog(
            null,
            "Do you want to continue?",
            "Confirmation",
            JOptionPane.YES_NO_OPTION
        );

        if (response == JOptionPane.YES_OPTION) {
            // User clicked "Yes"
            FirstInterface FI = new FirstInterface();
            FI.setVisible(true);
            this.setVisible(false);
        } else if (response == JOptionPane.NO_OPTION) {
            // User clicked "No"
            
        } else if (response == JOptionPane.CANCEL_OPTION) {
            // User clicked "Cancel" or closed the dialog
            
        }
//         JOptionPane.showMessageDialog(null, "ARE YOU SURE!");
//        FirstInterface FI = new FirstInterface();
//        FI.setVisible(true);
//        this.setVisible(false);
    }//GEN-LAST:event_jButton2MouseClicked

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SingUpInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ConformPasswordTxt;
    private javax.swing.JTextField EmailTxt;
    private javax.swing.JTextField FirstNameTxt;
    private javax.swing.JTextField LastNameTxt;
    private javax.swing.JTextField PasswordTxt;
    private javax.swing.JTextField cusidTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    // End of variables declaration//GEN-END:variables
}
