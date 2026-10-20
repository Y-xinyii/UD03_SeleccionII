
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        try(Scanner input = new Scanner(System.in)){
        System.out.println("Introducir un número de mes (1 al 12): ");

        int mes = input.nextInt();      

        switch (mes) {

            case 1 -> System.out.println("El mes" + mes + "tiene 31 días.");


            case 2 -> System.out.println("El mes" + mes + "tiene 28 días.");


            case 3 -> System.out.println("El mes" + mes + "tiene 31 días.");
    

            case 4 -> System.out.println("El mes" + mes + "tiene 30 días.");
  

            case 5 -> System.out.println("El mes" + mes + "tiene 31 días.");


            case 6 -> System.out.println("El mes" + mes + "tiene 30 días.");
 

            case 7 -> System.out.println("El mes" + mes + "tiene 31 días.");


            case 8 -> System.out.println("El mes" + mes + "tiene 31 días.");


            case 9 -> System.out.println("El mes" + mes + "tiene 30 días.");


            case 10 -> System.out.println("El mes" + mes + "tiene 31 días.");


            case 11 -> System.out.println("El mes" + mes + "tiene 30 días.");


            case 12 -> System.out.println("El mes" + mes + "tiene 31 días.");


            default -> System.out.println("Número de mes no válido. Debe ser entre 1 y 12.");
 

        }      
    }
    }

} 