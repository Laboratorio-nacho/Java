public class mayor {
     // Elemento mayor de arreglo en Java
	public static void main(String[] args) {
		int[] numeros = new int[] { 28, 50, 40, 200, 20, 44, 100, 153 };
		// Asumir que el mayor es el primero
		int mayor = numeros[0];
		// Recorrer arreglo y ver si no es así
		// (comenzar desde el 1 porque el 0 ya lo tenemos contemplado arriba)
		for (int x = 1; x < numeros.length; x++) {
			if (numeros[x] > mayor) {
				mayor = numeros[x];
			}
		}
		System.out.println("El mayor es: " + mayor);
	}

}
