/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import javax.swing.JOptionPane;

/**
 *
 * @author ilyes
 */
public class A_principale extends javax.swing.JFrame {

    /**
     * Creates new form A_principale
     */
    public A_principale() {
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

        jPanel1 = new javax.swing.JPanel();
        welcome = new javax.swing.JLabel();
        usagerbtn = new javax.swing.JButton();
        livrebtn = new javax.swing.JButton();
        empruntbtn = new javax.swing.JButton();
        sign_out = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        welcome.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        welcome.setText("welcome");

        usagerbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        usagerbtn.setText("gestion de Usager");
        usagerbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usagerbtnActionPerformed(evt);
            }
        });

        livrebtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        livrebtn.setText("gestion de Livre");
        livrebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                livrebtnActionPerformed(evt);
            }
        });

        empruntbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        empruntbtn.setText("gestion d'Emprunt");
        empruntbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empruntbtnActionPerformed(evt);
            }
        });

        sign_out.setText("sign-out");
        sign_out.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sign_outActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(empruntbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(livrebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(sign_out)
                        .addGap(89, 89, 89)
                        .addComponent(welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(usagerbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 196, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(sign_out)))
                .addGap(2, 2, 2)
                .addComponent(usagerbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(empruntbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(livrebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void empruntbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empruntbtnActionPerformed
        Emprunt em=new Emprunt();
        em.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_empruntbtnActionPerformed

    private void usagerbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usagerbtnActionPerformed
        Usage u=new Usage();
        u.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_usagerbtnActionPerformed

    private void sign_outActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sign_outActionPerformed
        int i=JOptionPane.showConfirmDialog(this, "are you sure?");
        if(i==0){
            AdminConnection adm=new AdminConnection();
            adm.setVisible(true);
            this.setVisible(false);
            this.dispose();
        }
    }//GEN-LAST:event_sign_outActionPerformed

    private void livrebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_livrebtnActionPerformed
        Livre l= new Livre();
        l.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_livrebtnActionPerformed

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
            java.util.logging.Logger.getLogger(A_principale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(A_principale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(A_principale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(A_principale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new A_principale().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton empruntbtn;
    private javax.swing.JButton empruntbtn1;
    private javax.swing.JButton empruntbtn2;
    private javax.swing.JButton empruntbtn3;
    private javax.swing.JButton empruntbtn4;
    private javax.swing.JButton empruntbtn5;
    private javax.swing.JButton empruntbtn6;
    private javax.swing.JButton empruntbtn7;
    private javax.swing.JButton empruntbtn8;
    private javax.swing.JButton empruntbtn9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JButton livrebtn;
    private javax.swing.JButton livrebtn1;
    private javax.swing.JButton livrebtn2;
    private javax.swing.JButton livrebtn3;
    private javax.swing.JButton livrebtn4;
    private javax.swing.JButton livrebtn5;
    private javax.swing.JButton livrebtn6;
    private javax.swing.JButton livrebtn7;
    private javax.swing.JButton livrebtn8;
    private javax.swing.JButton livrebtn9;
    private javax.swing.JButton sign_out;
    private javax.swing.JButton usagebtn1;
    private javax.swing.JButton usagebtn2;
    private javax.swing.JButton usagebtn3;
    private javax.swing.JButton usagebtn4;
    private javax.swing.JButton usagebtn5;
    private javax.swing.JButton usagebtn6;
    private javax.swing.JButton usagebtn7;
    private javax.swing.JButton usagebtn8;
    private javax.swing.JButton usagebtn9;
    private javax.swing.JButton usagerbtn;
    private javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables
}
