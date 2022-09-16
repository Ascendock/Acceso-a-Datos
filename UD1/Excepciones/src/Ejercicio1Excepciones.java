
import javax.swing.JOptionPane;

/*
1. Crea un programa que divida dous números. Supoñamos que os números se introducen 
en dous controis de edición. Obtense  o texto de cada un dos controis de edición e 
gárdanse en dous strings.
 */
/**
 *
 * @author brunodc
 */
public class Ejercicio1Excepciones {

    public static void main(String[] args) {

        try {
            float num1, num2, resultado;

            num1 = Integer.parseInt(JOptionPane.showInputDialog("Escribe el primer numero:"));
            num2 = Integer.parseInt(JOptionPane.showInputDialog("Escribe el segundo numero:"));

            resultado = num1 / num2;
            System.out.println(resultado);
        } catch (ArithmeticException ErrorAritmetico) {
            System.out.println("Error artimético!," + ErrorAritmetico);
        } catch (RuntimeException ErrorIdentidad) {
            System.out.println("Error en la identidad de alguna de las variables!," + ErrorIdentidad);
        } catch (Exception e) {
            System.out.println("Error no controlado!," + e);
        }
    }
}
