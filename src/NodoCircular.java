public class NodoCircular {
    String dato;
    NodoCircular nodoSig;
    NodoCircular nodoAnt;

    public NodoCircular(String dato){
        this.dato = dato;
        nodoSig = null;
        nodoAnt = null;
    }
}
