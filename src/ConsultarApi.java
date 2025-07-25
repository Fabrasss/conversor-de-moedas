import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarApi {
    public Endereco buscarCotacao(String base_code, String target_code, double amount) throws IOException, InterruptedException {
        Gson gson = new Gson();
        HttpClient client = HttpClient.newHttpClient();

        URI uri = URI.create("https://v6.exchangerate-api.com/v6/23d512c8214dceee01b4a5de/pair/" + base_code+ "/" + target_code + "/" + amount);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(uri)
                .GET()
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();

            return gson.fromJson(json, Endereco.class);

        } catch (Exception e) {
            throw new RuntimeException("Erro ao buscar cotação", e);
        }
    }
}
