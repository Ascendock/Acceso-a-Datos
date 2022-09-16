/*
 * //Haz un programa que utilice el metodo listfiles() para mostrar la lista de 
ficheros en un directorio cualquiera pasado como argumento del main o en su 
defecto en el directorio actual. La informacion a mostrar sera para cada fichero 
o directorio, y la ultima fecha de modificacion. Los permisos hay que visualizarlos 
en el formato habitual de linux
 */
package Directorios;

import java.io.*;
import java.util.*;

/**
 *
 * @author brunodc
 */
public class ejercicioFicheros1 {

    public static void main(String[] args) {
        File directorio;
        if (args.length > 0) {
            directorio = new File(args[0]);
        } else {
            directorio = new File(".");
        }

        if (directorio.exists() && directorio.isDirectory()) {
            File[] listaFicheros = directorio.listFiles();
            for (int i = 0; i < listaFicheros.length; i++) {
                System.out.println("Nombre: " + listaFicheros[i].getName());
                System.out.println("Fecha de modificacion: " + new Date(listaFicheros[i].lastModified()));
                System.out.println("Permisos: " + (listaFicheros[i].canRead() ? "r" : "-") + (listaFicheros[i].canWrite() ? "w" : "-") + (listaFicheros[i].canExecute() ? "x" : "-"));
            }
        } else {
            System.out.println("El directorio no existe o no es un directorio");
        }
    }
}
