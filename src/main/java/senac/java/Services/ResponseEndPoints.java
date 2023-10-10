package senac.java.Services;

import com.sun.net.httpserver.HttpExchange;
import org.json.JSONObject;

import java.io.IOException;
import java.io.OutputStream;

public class ResponseEndPoints {
    public static void enviarResponse(HttpExchange exchange, String response) throws IOException {
//        if ("POST".equals(exchange.getRequestMethod())) {
//            exchange.sendResponseHeaders(200, response.getBytes().length);
//
//            OutputStream os = exchange.getResponseBody();
//            os.write(response.getBytes());
//            os.close();
//
//
//        }else if ("GET".equals(exchange.getRequestMethod())){
//            exchange.sendResponseHeaders(200, response.getBytes().length);
//
//            OutputStream os = exchange.getResponseBody();
//            os.write(response.getBytes());
//            os.close();
//        } else if ("PUT".equals(exchange.getRequestMethod())) {
//            exchange.sendResponseHeaders(200, response.getBytes().length);
//
//            OutputStream os = exchange.getResponseBody();
//            os.write(response.getBytes());
//            os.close();
//        }else if ("DELETE".equals(exchange.getRequestMethod())){
//            exchange.sendResponseHeaders(200, response.getBytes().length);
//
//        OutputStream os = exchange.getResponseBody();
//        os.write(response.getBytes());
//        os.close();
//    }else {
//            exchange.sendResponseHeaders(200, response.getBytes().length);
//
//            OutputStream os = exchange.getResponseBody();
//            os.write(response.getBytes());
//            os.close();
//       }

        exchange.sendResponseHeaders(200, response.getBytes().length);

        OutputStream os = exchange.getResponseBody();
        os.write(response.getBytes());
        os.close();
    }

    public static void enviarResponseJson(HttpExchange exchange, JSONObject response) throws IOException{
       exchange.getResponseHeaders().set("Content-Type","application/json");
        byte[] responseBytes = response.toString().getBytes("UTF-8");

        exchange.sendResponseHeaders(200, responseBytes.length);
        OutputStream os = exchange.getResponseBody();
        os.write(responseBytes);
        os.close();
    }
}
