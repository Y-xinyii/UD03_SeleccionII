import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        try(Scanner xinyi = new Scanner(System.in)) {

        System.out.println("Introducir una letra: ");
        int letra = xinyi.nextInt();

        switch (letra) {
            case 'A' -> System.out.println("Es unavocal.");
             
            case 'E' -> System.out.println("Es unavocal.");

            case 'I' -> System.out.println("Es unavocal.");

            case 'O' -> System.out.println("Es unavocal.");

            case 'U' -> System.out.println("Es unavocal.");

            default -> System.out.println("Es una consonante.");
        }
    }
    }
    
}
