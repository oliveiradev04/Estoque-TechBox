package EstoqueTechBox;

import java.util.Scanner;
import java.util.ArrayList;

public class Sistema {

    public static void mostrarMenu(ArrayList<Produto> estoqueProdutos, Scanner entrada) {
        boolean sairMenu = false;

        while(!sairMenu) {
            System.out.println("===================================");
            System.out.println("Selecione uma das opções abaixo:");
            System.out.println("1 - Cadastrar um produto para o estoque.");
            System.out.println("2 - Excluir um produto do estoque.");
            System.out.println("3 - Ver detalhes de um produto.");
            System.out.println("4 - Ver todos os produtos no estoque.");
            System.out.println("5 - Sair do menu.");
            System.out.print("Digite a opção desejada:");
            int opcao = entrada.nextInt();
            entrada.nextLine();


            switch (opcao) {
                case 1:
                Produto.adicionarEstoque(estoqueProdutos, entrada);
                    break;
            
                case 2:
                Estoque.removerEstoque(estoqueProdutos, entrada);
                    break;
                
                case 3:
                Estoque.detalharProduto(estoqueProdutos, entrada);
                    break;

                case 4:
                Estoque.listarProdutos(estoqueProdutos);
                    break;

                case 5:
                sairMenu = true;    
                    break;
                
                default:
                System.out.println("===================================");
                System.out.println("Opção inválida.");
            }
        }
        System.out.println("===================================");
        System.out.println("Obrigado pela sua atenção!");

    }
}
