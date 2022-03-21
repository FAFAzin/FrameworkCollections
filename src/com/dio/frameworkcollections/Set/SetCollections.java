package com.dio.frameworkcollections.Set;

import java.util.*;

public class SetCollections {
    public static void main(String[] args) {
/*        Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 6, 3.6], faça:

        set notas = new HashSet<>() - antes do java 5
        set<Double> notas = new HashSet<>(); - Generics(jdk 5) - diamant operator (jdk 7)
        HashSet<Double> notas = new HashSet<>();
        set<Double> notas = new HashSet<>(Arrays.asList(7, 8.5, 9.3, 5, 7, 6, 3.6));
        set<Double> notas = Set.of(7, 8.5, 9.3, 5, 7, 6, 3.6);
        notas.add(1d);
        notas.remove(5d);
        System.out.println(notas);*/

        System.out.println("Crie um conjunto e adicione as notas");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 6d, 3.6, 0d));
        System.out.println(notas);


        /*System.out.println("Exiba a posição da nota 5.0: ");
        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");*/

        System.out.println("Confira se a nota 5.0 está no conjunto: " + notas.contains(5.0));

        //System.out.println("Exiba a terceira nota adicionada: ");

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        System.out.println("Exiba a soma dos valores: ");
        Iterator<Double> iterator1 = notas.iterator();
        Double soma = 0.0;
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            soma += next;
        }
        System.out.println(soma);

        //System.out.println("Exiba média das notas: " + soma/notas.size());

        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

        ///System.out.println("Remova a nota na posição 0: ");

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator2 = notas.iterator();
        while (iterator2.hasNext()) {

            Double next = iterator2.next();
            if (next < 7.0) iterator2.remove();

            System.out.println(notas);

            System.out.println("Exiba todas as notas na ordem que foram formadas: ");
            Set<Double> notas2 = new LinkedHashSet<>();
            notas2.add(7d);
            notas2.add(8.5);
            notas2.add(9.3);
            notas2.add(5d);
            notas2.add(7d);
            notas2.add(0d);
            notas2.add(3.6);
            System.out.println(notas2);

            System.out.println("Exiba todas as notas na ordem crescente: ");

            Set<Double> notas3 = new TreeSet<>(notas2);
            System.out.println(notas3);

            System.out.println("Apague todo o conjunto: ");
            notas.clear();
            System.out.println(notas);




    }


}
}
