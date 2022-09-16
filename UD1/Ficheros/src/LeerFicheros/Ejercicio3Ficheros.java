/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author brunodc
 */
package LeerFicheros;

import java.io.*;
public class Ejercicio3Ficheros {
    
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader(args[0]);
            int c;
            while ((c = fr.read()) != -1) {
                System.out.print((char) c);
            }
            fr.close();
        } catch (IOException e) {
            System.out.println("Error E/S: " + e);
        }
    }
}

