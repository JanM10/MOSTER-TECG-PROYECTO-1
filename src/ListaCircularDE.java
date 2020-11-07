public class ListaCircularDE {

    int tamano = 0;
    NodoCircular inicio;
    NodoCircular fin;

    public boolean vacia(){
        return (tamano == 0);
    }

    public void insertar_inicio(String dato){
        NodoCircular nuevo = new NodoCircular(dato);

        if(vacia()){
            inicio = nuevo;
            fin = nuevo;

            inicio.nodoSig = fin;
            fin.nodoSig = inicio;
            inicio.nodoAnt = fin;
            fin.nodoSig = inicio;

            tamano++;
        }else {
            NodoCircular aux = inicio;
            nuevo.nodoSig = aux;
            aux.nodoAnt = nuevo;

            inicio = nuevo;

            tamano++;
        }
    }

    public void instertar_final(String dato){
        NodoCircular nuevo = new NodoCircular(dato);

        if (vacia()){
            inicio = nuevo;
            fin = nuevo;

            inicio.nodoSig = fin;
            fin.nodoSig = inicio;
            inicio.nodoAnt = fin;
            fin.nodoAnt = inicio;

            tamano++;
        }else {
            NodoCircular aux = fin;

            aux.nodoSig = nuevo;
            nuevo.nodoAnt = aux;

            fin = nuevo;

            tamano++;
        }

    }
    public void tamanoLista(){
        System.out.println("<---" + tamano + "--->");
    }

    public void mostrar_elementos(){
        if (vacia()){
            NodoCircular aux = inicio;

            for(int i = 0 ; 1 < tamano ; i++){
                System.out.println(aux.dato + "   ");
                aux = aux.nodoSig;
            }
        }else {
            System.out.println("<---- La lista esta vacia --->");
        }
    }

    public void buscar_modificar(int pos, String dato){
        if (vacia()){
            System.out.println("La lista esta vacia");
        }else {
            if (pos == 0){
                inicio.dato = dato;
            }else {
                if (pos > 0 && pos < tamano){
                    NodoCircular aux = inicio;
                    for (int i = 0; i < tamano-1; i++){
                        if (i == pos-1){
                            NodoCircular mod = aux.nodoSig;
                            mod.dato = dato;

                            aux.nodoSig = mod;
                        }else{
                            aux = aux.nodoSig;
                        }
                    }
                }else {
                    System.out.println("La posicion ingresada no existe");
                }
            }
        }
    }
}
