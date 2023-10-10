package senac.java.Views;
import senac.java.Domain.Products;
import senac.java.Domain.Salesperson;
import senac.java.Domain.Users;
import java.util.Scanner;

public class TelaCadastro {
    Telas telas = new Telas();




        public static void cadastrarVendedor(){
             Scanner scanner = new Scanner(System.in);
             Telas telas = new Telas();
            System.out.println("Cadastro de Vendedores ");
            Salesperson person = new Salesperson();

            System.out.print("Nome: ");
            person.name = scanner.nextLine();

            System.out.print("Sobrenome: ");
            person.lastName = scanner.nextLine();

            System.out.println("Numero: ");
            person.phoneNumber = Integer.parseInt(scanner.nextLine());

            System.out.println("CPF: ");
            person.cpf = scanner.nextLine();

            System.out.println("E-mail: ");
            person.email = scanner.nextLine();

            System.out.println("Endereço: ");
            person.address = scanner.nextLine();

            telas.Imprimir("Vendedor");
        }
        public static void cadastroCliente(){
            System.out.println("Cadastro de Clientes ");
            Users users = new Users();
            Scanner scanner = new Scanner(System.in);
            Telas telas = new Telas();

            System.out.print("Nome: ");
            users.name = scanner.nextLine();

            System.out.print("Sobrenome: ");
            users.lastName = scanner.nextLine();

            System.out.print("Telefone: ");
            users.phoneNumber = Integer.parseInt(scanner.nextLine());

            System.out.print("idade: ");
            users.age = Integer.parseInt(scanner.nextLine());

            System.out.print("CPF: ");
            users.cpf = Integer.parseInt(scanner.nextLine());

            System.out.print("Emai-l: ");
            users.email = scanner.nextLine();

            System.out.print("Endereço: ");
            users.address = scanner.nextLine();
            telas.Imprimir("Cliente");

        }
        public static void cadastrarProduto(){
            System.out.println("Cadastro de Produtos ");
            Products products = new Products();
            Scanner scanner = new Scanner(System.in);
            Telas telas = new Telas();

            System.out.print("Nome: ");
            products.pName = scanner.nextLine();

            System.out.print("...: ");
            products.pPrice = scanner.nextLine();

            System.out.print("Cor: ");
            products.pColor = scanner.nextLine();

            System.out.print("Descrição: ");
            products.PDescription = scanner.nextLine();

            System.out.print("Quantidade: ");
            products.pQuantity = Integer.parseInt(scanner.nextLine());
//        products.img

//            telas.Imprimir(3);
        }
}
