package buscanome;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BuscaNome {
    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Ana");
        nomes.add("Bento");
        nomes.add("Dani");
        nomes.add("Caio");
        nomes.add("Teo");
        nomes.add("Isis");
        nomes.add("Yuri");
        nomes.add("Clara");
        nomes.add("Elen");
        nomes.add("Zoe");

        System.out.println(nomes);

        Scanner t = new Scanner(System.in);
        System.out.println("Informe o nome que deseja pesquisar: ");
        if(nomes.contains(t.next())){
            System.out.println("Achei");
        } else {
            System.out.println("Não achei");
        }
    }
}
