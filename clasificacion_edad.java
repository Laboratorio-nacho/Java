import java.util.Scanner;

public class clasificacion_edad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(String.class.cast(System.in));
        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();

        if (edad < 0) {
            System.out.println("Edad no válida.");
        } else if (edad <= 12) {
            System.out.println("Categoría: Niño/a");
        } else if (edad <= 17) {
            System.out.println("Categoría: Adolescente");
        } else if (edad <= 64) {
            System.out.println("Categoría: Adulto/a");
        } else {
            System.out.println("Categoría: Adulto mayor");
        }
        scanner.close();
    }
}
