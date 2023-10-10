package senac.java.Views;

import senac.java.Domain.Stores;
import senac.java.Domain.Users;

import java.util.Scanner;



public class Interface {
    static Scanner sc = new Scanner(System.in);
    static Users nome = new Users();
    static Users sobrenome = new Users();
    static  Users idade = new Users();
    static Users  endereco = new Users();
    static  Users emaill = new Users();
    static Users pasword = new Users();
    static Users cpff = new Users();


    static Stores pnome = new Stores();
    static Stores preco = new Stores();
    static Stores cor = new Stores();
    static Stores descricao = new Stores ();


    public static void main(String[] args){

        System.out.println("Bem-vindo a tela inicial!");
        System.out.println();

        System.out.println("Digite o seu nome: ");
        nome.name = sc.nextLine();

        System.out.println("Digite o seu sobrenome: ");
        sobrenome.lastName = sc.nextLine();

        System.out.println("Digite a sua idade: ");
        idade.age = sc.nextByte();

        System.out.println("Digite o seu endereço: ");
        endereco.address = sc.nextLine();

        System.out.println("Digite o seu e-mail: ");
        emaill.email = sc.nextLine();

        System.out.println("Digite a sua senha: ");
        pasword.password = sc.nextLine();

        System.out.println("Digite o seu CPF: ");
        cpff.cpf = sc.nextLine();













    }
}
