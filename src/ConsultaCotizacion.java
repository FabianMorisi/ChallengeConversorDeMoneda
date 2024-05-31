import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaCotizacion {

    public Cotizacion buscaCotizacion(int cantidad, String monedaBase, String monedaDestino){

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/5697ac2609ccdf343f2b2fd4/pair/"
                +monedaBase+"/"+monedaDestino+"/"+cantidad+"/");

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();


        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Cotizacion.class);

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }


    }


}
