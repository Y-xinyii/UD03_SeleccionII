
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Introducir un número de 1 a 7: ");

        int numero = input.nextInt();

        //Usamos switch para saber el día mediante número

        switch (numero) {

            case 1 -> System.out.println("Lunes");

            case 2 -> System.out.println("Martes");
              

            case 3 -> System.out.println("Miercoles");
 

            case 4 -> System.out.println("Jueves");


            case 5 -> System.out.println("Viernes");


            case 6 -> System.out.println("Sábado");


            case 7 -> System.out.println("Domingo");
   

            default -> System.out.println("Numero no válido.");
        }
        input.close();
    }
} 