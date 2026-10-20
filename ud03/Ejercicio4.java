import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner xinyi = new Scanner(System.in);

        System.out.println("Introducir una letra: ");
        int letra = xinyi.nextInt();

        switch (letra) {
            case 'A':
                System.out.println("Es unavocal.");
                break;
             
            case 'E':
                System.out.println("Es unavocal.");
                break;

            case 'I':
                System.out.println("Es unavocal.");
                break;

            case 'O':
                System.out.println("Es unavocal.");
                break;

            case 'U':
                System.out.println("Es unavocal.");
                break;
                
            default:
                System.out.println("Es una consonante.");
        }
        xinyi.close();
    }
    
}
