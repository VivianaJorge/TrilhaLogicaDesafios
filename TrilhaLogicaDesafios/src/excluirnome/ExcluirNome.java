package excluirnome;

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
        nomes.add("CLAIR");
        nomes.add("ELOISA");
        nomes.add("CAIO");//

        System.out.println(nomes);

        ArrayList<String> novaLista = new ArrayList<>();

        for(int j=0;j< nomes.size();j++) {
            for (int i = j+1; i < nomes.size(); i++) {
                if ((nomes.get(j).equals(nomes.get(i)))) {
                    System.out.println(nomes.get(j) + "igual" + nomes.get(i));
                   // nomes.remove(nomes.get(i));
                    novaLista.add(nomes.get(i));

                } else {
                    System.out.println(nomes.get(j) + "diferente" + nomes.get(i));


                }
            }
        }
        System.out.println(nomes);
        }

}

