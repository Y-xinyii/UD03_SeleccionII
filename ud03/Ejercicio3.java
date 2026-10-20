import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Intoducir tu edad: ");
        int edad = input.nextInt();

        if (edad < 0){
            System.out.println("Edad no válida.");
            
        }else if(edad < 13) {
            System.out.println("Eres niño.");

        }else if(edad <= 17) {
            System.out.println("Eres adolescente.");

        }else if(edad <= 64) {
            System.out.println("Eres adulto/a.");
        }else{
            System.out.println("Eres señor.");
        }

        input.close();

    }
    
}
