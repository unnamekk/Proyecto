package plantilla_proyecto;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Preguntas extends javax.swing.JFrame {
    
    Timer t;
    int i = 180;
    boolean lf = false;

    public Preguntas() {
        initComponents();
        
        t = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                timer.setText(String.valueOf(i));
                i--;
                if (i == 0) {
                    JOptionPane.showMessageDialog(null,"Se acabo su tiempo","Intenta de nuevo", JOptionPane.CANCEL_OPTION);
                    dispose();
                }
            }
        });
        t.start();
        
        this.setLocationRelativeTo(null);
        
        ImageIcon fon = new ImageIcon("src/imagenes/fondo_1.jpg");
        Icon icon0 = new ImageIcon(fon.getImage().getScaledInstance(fondo.getWidth(), fondo.getHeight(), Image.SCALE_DEFAULT));
        fondo.setIcon(icon0);
        this.repaint();
        
        ImageIcon res1 = new ImageIcon("src/imagenes/Imagen1.png");
        Icon icon1 = new ImageIcon(res1.getImage().getScaledInstance(btnres1.getWidth(), btnres1.getHeight(), Image.SCALE_DEFAULT));
        btnres1.setIcon(icon1);
        this.repaint();
        
        ImageIcon res2 = new ImageIcon("src/imagenes/Imagen1.png");
        Icon icon2 = new ImageIcon(res2.getImage().getScaledInstance(btnres2.getWidth(), btnres2.getHeight(), Image.SCALE_DEFAULT));
        btnres2.setIcon(icon2);
        this.repaint();
        
        ImageIcon res3 = new ImageIcon("src/imagenes/Imagen1.png");
        Icon icon3 = new ImageIcon(res3.getImage().getScaledInstance(btnres3.getWidth(), btnres3.getHeight(), Image.SCALE_DEFAULT));
        btnres3.setIcon(icon3);
        this.repaint();
        
        ImageIcon res4 = new ImageIcon("src/imagenes/Imagen1.png");
        Icon icon4 = new ImageIcon(res4.getImage().getScaledInstance(btnres4.getWidth(), btnres4.getHeight(), Image.SCALE_DEFAULT));
        btnres4.setIcon(icon4);
        this.repaint();
        
        ImageIcon preg = new ImageIcon("src/imagenes/Imagen1.png");
        Icon icon5 = new ImageIcon(preg.getImage().getScaledInstance(lblpregunta.getWidth(), lblpregunta.getHeight(), Image.SCALE_DEFAULT));
        lblpregunta.setIcon(icon5);
        this.repaint();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl1 = new javax.swing.JPanel();
        btnres2 = new javax.swing.JButton();
        btnres3 = new javax.swing.JButton();
        btnres1 = new javax.swing.JButton();
        btn50 = new javax.swing.JButton();
        btncall = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblpregunta = new javax.swing.JLabel();
        btnres4 = new javax.swing.JButton();
        timer = new javax.swing.JLabel();
        lblres1 = new javax.swing.JLabel();
        lblres2 = new javax.swing.JLabel();
        lblres3 = new javax.swing.JLabel();
        lblres4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();
        pnlbarra = new javax.swing.JPanel();
        hide = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        jlogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnres2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/close.png"))); // NOI18N
        btnres2.setBorder(null);
        btnres2.setBorderPainted(false);
        btnres2.setContentAreaFilled(false);
        btnres2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnres2.setInheritsPopupMenu(true);
        btnres2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnres2ActionPerformed(evt);
            }
        });
        pnl1.add(btnres2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 500, 360, 110));

        btnres3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/close.png"))); // NOI18N
        btnres3.setBorder(null);
        btnres3.setBorderPainted(false);
        btnres3.setContentAreaFilled(false);
        btnres3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnres3.setInheritsPopupMenu(true);
        btnres3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnres3ActionPerformed(evt);
            }
        });
        pnl1.add(btnres3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 500, 360, 110));

        btnres1.setBackground(new java.awt.Color(255, 255, 255));
        btnres1.setForeground(new java.awt.Color(0, 255, 255));
        btnres1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/close.png"))); // NOI18N
        btnres1.setBorder(null);
        btnres1.setBorderPainted(false);
        btnres1.setContentAreaFilled(false);
        btnres1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnres1.setInheritsPopupMenu(true);
        btnres1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnres1ActionPerformed(evt);
            }
        });
        pnl1.add(btnres1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 360, 110));

        btn50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/5050.png"))); // NOI18N
        btn50.setBorder(null);
        btn50.setBorderPainted(false);
        btn50.setContentAreaFilled(false);
        btn50.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn50.setInheritsPopupMenu(true);
        btn50.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/5050s.png"))); // NOI18N
        btn50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn50ActionPerformed(evt);
            }
        });
        pnl1.add(btn50, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 260, 160));

        btncall.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/llamada.png"))); // NOI18N
        btncall.setBorder(null);
        btncall.setBorderPainted(false);
        btncall.setContentAreaFilled(false);
        btncall.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btncall.setInheritsPopupMenu(true);
        btncall.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/llamadas.png"))); // NOI18N
        btncall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncallActionPerformed(evt);
            }
        });
        pnl1.add(btncall, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 50, 220, 160));

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setText("Cual es el lugar de origen del Whisky Escocés?");
        pnl1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 560, 70));

        lblpregunta.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        lblpregunta.setForeground(new java.awt.Color(0, 255, 255));
        pnl1.add(lblpregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 690, 100));

        btnres4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/close.png"))); // NOI18N
        btnres4.setBorder(null);
        btnres4.setBorderPainted(false);
        btnres4.setContentAreaFilled(false);
        btnres4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnres4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnres4ActionPerformed(evt);
            }
        });
        pnl1.add(btnres4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 360, 370, 110));

        timer.setFont(new java.awt.Font("Bahnschrift", 1, 75)); // NOI18N
        timer.setForeground(new java.awt.Color(0, 255, 255));
        pnl1.add(timer, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 220, 200));

        lblres1.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        lblres1.setForeground(new java.awt.Color(0, 255, 255));
        lblres1.setText("Irlanda");
        pnl1.add(lblres1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, 230, 60));

        lblres2.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        lblres2.setForeground(new java.awt.Color(0, 255, 255));
        lblres2.setText("Gales");
        pnl1.add(lblres2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 520, 240, 60));

        lblres3.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        lblres3.setForeground(new java.awt.Color(0, 255, 255));
        lblres3.setText("Estados unidos");
        pnl1.add(lblres3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 530, 240, 60));

        lblres4.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        lblres4.setForeground(new java.awt.Color(0, 255, 255));
        lblres4.setText("Escocia");
        pnl1.add(lblres4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 380, 240, 60));

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 255));
        jLabel2.setText("Puntos: 0");
        pnl1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 40));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo_1.jpg"))); // NOI18N
        pnl1.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 670));

        getContentPane().add(pnl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 930, 630));

        pnlbarra.setBackground(new java.awt.Color(255, 255, 255));
        pnlbarra.setMinimumSize(new java.awt.Dimension(0, 0));
        pnlbarra.setPreferredSize(new java.awt.Dimension(0, 0));
        pnlbarra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/minimizar.png"))); // NOI18N
        hide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hideMouseClicked(evt);
            }
        });
        pnlbarra.add(hide, new org.netbeans.lib.awtextra.AbsoluteConstraints(852, 0, 30, 40));

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/close.png"))); // NOI18N
        close.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        pnlbarra.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 0, 30, 40));

        titulo.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        titulo.setForeground(new java.awt.Color(0, 0, 0));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("¿Que sabes de cultura?");
        titulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlbarra.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 2, -1, 30));

        jlogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/log.png"))); // NOI18N
        jlogo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlbarra.add(jlogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 40));

        getContentPane().add(pnlbarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn50ActionPerformed
         
    }//GEN-LAST:event_btn50ActionPerformed

    private void btncallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncallActionPerformed
        Llamada f = new Llamada();
        f.setVisible(true);
        btncall.setEnabled(false);
    }//GEN-LAST:event_btncallActionPerformed

    private void btnres4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnres4ActionPerformed
    
    }//GEN-LAST:event_btnres4ActionPerformed

    private void btnres1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnres1ActionPerformed
        
    }//GEN-LAST:event_btnres1ActionPerformed

    private void btnres2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnres2ActionPerformed
       
    }//GEN-LAST:event_btnres2ActionPerformed

    private void hideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hideMouseClicked
        this.setState(Principal.ICONIFIED);
    }//GEN-LAST:event_hideMouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null, "Deseas salir?", "Aviso", dialog);
        if (result == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_closeMouseClicked

    private void btnres3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnres3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnres3ActionPerformed

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Preguntas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn50;
    private javax.swing.JButton btncall;
    private javax.swing.JButton btnres1;
    private javax.swing.JButton btnres2;
    private javax.swing.JButton btnres3;
    private javax.swing.JButton btnres4;
    private javax.swing.JLabel close;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel hide;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jlogo;
    private javax.swing.JLabel lblpregunta;
    private javax.swing.JLabel lblres1;
    private javax.swing.JLabel lblres2;
    private javax.swing.JLabel lblres3;
    private javax.swing.JLabel lblres4;
    private javax.swing.JPanel pnl1;
    private javax.swing.JPanel pnlbarra;
    private javax.swing.JLabel timer;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
