package com.dio.frameworkcollections.Map;
/*Dadas as seguintes informações sobre meus livros favoritos e seus autores,
crie um dicionário e ordene este dicionário:
exibindo (Nome Autor - Nome Livro);
Autor = Hawking, Stephen  - Livro = nome: Uma Breve História do Tempo. páginas: 256
Autor = Duhigg, Charles - Livro = nome: O Poder do Hábito, paginas: 408
Autor = Harari, Yuval Noah  - Livro = 21 Lições Para o Século 21, páginas: 432
*/

import java.util.*;

public class OrdenacaoMap {

    public static void main(String[] args) {
        System.out.println("--\tOrdem aleatória\t--");
        Map<String, Livro> meusLivros = new HashMap<>() {{
            put(" Antoine de Saint-Exupéry ", new Livro("O pequeno príncipe", 60));
            put(" Neil Gaiman ", new Livro("Coraline", 256));
            put(" Stephen Chbosky ", new Livro("As vantagens de ser invesível", 385));

        }};
        for (Map.Entry<String, Livro> livro : meusLivros.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());


        System.out.println("--\tOrdem de inserção\t--");
        Map<String, Livro> meusLivros1 = new LinkedHashMap<>() {{
            put(" Antoine de Saint-Exupéry ", new Livro("O pequeno príncipe", 60));
            put(" Neil Gaiman ", new Livro("Coraline", 256));
            put(" Stephen Chbosky ", new Livro("As vantagens de ser invesível", 385));
        }};

        for (Map.Entry<String, Livro> livro1 : meusLivros1.entrySet()) {

            System.out.println(livro1.getKey() + " - " + livro1.getValue().getNome());
        }

        System.out.println("--\tOrdem alfabética autores\t--");

        Map<String, Livro> meuslivros2 = new TreeMap<>(meusLivros1);

        for (Map.Entry<String, Livro> livro2 : meusLivros1.entrySet()) {

            System.out.println(livro2.getKey() + " - " + livro2.getValue().getNome());

        }

        System.out.println("--\tOrdem alfabética nome dos livros\t--");
        Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome());
        meusLivros3.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livro> livro3 : meusLivros3) {

            System.out.println(livro3.getKey() + " - " + livro3.getValue().getNome());


        }

    }
}



        /*System.out.println("--\tOrdem número de páginas\t--");
    }*/






