import java.util.Scanner;

public class menu_interactivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- MENÚ DE OPCIONES ---");
            System.out.println("1. Saludar");
            System.out.println("2. Mostrar fecha/hora simulada");
            System.out.println("3. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("¡Hola! Bienvenido al sistema.");
                    break;
                case 2:
                    System.out.println("Entorno de desarrollo activo en UST.");
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 3);
        
        sc.close();
    }
}
