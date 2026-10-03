package Tarea6;

import java.util.ArrayList;
import java.util.Collections;

public class Ordenar {
    public static void main(String[] args) throws Exception {
        ArrayList<String> nombres = new ArrayList<String>();
        nombres.add("Leo");
        nombres.add("Josue");
        nombres.add("Cesia");
        System.out.println("Primer nombre: " + nombres.get(0));
        nombres.set(0, "Lucio");
        Collections.sort(nombres);
        for(String nombre : nombres){
            System.out.println(nombre);
        }
        System.out.println("Total: " + nombres.size());
    }
}
