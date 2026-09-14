import java.util.Scanner;
import java.util.Random;

public class adivina_numero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int numeroSecreto = random.nextInt(50) + 1; // 1 al 50
        int intento = 0;
        
        System.out.println("Intenta adivinar el número del 1 al 50!");

        while (intento != numeroSecreto) {
            System.out.print("Introduce tu número: ");
            intento = sc.nextInt();

            if (intento < numeroSecreto) {
                System.out.println("El número secreto es mayor.");
            } else if (intento > numeroSecreto) {
                System.out.println("El número secreto es menor.");
            }
        }

        System.out.println("¡Felicidades! Adivinaste el número.");
        sc.close();
    }
}
