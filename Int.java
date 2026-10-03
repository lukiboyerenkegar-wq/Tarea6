package Tarea6;

import java.util.ArrayList;

public class Int {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(8);
        numeros.add(11);
        System.out.println("Primer numero: " + numeros.get(0));
        numeros.set(1, 5);
        for(Integer numero : numeros){
            System.out.println(numero);
        }
        System.out.println("Total: " + numeros.size());
    }
}
