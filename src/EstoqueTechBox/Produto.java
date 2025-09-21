package EstoqueTechBox;

import java.util.Scanner;
import java.util.ArrayList;

public class Produto {
    private String produto;
    private float preco;
    private int quantidade;

    public Produto() {

    }

    public Produto(String produto, float preco, int quantidade) {
        this.produto = produto;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public static void adicionarEstoque(ArrayList<Produto> estoqueProdutos, Scanner entrada) {

        System.out.println("===================================");
        System.out.print("Digite o nome do produto:");
        String produto = entrada.nextLine();

        System.out.print("Digite o preco do produto:");
        float preco = entrada.nextFloat();

        System.out.print("Digite a quantidade do produto: ");
        int quantidade = entrada.nextInt();

        Produto novoProduto = new Produto (produto, preco, quantidade);
        estoqueProdutos.add(novoProduto);

        System.out.println("===================================");
        System.out.println("Produto adicionado com sucesso!");

    }
}
