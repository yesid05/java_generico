package metodo_generico;

public class Main {

    public static void main(String[] argumento) {
	// array de enteros, reales, caracter y cadena
	Integer[] intArray = { 1, 2, 3, 4, 5 };
	Double[] doubleArray = { 1.1, 1.2, 1.3 };
	Character[] caracterArray = { 'y', 'e', 's', 'i', 'd' };
	String[] cadenaArray = { "cadena 1", "cadena 2" };

	System.out.println("Array de enteros:");
	imprimirArray(intArray);

	System.out.println("Array de reales:");
	imprimirArray(doubleArray);

	System.out.println("Array de caracteres:");
	imprimirArray(caracterArray);

	System.out.println("Array de cadena:");
	imprimirArray(cadenaArray);

    }

    // metodo generico para imprimir un array
    public static <E> void imprimirArray(E[] unArray) {
	for (E e : unArray) {
	    System.out.printf("%s ", e);
	}

	System.out.println();
    }
}
