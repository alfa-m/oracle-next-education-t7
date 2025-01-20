package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme filme1 = new Filme("Tron", 1982);
        filme1.avalia(7.4);
        Filme filme2 = new Filme("O poderoso chefão", 1972);
        filme2.avalia(10.0);
        Filme filme3 = new Filme("Avatar", 2009);
        filme3.avalia(8.0);
        Serie lost = new Serie("Lost", 2005);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filme1);
        lista.add(filme2);
        lista.add(filme3);
        lista.add(lost);

        for (Titulo titulo : lista) {
            System.out.println(titulo.getNome());

            if (titulo instanceof Filme filme) {
                System.out.println("Classificação " + filme.getClassificacao());
            }
        }

        List<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Jim Carrey");
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Steve Martin");
        buscaPorArtista.add("Steve Carell");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Lista após ordenação:");
        System.out.println(buscaPorArtista);

        Collections.sort(lista);
        System.out.println("Lista de títulos ordena por nome:");
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Lista de títulos ordenada por ano de lançamento:");
        System.out.println(lista);

    }
}
