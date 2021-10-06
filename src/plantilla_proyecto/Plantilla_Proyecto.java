package plantilla_proyecto;

import java.io.*;
import java.util.Scanner;
import java.util.Random;
import javax.swing.JOptionPane;

public class Plantilla_Proyecto {

    public static int random[] = new int[22];
    public static String p[] = new String[22];
    public static int opcion;
    public static String nombre;

    //public static void Proceso() {
        //int premio = 0;
        //int correctas = 0;
        //while (Plantilla_Proyecto.opcion != 3) {
            //switch (Plantilla_Proyecto.bienvenida()) {
                //case 0:
                    //for (int i = 0; i < 22; i++) {
                        //Plantilla_Proyecto.casos(Plantilla_Proyecto.random[i]);
                        //correctas = correctas + 1;
                        //premio = premio + 25;
                        //JOptionPane.showMessageDialog(null, "Tienes: " + premio + " Puntos ");

                    //}

            //}
        //}
    //}

    public static String bienvenida() {
        String[] opciones = {"Comenzar", "Ayuda", "Salir"};
        nombre = JOptionPane.showInputDialog(null, "!Tenemos un nuevo concursante!\n\n Digita tu nombre: ", JOptionPane.INFORMATION_MESSAGE);
        if (nombre.equals("")) {
            System.exit(0);
        }
        return nombre;
    }
        
    //public static int casos(int definido) {
        //int resp, def;
        //Scanner dato = new Scanner(System.in);
        //switch (definido) {
            //case 0:
                //String[] a = {"Opcion a", "Opcion b", "Opcion c", "Opcion d"};
                //resp = JOptionPane.showOptionDialog(null, Plantilla_Proyecto.p[0]
                        //+ "\n a) Secuencia logica de pasos que busca resolver un problema"
                        //+ "\n b) Es una igualdad entre dos expresiones algebraicas relacionadas"
                        //+ "\n c) Es una relacion de variables"
                        //+ "\n d) Ninguna de las anteriores"
                        //+ "\n Elija la opcion correcta, tomese su tiempo", 0, JOptionPane.QUESTION_MESSAGE, a);

        //}
    //}
    
    public static void Random(){
        int inicio = 0, fin = 22;
        Random rnd = new Random();
        for (int i = 0;i < 22; i++){
            random[i] = (int) (rnd.nextDouble()* fin + inicio);
            for (int j = 0;j < 22; j++){
                if (random[i] == random[j] && i != j && i>0 ){
                    i--;
                }
            } 
        
    }
    }

}
