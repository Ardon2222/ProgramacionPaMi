package Trabajo;

import java.util.ArrayList;

public class Sumar_iguales {
    public static void main(String[] args) {
        int[] array = {4, 2, 3, 2, 4, 5, 3};
        ArrayList<Integer> valoresIguales = new ArrayList<>();
        boolean[] yaAgregado = new boolean[array.length];
        int suma=0;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j] && !yaAgregado[i] && !yaAgregado[j]) {
                    valoresIguales.add(array[i]); 
                    yaAgregado[i] = true;
                    yaAgregado[j] = true;
                }
            }
        }

        // Convertir la lista a un array
        for (int i = 0; i < valoresIguales.size(); i++) {
            suma+=valoresIguales.get(i);
        }
        System.out.println(suma);
    }
}