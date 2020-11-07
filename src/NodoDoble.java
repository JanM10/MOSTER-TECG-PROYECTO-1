public class NodoDoble {
    public int dato;
    NodoDoble siguente, anterior;

    //Constructor para cuando aun no hay nodos
    public NodoDoble(int el){
        this(el,null,null);
    }

    //Constructor para cuadno ya hay nodos

    /**
     * Aqui viene el elemento anterior y el siguente.
     * @param el
     * @param s
     * @param a
     */
    public NodoDoble(int el, NodoDoble s, NodoDoble a){
        dato = el;
        siguente = s;
        anterior = a;
    }

}
