package Tarea6;

import java.util.ArrayList;

public class Booleanos {
    public static void main(String[] args) throws Exception {
        ArrayList<Boolean> booleanos = new ArrayList<>();
        booleanos.add(true);
        booleanos.add(false);
        System.out.println("primer dato: " + booleanos.get(0));
        booleanos.add(true);
        for(boolean booleano : booleanos){
            System.out.println(booleano);
        }
        System.out.println("Total: " + booleanos.size());
    }
}