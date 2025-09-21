package EstoqueTechBox;

import java.util.Scanner;
import java.util.ArrayList;

public class Usuario {

    private String nome;
    private String email;
    private String senha;

    public Usuario() {

    }

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public static void cadastrarUsuario(ArrayList<Usuario> listaUsuarios, Scanner entrada) {

        System.out.println("===================================");
        System.out.print("Digite seu nome completo: ");
        String nome = entrada.nextLine();

        System.out.print("Digite seu email: ");
        String email = entrada.nextLine();

        System.out.print("Digite sua senha: ");
        String senha = entrada.nextLine();
  
        boolean emailEncontrado = false;
        
        for (Usuario u : listaUsuarios) {
            if (u.getEmail().equals(email)) {
                System.out.println("===================================");
                System.out.println("Este endereço de email já possui cadastro.");
                emailEncontrado = true;
                break;
            } 
        }

        if ((!emailEncontrado) && (email.endsWith("techbox.com.br"))) {
            Usuario novoUsuario = new Usuario(nome, email, senha);
            listaUsuarios.add(novoUsuario);
            System.out.println("===================================");
            System.out.println("Usuário cadastrado com sucesso!");

        } else if (!email.endsWith("techbox.com.br")) {
            System.out.println("===================================");
            System.out.println("Endereço de email inválido. Tente novamente.");
        }

    }

    public static void logarUsuario(ArrayList<Usuario> listaUsuarios, ArrayList<Produto> estoqueProdutos, Scanner entrada) {

        System.out.println("===================================");
        System.out.print("Digite seu email: ");
        String email = entrada.nextLine();

        System.out.print("Digite sua senha: ");
        String senha = entrada.nextLine();

        boolean usuarioEncontrado = false;

        for (Usuario u : listaUsuarios) {
            if (u.getEmail().equals(email) && (u.senha.equals(senha))) {
                System.out.println("===================================");
                System.out.println("Login realizado com sucesso! Seja bem-vindo, " + u.getNome() + "!");
                Sistema.mostrarMenu(estoqueProdutos, entrada); 
                usuarioEncontrado = true;
                break; 
            } 
        }

        if (!usuarioEncontrado) {
            System.out.println("===================================");
            System.out.println("Erro! Email ou senha inválidos.");
        }

    }
}
