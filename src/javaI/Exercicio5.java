package javaI;

import java.util.ArrayList;
import java.util.Scanner;
/*Desenvolver um programa para exibição por console os n primeiros números naturais que
        têm pelo menos m dígitos de d, sendo n, m e d valores que o utilizador vai informar pelo
        console.
                Por exemplo: se o usuário inserir n = 5, m = 2 e d = 3, o programa deve exibir os primeiros 5
        números naturais que tenham pelo menos 2 dígitos terminados em 3 no console. Neste
        caso, a saída será: 33, 133 , 233, 303, 313.
        Dependendo de como você decidir abordar a solução para este exercício, pode ser
        necessário usar recursos que ainda não estudamos. Faz parte do desafio encontrar
        soluções na Internet e utilizá-las.*/

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número");
        int n = scan.nextInt();

        System.out.println("Digite a quantidade de algarismos: ");
        int m = scan.nextInt();

        System.out.println("Digite o final do número: ");
        int d = scan.nextInt();

        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(n);
        numeros.add(m);
        numeros.add(d);

        System.out.println(numeros);

    }


}

