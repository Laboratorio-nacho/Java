import java.util.Scanner;

public class tabla_multiplicar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Qué tabla de multiplicar deseas ver?: ");
        int numero = sc.nextInt();

        System.out.println("--- Tabla del " + numero + " ---");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        sc.close();
    }
}
