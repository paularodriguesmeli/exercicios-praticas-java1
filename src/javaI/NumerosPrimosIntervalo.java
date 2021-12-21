package javaI;

import java.util.Scanner;

public class NumerosPrimosIntervalo {

    public static boolean ePrimo(int numero) {
        for(int i = 2; i < numero; i++) {
            if(numero % i == 0) {
                return false;
            }
        }
        return  true;
    }

    public static void main(String[] args) {

        /*Desenvolva um programa para mostrar no console os primeiros n números primos entre 1
        e m, sendo m um valor que o usuário irá inserir pelo console.*/

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numeroFinal = scan.nextInt();

        for(int i = 2; i <= numeroFinal; i++) {
            if(ePrimo(i)) {
                System.out.println(i + " é um número primo.");
            }
        }

    }
}
