package plantilla_proyecto;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Preguntas extends javax.swing.JFrame {

    //Variables
    private int x, y;
    public static int aleatorioJuego = 0, nRespJuego = 0, min = 1, max = 5, maxJuego = 15,
            confJuego = 0, n = 1, confResp = 0, confOp = 0, tGanado = 0,
            vGanado = 0,resta = 0,points =0;
    public static Random rnd = new Random();

    //Variable de las preguntas del juego
    public String txtRespJuego = "", resp1 = "", resp2 = "", resp3 = "", resp4 = "", txtRJ = "",
            varPorcB = "", respCorrJuego = "",
            preg1 = "¿Qué nombre reciben las culturas Mayas, Aztecas e Incas?",
            preg2 = "¿En qué aspectos destacaron los Mayas?",
            preg3 = "¿Qué se celebra el 10 de junio en la Guayana francesa?",
            preg4 = "¿Cómo se llama la Reina del Reino Unido?",
            preg5 = "¿En qué continente está Ecuador?",
            preg6 = "¿Como se escribe el 79 en números romanos?",
            preg7 = "¿Dónde originaron los juegos olímpicos?",
            preg8 = "¿De qué colores es la bandera de México?",
            preg9 = "¿En qué país se encuentra la torre de Pisa?",
            preg10 = "¿Qué producto cultiva más Guatemala?",
            preg11 = "¿Dónde se encuentra la famosa Torre Eiffel?",
            preg12 = "¿Cual es el rio más largo del mundo?",
            preg13 = "¿Cuál es la moneda del Reino Unido?",
            preg14 = "¿Cómo se llama el himno nacional de Francia?",
            preg15 = "¿Cuál es la ciudad principal de los Mayas?",
            resPreg1A = "Culturas americanas", resPreg1B = "Culturas vikingas", resPreg1C = "Culturas Precolombinas", resPreg1D = "Culturas indígenas",
            resPreg2A = "Agricultura y comercio", resPreg2B = "Jugar al fútbol", resPreg2C = "Astronomía y matemáticas", resPreg2D = "Conquista de territorios",
            resPreg3A = "Santa Teresa de Ávila en Cayenne", resPreg3B = "Abolición de la esclavitud", resPreg3C = "Fiestas patronales", resPreg3D = "Ninguna de las anteriores",
            resPreg4A = "Ana", resPreg4B = "Isabel II", resPreg4C = "Victoria III", resPreg4D = "Elizabeth",
            resPreg5A = "América", resPreg5B = "Europa", resPreg5C = "Africa", resPreg5D = "Asia",
            resPreg6A = "XIIIX", resPreg6B = "XXIC", resPreg6C = "LXXIX", resPreg6D = "XXXXXXXIX",
            resPreg7A = "Noruega", resPreg7B = "España", resPreg7C = "Grecia", resPreg7D = "Rusia",
            resPreg8A = "Rojo y blanco", resPreg8B = "Amarillo, azul y rojo", resPreg8C = "Blanco y azul", resPreg8D = "Verde, blanco y rojo.",
            resPreg9A = "España", resPreg9B = "Italia", resPreg9C = "Francia", resPreg9D = "Inglaterra",
            resPreg10A = "Platano", resPreg10B = "Maiz", resPreg10C = "Café", resPreg10D = "Uva",
            resPreg11A = "Medellín", resPreg11B = "París", resPreg11C = "Londres", resPreg11D = "Roma",
            resPreg12A = "El Yangtze", resPreg12B = "El Nilo", resPreg12C = "El Orinoco", resPreg12D = "El Amazonas",
            resPreg13A = "Euro", resPreg13B = "Peso", resPreg13C = "Dolar", resPreg13D = "Libra",
            resPreg14A = "Marcha Real", resPreg14B = "God Save the Queen", resPreg14C = "La Marsellesa", resPreg14D = "Kong Kristian",
            resPreg15A = "Sevilla", resPreg15B = "Tlaxcala", resPreg15C = "Machu Pichu", resPreg15D = "Chichen Itzá";

    //Temporizador = 3mins
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
                    JOptionPane.showMessageDialog(null, "Se acabo su tiempo", "Intenta de nuevo", JOptionPane.CANCEL_OPTION);
                    dispose();

                }
            }

        });
        t.start();
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
        Icon icon2 = new ImageIcon(res2.getImage().getScaledInstance(btnres3.getWidth(), btnres3.getHeight(), Image.SCALE_DEFAULT));
        btnres3.setIcon(icon2);
        this.repaint();

        ImageIcon res3 = new ImageIcon("src/imagenes/Imagen1.png");
        Icon icon3 = new ImageIcon(res3.getImage().getScaledInstance(btnres2.getWidth(), btnres2.getHeight(), Image.SCALE_DEFAULT));
        btnres2.setIcon(icon3);
        this.repaint();

        ImageIcon res4 = new ImageIcon("src/imagenes/Imagen1.png");
        Icon icon4 = new ImageIcon(res4.getImage().getScaledInstance(btnres4.getWidth(), btnres4.getHeight(), Image.SCALE_DEFAULT));
        btnres4.setIcon(icon4);
        this.repaint();

        ImageIcon preg = new ImageIcon("src/imagenes/Imagen1.png");
        Icon icon5 = new ImageIcon(preg.getImage().getScaledInstance(lblpregunta.getWidth(), lblpregunta.getHeight(), Image.SCALE_DEFAULT));
        lblpregunta.setIcon(icon5);
        this.repaint();
        
        aleatorioJuego = (int) (Math.random() * (maxJuego)) + min;
        switch (aleatorioJuego) {
            case 1:
                quest.setText(preg1);
                lblres1.setText(resPreg1A);
                lblres2.setText(resPreg1B);
                lblres3.setText(resPreg1C);
                lblres4.setText(resPreg1D);
                respCorrJuego = resPreg1C;

                break;
            case 2:
                quest.setText(preg2);
                lblres1.setText(resPreg2A);
                lblres2.setText(resPreg2B);
                lblres3.setText(resPreg2C);
                lblres4.setText(resPreg2D);
                respCorrJuego = resPreg2A;

                break;
            case 3:
                quest.setText(preg3);
                lblres1.setText(resPreg3A);
                lblres2.setText(resPreg3B);
                lblres3.setText(resPreg3C);
                lblres4.setText(resPreg3D);
                respCorrJuego = resPreg3B;

                break;
            case 4:
                quest.setText(preg4);
                lblres1.setText(resPreg4A);
                lblres2.setText(resPreg4B);
                lblres3.setText(resPreg4C);
                lblres4.setText(resPreg4D);
                respCorrJuego = resPreg4B;

                break;
            case 5:
                quest.setText(preg5);
                lblres1.setText(resPreg5A);
                lblres2.setText(resPreg5B);
                lblres3.setText(resPreg5C);
                lblres4.setText(resPreg5D);
                respCorrJuego = resPreg5A;

                break;
            case 6:
                quest.setText(preg6);
                lblres1.setText(resPreg6A);
                lblres2.setText(resPreg6B);
                lblres3.setText(resPreg6C);
                lblres4.setText(resPreg6D);
                respCorrJuego = resPreg6C;

                break;
            case 7:
                quest.setText(preg7);
                lblres1.setText(resPreg7A);
                lblres2.setText(resPreg7B);
                lblres3.setText(resPreg7C);
                lblres4.setText(resPreg7D);
                respCorrJuego = resPreg7C;

                break;
            case 8:
                quest.setText(preg8);
                lblres1.setText(resPreg8A);
                lblres2.setText(resPreg8B);
                lblres3.setText(resPreg8C);
                lblres4.setText(resPreg8D);
                respCorrJuego = resPreg8D;

                break;
            case 9:
                quest.setText(preg9);
                lblres1.setText(resPreg9A);
                lblres2.setText(resPreg9B);
                lblres3.setText(resPreg9C);
                lblres4.setText(resPreg9D);
                respCorrJuego = resPreg9B;

                break;
            case 10:
                quest.setText(preg10);
                lblres1.setText(resPreg10A);
                lblres2.setText(resPreg10B);
                lblres3.setText(resPreg10C);
                lblres4.setText(resPreg10D);
                respCorrJuego = resPreg10C;

                break;
            case 11:
                quest.setText(preg11);
                lblres1.setText(resPreg11A);
                lblres2.setText(resPreg11B);
                lblres3.setText(resPreg11C);
                lblres4.setText(resPreg11D);
                respCorrJuego = resPreg11B;

                break;
            case 12:
                quest.setText(preg12);
                lblres1.setText(resPreg12A);
                lblres2.setText(resPreg12B);
                lblres3.setText(resPreg12C);
                lblres4.setText(resPreg12D);
                respCorrJuego = resPreg12B;

                break;
            case 13:
                quest.setText(preg13);
                lblres1.setText(resPreg13A);
                lblres2.setText(resPreg13B);
                lblres3.setText(resPreg13C);
                lblres4.setText(resPreg13D);
                respCorrJuego = resPreg13D;

                break;
            case 14:
                quest.setText(preg14);
                lblres1.setText(resPreg14A);
                lblres2.setText(resPreg14B);
                lblres3.setText(resPreg14C);
                lblres4.setText(resPreg14D);
                respCorrJuego = resPreg14C;

                break;
            case 15:
                quest.setText(preg15);
                lblres1.setText(resPreg15A);
                lblres2.setText(resPreg15B);
                lblres3.setText(resPreg15C);
                lblres4.setText(resPreg15D);
                respCorrJuego = resPreg15D;

                break;
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl1 = new javax.swing.JPanel();
        btnres1 = new javax.swing.JButton();
        btnres2 = new javax.swing.JButton();
        btnres3 = new javax.swing.JButton();
        btnres4 = new javax.swing.JButton();
        lblres1 = new javax.swing.JLabel();
        lblres2 = new javax.swing.JLabel();
        lblres3 = new javax.swing.JLabel();
        lblres4 = new javax.swing.JLabel();
        timer = new javax.swing.JLabel();
        btn50 = new javax.swing.JButton();
        btncall = new javax.swing.JButton();
        quest = new javax.swing.JLabel();
        lblpregunta = new javax.swing.JLabel();
        lblpoints = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();
        pnlbarra = new javax.swing.JPanel();
        hide = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        jlogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
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
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnres1.setBackground(new java.awt.Color(255, 255, 255));
        btnres1.setForeground(new java.awt.Color(0, 255, 255));
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
        pnl1.add(btnres1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 340, 90));

        btnres2.setForeground(new java.awt.Color(0, 255, 255));
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
        pnl1.add(btnres2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, 340, 90));

        btnres3.setForeground(new java.awt.Color(0, 255, 255));
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
        pnl1.add(btnres3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 500, 340, 90));

        btnres4.setForeground(new java.awt.Color(0, 255, 255));
        btnres4.setBorder(null);
        btnres4.setBorderPainted(false);
        btnres4.setContentAreaFilled(false);
        btnres4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnres4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnres4ActionPerformed(evt);
            }
        });
        pnl1.add(btnres4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 350, 340, 90));

        lblres1.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        lblres1.setForeground(new java.awt.Color(0, 255, 255));
        pnl1.add(lblres1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 320, 50));

        lblres2.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        lblres2.setForeground(new java.awt.Color(0, 255, 255));
        pnl1.add(lblres2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 520, 320, 50));

        lblres3.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        lblres3.setForeground(new java.awt.Color(0, 255, 255));
        pnl1.add(lblres3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 520, 320, 50));

        lblres4.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        lblres4.setForeground(new java.awt.Color(0, 255, 255));
        pnl1.add(lblres4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 370, 320, 50));

        timer.setFont(new java.awt.Font("Bahnschrift", 1, 75)); // NOI18N
        timer.setForeground(new java.awt.Color(0, 255, 255));
        pnl1.add(timer, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 220, 200));

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

        quest.setFont(new java.awt.Font("Bahnschrift", 1, 20)); // NOI18N
        quest.setForeground(new java.awt.Color(0, 255, 255));
        quest.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quest.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnl1.add(quest, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 670, 70));

        lblpregunta.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        lblpregunta.setForeground(new java.awt.Color(0, 255, 255));
        pnl1.add(lblpregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 710, 100));

        lblpoints.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        lblpoints.setForeground(new java.awt.Color(0, 255, 255));
        lblpoints.setText("Puntos: 0");
        pnl1.add(lblpoints, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 40));

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
        if (resPreg1C.equals(respCorrJuego)) {
            btnres1.setVisible(false);
            btnres4.setVisible(false);
            lblres1.setVisible(false);
            lblres4.setVisible(false);
            btn50.setEnabled(false);
        } else {
            if (resPreg2A.equals(respCorrJuego)) {
                btnres2.setVisible(false);
                btnres4.setVisible(false);
                lblres2.setVisible(false);
                lblres4.setVisible(false);
                btn50.setEnabled(false);
            } else {
                if (resPreg3B.equals(respCorrJuego)) {
                    btnres1.setVisible(false);
                    btnres3.setVisible(false);
                    lblres1.setVisible(false);
                    lblres3.setVisible(false);
                    btn50.setEnabled(false);
                } else {
                    if (resPreg4B.equals(respCorrJuego)) {
                        btnres4.setVisible(false);
                        btnres3.setVisible(false);
                        lblres4.setVisible(false);
                        lblres3.setVisible(false);
                        btn50.setEnabled(false);
                    } else {
                        if (resPreg5A.equals(respCorrJuego)) {
                            btnres2.setVisible(false);
                            btnres3.setVisible(false);
                            lblres2.setVisible(false);
                            lblres3.setVisible(false);
                            btn50.setEnabled(false);
                        } else {
                            if (resPreg6C.equals(respCorrJuego)) {
                                btnres1.setVisible(false);
                                btnres4.setVisible(false);
                                lblres1.setVisible(false);
                                lblres4.setVisible(false);
                                btn50.setEnabled(false);
                            } else {
                                if (resPreg7C.equals(respCorrJuego)) {
                                    btnres1.setVisible(false);
                                    btnres2.setVisible(false);
                                    lblres1.setVisible(false);
                                    lblres2.setVisible(false);
                                    btn50.setEnabled(false);
                                } else {
                                    if (resPreg8D.equals(respCorrJuego)) {
                                        btnres1.setVisible(false);
                                        btnres3.setVisible(false);
                                        lblres1.setVisible(false);
                                        lblres3.setVisible(false);
                                        btn50.setEnabled(false);
                                    } else {
                                        if (resPreg9B.equals(respCorrJuego)) {
                                            btnres1.setVisible(false);
                                            btnres4.setVisible(false);
                                            lblres1.setVisible(false);
                                            lblres4.setVisible(false);
                                            btn50.setEnabled(false);
                                        } else {
                                            if (resPreg10C.equals(respCorrJuego)) {
                                                btnres1.setVisible(false);
                                                btnres2.setVisible(false);
                                                lblres1.setVisible(false);
                                                lblres2.setVisible(false);
                                                btn50.setEnabled(false);
                                            } else {
                                                if (resPreg11B.equals(respCorrJuego)) {
                                                    btnres1.setVisible(false);
                                                    btnres3.setVisible(false);
                                                    lblres1.setVisible(false);
                                                    lblres3.setVisible(false);
                                                    btn50.setEnabled(false);
                                                } else {
                                                    if (resPreg12B.equals(respCorrJuego)) {
                                                        btnres4.setVisible(false);
                                                        btnres3.setVisible(false);
                                                        lblres4.setVisible(false);
                                                        lblres3.setVisible(false);
                                                        btn50.setEnabled(false);
                                                    } else {
                                                        if (resPreg13D.equals(respCorrJuego)) {
                                                            btnres2.setVisible(false);
                                                            btnres3.setVisible(false);
                                                            lblres2.setVisible(false);
                                                            lblres3.setVisible(false);
                                                            btn50.setEnabled(false);
                                                        } else {
                                                            if (resPreg14C.equals(respCorrJuego)) {
                                                                btnres1.setVisible(false);
                                                                btnres4.setVisible(false);
                                                                lblres1.setVisible(false);
                                                                lblres4.setVisible(false);
                                                                btn50.setEnabled(false);
                                                            } else {
                                                                if (resPreg15D.equals(respCorrJuego)) {
                                                                    btnres1.setVisible(false);
                                                                    btnres3.setVisible(false);
                                                                    lblres1.setVisible(false);
                                                                    lblres3.setVisible(false);
                                                                    btn50.setEnabled(false);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }

                }

            }
        }
    }//GEN-LAST:event_btn50ActionPerformed

    private void btncallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncallActionPerformed
        Llamada f = new Llamada();
        f.setVisible(true);
        btncall.setEnabled(false);
    }//GEN-LAST:event_btncallActionPerformed

    private void btnres4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnres4ActionPerformed
        if (resPreg8D.equals(respCorrJuego)) {
            JOptionPane.showConfirmDialog(null, "Respuesta Correcta!", "CORRECTO!!", JOptionPane.OK_OPTION);
            nRespJuego = nRespJuego + 1;
            points = points + 1500;
        } else {
            if (resPreg13D.equals(respCorrJuego)) {
                JOptionPane.showConfirmDialog(null, "Respuesta Correcta!", "CORRECTO!!", JOptionPane.OK_OPTION);
                nRespJuego = nRespJuego + 1;
                points = points + 1500;
            } else {
                if (resPreg15D.equals(respCorrJuego)) {
                    JOptionPane.showConfirmDialog(null, "Respuesta Correcta!", "CORRECTO!!", JOptionPane.OK_OPTION);
                    nRespJuego = nRespJuego + 1;
                    points = points + 1500;

                }
            }
        }
    }//GEN-LAST:event_btnres4ActionPerformed

    private void btnres1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnres1ActionPerformed
        if (resPreg2A.equals(respCorrJuego)) {
            JOptionPane.showConfirmDialog(null, "Respuesta Correcta!", "CORRECTO!!", JOptionPane.OK_OPTION);
            nRespJuego = nRespJuego + 1;
            points = points + 1500;
        } else {
            if (resPreg5A.equals(respCorrJuego)) {
                JOptionPane.showConfirmDialog(null, "Respuesta Correcta!", "CORRECTO!!", JOptionPane.OK_OPTION);
                nRespJuego = nRespJuego + 1;
                points = points + 1500;
                points = points + 1500;
            }
        }
    }//GEN-LAST:event_btnres1ActionPerformed

    private void btnres3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnres3ActionPerformed
        if (resPreg1C.equals(respCorrJuego)) {
            JOptionPane.showConfirmDialog(null, "Respuesta Correcta!", "CORRECTO!!", JOptionPane.OK_OPTION);
            nRespJuego = nRespJuego + 1;
            points = points + 1500;
        } else {
            if (resPreg6C.equals(respCorrJuego)) {
                JOptionPane.showConfirmDialog(null, "Respuesta Correcta!", "CORRECTO!!", JOptionPane.OK_OPTION);
                nRespJuego = nRespJuego + 1;
                points = points + 1500;
            } else {
                if (resPreg7C.equals(respCorrJuego)) {
                    JOptionPane.showConfirmDialog(null, "Respuesta Correcta!", "CORRECTO!!", JOptionPane.OK_OPTION);
                    nRespJuego = nRespJuego + 1;
                    points = points + 1500;
                } else {
                    if (resPreg10C.equals(respCorrJuego)) {
                        JOptionPane.showConfirmDialog(null, "Respuesta Correcta!", "CORRECTO!!", JOptionPane.OK_OPTION);
                        nRespJuego = nRespJuego + 1;
                        points = points + 1500;
                    } else {
                        if (resPreg14C.equals(respCorrJuego)) {
                            JOptionPane.showConfirmDialog(null, "Respuesta Correcta!", "CORRECTO!!", JOptionPane.OK_OPTION);
                            nRespJuego = nRespJuego + 1;
                            points = points + 1500;
                        }
                    }
                }
            }

        }
    }//GEN-LAST:event_btnres3ActionPerformed

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

    private void btnres2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnres2ActionPerformed
        if (resPreg3B.equals(respCorrJuego)) {
            JOptionPane.showConfirmDialog(null, "Respuesta Correcta!", "CORRECTO!!", JOptionPane.OK_OPTION);
            nRespJuego = nRespJuego + 1;
            points = points + 1500;
        } else {
            if (resPreg4B.equals(respCorrJuego)) {
                JOptionPane.showConfirmDialog(null, "Respuesta Correcta!", "CORRECTO!!", JOptionPane.OK_OPTION);
                nRespJuego = nRespJuego + 1;
                points = points + 1500;
            } else {
                if (resPreg9B.equals(respCorrJuego)) {
                    JOptionPane.showConfirmDialog(null, "Respuesta Correcta!", "CORRECTO!!", JOptionPane.OK_OPTION);
                    nRespJuego = nRespJuego + 1;
                    points = points + 1500;

                } else {
                    if (resPreg11B.equals(respCorrJuego)) {
                        JOptionPane.showConfirmDialog(null, "Respuesta Correcta!", "CORRECTO!!", JOptionPane.OK_OPTION);
                        nRespJuego = nRespJuego + 1;
                        points = points + 1500;

                    } else {
                        if (resPreg12B.equals(respCorrJuego)) {
                            JOptionPane.showConfirmDialog(null, "Respuesta Correcta!", "CORRECTO!!", JOptionPane.OK_OPTION);
                            nRespJuego = nRespJuego + 1;
                            points = points + 1500;

                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_btnres2ActionPerformed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_formMouseDragged

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
    private javax.swing.JLabel jlogo;
    private javax.swing.JLabel lblpoints;
    private javax.swing.JLabel lblpregunta;
    private javax.swing.JLabel lblres1;
    private javax.swing.JLabel lblres2;
    private javax.swing.JLabel lblres3;
    private javax.swing.JLabel lblres4;
    private javax.swing.JPanel pnl1;
    private javax.swing.JPanel pnlbarra;
    private static javax.swing.JLabel quest;
    private javax.swing.JLabel timer;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
