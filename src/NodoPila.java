public class NodoPila {
    // Variable en la cual se va a guardar el valor.
    private int valor;
    // Variable para enlazar los nodos.
    private NodoPila siguiente;
    /**
     * Constructor que inicializamos el valor de las variables.
     */
    public void NodoPila(){
        this.valor = 0;
        this.siguiente = null;
    }

    // Métodos get y set para los atributos.

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public NodoPila getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPila siguiente) {
        this.siguiente = siguiente;
    }
}