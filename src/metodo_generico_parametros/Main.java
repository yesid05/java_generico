package metodo_generico_parametros;

public class Main {

    public static void main(String[] args) {
	
	System.out.printf("Máximo de %d, %d y %d es: %d\n\n",3,4,5,objetoMaximo(3, 4, 5));
	
	System.out.printf("Máximo de %.1f, %.1f y %.1f es: %.1f\n\n",6.6,7.6,6.7,objetoMaximo(6.6, 7.6, 6.7));
	
	System.out.printf("Máximo de %s, %s y %s es: %s","pera","naranja","manzana",objetoMaximo("pera", "naranja", "manzana"));

    }

    /**
     * Determina el objeto mas grande  
     * @param x objeto número 1.
     * @param y objeto número 2
     * @param z objeto número 3
     * @return el objeto más grande 
     */
    public static <T extends Comparable<T>> T objetoMaximo(T x, T y, T z) {
	T numMax = x; // asume que x es inicialmente el objeto más grande
	if (y.compareTo(numMax) > 0) {
	    numMax = y; // y es el objeto más grande
	}
	if (z.compareTo(numMax) > 0) {
	    numMax = z; // z es el objeto más grande
	}

	return numMax; // retorna el objeto más grande 

    }

}
