/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LeerFicheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author brunodc
 */
public class Ejercicio4Ficheros {

    public class Ejercicio2 {

        public static void main(String[] args) throws IOException {
            if (args.length != 1) {
                System.out.println("Uso: java Ejercicio2 <nombre_fichero>");
                System.exit(-1);
            }
            File fichero = new File(args[0]);
            if (!fichero.exists()) {
                System.out.println("El fichero " + args[0] + " no existe");
                System.exit(-1);
            }
            if (!fichero.canRead()) {
                System.out.println("No se puede leer el fichero " + args[0]);
                System.exit(-1);
            }
            FileReader fr = new FileReader(fichero);
            BufferedReader br = new BufferedReader(fr);
            String linea;
            int contador = 0;
            while ((linea = br.readLine()) != null) {
                for (int i = 0; i < linea.length(); i++) {
                    System.out.print(linea.charAt(i));
                    contador++;
                    if (contador == 20) {
                        System.out.println();
                        contador = 0;
                    }
                }
            }
            br.close();
            fr.close();
        }
    }
}
