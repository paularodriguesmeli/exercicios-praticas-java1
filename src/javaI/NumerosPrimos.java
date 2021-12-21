package javaI;

import java.util.Scanner;

public class NumerosPrimos {

    public static boolean ePrimo(int numero) {
        for(int i = 2; i < numero; i++) {
            if(numero % i == 0) {
                return false;
            }
        }
        return  true;
    }

    public static void main(String[] args) {

        /*Desenvolva um programa para informar se um um número n é primo ou não, sendo n um
        valor que o usuário irá inserir pelo console.*/

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número para saber se ele é primo ou não: ");
        int numeroPrimo = scan.nextInt();

        if(ePrimo(numeroPrimo)) {
            System.out.println("Esse número é primo.");
        } else {
            System.out.println("Esse número não é primo.");
        }




    }
}
