/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.CardLayout;


public class PilihGambarButton extends javax.swing.JFrame {

    /**
     * Creates new form PilihGambarButton
     */
    public PilihGambarButton() {
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

        buttonpanel = new javax.swing.JPanel();
        putihbtn = new javax.swing.JButton();
        merahbtn = new javax.swing.JButton();
        birubtn = new javax.swing.JButton();
        exitbtn = new javax.swing.JButton();
        imagepanel = new javax.swing.JPanel();
        putih = new javax.swing.JLabel();
        merah = new javax.swing.JLabel();
        biru = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonpanel.setBackground(new java.awt.Color(153, 153, 255));

        putihbtn.setText("Putih");
        putihbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                putihbtnActionPerformed(evt);
            }
        });
        buttonpanel.add(putihbtn);

        merahbtn.setText("Merah");
        merahbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                merahbtnActionPerformed(evt);
            }
        });
        buttonpanel.add(merahbtn);

        birubtn.setText("Biru");
        birubtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                birubtnActionPerformed(evt);
            }
        });
        buttonpanel.add(birubtn);

        exitbtn.setText("Exit");
        exitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbtnActionPerformed(evt);
            }
        });
        buttonpanel.add(exitbtn);

        getContentPane().add(buttonpanel, java.awt.BorderLayout.PAGE_START);

        imagepanel.setLayout(new java.awt.CardLayout());

        putih.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Putih.jpg"))); // NOI18N
        imagepanel.add(putih, "0");

        merah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Merah.jpg"))); // NOI18N
        imagepanel.add(merah, "1");

        biru.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Biru.jpg"))); // NOI18N
        imagepanel.add(biru, "2");

        getContentPane().add(imagepanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbtnActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitbtnActionPerformed

    private void putihbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_putihbtnActionPerformed
        // TODO add your handling code here:
        CardLayout c1 =(CardLayout) (imagepanel.getLayout());
        c1.show(imagepanel,"0");
    }//GEN-LAST:event_putihbtnActionPerformed

    private void merahbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_merahbtnActionPerformed
        // TODO add your handling code here:
        CardLayout c1 =(CardLayout) (imagepanel.getLayout());
        c1.show(imagepanel,"1");
    }//GEN-LAST:event_merahbtnActionPerformed

    private void birubtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_birubtnActionPerformed
        // TODO add your handling code here:
        CardLayout c1 =(CardLayout) (imagepanel.getLayout());
        c1.show(imagepanel,"2");
    }//GEN-LAST:event_birubtnActionPerformed

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
            java.util.logging.Logger.getLogger(PilihGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PilihGambarButton().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel biru;
    private javax.swing.JButton birubtn;
    private javax.swing.JPanel buttonpanel;
    private javax.swing.JButton exitbtn;
    private javax.swing.JPanel imagepanel;
    private javax.swing.JLabel merah;
    private javax.swing.JButton merahbtn;
    private javax.swing.JLabel putih;
    private javax.swing.JButton putihbtn;
    // End of variables declaration//GEN-END:variables
}
