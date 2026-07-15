import java.util.Scanner;

public class calculadora {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        float o,num1=0,num2=0, resultado=0, opcion=0;
        

        while (opcion!=3) {
            System.out.println( "1- ingresar 2 numeros");
            System.out.println("2- ingresar operacion y ver resultado ");
            System.out.println("3- Salir");
            opcion = entrada.nextInt();

            if (opcion==1) {
                System.out.println("ingrese 2 numeros");
                num1 = entrada.nextFloat();
                num2 = entrada.nextFloat();
            }
            if (opcion==2) {
                System.out.println("ingrese una operacion:");
                System.out.println("1-suma,2-resta,3-division,4-multiplicacion");
                o = entrada.nextInt();
                
                if (o==1) {  
                    resultado=num1+num2;
                }
                if (o==2) {
                    resultado=num1-num2;
                }
                if (o==3) {
                    resultado=num1*num2;
                } 
                if (o==4) {
                    resultado=num1/num2;
                }
                System.out.println("el resultado es "+ resultado);
            }

            entrada.close();
            
        }
    }
    
}
