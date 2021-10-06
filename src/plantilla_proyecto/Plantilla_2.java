package plantilla_proyecto;
 
import javax.swing.*;
 
import java.text.*;
import java.util.*;
 
public class Plantilla_2 {
     
    //Variables
    public static DecimalFormat miformato = new DecimalFormat("###,###,###,###");
    public static int nOp1 = 0, aleatorioPrel = 0, aleatorioJuego = 0, respCorrPrel = 0, respCorrJuego = 0,
                      nRespJuego = 0, min = 1, max = 10, maxJuego = 20, sIni = 0, sFin = 0, mIni = 0, mFin = 0, resEntrar = 0, confJuego = 0, n = 1,
                      confirm = 0, confResp = 0, confOp = 0, conf50 = 0, nPreg = 0, tGanado = 0, vGanado = 0, tgSeg = 0, resta = 0;
    public static Random rnd = new Random();
    //Variables generales y de la adivinanza
    public static String txtOp1 = "", txtPregPrel = "", adiv = "", respAdiv = "", resp = "", segundoIni = "", segundoFin = "", minutoIni = "", minutoFin = "",
    adiv1 = "Blanco por dentro, \n verde por fuera; \n si quieres que te lo diga, \n es-pera. \n ¿Que es? \n La/El",
    adiv2 = "Este banco está ocupado \n por un padre y por un hijo: \n el padre se llama Juan \n y el hijo ya te lo he dicho. \n ¿Que es?",
    adiv3 = "Es pequeña como una pera, \n pero alumbra la casa entera. \n ¿Que es? \n La/El",
    adiv4 = "Redondo soy como un pandero, \n quien me tome en verano que use sombrero. \n ¿Que es? \n La/El",
    adiv5 = "Y lo es \n Y lo es \n y no lo adivinarás \n aunque te dé en un mes. \n ¿Que es? \n La/El",
    adiv6 = "En rincones y entre ramas \n mis redes voy construyendo, \n para que moscas incautas, \n en ellas vayan cayendo. \n ¿Que es? \n La/El",
    adiv7 = "Te la digo y no me entiendes, \n te la repito y no me comprendes. \n ¿Que es? \n La/El",
    adiv8 = "Tengo nombre de animal, \n cuando la rueda se pincha \n me tienes que utilizar. \n ¿Que es? \n La/El",
    adiv9 = "Soy ave y soy llana, \n pero no tengo pico ni alas. \n ¿Que es? \n La/El",
    adiv10 = "Todos me quieren para descansar \n ¡¡si ya te lo he dicho!! \n no pienses más. \n ¿Que es? \n La/El",
    respAdiv1 = "PERA",
    respAdiv2 = "ESTEBAN",
    respAdiv3 = "BOMBILLA",
    respAdiv4 = "SOL",
    respAdiv5 = "HILO",
    respAdiv6 = "ARAÑA",
    respAdiv7 = "TELA",
    respAdiv8 = "GATO",
    respAdiv9 = "AVELLANA",
    respAdiv10 = "SILLA";
    //Variable de las preguntas del juego
    public static String txtRespJuego = "", preg = "", resp1 = "", resp2 = "", resp3 = "", resp4 = "", txtRJ = "",
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
         
    public static void main(String [] args)
    {
        while (nOp1 != 4)
        {
            try {
                 
                txtOp1 = JOptionPane.showInputDialog(null, "Bienvenido" +
                        "\n 1. Preliminar del juego" +
                        "\n 2. Comenzar el juego" +
                        "\n 3. Ayuda" +
                        "\n 4. Salir" +
                        "\n Escoja una opción ?",
                        "¿QUIEN QUIERE SER MILLONARIO?", JOptionPane.INFORMATION_MESSAGE);
             
                nOp1 = Integer.parseInt(txtOp1);
                 
                switch (nOp1)
                {
                case 1:
                    casoPreliminarJuego();
                    break;
                case 2:
                    casoComenzarJuego();
                    break;
                case 3:
                    casoAyuda();
                    break;
                case 4:
                    casoSalirJuego();
                    break;
                default:
                    casoIncorrecto();
                    break;
                }
                 
            } catch(Exception e)
            {
                casoIncorrecto();
            }
        }
    }
     
