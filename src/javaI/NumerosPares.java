package javaI;

import java.util.Scanner;

public class NumerosPares {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numeroFinal;
        System.out.println("Digite um número: ");
        numeroFinal = scan.nextInt();


        for(int i = 0; i <= numeroFinal; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }
}

