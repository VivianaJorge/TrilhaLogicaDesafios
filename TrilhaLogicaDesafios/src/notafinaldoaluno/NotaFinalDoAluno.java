package notafinaldoaluno;

import java.util.Scanner;

public class NotaFinalDoAluno {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Informe a nota G1:");
        Float g1 = t.nextFloat();
        System.out.println("Informe a nota G2:");
        Float g2 = t.nextFloat();
        System.out.println("Informe a nota G3:");
        Float g3 = t.nextFloat();
        Float media = (g1+g2+g3)/3;
        System.out.printf("Média: %.1f\n", media);
        if (media>=7){
            System.out.println("Aprovado");
        } else if (media>=5){
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }


    }
}