    public static void casoPreliminarJuego()
    {
        do {
            Calendar seg1 = new GregorianCalendar();
            Calendar min1 = new GregorianCalendar();
            respCorrPrel = 0;
            sIni = 0;
            sFin = 0;
                     
            aleatorioPrel = (int)(Math.random()*(max))+min;
            segundoIni = Integer.toString(seg1.get(Calendar.SECOND));
            minutoIni = Integer.toString(min1.get(Calendar.MINUTE));
             
            if (aleatorioPrel == 1)
            {
                adiv = adiv1;
                respAdiv = respAdiv1;
            }
            if (aleatorioPrel == 2)
            {
                adiv = adiv2;
                respAdiv = respAdiv2;
            }
            if (aleatorioPrel == 3)
            {
                adiv = adiv3;
                respAdiv = respAdiv3;
            }
            if (aleatorioPrel == 4)
            {
                adiv = adiv4;
                respAdiv = respAdiv4;
            }
            if (aleatorioPrel == 5)
            {
                adiv = adiv5;
                respAdiv = respAdiv5;
            }
            if (aleatorioPrel == 6)
            {
                adiv = adiv6;
                respAdiv = respAdiv6;
            }
            if (aleatorioPrel == 7)
            {
                adiv = adiv7;
                respAdiv = respAdiv7;
            }
            if (aleatorioPrel == 8 )
            {
                adiv = adiv8;
                respAdiv = respAdiv8;
            }
            if (aleatorioPrel == 9)
            {
                adiv = adiv9;
                respAdiv = respAdiv9;
            }
            if (aleatorioPrel == 10)
            {
                adiv = adiv10;
                respAdiv = respAdiv10;
            }
             
            txtPregPrel = JOptionPane.showInputDialog(null, adiv,
                    "¿QUIEN QUIERE SER MILLONARIO?", JOptionPane.INFORMATION_MESSAGE);
             
            txtPregPrel = txtPregPrel.toUpperCase();
            boolean resultado = (respAdiv.equals(txtPregPrel));
             
            if (resultado == true)
            {
                tiempoResponder();
                resp = "Respuesta Correcta";
                 
                JOptionPane.showMessageDialog(null, resp + "\nTiempo que se demoro en reponder: \n" +
                        resEntrar + " Segundos",
                        "¿QUIEN QUIERE SER MILLONARIO?", JOptionPane.INFORMATION_MESSAGE);
                respCorrPrel = 1;
                confirm = 1;
            }else{
                tiempoResponder();
                resp = "Respuesta Incorrecta";
                 
                JOptionPane.showMessageDialog(null, resp + "\nLa respuesta correcta es: \n" + respAdiv +
                        "\nTiempo que se demoro en reponder: \n" + resEntrar  + " Segundos",
                        "¿QUIEN QUIERE SER MILLONARIO?", JOptionPane.ERROR_MESSAGE);
                 
                confirm = JOptionPane.showConfirmDialog(null, "Desea adivinar otra vez",
                        "¿QUIEN QUIERE SER MILLONARIO?", JOptionPane.INFORMATION_MESSAGE);
                 
            }
        }while(confirm == 0);
    }
     
    public static void casoComenzarJuego()
    {
        if (respCorrPrel == 1 && resEntrar <= 10)
        {
            iniciarJuego();
        }else{
            JOptionPane.showMessageDialog(null, "Tiene que responder correctamente" +
                    "\n la adivinanza del juego preliminar y \n demorarse menos de 10 segundos.",
                    "¿QUIEN QUIERE SER MILLONARIO?", JOptionPane.INFORMATION_MESSAGE);
        }
    }
     
    public static void casoIncorrecto()
    {
        JOptionPane.showMessageDialog(null, "Tiene que seleccionar una de las opciones",
                "¿QUIEN QUIERE SER MILLONARIO?", JOptionPane.ERROR_MESSAGE);
    }
     
