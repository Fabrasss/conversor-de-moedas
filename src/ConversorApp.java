import java.io.IOException;


import java.util.*;

public class ConversorApp {
    private static final Map<Integer, String> moedas = Map.of(
            1, "ARS", // Peso argentino
            2, "BOB", // Boliviano boliviano
            3, "BRL", // Real brasileiro
            4, "CLP", // Peso chileno
            5, "COP", // Peso colombiano
            6, "USD"  // Dólar americano
    );

    public void iniciar() throws IOException, InterruptedException {
        Scanner teclado = new Scanner(System.in);
        System.out.println("===================================");
        System.out.println("Bem-vindo ao Conversor de Moeda");
        System.out.println("===================================");

        System.out.println("Moedas disponíveis:");
        for (Map.Entry<Integer, String> entrada : moedas.entrySet()) {
            System.out.printf("%d) %s%n", entrada.getKey(), entrada.getValue());
        }

        System.out.print("\nEscolha a moeda de ORIGEM (número): ");
        int origemEscolhida = teclado.nextInt();
        System.out.print("Escolha a moeda de DESTINO (número): ");
        int destinoEscolhido = teclado.nextInt();

        if (!moedas.containsKey(origemEscolhida) || !moedas.containsKey(destinoEscolhido)) {
            System.out.println("Opção inválida de moeda.");
            return;
        }

        String moedaOrigem = moedas.get(origemEscolhida);
        String moedaDestino = moedas.get(destinoEscolhido);

        System.out.printf("Digite o valor em %s para converter: ", moedaOrigem);
        double valor = teclado.nextDouble();

        ConsultarApi consultar = new ConsultarApi();
        Endereco cotacao = consultar.buscarCotacao(moedaOrigem, moedaDestino, valor);

        System.out.println("===================================");
        System.out.printf("Valor em %s: %.2f%n", moedaOrigem, valor);
        System.out.printf("Convertido para %s: %.2f%n", moedaDestino, cotacao.conversion_result());
        System.out.println("===================================");
    }
    
}
