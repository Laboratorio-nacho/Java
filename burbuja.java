import java.util.Scanner;
import javax.swing.JOptionPane;

public class burbuja{
    public static void main(String[] args) { //main: atajo
        Scanner entrada= new Scanner(System.in);
        int arreglo[],n_elementos,aux;

        n_elementos = Integer.parseInt(JOptionPane.showInputDialog("digite cantidad de elementos del arreglo"));

        arreglo = new int[n_elementos];//le asignamos nros elementos al arreglo

        for (int i = 0; i < n_elementos; i++) {
            System.out.println((i+1)+" digite un numero");
            arreglo[i]=entrada.nextInt();
        }

        //metodo burbuja
        for (int i = 0; i < (n_elementos-1); i++) {
            for (int j = 0; j < (n_elementos-1); j++) {
                if (arreglo[j] > arreglo[j+1]) {
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1]=aux;
                    
                }
            }
            
        }

        //mostrando el arreglo de forma creciente
        System.out.println("arreglo ordenado: ");
        for (int i = 0; i < n_elementos; i++) {
            System.out.println(arreglo[i]);
            
        }

        entrada.close();
    }
}


