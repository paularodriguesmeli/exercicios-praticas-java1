package javaI.supermercado;

import java.util.ArrayList;
import java.util.List;

public class Programa {
    public static void main(String[] args) {

        Produto produto1 = new Produto();
        produto1.setNomeProduto("Arroz");
        produto1.setPrecoProduto(10.99);
        produto1.setQtdeProduto(4);

        Produto produto2 = new Produto();
        produto2.setNomeProduto("Feijão");
        produto2.setPrecoProduto(14.49);
        produto2.setQtdeProduto(2);

        Produto produto3 = new Produto();
        produto3.setNomeProduto("Tomate");
        produto3.setPrecoProduto(9.99);
        produto3.setQtdeProduto(3);

        List<Produto> listaProdutos = new ArrayList<Produto>();
        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        listaProdutos.add(produto3);

        double total = 0.0;
        double totalItem = 0.0;

        System.out.println("Produtos da lista de compras:\n");
        for (Produto p: listaProdutos) {
            totalItem = p.calculaPrecoItem(p.getPrecoProduto(), p.getQtdeProduto());
            total += totalItem;
            System.out.println(p);
            System.out.println("Total do item: R$ " + totalItem + "\n");

        }

        System.out.println("\nTotal da compra: R$ " + total);


    }
}
