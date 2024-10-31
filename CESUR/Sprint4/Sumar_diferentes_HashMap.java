package Trabajo;

import java.util.ArrayList;
import java.util.HashMap;

public class Sumar_diferentes_HashMap {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5, 3}; 
        HashMap<Integer, Integer> contador = new HashMap<>();
        ArrayList<Integer> valoresUnicos = new ArrayList<>();
        int suma=0;


        // Agregar valores al HashMap
        for (int i = 0; i < arr.length; i++) {
            contador.put(arr[i], contador.getOrDefault(arr[i], 0) + 1);
        }
        
        // Agregar a la lista "valoresUnicos" solo los que aparecen una vez
        for (int i = 0; i < arr.length; i++) {
            if (contador.get(arr[i]) == 1) {
                valoresUnicos.add(arr[i]);
            }
        }
        
        // Sumar
        System.out.println("Valores únicos encontrados: ");
        for (int i = 0; i < valoresUnicos.size(); i++) {
            suma+=valoresUnicos.get(i);
        }
        System.out.println(suma); 
    }
}