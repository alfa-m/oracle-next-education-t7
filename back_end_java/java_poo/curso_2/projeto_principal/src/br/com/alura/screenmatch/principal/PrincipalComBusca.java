package br.com.alura.screenmatch.principal;

//import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.excecoes.ErroConversaoAnoException;
import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import io.github.cdimascio.dotenv.Dotenv;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leTeclado = new Scanner(System.in);
        String tituloUsuario = "";
        Dotenv dotenv = Dotenv.load();
        String apiKey = dotenv.get("OMDB_API_KEY");
        List<Titulo> titulos = new ArrayList<>();

        //Gson gson = new Gson();
        Gson gsonOmdb = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        System.out.println("Bem-vindo à sessão de busca do ScreeMatch");
        System.out.println("Digite o nome de um filme para fazer a busca ou 'Sair' para finalizar a busca");

        while(!tituloUsuario.equalsIgnoreCase("Sair")) {
            System.out.println("Qual filme você gostaria de ver?");
            tituloUsuario = leTeclado.nextLine();

            if(tituloUsuario.equalsIgnoreCase("Sair")) {
                break;
            }

            String url = "http://www.omdbapi.com/?t=" + tituloUsuario.replace(" ", "+") + "&apikey=" + apiKey;

            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(url))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
                System.out.println("Status code: " + response.statusCode());
                System.out.println("Request: " + response.request());
                System.out.println("Body: " + response.body());

                //Titulo tituloJson = gson.fromJson(response.body(), Titulo.class);
                TituloOmdb tituloOmdbJson = gsonOmdb.fromJson(response.body(), TituloOmdb.class);
                //System.out.println(tituloJson);
                System.out.println("Escolha do usuário convertida em TituloOmdb: ");
                System.out.println(tituloOmdbJson);

                Titulo meuTitulo = new Titulo(tituloOmdbJson);
                System.out.println("Escolha do usuário convertida em Titulo: ");
                System.out.println(meuTitulo);
                titulos.add(meuTitulo);

            } catch (NumberFormatException e) {
                System.out.println("Houve um erro no formato de ano encontrado para o objeto");
                System.out.println("Mensagem de erro:\n" + e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Houve um erro no argumento passado para a busca do título");
                System.out.println("Mensagem de erro:\n" + e.getMessage());
            } catch (ErroConversaoAnoException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Filmes buscados adicionados à lista!");
        System.out.println(titulos);

        FileWriter escreveArquivo = new FileWriter("filmes.json");
        escreveArquivo.write(gsonOmdb.toJson(titulos));
        escreveArquivo.close();

        System.out.println("A execução do código foi finalizada");
    }
}
