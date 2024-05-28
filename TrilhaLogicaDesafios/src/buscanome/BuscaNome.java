package buscanome;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BuscaNome {
    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("ANA");
        nomes.add("BENTO");
        nomes.add("DANI");
        nomes.add("CAIO");
        nomes.add("TEO");
        nomes.add("ISIS");
        nomes.add("YURI");
        nomes.add("CLARA");
        nomes.add("ELLEN");
        nomes.add("ZOE");

        System.out.println(nomes);

        Scanner t = new Scanner(System.in);
        System.out.println("Informe o nome que deseja pesquisar: ");
        String pesquisa = t.next().toUpperCase();
        if(nomes.contains(pesquisa)){
            System.out.println("Achei");
        } else {
            System.out.println("Não achei");
        }
    }
}
