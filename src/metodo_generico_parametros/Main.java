package metodo_generico_parametros;

public class Main {

    public static void main(String[] args) {
	
	System.out.printf("M�ximo de %d, %d y %d es: %d\n\n",3,4,5,objetoMaximo(3, 4, 5));
	
	System.out.printf("M�ximo de %.1f, %.1f y %.1f es: %.1f\n\n",6.6,7.6,6.7,objetoMaximo(6.6, 7.6, 6.7));
	
	System.out.printf("M�ximo de %s, %s y %s es: %s","pera","naranja","manzana",objetoMaximo("pera", "naranja", "manzana"));

    }

    /**
     * Determina el objeto mas grande  
     * @param x objeto n�mero 1.
     * @param y objeto n�mero 2
     * @param z objeto n�mero 3
     * @return el objeto m�s grande 
     */
    public static <T extends Comparable<T>> T objetoMaximo(T x, T y, T z) {
	T numMax = x; // asume que x es inicialmente el objeto m�s grande
	if (y.compareTo(numMax) > 0) {
	    numMax = y; // y es el objeto m�s grande
	}
	if (z.compareTo(numMax) > 0) {
	    numMax = z; // z es el objeto m�s grande
	}

	return numMax; // retorna el objeto m�s grande 

    }

}
