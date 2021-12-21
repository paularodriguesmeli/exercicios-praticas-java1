package javaI;

import java.util.Arrays;
import java.util.Collections;

public class ArrayOrdenacao {

    public static void main(String[] args) {

        Integer[] numeros = {52, 10, 85, 1324, 01, 13, 62, 30, 12, 127};

        // ordenando o array em ordem crescente
        Arrays.sort(numeros);
        System.out.println("Vetor em ordem crescente: ");
        System.out.println(Arrays.toString(numeros));

        // ordenando o array em ordem decrescente
        // O método reverseOrder() inverte a ordem de um vetor já ordenado
        Arrays.sort(numeros, Collections.reverseOrder());
        System.out.println("Vetor em ordem decrescente: ");
        System.out.println(Arrays.toString(numeros));
    }
}
