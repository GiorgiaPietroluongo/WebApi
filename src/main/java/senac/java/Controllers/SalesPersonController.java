package senac.java.Controllers;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import senac.java.Services.ResponseEndPoints;
import org.json.JSONObject;
import java.io.IOException;

public class SalesPersonController {
    static ResponseEndPoints res = new ResponseEndPoints();

    public static class SalesPersonHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            String response = "";
            JSONObject ris = new JSONObject();

            ris.put("Minha chave1", "Valor1");
            ris.put("Minha chave2",5478);

            if ("GET".equals(exchange.getRequestMethod())) {
                response = "Essa é a rota de vendedor - GET";
//                res.enviarResponse(exchange, response);
                res.enviarResponseJson(exchange,ris);
            } else if ("POST".equals(exchange.getRequestMethod())) {
                response = "Essa é a rota de vendedor - POST";
                res.enviarResponseJson(exchange,ris);
            } else if ("PUT".equals(exchange.getRequestMethod())) {
                response = "Essa é a rota de vendedor - PUT";
                res.enviarResponseJson(exchange,ris);
            } else if ("DELETE".equals(exchange.getRequestMethod())) {
                response = "Essa é a rota de vendedor - DELETE";
                res.enviarResponseJson(exchange,ris);
            } else {
                response = "Rota vendedor - ERRO!" +
                        " O metodo utilizado foi: " + exchange.getRequestMethod();
                res.enviarResponse(exchange, response);
            }
        }
    }
}
