## 🖥️ Sistema de Estoque de Periféricos para Com – EstoqueTechBox

## 📄 Visão Geral
Este projeto é um sistema simples de controle de estoque de periféricos gamers para uma empresa fictícia chamada: TechBox. Permite cadastrar produtos, listar, detalhar informações e remover itens do estoque. Foi desenvolvido em Java utilizando conceitos básicos de programação orientada a objetos.

## 🚀 Funcionalidades
- Cadastro e login de usuário com endereço de email profissional da empresa obrigatório no domínio `@techbox.com.br` antes de acessar o menu principal
- Cadastro de novos produtos (nome, preço e quantidade)
- Listagem de todos os produtos
- Detalhamento de um produto específico
- Remoção total ou parcial de produtos do estoque


## 🗂️ Estrutura do Projeto
```
src/
├── EstoqueTechBox/
│   ├── Usuario.java  (classe que representa um usuário com email/senha)
│   ├── Produto.java  (classe que representa um produto)
│   ├── Estoque.java  (classe com métodos para gerenciar o estoque)
│   ├── Sistema.java  (classe responsável pelo menu)
│   └── Main.java     (classe principal com fluxo de cadastro/login e chamada do Sistema)
```

## 🛠️ Tecnologias Utilizadas
- Java 
- IDE: VSCode (Visual Studio Code)
- Uso de `ArrayList` e `Scanner` para armazenamento e entrada de dados

## 📋 Como Usar
1. Compile todas as classes.
2. Execute a classe `Main.java`.
3. O sistema solicitará:
   - Cadastro de um usuário com email no domínio `@techbox.com.br` e senha.
   - Login com o mesmo email e senha.
4. Após login bem-sucedido, o menu será exibido:
   - 1 para cadastrar produto
   - 2 para excluir produto
   - 3 para detalhar produto
   - 4 para listar todos os produtos
   - 5 para sair do menu

## 💡 Exemplo de Uso
```
Digite seu nome completo: Allan
Digite seu email: Allan@techbox.com.br
Digite sua senha: ****
Cadastro realizado com sucesso!

Digite seu email para login: Allan@techbox.com.br
Digite sua senha: ****
Login bem-sucedido!

==== Menu Estoque ====
1 - Cadastrar produto
2 - Listar produtos
3 - Detalhar produto
4 - Remover produto
5 - Sair do programa
```

## 👤 Autor
- **Demétrius Oliveira**
- Estudante de Análise e Desenvolvimento de Sistemas
