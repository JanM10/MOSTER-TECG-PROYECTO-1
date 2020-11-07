import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;
import java.io.IOException;

//public class ObjectMapper{


public class App{
    public static void main(String [] args){
        ObjectMapper mapper = new ObjectMapper();
        try{
            Datos[] datos = mapper.readValue(new File ("cartas.json"), Datos[].class);

            System.out.println("Nombre:"+datos[1].getNombre());
            System.out.println("id:"+datos[1].getId());
            System.out.println("Daño:"+datos[1].getDaño());
            System.out.println("Coste:"+datos[1].getCoste());
            System.out.println("Vida:"+datos[1].getVida());
            System.out.println("Hechizos:"+datos[1].getHechizo());
            System.out.println("------------");
            System.out.println("Nombre:"+datos[2].getNombre());
            System.out.println("id:"+datos[2].getId());
            System.out.println("Daño:"+datos[2].getDaño());
            System.out.println("Coste:"+datos[2].getCoste());
            System.out.println("Vida:"+datos[2].getVida());
            System.out.println("Hechizos:"+datos[2].getHechizo());
            System.out.println("------------");
            System.out.println("Nombre:"+datos[3].getNombre());
            System.out.println("id:"+datos[3].getId());
            System.out.println("Daño:"+datos[3].getDaño());
            System.out.println("Coste:"+datos[3].getCoste());
            System.out.println("Vida:"+datos[3].getVida());
            System.out.println("Hechizos:"+datos[3].getHechizo());
            System.out.println("------------");
            System.out.println("Nombre:"+datos[4].getNombre());
            System.out.println("id:"+datos[4].getId());
            System.out.println("Daño:"+datos[4].getDaño());
            System.out.println("Coste:"+datos[4].getCoste());
            System.out.println("Vida:"+datos[4].getVida());
            System.out.println("Hechizos:"+datos[4].getHechizo());
            System.out.println("------------");
            System.out.println("Nombre:"+datos[5].getNombre());
            System.out.println("id:"+datos[5].getId());
            System.out.println("Daño:"+datos[5].getDaño());
            System.out.println("Coste:"+datos[5].getCoste());
            System.out.println("Vida:"+datos[5].getVida());
            System.out.println("Hechizos:"+datos[5].getHechizo());
            System.out.println("------------");
            System.out.println("Nombre:"+datos[6].getNombre());
            System.out.println("id:"+datos[6].getId());
            System.out.println("Daño:"+datos[6].getDaño());
            System.out.println("Coste:"+datos[6].getCoste());
            System.out.println("Vida:"+datos[6].getVida());
            System.out.println("Hechizos:"+datos[6].getHechizo());
            System.out.println("------------");
            System.out.println("Nombre:"+datos[7].getNombre());
            System.out.println("id:"+datos[7].getId());
            System.out.println("Daño:"+datos[7].getDaño());
            System.out.println("Coste:"+datos[7].getCoste());
            System.out.println("Vida:"+datos[7].getVida());
            System.out.println("Hechizos:"+datos[7].getHechizo());
            System.out.println("------------");
            System.out.println("Nombre:"+datos[8].getNombre());
            System.out.println("id:"+datos[8].getId());
            System.out.println("Daño:"+datos[8].getDaño());
            System.out.println("Coste:"+datos[8].getCoste());
            System.out.println("Vida:"+datos[8].getVida());
            System.out.println("Hechizos:"+datos[8].getHechizo());
            System.out.println("------------");

            System.out.println("Nombre:"+datos[9].getNombre());
            System.out.println("id:"+datos[9].getId());
            System.out.println("Daño:"+datos[9].getDaño());
            System.out.println("Coste:"+datos[9].getCoste());
            System.out.println("Vida:"+datos[9].getVida());
            System.out.println("Hechizos:"+datos[9].getHechizo());
            System.out.println("------------");

            System.out.println("Nombre:"+datos[10].getNombre());
            System.out.println("id:"+datos[10].getId());
            System.out.println("Daño:"+datos[10].getDaño());
            System.out.println("Coste:"+datos[10].getCoste());
            System.out.println("Vida:"+datos[10].getVida());
            System.out.println("Hechizos:"+datos[10].getHechizo());
            System.out.println("------------");

            System.out.println("Nombre:"+datos[11].getNombre());
            System.out.println("id:"+datos[11].getId());
            System.out.println("Daño:"+datos[11].getDaño());
            System.out.println("Coste:"+datos[11].getCoste());
            System.out.println("Vida:"+datos[11].getVida());
            System.out.println("Hechizos:"+datos[11].getHechizo());
            System.out.println("------------");

            System.out.println("Nombre:"+datos[12].getNombre());
            System.out.println("id:"+datos[12].getId());
            System.out.println("Daño:"+datos[12].getDaño());
            System.out.println("Coste:"+datos[12].getCoste());
            System.out.println("Vida:"+datos[12].getVida());
            System.out.println("Hechizos:"+datos[12].getHechizo());
            System.out.println("------------");

            System.out.println("Nombre:"+datos[13].getNombre());
            System.out.println("id:"+datos[13].getId());
            System.out.println("Daño:"+datos[13].getDaño());
            System.out.println("Coste:"+datos[13].getCoste());
            System.out.println("Vida:"+datos[13].getVida());
            System.out.println("Hechizos:"+datos[13].getHechizo());
            System.out.println("------------");

            System.out.println("Nombre:"+datos[14].getNombre());
            System.out.println("id:"+datos[14].getId());
            System.out.println("Daño:"+datos[14].getDaño());
            System.out.println("Coste:"+datos[14].getCoste());
            System.out.println("Vida:"+datos[14].getVida());
            System.out.println("Hechizos:"+datos[14].getHechizo());
            System.out.println("------------");
            System.out.println("Nombre:"+datos[15].getNombre());
            System.out.println("id:"+datos[15].getId());
            System.out.println("Daño:"+datos[15].getDaño());
            System.out.println("Coste:"+datos[15].getCoste());
            System.out.println("Vida:"+datos[15].getVida());
            System.out.println("Hechizos:"+datos[15].getHechizo());
            System.out.println("------------");

            System.out.println("Nombre:"+datos[16].getNombre());
            System.out.println("id:"+datos[16].getId());
            System.out.println("Daño:"+datos[16].getDaño());
            System.out.println("Coste:"+datos[16].getCoste());
            System.out.println("Vida:"+datos[16].getVida());
            System.out.println("Hechizos:"+datos[16].getHechizo());
            System.out.println("------------");






        }catch (JsonParseException e){
            e.printStackTrace();
        }catch (JsonMappingException e){
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();

        }


    }
}
