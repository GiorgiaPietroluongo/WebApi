package senac.java;
import senac.java.Services.Servidor;
import senac.java.Views.Telas;



//import com.sun.net.httpserver.HttpServer;
//import com.sun.net.httpserver.HttpHandler;
//import com.sun.net.httpserver.HttpExchange;
//
import java.io.IOException;
//import java.io.OutputStream;
//import java.net.InetSocketAddress;


public class Main {
    public static void main(String[] args) throws IOException {
        Servidor servidor = new Servidor();
        Telas telas = new Telas();

           servidor.apiServer();
            telas.telaInicial();


    }
}