import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws IOException, InterruptedException {
//        Scanner teclado = new Scanner(System.in);
//        System.out.println("===================================");
//        System.out.println("Bem-vindo ao Conversor de Moeda");
//
//
//        System.out.println("1) Dolar =>> Real brasileiro");
//        System.out.println("digite o valor para converter");
//        double valor = teclado.nextDouble();
//        ConsultarApi consultar = new ConsultarApi();
//        Endereco cotacao = consultar.buscarCotacao("USD", "BRL", valor);
//        System.out.println("O valor inserido [USD]: "+ valor + " Sera convertido em: [BRL] " + cotacao.conversion_result());

    new ConversorApp().iniciar();












    }
}
