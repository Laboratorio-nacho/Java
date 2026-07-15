public class estatico {
    private static String frase = "primera frase"; //? statico para que un cambio en la frase repercute en todos los objetos

    public static int sumar(int n1,int n2) {
        int suma = n1 + n2;
        return suma;
        
    }
    public static void main(String[] args) {
        
        System.out.println(estatico.frase);
        System.out.println("la suma es "+ estatico.sumar(3, 4));
        
    }    
    
}
