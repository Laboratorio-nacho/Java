import java.util.Scanner;

public class entrada_de_datos{
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);//in viene de input osea entrada de datos
        //int numero;
        String cadena ;
        //char letra;
        System.out.println(entrada);


        /*System.out.println("digite un numero ");
        numero=entrada.nextInt();*/

        System.out.println("digite una cadena");
        cadena=entrada.nextLine();  //next solo guarda una cadena pero si hay un espacio no mostrara lo demas asi que es mejor usar nextline

        /*System.out.println("digite letra");
        letra=entrada.next().charAt(0);*/

        //System.out.println("el numero es " + numero);
        System.out.println("la cadena es " + cadena);
        //System.out.println("la letra es "+ letra);
    }
}
