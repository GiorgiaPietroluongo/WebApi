package senac.java.Views;
import senac.java.Domain.Salesperson;
import senac.java.Domain.Users;
import senac.java.Services.Decisoes;
import senac.java.Services.Roteamento;
import java.util.Scanner;


public class Telas {
    static Scanner sc = new Scanner(System.in);
    public static void telaInicial(){

        Users users = new Users();

        Decisoes decisao = new Decisoes();
        String userInput = "";

        int escolhaInput = 0;


        Roteamento rotas = new Roteamento();
        System.out.println("Bem vindo ao programa de cadastros");
        System.out.println();

        System.out.println("Selecione a opção desejada:");
        System.out.println(" ");
        System.out.println("1. Cadastro Vendedor");
        System.out.println("2. Cadastro Cliente");
        System.out.println("3. Cadastrar Produto");
        System.out.println("4. Sair");
        escolhaInput = Integer.parseInt(sc.nextLine());

        rotas.rotas(escolhaInput);





    }
    public static void Imprimir(String telaOrigem){
        Users users = new Users();

        Salesperson salesPersons = new Salesperson();
        Decisoes decisao = new Decisoes();
        String userInput = "";

        System.out.println("valores Informados:");

        if(telaOrigem == "Vendedor") {
            System.out.println("Os dados de vendedor digitados foram:");
            System.out.println("Nome: " + salesPersons.name);
            System.out.println("Sobrenome: " + salesPersons.lastName);
            System.out.println("Telefone: " + salesPersons.cpf);
            System.out.println("CPF: " + salesPersons.cpf);
            System.out.println("E-mail" +salesPersons.email);
            System.out.println("Endereço: " + salesPersons.address);


        }else if(telaOrigem == "Cliente"){
            System.out.println("Os dados de clientes digitados foram:");
            System.out.println("Nome: " + users.name);
            System.out.println("Sobrenome: " + users.lastName);
            System.out.println("Idade: " + users.age);
            System.out.println("Endereço: " + users.address);
            System.out.println("E-mail" + users.email);
            System.out.println("Senha: " + users.id);
            System.out.println("CPF: " + users.cpf);
        }
        System.out.println("Voce quer continuar efetuando novos cadastros?");
        System.out.println("Digite S para sim, N para voltar a tela iniacal ou S para fechar a aplicação.");
        userInput = sc.nextLine();


            decisao.escolhaUsuario(userInput, telaOrigem);
//         userInput = sc.nextLine();
//         Decisoes.escolhaUsiario();

    }

}