    public static void tiempoResponder()
    {
        Calendar seg2 = new GregorianCalendar();
        Calendar min2 = new GregorianCalendar();
        segundoFin = Integer.toString(seg2.get(Calendar.SECOND));
        minutoFin = Integer.toString(min2.get(Calendar.MINUTE));
         
        sIni = Integer.parseInt(segundoIni);
        sFin = Integer.parseInt(segundoFin);
        mIni = Integer.parseInt(minutoIni);
        mFin = Integer.parseInt(minutoFin);
 
        if (mIni < mFin)
        {
            resta = mFin - mIni;
            if (resta == 1)
            {
                sFin = sFin + 60;
            }
            if (resta == 2)
            {
                sFin = sFin + 120;
            }
            if (resta == 3)
            {
                sFin = sFin + 180;
            }
        }
        resEntrar = sIni - sFin;
        if (resEntrar < 0)
        {
            resEntrar = resEntrar * (-1);
        }
    }
     
    public static void iniciarJuego()
    {
        confOp = 0;
        conf50 = 0;
        n = 1;
        min = 1;
        do
        {
            confResp = 0;
            aleatorioJuego = (int)(Math.random()*(maxJuego))+min;
             
            do
            {
                switch (aleatorioJuego)
                {
                    case 1:
                        preg = preg1;
                        resp1 = "\n 1. " + resPreg1A;
                        resp2 = "\n 2. " + resPreg1B;
                        resp3 = "\n 3. " + resPreg1C;
                        resp4 = "\n 4. " + resPreg1D;
                        respCorrJuego = 2;
                        txtRJ = resp2 + resp4;
                    break;
                    case 2:
                        preg = preg2;
                        resp1 = "\n 1. " + resPreg2A;
                        resp2 = "\n 2. " + resPreg2B;
                        resp3 = "\n 3. " + resPreg2C;
                        resp4 = "\n 4. " + resPreg2D;
                        respCorrJuego = 3;
                        txtRJ = resp3 + resp4;
                    break;
                    case 3:
                        preg = preg3;
                        resp1 = "\n 1. " + resPreg3A;
                        resp2 = "\n 2. " + resPreg3B;
                        resp3 = "\n 3. " + resPreg3C;
                        resp4 = "\n 4. " + resPreg3D;
                        respCorrJuego = 3;
                        txtRJ = resp1 + resp3;
                    break;
                    case 4:
                        preg = preg4;
                        resp1 = "\n 1. " + resPreg4A;
                        resp2 = "\n 2. " + resPreg4B;
                        resp3 = "\n 3. " + resPreg4C;
                        resp4 = "\n 4. " + resPreg4D;
                        respCorrJuego = 4;
                        txtRJ = resp2 + resp4;
                    break;
                    case 5:
                        preg = preg5;
                        resp1 = "\n 1. " + resPreg5A;
                        resp2 = "\n 2. " + resPreg5B;
                        resp3 = "\n 3. " + resPreg5C;
                        resp4 = "\n 4. " + resPreg5D;
                        respCorrJuego = 3;
                        txtRJ = resp2 + resp3;
                    break;
                    case 6:
                        preg = preg6;
                        resp1 = "\n 1. " + resPreg6A;
                        resp2 = "\n 2. " + resPreg6B;
                        resp3 = "\n 3. " + resPreg6C;
                        resp4 = "\n 4. " + resPreg6D;
                        respCorrJuego = 3;
                        txtRJ = resp1 + resp3;
                    break;
                    case 7:
                        preg = preg7;
                        resp1 = "\n 1. " + resPreg7A;
                        resp2 = "\n 2. " + resPreg7B;
                        resp3 = "\n 3. " + resPreg7C;
                        resp4 = "\n 4. " + resPreg7D;
                        respCorrJuego = 2;
                        txtRJ = resp2 + resp3;
                    break;
                    case 8:
                        preg = preg8;
                        resp1 = "\n 1. " + resPreg8A;
                        resp2 = "\n 2. " + resPreg8B;
                        resp3 = "\n 3. " + resPreg8C;
                        resp4 = "\n 4. " + resPreg8D;
                        respCorrJuego = 2;
                        txtRJ = resp1 + resp2;
                    break;
                    case 9:
                        preg = preg9;
                        resp1 = "\n 1. " + resPreg9A;
                        resp2 = "\n 2. " + resPreg9B;
                        resp3 = "\n 3. " + resPreg9C;
                        resp4 = "\n 4. " + resPreg9D;
                        respCorrJuego = 3;
                        txtRJ = resp2 + resp3;
                    break;
                    case 10:
                        preg = preg10;
                        resp1 = "\n 1. " + resPreg10A;
                        resp2 = "\n 2. " + resPreg10B;
                        resp3 = "\n 3. " + resPreg10C;
                        resp4 = "\n 4. " + resPreg10D;
                        respCorrJuego = 4;
                        txtRJ = resp3 + resp4;
                    break;
                    case 11:
                        preg = preg11;
                        resp1 = "\n 1. " + resPreg11A;
                        resp2 = "\n 2. " + resPreg11B;
                        resp3 = "\n 3. " + resPreg11C;
                        resp4 = "\n 4. " + resPreg11D;
                        respCorrJuego = 3;
                        txtRJ = resp3 + resp4;
                    break;
                    case 12:
                        preg = preg12;
                        resp1 = "\n 1. " + resPreg12A;
                        resp2 = "\n 2. " + resPreg12B;
                        resp3 = "\n 3. " + resPreg12C;
                        resp4 = "\n 4. " + resPreg12D;
                        respCorrJuego = 2;
                        txtRJ = resp2 + resp4;
                    break;
                    case 13:
                        preg = preg13;
                        resp1 = "\n 1. " + resPreg13A;
                        resp2 = "\n 2. " + resPreg13B;
                        resp3 = "\n 3. " + resPreg13C;
                        resp4 = "\n 4. " + resPreg13D;
                        respCorrJuego = 2;
                        txtRJ = resp1 + resp2;
                    break;
                    case 14:
                        preg = preg14;
                        resp1 = "\n 1. " + resPreg14A;
                        resp2 = "\n 2. " + resPreg14B;
                        resp3 = "\n 3. " + resPreg14C;
                        resp4 = "\n 4. " + resPreg14D;
                        respCorrJuego = 3;
                        txtRJ = resp2 + resp3;
                    break;
                    case 15:
                        preg = preg15;
                        resp1 = "\n 1. " + resPreg15A;
                        resp2 = "\n 2. " + resPreg15B;
                        resp3 = "\n 3. " + resPreg15C;
                        resp4 = "\n 4. " + resPreg15D;
                        respCorrJuego = 2;
                        txtRJ = resp2 + resp4;
                    break;
                    case 16:
                        preg = preg16;
                        resp1 = "\n 1. " + resPreg16A;
                        resp2 = "\n 2. " + resPreg16B;
                        resp3 = "\n 3. " + resPreg16C;
                        resp4 = "\n 4. " + resPreg16D;
                        respCorrJuego = 3;
                        txtRJ = resp3 + resp4;
                    break;
                    case 17:
                        preg = preg17;
                        resp1 = "\n 1. " + resPreg17A;
                        resp2 = "\n 2. " + resPreg17B;
                        resp3 = "\n 3. " + resPreg17C;
                        resp4 = "\n 4. " + resPreg17D;
                        respCorrJuego = 1;
                        txtRJ = resp1 + resp3;
                    break;
                    case 18:
                        preg = preg18;
                        resp1 = "\n 1. " + resPreg18A;
                        resp2 = "\n 2. " + resPreg18B;
                        resp3 = "\n 3. " + resPreg18C;
                        resp4 = "\n 4. " + resPreg18D;
                        respCorrJuego = 3;
                        txtRJ = resp3 + resp4;
                    break;
                    case 19:
                        preg = preg19;
                        resp1 = "\n 1. " + resPreg19A;
                        resp2 = "\n 2. " + resPreg19B;
                        resp3 = "\n 3. " + resPreg19C;
                        resp4 = "\n 4. " + resPreg19D;
                        respCorrJuego = 1;
                        txtRJ = resp1 + resp4;
                    break;
                    case 20:
                        preg = preg20;
                        resp1 = "\n 1. " + resPreg20A;
                        resp2 = "\n 2. " + resPreg20B;
                        resp3 = "\n 3. " + resPreg20C;
                        resp4 = "\n 4. " + resPreg20D;
                        respCorrJuego = 1;
                        txtRJ = resp1 + resp2;
                    break;
                }
                if (nPreg == 0)
                {
                    if (confOp == 0  && conf50 == 0)
                    {
                        txtRespJuego = JOptionPane.showInputDialog(null, preg + 
                                resp1 +
                                resp2 + 
                                resp3 + 
                                resp4 +
                                "\n5. Ayuda del publico" +
                                "\n6. Ayuda 50:50" +
                                "\n7. Salir",
                                "¿QUIEN QUIERE SER MILLONARIO?", JOptionPane.INFORMATION_MESSAGE);
                    }
                    if (confOp == 0  && conf50 == 1)
                    {
                        txtRespJuego = JOptionPane.showInputDialog(null, preg + 
                                resp1 +
                                resp2 + 
                                resp3 + 
                                resp4 +
                                "\n5. Ayuda del publico" +
                                "\n7. Salir",
                                "¿QUIEN QUIERE SER MILLONARIO?", JOptionPane.INFORMATION_MESSAGE);
                    }
                    if (confOp == 1  && conf50 == 0){
                        txtRespJuego = JOptionPane.showInputDialog(null, preg + 
                                resp1 +
                                resp2 + 
                                resp3 + 
                                resp4 +
                                "\n6. Ayuda 50:50" +
                                "\n7. Salir",
                                "¿QUIEN QUIERE SER MILLONARIO?", JOptionPane.INFORMATION_MESSAGE);
                    }
                    if (confOp == 1  && conf50 == 1){
                        txtRespJuego = JOptionPane.showInputDialog(null, preg + 
                                resp1 +
                                resp2 + 
                                resp3 + 
                                resp4 +
                                "\n7. Salir",
                                "¿QUIEN QUIERE SER MILLONARIO?", JOptionPane.INFORMATION_MESSAGE);
                    }
                     
                    nRespJuego = Integer.parseInt(txtRespJuego);
                 
                    if (nRespJuego == 6 && confOp == 0 && conf50 == 0)
                    {
                        txtRespJuego = JOptionPane.showInputDialog(null, preg +
                                txtRJ +
                                "\n5. Ayuda del publico" +
                                "\n7. Salir",
                                "¿QUIEN QUIERE SER MILLONARIO?", JOptionPane.INFORMATION_MESSAGE);
                        nRespJuego = Integer.parseInt(txtRespJuego);
                        conf50 = 1;
                        nPreg = 1;
                    }
                    if (nRespJuego == 6 && confOp == 1  && conf50 == 0)
                    {
                        txtRespJuego = JOptionPane.showInputDialog(null, preg +
                                txtRJ +
                                "\n7. Salir",
                                "¿QUIEN QUIERE SER MILLONARIO?", JOptionPane.INFORMATION_MESSAGE);
                        nRespJuego = Integer.parseInt(txtRespJuego);
                        conf50 = 1;
                        nPreg = 0;
                    }
                }
                if (nPreg == 1 && confOp == 1)
                {
                        txtRespJuego = JOptionPane.showInputDialog(null, preg +
                                txtRJ +
                                "\n7. Salir",
                                "¿QUIEN QUIERE SER MILLONARIO?", JOptionPane.INFORMATION_MESSAGE);
                        nRespJuego = Integer.parseInt(txtRespJuego);
                        conf50 = 1;
                }
                     
                if (nRespJuego == 1 || nRespJuego == 2 || nRespJuego == 3 || nRespJuego == 4)
                {
                    if (respCorrJuego == nRespJuego)
                    {
                        if (n <= 8 )
                        {
 
                            if(n == 1)
                            {
                                vGanado = 500000;
                                tgSeg = 0;
                            }
                            if(n == 2)
                            {
                                vGanado = 1000000;
                                tgSeg = 1;
                            }
                            if(n == 3)
                            {
                                vGanado = 2000000;
                                tgSeg = 0;
                            }
                            if(n == 4)
                            {
                                vGanado = 10000000;
                                tgSeg = 1;
                                //min = 5;
                            }
                            if(n == 5)
                            {
                                vGanado = 15000000;
                                tgSeg = 0;
                            }
                            if(n == 6)
                            {
                                vGanado = 30000000;
                                tgSeg = 1;
                                //min = 10;
                            }
                            if(n == 7)
                            {
                                vGanado = 60000000;
                                tgSeg = 0;
                            }
                            if(n == 8 )
                            {
                                vGanado = 120000000;
                                JOptionPane.showMessageDialog(null, "Ha ganado el premio mayor\n" +
                                        "Total ganado : $" + miformato.format(vGanado),
                                        "¿QUIEN QUIERE SER MILLONARIO?", JOptionPane.INFORMATION_MESSAGE);
                                casoSalirJuego();
                            }
                             
                            if (tgSeg == 1)
                            {
                                tGanado = vGanado;
                            }
                                 
                            confJuego = JOptionPane.showConfirmDialog(null, "Respuesta Correcta \n" +
                                    "Hasta el momento ha ganado:  $" + miformato.format(vGanado) +
                                    "\nDesea continuar jugando",
                                    "¿QUIEN QUIERE SER MILLONARIO?", JOptionPane.INFORMATION_MESSAGE);
                             
                            if (confJuego == JOptionPane.YES_OPTION)
                            {
                                confirm = 0;
                                confResp = 0;
                                nPreg = 0;
                            }
                            if (confJuego == JOptionPane.NO_OPTION)
                            {
                                JOptionPane.showMessageDialog(null, "Total ganado : $" + miformato.format(vGanado),
                                        "¿QUIEN QUIERE SER MILLONARIO?", JOptionPane.INFORMATION_MESSAGE);
                                confirm = 1;
                                confResp = 0;
                                nPreg = 0;
                            }
                             
                        }
                    }else
                    {
                        JOptionPane.showMessageDialog(null, "Respuesta Incorrecta \n" +
                                "Total ganado : $" + miformato.format(tGanado),
                                "¿QUIEN QUIERE SER MILLONARIO?", JOptionPane.ERROR_MESSAGE);
                        confirm = 1;
                    }
                     
                }
                if (nRespJuego == 5 && confOp == 0)
                {
                     
                    if (respCorrJuego == 1)
                    {
                        varPorcB = resp1 + " = 40%" + "\n" + resp2 + " = 24%" + "\n" + resp3 + " = 16%" + "\n" + resp4 + " = 20%";
                    }
                    if (respCorrJuego == 2)
                    {
                        varPorcB = resp1 + " = 30%" + "\n" + resp2 + " = 35%" + "\n" + resp3 + " = 20%" + "\n" + resp4 + " = 15%";
                    }
                    if (respCorrJuego == 3)
                    {
                        varPorcB = resp1 + " = 20%" + "\n" + resp2 + " = 15%" + "\n" + resp3 + " = 50%" + "\n" + resp4 + " = 15%";
                    }
                    if (respCorrJuego == 4)
                    {
                        varPorcB = resp1 + " = 15%" + "\n" + resp2 + " = 8%" + "\n" + resp3 + " = 17%" + "\n" + resp4 + " = 60%";
                    }
                    JOptionPane.showMessageDialog(null, "Respuesta del Publico" +
                            "\n" + varPorcB,
                            "¿QUIEN QUIERE SER MILLONARIO?", JOptionPane.INFORMATION_MESSAGE);
                    confResp = 1;
                    confOp = 1;
                }
                if (nRespJuego == 7)
                {
                    casoSalirJuego();
                }
                if (nRespJuego >= 8 )
                {
                    confResp = 1;
                }
                if (nRespJuego == 5 && confOp == 1)
                {
                    confResp = 1;
                }
                if (nRespJuego == 6 && conf50 == 1)
                {
                    confResp = 1;
                }
 
            }while(confResp == 1);
            n += 1;
        }while(confirm == 0);
         
    }
     
    public static void casoAyuda()
    {
        JOptionPane.showMessageDialog(null, "Reglas\n" +
                "Para poder empezar primero tienes que pasar \n el juego preliminar.\n" +
                "Premios \n" +
                "1a Pregunta    $500,000 \n" +
                "2a Pregunta   $1,000,000 Queda en Seguridad \n" +
                "3a Pregunta   $2,000,000 \n" +
                "4a Pregunta  $10,000,000 Queda en Seguridad \n" +
                "5a Pregunta  $15,000,000 \n" +
                "6a Pregunta  $30,000,000 Queda en Seguridad \n" +
                "7a Pregunta  $60,000,000 \n" +
                "8a Pregunta $120,000,000 \n",
                "¿QUIEN QUIERE SER MILLONARIO?", JOptionPane.INFORMATION_MESSAGE);
    }
     
    public static void casoSalirJuego()
    {
        System.exit(0);
    }
     
}
