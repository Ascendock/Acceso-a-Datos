
/**
 *
 * @author brunodc
 */
public class excepciones1 {

    public static void main(String[] args) {
        
        try {
            
        int num = 10, denom = 0, cociente;
            
            cociente = num / denom;
            System.out.println("Resultado:" + cociente);
            
        } catch (ArithmeticException ErrorNumerico) {
            System.out.println("Error aritmetico");
        } catch(RuntimeException ErrorIdentidad){
            System.out.println("Error de identidad de la variable");
        } catch (Exception e) {
            System.out.println(e + "Error desconocido");
        }
    }
}
