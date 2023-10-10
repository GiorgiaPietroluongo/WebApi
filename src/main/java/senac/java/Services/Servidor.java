package senac.java.Services;

import java.io.IOException;

import java.net.InetSocketAddress;

import senac.java.Domain.Users;
import com.sun.net.httpserver.HttpServer;
import senac.java.Controllers.UserController;
import senac.java.Controllers.SalesPersonController;
import senac.java.Controllers.ProductsController;


public class Servidor {

    //HttpExchange ex; = classe abstratata
    //static HttpExchange ex;

    public  void apiServer() throws IOException {
        Users users = new Users();



        // classe abstratas se auto inicializam criando ele na classe
        // não precisa inicalizar quando é criada no parametro de uma função ou no parametro de uma classe, caso contrário tem q inicializar

        // quem faz a troca de dados entre o back e o front é o httptserver

        // httptServer é um tipo de uma classe
        // ele criou um método e deixou a gente escolhar a porta é  o HTTPExchange
        // quem faz a habilitação é o Inet
        HttpServer server = HttpServer.create(new InetSocketAddress(3000),
                0);

//        path = ex.getRequestURI().getPath();
//        System.out.println("O caminho do navegador foi:" + path);


//        urlPath=  exchange.getRequestURI();


        //URI é composto da URL mais o endpoint = /api/teste

        //URL é o camninho que a gente digita no navegador
//        HttpServer url = HttpServer.create(new InetSocketAddress(3000))

        //eu sei qye eu preciso instanciar antes do server o HttptExchange ex = new HttptExchange(){}, dentro dessa biblioteca eu tenho os métodos que vão aparecer
        //  HttptExchange ex = new HttptExchange(); ,ele vai dar um erro que ela é abstratata e a gente não pode instanciar
        // classe abstratata = não é uma classe normal, as classes que a gente cria possuem parametro e metodo, esse classe pode conter, mas o que tem lá dentro é como se fosse um monte de vazio
        // ou seja, hhtpexchange as coisas que estão pré feitas como um placeholder, que são coisas temporárias para depois trocar
        // classe abstrara também pode ser chamanda no java e c# de  = interface
        //interface = para tipar métodos pré criados
        //porque?


        //Createcontent cria a rota e o contexto
        // o priemiro parâmetro vai até a ,
        // o segundo parâmetro é o que a gente vai enviar na  internet = httpExchange exchange

        // Servidor::chamar = estamos forçando um método que possui como parâmentro uma classe abstrata abstrata a iniciar
        //server.createContext("/api/usuario", Servidor::chamar);

             server.createContext("/api/usuario", new UserController.UserHandler());
             server.createContext("/api/vendedor", new SalesPersonController.SalesPersonHandler());
             server.createContext("/api/produtos", new ProductsController.ProductsHandler());




        // deixa nulo para ser tudo padrão (ele joga tudo para default)
        server.setExecutor(null);

        // ele vai ficar ouvindo o que a pessoa vai digitar, se ela está mandando algum dado..
        server.start();
        System.out.println("Servidor iniciado;");

    }

//    private static HttpHandler chamar() {
//    }

    // isso é um método
//    public static void chamar(HttpExchange exchange) throws IOException{


    // override = criar o método de novo e forçar a criação da permissão
//    public static void enviarResponse(HttpExchange exchange, String response) throws IOException {
//        if ("GET".equals(exchange.getRequestMethod())) {
//            exchange.sendResponseHeaders(200, response.getBytes().length);
//
//            OutputStream os = exchange.getResponseBody();
//            os.write(response.getBytes());
//            os.close();
//
//
//        }
//
//    }
    // implements você criar para modificar uma outra classe
//    class UserHandler implements HttpHandler {
//
//        //1 passo = criar o método de novo e forçar a criação da permissão
//        // 2 passo =
//        @Override
//        public void handle(HttpExchange exchange) throws IOException {
//            String response = "Essa e a rota de usuario";
//            enviarResponse(exchange, response);
//        }
//    }

//    class SalesPersonHandler implements HttpHandler {
//        @Override
//        public void handle(HttpExchange exchange) throws IOException{
//            String response = "Essa é a rota de vendedor";
//            enviarResponse(exchange, response);
//        }
//    }

//    class ProductsHandler implements HttpHandler {
//        @Override
//        public void handle(HttpExchange exchange) throws IOException{
//            String response ="Essa é a rota de produtos";
//            enviarResponse(exchange, response);
//        }
//    }

}



