/*
 * realiza un programa en java que al ejecutarlo reciba como argumento un nombre de un directorio. El programa debe eliminar el directorio y los 
ficheros contenidos en el emitiendo un mensaje con el formato "archivo eliminado"
 */
package Directorios;

import java.io.File;

public class EjercicioFicheros2 {

    public static void main(String[] args) {
        File directorio = new File(args[0]);
        if (directorio.exists()) {
            File[] ficheros = directorio.listFiles();
            for (int i = 0; i < ficheros.length; i++) {
                ficheros[i].delete();
                System.out.println("archivo eliminado");
            }
            directorio.delete();
        }
    }

}
