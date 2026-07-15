import java.util.Scanner;

public class operadores{

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);  //objeto entradaa para guardar datos
        float numero1,numero2, suma , resta , multiplicaccion , division ,resto;
         
        System.out.println("digite 2 numeros");
        numero1 = entrada.nextFloat();
        numero2 = entrada.nextFloat();
        
        suma = numero1+numero2;
        resta = numero1-numero2;
        multiplicaccion = numero1*numero2;
        division = numero1/numero2;
        resto = numero1%numero2;

        System.out.println("la suma es "+ suma);
        System.out.println("la resta es "+ resta);
        System.out.println("la multiplicacion es "+multiplicaccion);
        System.out.println("la division es "+ division);
        System.out.println("el resto es "+ resto);

        entrada.close();
    }       



    

}