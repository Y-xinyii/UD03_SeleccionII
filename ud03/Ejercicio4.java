import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        try(Scanner xinyi = new Scanner(System.in)) {

        System.out.println("Introducir una letra en mayuscula: ");
        int letra = xinyi.nextInt();

        switch (letra) {
            case 'A' -> System.out.println("Es una vocal.");
             
            case 'E' -> System.out.println("Es una vocal.");

            case 'I' -> System.out.println("Es una vocal.");

            case 'O' -> System.out.println("Es una vocal.");

            case 'U' -> System.out.println("Es una vocal.");

            default -> System.out.println("Es una consonante.");
        }
    }
    }
    
}
