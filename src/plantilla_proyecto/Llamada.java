package plantilla_proyecto;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author COREI3
 */
public class Llamada extends javax.swing.JFrame {

    /**
     * Creates new form Llamada
     */
    Timer t;
    int i = 60;

    public Llamada() {
        initComponents();
        this.setLocationRelativeTo(null);

        t = new Timer(1000, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                timer.setText(String.valueOf(i));

                i--;
                if (i == 0) {

                    dispose();

                }

            }

        });
        t.start();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlprin = new javax.swing.JPanel();
        lblcontestado = new javax.swing.JLabel();
        timer = new javax.swing.JLabel();
        colgar = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlprin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblcontestado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/llamando.png"))); // NOI18N
        pnlprin.add(lblcontestado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 200, 200));

        timer.setFont(new java.awt.Font("Tahoma", 1, 75)); // NOI18N
        timer.setForeground(new java.awt.Color(255, 255, 255));
        pnlprin.add(timer, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 220, 200));

        colgar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/colgar.png"))); // NOI18N
        colgar.setBorder(null);
        colgar.setBorderPainted(false);
        colgar.setContentAreaFilled(false);
        colgar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colgarActionPerformed(evt);
            }
        });
        pnlprin.add(colgar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, 240, 220));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo_1.jpg"))); // NOI18N
        pnlprin.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 300));

        getContentPane().add(pnlprin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void colgarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colgarActionPerformed
        this.dispose();

    }//GEN-LAST:event_colgarActionPerformed

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(Llamada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Llamada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Llamada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Llamada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Llamada().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton colgar;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel lblcontestado;
    private javax.swing.JPanel pnlprin;
    private javax.swing.JLabel timer;
    // End of variables declaration//GEN-END:variables
}
