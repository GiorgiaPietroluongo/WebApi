package senac.java.Controllers;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import senac.java.Services.ResponseEndPoints;
import org.json.JSONObject;
import java.io.IOException;

public class ProductsController {

    static ResponseEndPoints res = new ResponseEndPoints();
    public static class ProductsHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            String response = "";

            if("GET".equals(exchange.getRequestMethod())){
                response = "Essa é a rota de produto - GET";
                res. enviarResponse(exchange, response);
            }else if ("POST".equals(exchange.getRequestMethod())){
                response = "Essa é a rota de produto - POST";
                res. enviarResponse(exchange, response);
            } else if ("PUT".equals(exchange.getRequestMethod())) {
                response = "Essa é a rota de produto - PUT";
                res. enviarResponse(exchange, response);
            } else if ("DELETE".equals(exchange.getRequestMethod())) {
                response = "Essa é a rota de produto - DELETE";
                res. enviarResponse(exchange, response);
            }else {
                response = "Rota produtos - ERRO!" +
                        " O metodo utilizado foi: " + exchange.getRequestMethod();;
                res. enviarResponse(exchange, response);
            }
        }
    }
}
