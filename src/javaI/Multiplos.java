package javaI;

import java.util.Scanner;

public class Multiplos {

    public static void main(String[] args) {

        /*Desenvolva um programa para mostrar os primeiros n números múltiplos de m, sendo n e
        m valores que o usuário irá inserir via console.*/

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int primeiroNumero = scan.nextInt();

        System.out.println("Digite outro número: ");
        int segundoNumero = scan.nextInt();


        for(primeiroNumero = 0; primeiroNumero <= segundoNumero; primeiroNumero++) {
            if(primeiroNumero % segundoNumero == 0) {
                System.out.println(primeiroNumero);
            }
        }
    }
}
