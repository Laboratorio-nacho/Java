import java.util.Scanner;

public class dias_mes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número del mes (1-12): ");
        int mes = sc.nextInt();
        int dias = 0;

        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                dias = 31;
                break;
            case 4: case 6: case 9: case 11:
                dias = 30;
                break;
            case 2:
                dias = 28; // Ignorando años bisiestos para simplicidad
                break;
            default:
                System.out.println("Mes inválido.");
                sc.close();
                return;
        }
        System.out.println("El mes " + mes + " tiene " + dias + " días.");
        sc.close();
    }
}
