package EstoqueTechBox;

import java.util.ArrayList;
import java.util.Scanner;

public class Estoque {

    public static void removerEstoque(ArrayList<Produto> estoqueProdutos, Scanner entrada) {
        for (Produto p : estoqueProdutos) {
            System.out.println(p.getProduto() + " - Quantidade: " + p.getQuantidade());
        }

        System.out.println("===================================");
        System.out.print("Produto a remover: ");
        String nome = entrada.nextLine();

        System.out.println("===================================");
        System.out.print("Quantidade a remover: ");
        int quantidade = entrada.nextInt();
        entrada.nextLine(); 

        for (int i = 0; i < estoqueProdutos.size(); i++) {
            Produto p = estoqueProdutos.get(i);
            if (p.getProduto().equalsIgnoreCase(nome)) {
                if (quantidade >= p.getQuantidade()) {
                    estoqueProdutos.remove(i); 
                    System.out.println("===================================");
                    System.out.println("Produto removido.");
                } else {
                    p.setQuantidade(p.getQuantidade() - quantidade); 
                    System.out.println("===================================");
                    System.out.println("Quantidade atualizada.");
                }
                return; 
            }
        }
        System.out.println("===================================");
        System.out.println("Produto não encontrado.");
    }

    public static void detalharProduto(ArrayList<Produto> estoqueProdutos, Scanner entrada) {
        for (Produto p : estoqueProdutos) {
            System.out.println(p.getProduto());
        }

        System.out.println("===================================");
        System.out.print("Produto para detalhar: ");
        String nome = entrada.nextLine();

        for (Produto p : estoqueProdutos) {
            System.out.println("===================================");
            if (p.getProduto().equalsIgnoreCase(nome)) {
                System.out.println("Nome: " + p.getProduto());
                System.out.println("Preço: " + p.getPreco());
                System.out.println("Quantidade: " + p.getQuantidade());
                return;
            }
        }
        System.out.println("===================================");
        System.out.println("Produto não encontrado.");
    }

    public static void listarProdutos(ArrayList<Produto> estoqueProdutos) {
        System.out.println("===================================");
        for (Produto p : estoqueProdutos) {
            System.out.println(p.getProduto() + " | Preço: " + p.getPreco() + " | Quantidade | " + p.getQuantidade());
        }
    }
}