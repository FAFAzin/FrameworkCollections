package com.dio.frameworkcollections.Set;

/*Dadas as seguintes informações sobre minhas séries favoritas,
crie um conjunto e ordene este conjunto exibindo:
(nome - genero - tempo de episódio);
Série 1 = Nome: got, genero: fantasia, tempoEpisodio: 60
Série 2 = nome: dark, genero: drama, tempoEpisodio: 60
Série 3 = nome: that '70s show, genero: comédia, tempoEpisodio: 25
*/

import java.util.*;

public class OrdenacaoSet {
    public static void main(String[] args) {

        //Ordem aleatória
        System.out.println("--\tOrdem Aleatória\t--");
        Set<Serie> minhasSeries = new HashSet<>(){{
            add(new Serie("Se eu não tivesse te conhecido", "Ficção", 45));
            add(new Serie("13 Reasons Why ", "Drama", 60));
            add(new Serie("Mr Robot", "Drama", 60));
            add(new Serie("Flash", "Ficção", 60));
        }};
        for (Serie serie: minhasSeries) System.out.println(serie.getNome() + " - "
        + serie.getGenero() + " - " + serie.getTempoEpisodio());

        //Ordem de Inserçõa
        System.out.println("\t--Ordem de Inserção--\t");
        Set<Serie> minhasSeries1 = new LinkedHashSet<>(){{
            add(new Serie("Se eu não tivesse te conhecido", "Ficção", 45));
            add(new Serie("13 Reasons Why ", "Drama", 60));
            add(new Serie("Mr Robot", "Drama", 60));
            add(new Serie("Flash", "Ficção", 60));

        }};
        for (Serie serie : minhasSeries1) System.out.println(serie.getNome() + " - "
                + serie.getGenero() + " - " + serie.getTempoEpisodio());


        System.out.println("\t--Ordem Natural--\t");
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
        for (Serie serie : minhasSeries2) System.out.println(serie.getNome() + " - "
                + serie.getGenero() + " - " + serie.getTempoEpisodio());

        System.out.println("--\tOrdem Nome/Gênero/TempoEpisodio\t--");
        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
        minhasSeries3.addAll(minhasSeries);
        for (Serie serie: minhasSeries3) System.out.println(serie.getNome() + " - "
                + serie.getGenero() + " - " + serie.getTempoEpisodio());

    }

}
