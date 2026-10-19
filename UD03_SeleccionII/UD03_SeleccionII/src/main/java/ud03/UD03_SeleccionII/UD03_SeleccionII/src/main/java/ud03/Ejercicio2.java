
package ud03;
import java.util.Scanner;
/**
 * @author Ye Xinyi
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Introducir un número de mes (1 al 12): ");
        int mes = input.nextInt();
        
        switch(mes) {
            case 1:
                System.out.println("El mes" + mes + "tiene 28 días.");
                break;
            case 2:
                System.out.println("El mes" + mes + "tiene 31 días.");
                break;
            case 3:
                System.out.println("El mes" + mes + "tiene 31 días.");
                break;    
            case 4:
                System.out.println("El mes" + mes + "tiene 30 días.");
                break;   
            case 5:
                System.out.println("El mes" + mes + "tiene 31 días.");
                break;
            case 6:
                System.out.println("El mes" + mes + "tiene 30 días.");
                break;
            case 7:
                System.out.println("El mes" + mes + "tiene 31 días.");
                break;
            case 8:
                System.out.println("El mes" + mes + "tiene 31 días.");
                break;
            case 9:
                System.out.println("El mes" + mes + "tiene 30 días.");
                break;
            case 10:
                System.out.println("El mes" + mes + "tiene 31 días.");
                break;
            case 11:
                System.out.println("El mes" + mes + "tiene 30 días.");
                break;
            case 12:
                System.out.println("El mes" + mes + "tiene 31 días.");
                break;
            default:
                System.out.println("Número de mes no válido. Debe ser entre 1 y 12.");
                break;
        }
        
    }
}
