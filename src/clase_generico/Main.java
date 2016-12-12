package clase_generico;

public class Main {
    
    public static void main(String[] argumento){
	//Construye objeto de tipo enteros
	Objeto<Integer> enteroObjeto = new Objeto<Integer>();
	
	//Contruye objeto de tipo cadena
	Objeto<String> cadenaObjeto = new Objeto<>();
	
	//Agregando valores
	enteroObjeto.cambiarObjeto(new Integer(5));
	cadenaObjeto.cambiarObjeto(new String("Yesid"));
	
	//Imprimiendo valores
	System.out.printf("El valor entero es: %d\n\n",enteroObjeto.darObjeto());
	System.out.printf("El valor de la cadena es: %s",cadenaObjeto.darObjeto());
	
    }

}
