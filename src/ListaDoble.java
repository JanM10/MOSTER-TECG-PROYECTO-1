import javax.swing.*;

public class ListaDoble {
    private NodoDoble inicio,fin;
    public ListaDoble(){
        inicio = fin = null;
    }
    //Metodo para saber cuando la lista esta vacia
    public boolean estaVacia(){
        return inicio == null;
    }
    //Metodo para agregar nodos al final
    public void agregarAlFinal(int el){
        if(!estaVacia()){
            fin = new NodoDoble(el, null, fin);
            fin.anterior.siguente = fin;
        }else{
            inicio = fin = new NodoDoble(el);
        }
    }
    //Metodo para agregar al inicio
    public void agregarAlInicio(int el){
        if(!estaVacia()){
            inicio = new NodoDoble(el, inicio, null);
            inicio.siguente.anterior = inicio;
        }else{
            inicio = fin = new NodoDoble(el);
        }
    }
    //Metodo para mostrar la lista de Inicio a Fin
    public void mostrarListaInicioFin(){
        if (!estaVacia()){
            String datos = "<=>";
            NodoDoble auxiliar = inicio;
            while (auxiliar != null){
                datos = datos + "[" + auxiliar.dato + "]<=>";
                auxiliar = auxiliar.siguente;
            }
            JOptionPane.showMessageDialog(null,datos,
                    "Mostrando lista de Inicio a Fin",JOptionPane.INFORMATION_MESSAGE);

        }
    }
    //Metodo para mostrar la Lista de Fin a Inicio
    public void mostrarListaFinInicio(){
        if (!estaVacia()){
            String datos = "<=>";
            NodoDoble auxiliar = fin;
            while (auxiliar != null){
                datos = datos + "[" + auxiliar.dato + "]<=>";
                auxiliar = auxiliar.anterior;
            }
            JOptionPane.showMessageDialog(null,datos,
                    "Mostrando lista de Inicio a Fin",JOptionPane.INFORMATION_MESSAGE);

        }
    }
}
