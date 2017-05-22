/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windows;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Javier
 */
public class New_Customer extends javax.swing.JFrame {

    /**
     * Creates new form New_Customer
     */
    public New_Customer() {
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage (new ImageIcon(getClass().getResource("../img/icono_app.png")).getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Title = new javax.swing.JLabel();
        NAME = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        SURNAME = new javax.swing.JLabel();
        txt_surname = new javax.swing.JTextField();
        ADDRESS = new javax.swing.JLabel();
        txt_address = new javax.swing.JTextField();
        CITY = new javax.swing.JLabel();
        txt_city = new javax.swing.JTextField();
        CP = new javax.swing.JLabel();
        txt_cp = new javax.swing.JTextField();
        PHONE = new javax.swing.JLabel();
        txt_phone = new javax.swing.JTextField();
        EMAIL = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        SAVE = new javax.swing.JButton();
        CANCEL = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setText("NEW CUSTOMER");
        getContentPane().add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, -1, -1));

        NAME.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        NAME.setForeground(new java.awt.Color(255, 255, 255));
        NAME.setText("Name");
        getContentPane().add(NAME, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 70, 30));

        txt_name.setBackground(new java.awt.Color(51, 51, 51));
        txt_name.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 100, 30));

        SURNAME.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        SURNAME.setForeground(new java.awt.Color(255, 255, 255));
        SURNAME.setText("Surname");
        getContentPane().add(SURNAME, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 70, 30));

        txt_surname.setBackground(new java.awt.Color(51, 51, 51));
        txt_surname.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txt_surname, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 100, 30));

        ADDRESS.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        ADDRESS.setForeground(new java.awt.Color(255, 255, 255));
        ADDRESS.setText("Address");
        getContentPane().add(ADDRESS, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 70, 30));

        txt_address.setBackground(new java.awt.Color(51, 51, 51));
        txt_address.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txt_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 100, 30));

        CITY.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        CITY.setForeground(new java.awt.Color(255, 255, 255));
        CITY.setText("City");
        getContentPane().add(CITY, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 70, 30));

        txt_city.setBackground(new java.awt.Color(51, 51, 51));
        txt_city.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txt_city, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, 100, 30));

        CP.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        CP.setForeground(new java.awt.Color(255, 255, 255));
        CP.setText("CP");
        getContentPane().add(CP, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 70, 30));

        txt_cp.setBackground(new java.awt.Color(51, 51, 51));
        txt_cp.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txt_cp, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, 100, 30));

        PHONE.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        PHONE.setForeground(new java.awt.Color(255, 255, 255));
        PHONE.setText("Phone");
        getContentPane().add(PHONE, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 70, 30));

        txt_phone.setBackground(new java.awt.Color(51, 51, 51));
        txt_phone.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txt_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, 100, 30));

        EMAIL.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        EMAIL.setForeground(new java.awt.Color(255, 255, 255));
        EMAIL.setText("Email");
        getContentPane().add(EMAIL, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 70, 30));

        txt_email.setBackground(new java.awt.Color(51, 51, 51));
        txt_email.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 100, 30));

        SAVE.setBackground(new java.awt.Color(25, 25, 25));
        SAVE.setForeground(new java.awt.Color(255, 255, 255));
        SAVE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono_guardar-A.png"))); // NOI18N
        SAVE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SAVE.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono_guardar-B.png"))); // NOI18N
        SAVE.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono_guardar.png"))); // NOI18N
        SAVE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SAVEActionPerformed(evt);
            }
        });
        getContentPane().add(SAVE, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 480, 50, 50));

        CANCEL.setBackground(new java.awt.Color(25, 25, 25));
        CANCEL.setForeground(new java.awt.Color(255, 255, 255));
        CANCEL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono_no-A.png"))); // NOI18N
        CANCEL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CANCEL.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono_no-B.png"))); // NOI18N
        CANCEL.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono_no.png"))); // NOI18N
        CANCEL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CANCELActionPerformed(evt);
            }
        });
        getContentPane().add(CANCEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 480, 50, 50));

        Background.setForeground(new java.awt.Color(255, 255, 255));
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo_windows2.jpg"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CANCELActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CANCELActionPerformed
        // CANCEL
        this.setVisible(false);
    }//GEN-LAST:event_CANCELActionPerformed

    private void SAVEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SAVEActionPerformed
        // SAVE
        JOptionPane.showMessageDialog(null,"Data saved successfully", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_SAVEActionPerformed

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
            java.util.logging.Logger.getLogger(New_Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(New_Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(New_Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(New_Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new New_Customer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ADDRESS;
    private javax.swing.JLabel Background;
    private javax.swing.JButton CANCEL;
    private javax.swing.JLabel CITY;
    private javax.swing.JLabel CP;
    private javax.swing.JLabel EMAIL;
    private javax.swing.JLabel NAME;
    private javax.swing.JLabel PHONE;
    private javax.swing.JButton SAVE;
    private javax.swing.JLabel SURNAME;
    private javax.swing.JLabel Title;
    private javax.swing.JTextField txt_address;
    private javax.swing.JTextField txt_city;
    private javax.swing.JTextField txt_cp;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_phone;
    private javax.swing.JTextField txt_surname;
    // End of variables declaration//GEN-END:variables
}
