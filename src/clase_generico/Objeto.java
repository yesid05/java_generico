package clase_generico;

public class Objeto<T> {
    // -------------------------------
    // Atributos
    // -------------------------------
    private T objeto; // Objeto de cualquier tipo

    // -------------------------------
    // Metodos
    // -------------------------------

    /**
     * Construye un objeto vacío
     */
    public Objeto() {
	// TODO Auto-generated constructor stub
    }

    /**
     * Construye un objeto con parametro
     * 
     * @param unObjeto
     *            Objeto de cualquier tipo
     */
    public Objeto(T unObjeto) {
	objeto = unObjeto;
    }

    /**
     * Cambia el valor de la variable objeto
     * 
     * @param unObjeto
     *            nuevo valor para la variable objeto
     */
    public void cambiarObjeto(T unObjeto) {
	objeto = unObjeto;
    }

    /**
     * Retorna el valor de la variable objeto
     * 
     * @return valor de objeto
     */
    public T darObjeto() {
	return objeto;
    }
}
