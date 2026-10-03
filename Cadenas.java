package Tarea6;

import java.util.ArrayList;

public class Cadenas {
    public static void main(String[] args) throws Exception {
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Leo");
        nombres.add("Luis");
        nombres.add("Josue");
        System.out.println("Primer nombre: " + nombres.get(0));
        nombres.set(0, "Jorge");
        for(String nombre : nombres){
            System.out.println(nombre);
        }
        System.out.println("Total: " + nombres.size());
    }
}
