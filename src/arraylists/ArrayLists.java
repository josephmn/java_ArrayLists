
package arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {

    public static void main(String[] args) {
        
        List<Persona> lista = new ArrayList<Persona>();
        
        lista.add(new Persona(1, "Luisina", 30));
        lista.add(new Persona(2, "Gabriel", 30));
        lista.add(new Persona(3, "Ibra", 9));
        lista.add(new Persona(4, "TodoCode", 2));
        
        // como recorrer las listas?
        
        System.out.println("------------------ FOR ------------------");
        // 1. recorrer por indice
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("prueba: " + lista.get(i).getNombre());
        }
        System.out.println("---------------- FOREACH ----------------");
        // 2. recorrer elementos (por cada uno) -> foreach
        for (Persona persona : lista) {
            System.out.println("prueba: " + persona.getNombre());
        }
        
    }
    
}
