import javax.swing.*;

public class ProbarLasListas {
    public static void main(String[] args) {
        ListaDoble listita = new ListaDoble();
        int opcion = 0, elemento;
        do{
            try{
                elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Agregar un nodo al inicio\n"
                                +"2. Agregar un NodoPila al final\n"
                                +"3. Mostrar la lista de Inicio a Fin\n"
                                +"4. Mostrar la lista de Fin a Inicio\n"
                                +"5. Salir\n"
                                +"6. Que deseas hacer?","Menu de opciones",
                        JOptionPane.INFORMATION_MESSAGE));
            }catch (NumberFormatException n){
                JOptionPane.showMessageDialog(null, "Error" + n.getMessage());
            }
        }while (opcion != 5);
    }
}
