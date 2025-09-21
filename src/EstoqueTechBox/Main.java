package EstoqueTechBox;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();
        ArrayList<Produto> estoqueProdutos = new ArrayList<>();
        
        while(true) {
            System.out.println("===================================");
            System.out.println(" Bem-vindo ao Sistema de Controle");
            System.out.println("    de Estoque de Periféricos");
            System.out.println("      para Gamers TechBox!");
            System.out.println("===================================");
            
            System.out.print("Deseja fazer login? (s/n)");
            String resposta = entrada.nextLine().trim().toLowerCase();

            if (resposta.equals("s")) {

            Usuario.logarUsuario(listaUsuarios, estoqueProdutos, entrada);
                
            } else if (resposta.equals("n")) {
                System.out.println("===================================");
                System.out.print("Deseja fazer cadastro? (s/n)");
                String resposta2 = entrada.nextLine().trim().toLowerCase();

                if (resposta2.equals("s")) {
                    Usuario.cadastrarUsuario(listaUsuarios, entrada);
                } else {
                    System.out.println("==================================="); 
                    System.out.println("Obrigado pela sua atenção!");
                }

            } else {
                System.out.println("===================================");
                System.out.println("Resposta inválida. Por favor, digite 's' ou 'n'.");
            }

        }
    }
}