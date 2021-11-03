package plantilla_proyecto;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {

    private int x, y;

    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        String pedir = JOptionPane.showInputDialog(null, "Introduzca su nombre: ", "Introduccion", JOptionPane.QUESTION_MESSAGE);
        lblname.setText("Nombre: " + pedir);
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/log.png")).getImage());

        ImageIcon fon = new ImageIcon("src/imagenes/fondo_aclarado.png");
        Icon icon1 = new ImageIcon(fon.getImage().getScaledInstance(fondo.getWidth(), fondo.getHeight(), Image.SCALE_DEFAULT));
        fondo.setIcon(icon1);
        this.repaint();

        ImageIcon res1 = new ImageIcon("src/imagenes/Imagen1.png");
        Icon icon2 = new ImageIcon(res1.getImage().getScaledInstance(btnopc1.getWidth(), btnopc1.getHeight(), Image.SCALE_DEFAULT));
        btnopc1.setIcon(icon2);
        this.repaint();
        btnopc1.setVisible(false);

        ImageIcon res2 = new ImageIcon("src/imagenes/Imagen1.png");
        Icon icon3 = new ImageIcon(res2.getImage().getScaledInstance(btnopc2.getWidth(), btnopc2.getHeight(), Image.SCALE_DEFAULT));
        btnopc2.setIcon(icon3);
        this.repaint();
        btnopc2.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlbarra = new javax.swing.JPanel();
        hide = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        jlogo = new javax.swing.JLabel();
        pnlprincipal = new javax.swing.JPanel();
        btniniciar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblname = new javax.swing.JLabel();
        btnopc1 = new javax.swing.JButton();
        btnopc2 = new javax.swing.JButton();
        lblopc1 = new javax.swing.JLabel();
        lblopc2 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("¿Que sabes de cultura?");
        setUndecorated(true);
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        pnlbarra.setBackground(new java.awt.Color(255, 255, 255));
        pnlbarra.setLayout(null);

        hide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/minimizar.png"))); // NOI18N
        hide.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        hide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hideMouseClicked(evt);
            }
        });
        pnlbarra.add(hide);
        hide.setBounds(880, 0, 40, 40);

        titulo.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        titulo.setForeground(new java.awt.Color(0, 0, 0));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("¿Que sabes de cultura?");
        titulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlbarra.add(titulo);
        titulo.setBounds(380, 0, 220, 40);

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/close.png"))); // NOI18N
        close.setLabelFor(hide);
        close.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        pnlbarra.add(close);
        close.setBounds(920, 0, 32, 40);

        jlogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/log.png"))); // NOI18N
        jlogo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlbarra.add(jlogo);
        jlogo.setBounds(0, 0, 50, 40);

        pnlprincipal.setBackground(new java.awt.Color(153, 102, 0));
        pnlprincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btniniciar.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btniniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/start.png"))); // NOI18N
        btniniciar.setText("Jugar");
        btniniciar.setBorder(null);
        btniniciar.setContentAreaFilled(false);
        btniniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btniniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btniniciarActionPerformed(evt);
            }
        });
        pnlprincipal.add(btniniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, 250, 130));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logocontexto.png"))); // NOI18N
        pnlprincipal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 480, 240));

        lblname.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        lblname.setForeground(new java.awt.Color(0, 255, 255));
        lblname.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblname.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlprincipal.add(lblname, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 0, 270, 20));

        btnopc1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/close.png"))); // NOI18N
        btnopc1.setBorder(null);
        btnopc1.setBorderPainted(false);
        btnopc1.setContentAreaFilled(false);
        btnopc1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnopc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnopc1ActionPerformed(evt);
            }
        });
        pnlprincipal.add(btnopc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 420, 180, 50));

        btnopc2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/close.png"))); // NOI18N
        btnopc2.setBorder(null);
        btnopc2.setBorderPainted(false);
        btnopc2.setContentAreaFilled(false);
        btnopc2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnopc2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnopc2ActionPerformed(evt);
            }
        });
        pnlprincipal.add(btnopc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 420, 200, 50));

        lblopc1.setFont(new java.awt.Font("Bahnschrift", 1, 15)); // NOI18N
        lblopc1.setForeground(new java.awt.Color(0, 255, 255));
        lblopc1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblopc1.setFocusable(false);
        pnlprincipal.add(lblopc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, 180, 30));

        lblopc2.setFont(new java.awt.Font("Bahnschrift", 1, 15)); // NOI18N
        lblopc2.setForeground(new java.awt.Color(0, 255, 255));
        pnlprincipal.add(lblopc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 430, 170, 30));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo_aclarado.png"))); // NOI18N
        fondo.setMinimumSize(new java.awt.Dimension(840, 570));
        fondo.setPreferredSize(new java.awt.Dimension(840, 570));
        pnlprincipal.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 570));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlbarra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlprincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 961, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlbarra, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlprincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_formMouseDragged

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

    private void btniniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btniniciarActionPerformed
        btnopc1.setVisible(true);
        btnopc2.setVisible(true);
        lblopc1.setText("Novato cultural");
        lblopc2.setText("Rey de la cultura");
        btniniciar.setEnabled(false);
    }//GEN-LAST:event_btniniciarActionPerformed

    private void btnopc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnopc1ActionPerformed
        this.dispose();
        Preguntas pre = new Preguntas();
        pre.setVisible(true);

    }//GEN-LAST:event_btnopc1ActionPerformed

    private void btnopc2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnopc2ActionPerformed
        this.dispose();
        Preguntas_dificil difi = new Preguntas_dificil();
        difi.setVisible(true);
    }//GEN-LAST:event_btnopc2ActionPerformed

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
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btniniciar;
    private javax.swing.JButton btnopc1;
    private javax.swing.JButton btnopc2;
    private javax.swing.JLabel close;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel hide;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jlogo;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lblopc1;
    private javax.swing.JLabel lblopc2;
    private javax.swing.JPanel pnlbarra;
    private javax.swing.JPanel pnlprincipal;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
