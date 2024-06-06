package excluirnome;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class ExcluirNome {

    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("ANA"); //2X
        nomes.add("BENTO");
        nomes.add("DANI");
        nomes.add("CAIO"); //3X
        nomes.add("TEO"); //2X
        nomes.add("ISIS"); //2X
        nomes.add("YURI"); //2X
        nomes.add("CLARA");
        nomes.add("ELLEN");
        nomes.add("ZOE");
        nomes.add("ANA");//
        nomes.add("BRUNO");
        nomes.add("DAVI");
        nomes.add("CAIO");//
        nomes.add("TEO");//
        nomes.add("ISIS");//
        nomes.add("YURI");//
        nomes.add("CARLOS");
        nomes.add("ELOISA");
        nomes.add("CAIO");//

        System.out.println("Lista de nomes completa:");
        System.out.println(nomes);

        ArrayList<String> novaLista = new ArrayList<>();
        boolean repete = true;
        do{
            for(int j=0;j< nomes.size();j++) {
                for (int i = j+1; i < nomes.size(); i++) {
                    if ((nomes.get(j).equals(nomes.get(i)))) {
                        novaLista.add(nomes.get(i));
                        repete = true;
                    } else {
                        repete = false;
                    }
                }
            }
        } while (repete);

        nomes.removeAll(novaLista);
        novaLista.clear();
        System.out.println("-----------------");
        System.out.println("Lista de nomes retirando duplicidade:");
        System.out.println(nomes);
    }

}

