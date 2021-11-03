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
    public static DecimalFormat miformato = new DecimalFormat("###,###,###,###");
    public static int aleatorioJuego = 0, nRespJuego = 0, min = 1, max = 5, maxJuego = 15,
            confJuego = 0, n = 1, confResp = 0, confOp = 0, conf50 = 0, nPreg = 0, tGanado = 0,
            vGanado = 0, tgSeg = 0, resta = 0, respCorrJuego = 0, confirm = 0;
    public static Random rnd = new Random();

    //Variable de las preguntas del juego
    public static String txtRespJuego = "", resp1 = "", resp2 = "", resp3 = "", resp4 = "", txtRJ = "",
            varPorcB = "",
            preg1 = "¿Blancanieves cae en un hechizo de la bruja por comer una?",
            preg2 = "¿Cuantos jugadores hay en un equipo \nde Baloncesto sin contar los suplentes?",
            preg3 = "¿Cual de los siguientes animales vive por más años?",
            preg4 = "¿Cual de estos planetas es el mas grande?",
            preg5 = "¿El orden de los factores no altera el...?",
            preg6 = "¿Como se escribe el 79 en números romanos?",
            preg7 = "¿Quienes inventaron la polvora?",
            preg8 = "¿Cual es el planeta mas cercano al Sol?",
            preg9 = "¿Cual de los siguientes animales no es un mamifero?",
            preg10 = "¿Cual de las siguientes serpientes no es venenosa?",
            preg11 = "¿Una Docena es un conjunto de cuantas unidades?",
            preg12 = "¿Cual es el rio más largo del mundo?",
            preg13 = "¿La señal telegrafica para pedir auxilio es...?",
            preg14 = "¿Como se llama el hábito de comer tierra?",
            preg15 = "¿Un ateo es aquel que no cree en...?",
            preg16 = "¿Dos de los animales que se destacan en el Guernica de Picasso son...?",
            preg17 = "¿De que parte de Adán creó Dios a la mujer?",
            preg18 = "¿Un sabueso es...?",
            preg19 = "¿Nombre del jefe de Pedro Picapiedra en la serie animada?",
            preg20 = "¿En matemáticas, principio basico que es asumido como verdadero \nsin recurrir a demostración alguna...?",
            resPreg1A = "Bebida Embrujada", resPreg1B = "Manzana", resPreg1C = "Cereza", resPreg1D = "Pocion Mágica",
            resPreg2A = "3", resPreg2B = "4", resPreg2C = "5", resPreg2D = "6",
            resPreg3A = "El ratón", resPreg3B = "El sapo", resPreg3C = "La tortuga", resPreg3D = "El elefante",
            resPreg4A = "La Tierra", resPreg4B = "Saturno", resPreg4C = "Mercurio", resPreg4D = "Júpiter",
            resPreg5A = "Resultado", resPreg5B = "Cociente", resPreg5C = "Producto", resPreg5D = "Divisor",
            resPreg6A = "XIIIX", resPreg6B = "XXIC", resPreg6C = "LXXIX", resPreg6D = "XXXXXXXIX",
            resPreg7A = "Los Egipcios", resPreg7B = "Los Chinos", resPreg7C = "Los Griegos", resPreg7D = "Los Romanos",
            resPreg8A = "La Tierra", resPreg8B = "Mercurio", resPreg8C = "Venus", resPreg8D = "Urano",
            resPreg9A = "El chimpancé", resPreg9B = "La ballena", resPreg9C = "La avestruz", resPreg9D = "El conejo",
            resPreg10A = "La cobra", resPreg10B = "La vibora", resPreg10C = "La cascabel", resPreg10D = "La anaconda",
            resPreg11A = "Ocho unidades", resPreg11B = " Diez unidades", resPreg11C = "Doce unidades", resPreg11D = "Catorce unidades",
            resPreg12A = "El Yangtze", resPreg12B = "El Nilo", resPreg12C = "El Orinoco", resPreg12D = "El Amazonas",
            resPreg13A = "911", resPreg13B = "S.O.S.", resPreg13C = "D.O.S.", resPreg13D = "H.L.P.",
            resPreg14A = "Terricola", resPreg14B = "Antropologia", resPreg14C = "Geófago", resPreg14D = "Terrestre",
            resPreg15A = "Los médicos", resPreg15B = "Dios", resPreg15C = "Los extraterrestres", resPreg15D = "Su esposa",
            resPreg16A = "Chigüiro y armadillo", resPreg16B = "Gallina y pollito", resPreg16C = "Caballo y toro", resPreg16D = "Raton y ardilla",
            resPreg17A = "De una costilla", resPreg17B = "De un dedo", resPreg17C = "Del corazon", resPreg17D = "De un pie",
            resPreg18A = "Baile", resPreg18B = "Perfume", resPreg18C = "Animal", resPreg18D = "Plato tipico",
            resPreg19A = "Señor Rajuela", resPreg19B = "Señor Burns", resPreg19C = "Señor Skinner", resPreg19D = "Señor Rocadura",
            resPreg20A = "Axioma", resPreg20B = "Anión", resPreg20C = "Ion", resPreg20D = "Catión";

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

        aleatorioJuego = (int) (Math.random() * (maxJuego)) + min;
        switch (aleatorioJuego) {
            case 1:
                quest.setText(preg1);
                lblres1.setText(resPreg1A);
                resp2 = "\n 2. " + resPreg1B;
                resp3 = "\n 3. " + resPreg1C;
                resp4 = "\n 4. " + resPreg1D;
                respCorrJuego = 2;
                txtRJ = resp2 + resp4;
                break;
            case 2:
                quest.setText(preg2);
                resp1 = "\n 1. " + resPreg2A;
                resp2 = "\n 2. " + resPreg2B;
                resp3 = "\n 3. " + resPreg2C;
                resp4 = "\n 4. " + resPreg2D;
                respCorrJuego = 3;
                txtRJ = resp3 + resp4;
                break;
            case 3:
                quest.setText(preg3);
                resp1 = "\n 1. " + resPreg3A;
                resp2 = "\n 2. " + resPreg3B;
                resp3 = "\n 3. " + resPreg3C;
                resp4 = "\n 4. " + resPreg3D;
                respCorrJuego = 3;
                txtRJ = resp1 + resp3;
                break;
            case 4:
                quest.setText(preg4);
                resp1 = "\n 1. " + resPreg4A;
                resp2 = "\n 2. " + resPreg4B;
                resp3 = "\n 3. " + resPreg4C;
                resp4 = "\n 4. " + resPreg4D;
                respCorrJuego = 4;
                txtRJ = resp2 + resp4;
                break;
            case 5:
                quest.setText(preg5);
                resp1 = "\n 1. " + resPreg5A;
                resp2 = "\n 2. " + resPreg5B;
                resp3 = "\n 3. " + resPreg5C;
                resp4 = "\n 4. " + resPreg5D;
                respCorrJuego = 3;
                txtRJ = resp2 + resp3;
                break;
            case 6:
                quest.setText(preg6);
                resp1 = "\n 1. " + resPreg6A;
                resp2 = "\n 2. " + resPreg6B;
                resp3 = "\n 3. " + resPreg6C;
                resp4 = "\n 4. " + resPreg6D;
                respCorrJuego = 3;
                txtRJ = resp1 + resp3;
                break;
            case 7:
                quest.setText(preg7);
                resp1 = "\n 1. " + resPreg7A;
                resp2 = "\n 2. " + resPreg7B;
                resp3 = "\n 3. " + resPreg7C;
                resp4 = "\n 4. " + resPreg7D;
                respCorrJuego = 2;
                txtRJ = resp2 + resp3;
                break;
            case 8:
                quest.setText(preg8);
                resp1 = "\n 1. " + resPreg8A;
                resp2 = "\n 2. " + resPreg8B;
                resp3 = "\n 3. " + resPreg8C;
                resp4 = "\n 4. " + resPreg8D;
                respCorrJuego = 2;
                txtRJ = resp1 + resp2;
                break;
            case 9:
                quest.setText(preg9);
                resp1 = "\n 1. " + resPreg9A;
                resp2 = "\n 2. " + resPreg9B;
                resp3 = "\n 3. " + resPreg9C;
                resp4 = "\n 4. " + resPreg9D;
                respCorrJuego = 3;
                txtRJ = resp2 + resp3;
                break;
            case 10:
                quest.setText(preg10);
                resp1 = "\n 1. " + resPreg10A;
                resp2 = "\n 2. " + resPreg10B;
                resp3 = "\n 3. " + resPreg10C;
                resp4 = "\n 4. " + resPreg10D;
                respCorrJuego = 4;
                txtRJ = resp3 + resp4;
                break;
            case 11:
                quest.setText(preg11);
                resp1 = "\n 1. " + resPreg11A;
                resp2 = "\n 2. " + resPreg11B;
                resp3 = "\n 3. " + resPreg11C;
                resp4 = "\n 4. " + resPreg11D;
                respCorrJuego = 3;
                txtRJ = resp3 + resp4;
                break;
            case 12:
                quest.setText(preg12);
                resp1 = "\n 1. " + resPreg12A;
                resp2 = "\n 2. " + resPreg12B;
                resp3 = "\n 3. " + resPreg12C;
                resp4 = "\n 4. " + resPreg12D;
                respCorrJuego = 2;
                txtRJ = resp2 + resp4;
                break;
            case 13:
                quest.setText(preg13);
                resp1 = "\n 1. " + resPreg13A;
                resp2 = "\n 2. " + resPreg13B;
                resp3 = "\n 3. " + resPreg13C;
                resp4 = "\n 4. " + resPreg13D;
                respCorrJuego = 2;
                txtRJ = resp1 + resp2;
                break;
            case 14:
                quest.setText(preg14);
                resp1 = "\n 1. " + resPreg14A;
                resp2 = "\n 2. " + resPreg14B;
                resp3 = "\n 3. " + resPreg14C;
                resp4 = "\n 4. " + resPreg14D;
                respCorrJuego = 3;
                txtRJ = resp2 + resp3;
                break;
            case 15:
                quest.setText(preg15);
                resp1 = "\n 1. " + resPreg15A;
                resp2 = "\n 2. " + resPreg15B;
                resp3 = "\n 3. " + resPreg15C;
                resp4 = "\n 4. " + resPreg15D;
                respCorrJuego = 2;
                txtRJ = resp2 + resp4;
                break;
        }

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
        quest = new javax.swing.JLabel();
        lblpregunta = new javax.swing.JLabel();
        btnres4 = new javax.swing.JButton();
        timer = new javax.swing.JLabel();
        lblres1 = new javax.swing.JLabel();
        lblres2 = new javax.swing.JLabel();
        lblres3 = new javax.swing.JLabel();
        lblres4 = new javax.swing.JLabel();
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

        btnres2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/close.png"))); // NOI18N
        btnres2.setBorder(null);
        btnres2.setBorderPainted(false);
        btnres2.setContentAreaFilled(false);
        btnres2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        btnres3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        btnres1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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

        quest.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        quest.setForeground(new java.awt.Color(0, 255, 255));
        pnl1.add(quest, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 560, 70));

        lblpregunta.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        lblpregunta.setForeground(new java.awt.Color(0, 255, 255));
        pnl1.add(lblpregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 690, 100));

        btnres4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/close.png"))); // NOI18N
        btnres4.setBorder(null);
        btnres4.setBorderPainted(false);
        btnres4.setContentAreaFilled(false);
        btnres4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        pnl1.add(lblres1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, 230, 60));

        lblres2.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        lblres2.setForeground(new java.awt.Color(0, 255, 255));
        pnl1.add(lblres2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 520, 240, 60));

        lblres3.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        lblres3.setForeground(new java.awt.Color(0, 255, 255));
        pnl1.add(lblres3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 530, 240, 60));

        lblres4.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        lblres4.setForeground(new java.awt.Color(0, 255, 255));
        pnl1.add(lblres4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 380, 240, 60));

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

    }//GEN-LAST:event_btnres3ActionPerformed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_formMouseDragged

    public static void Juego() {
        confOp = 0;
        conf50 = 0;
        n = 1;
        min = 1;

        confResp = 0;

        switch (aleatorioJuego) {
            case 1:
                quest.setText(preg1);
                resp1 = "\n 1. " + resPreg1A;
                resp2 = "\n 2. " + resPreg1B;
                resp3 = "\n 3. " + resPreg1C;
                resp4 = "\n 4. " + resPreg1D;
                respCorrJuego = 2;
                txtRJ = resp2 + resp4;
                break;
            case 2:
                quest.setText(preg2);
                resp1 = "\n 1. " + resPreg2A;
                resp2 = "\n 2. " + resPreg2B;
                resp3 = "\n 3. " + resPreg2C;
                resp4 = "\n 4. " + resPreg2D;
                respCorrJuego = 3;
                txtRJ = resp3 + resp4;
                break;
            case 3:
                quest.setText(preg3);
                resp1 = "\n 1. " + resPreg3A;
                resp2 = "\n 2. " + resPreg3B;
                resp3 = "\n 3. " + resPreg3C;
                resp4 = "\n 4. " + resPreg3D;
                respCorrJuego = 3;
                txtRJ = resp1 + resp3;
                break;
            case 4:
                quest.setText(preg4);
                resp1 = "\n 1. " + resPreg4A;
                resp2 = "\n 2. " + resPreg4B;
                resp3 = "\n 3. " + resPreg4C;
                resp4 = "\n 4. " + resPreg4D;
                respCorrJuego = 4;
                txtRJ = resp2 + resp4;
                break;
            case 5:
                quest.setText(preg5);
                resp1 = "\n 1. " + resPreg5A;
                resp2 = "\n 2. " + resPreg5B;
                resp3 = "\n 3. " + resPreg5C;
                resp4 = "\n 4. " + resPreg5D;
                respCorrJuego = 3;
                txtRJ = resp2 + resp3;
                break;
            case 6:
                quest.setText(preg6);
                resp1 = "\n 1. " + resPreg6A;
                resp2 = "\n 2. " + resPreg6B;
                resp3 = "\n 3. " + resPreg6C;
                resp4 = "\n 4. " + resPreg6D;
                respCorrJuego = 3;
                txtRJ = resp1 + resp3;
                break;
            case 7:
                quest.setText(preg7);
                resp1 = "\n 1. " + resPreg7A;
                resp2 = "\n 2. " + resPreg7B;
                resp3 = "\n 3. " + resPreg7C;
                resp4 = "\n 4. " + resPreg7D;
                respCorrJuego = 2;
                txtRJ = resp2 + resp3;
                break;
            case 8:
                quest.setText(preg8);
                resp1 = "\n 1. " + resPreg8A;
                resp2 = "\n 2. " + resPreg8B;
                resp3 = "\n 3. " + resPreg8C;
                resp4 = "\n 4. " + resPreg8D;
                respCorrJuego = 2;
                txtRJ = resp1 + resp2;
                break;
            case 9:
                quest.setText(preg9);
                resp1 = "\n 1. " + resPreg9A;
                resp2 = "\n 2. " + resPreg9B;
                resp3 = "\n 3. " + resPreg9C;
                resp4 = "\n 4. " + resPreg9D;
                respCorrJuego = 3;
                txtRJ = resp2 + resp3;
                break;
            case 10:
                quest.setText(preg10);
                resp1 = "\n 1. " + resPreg10A;
                resp2 = "\n 2. " + resPreg10B;
                resp3 = "\n 3. " + resPreg10C;
                resp4 = "\n 4. " + resPreg10D;
                respCorrJuego = 4;
                txtRJ = resp3 + resp4;
                break;
            case 11:
                quest.setText(preg11);
                resp1 = "\n 1. " + resPreg11A;
                resp2 = "\n 2. " + resPreg11B;
                resp3 = "\n 3. " + resPreg11C;
                resp4 = "\n 4. " + resPreg11D;
                respCorrJuego = 3;
                txtRJ = resp3 + resp4;
                break;
            case 12:
                quest.setText(preg12);
                resp1 = "\n 1. " + resPreg12A;
                resp2 = "\n 2. " + resPreg12B;
                resp3 = "\n 3. " + resPreg12C;
                resp4 = "\n 4. " + resPreg12D;
                respCorrJuego = 2;
                txtRJ = resp2 + resp4;
                break;
            case 13:
                quest.setText(preg13);
                resp1 = "\n 1. " + resPreg13A;
                resp2 = "\n 2. " + resPreg13B;
                resp3 = "\n 3. " + resPreg13C;
                resp4 = "\n 4. " + resPreg13D;
                respCorrJuego = 2;
                txtRJ = resp1 + resp2;
                break;
            case 14:
                quest.setText(preg14);
                resp1 = "\n 1. " + resPreg14A;
                resp2 = "\n 2. " + resPreg14B;
                resp3 = "\n 3. " + resPreg14C;
                resp4 = "\n 4. " + resPreg14D;
                respCorrJuego = 3;
                txtRJ = resp2 + resp3;
                break;
            case 15:
                quest.setText(preg15);
                resp1 = "\n 1. " + resPreg15A;
                resp2 = "\n 2. " + resPreg15B;
                resp3 = "\n 3. " + resPreg15C;
                resp4 = "\n 4. " + resPreg15D;
                respCorrJuego = 2;
                txtRJ = resp2 + resp4;
                break;
        }

        if (nRespJuego == 1 || nRespJuego == 2 || nRespJuego == 3 || nRespJuego == 4) {
            if (respCorrJuego == nRespJuego) {
                if (n <= 8) {

                    if (n == 1) {
                    }
                    if (n == 2) {

                    }
                    if (n == 3) {

                    }
                    if (n == 4) {

                    }
                    if (n == 5) {

                    }
                    if (n == 6) {

                    }
                    if (n == 7) {

                    }
                    if (n == 8) {

                    }

                    if (confJuego == JOptionPane.NO_OPTION) {

                    }

                }
            } else {

            }

        }
    }

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
