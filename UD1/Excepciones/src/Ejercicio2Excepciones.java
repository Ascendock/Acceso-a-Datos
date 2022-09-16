
import javax.swing.JOptionPane;

/*
2. Crea un programa que lea por teclado 10 números de tipo enteiro, e amose un menú 
coas seguintes opcións: 1. maior, 2. menor, 3. suma, 4. producto, 5 media, 6. sair. 
Sairase do programa cando o usuario elixa a opción 6.
 */
/**
 *
 * @author brunodc
 */
public class Ejercicio2Excepciones {

    public static void main(String[] args) {

        try {
            int[] cadena = new int[10];
            int opcion = 6;

            for (int i = 0; i < 10; i++) {
                cadena[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero:"));
            }

            do {

                opcion = Integer.parseInt(JOptionPane.showInputDialog("1. Mayor\n2. Menor\n3. Suma\n4. Producto\n5. Media\n6. Salir"));

                switch (opcion) {
                    case 1 ->
                        System.out.println(calcularMayor(cadena));
                    case 2 ->
                        System.out.println(calcularMenor(cadena));
                    case 3 ->
                        System.out.println(calcularSuma(cadena));
                    case 4 ->
                        System.out.println(calcularProducto(cadena));
                    case 5 ->
                        System.out.println(calcularMedia(cadena));
                    case 6 ->
                        salir();
                }
            } while (opcion != 6);
        } catch (ArithmeticException ErrorAritmetico) {
            JOptionPane.showMessageDialog(null, "Error de cálculo!");
        } catch (NumberFormatException ErrorDatos) {
            JOptionPane.showMessageDialog(null, "Datos introducidos erroneos, introuce numeros enteros!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error no encontrado!");
        }

    }

    /**
     *
     * @param cadena
     */
    private static int calcularMayor(int[] cadena) {
        int mayor = cadena[0];

        for (int i : cadena) {
            if (mayor < i) {
                mayor = i;
            }
        }
        return mayor;
    }

    /**
     *
     * @param cadena
     */
    private static int calcularMenor(int[] cadena) {
        int menor = cadena[0];

        for (int i : cadena) {
            if (menor > i) {
                menor = i;
            }
        }
        return menor;
    }

    /**
     *
     * @param cadena
     */
    private static int calcularSuma(int[] cadena) {
        int suma = 1;
        for (int i : cadena) {
            suma = suma + i;

        }
        return suma;

    }

    /**
     *
     * @param cadena
     */
    private static int calcularProducto(int[] cadena) {
        int producto = 1;

        for (int i : cadena) {
            producto = producto * i;
        }
        return producto;
    }

    /**
     *
     * @param cadena
     */
    private static int calcularMedia(int[] cadena) {
        return calcularSuma(cadena) / cadena.length;
    }

    private static void salir() {
        return;
    }

}
