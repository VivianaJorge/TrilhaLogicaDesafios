package mediadoaluno;

import java.util.Scanner;

public class MediaDoAluno {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        String resp;
        do{
            System.out.println("Informe a nota 1 do aluno: ");
            float G1 = t.nextFloat();
            System.out.println("Informe a nota 2 do aluno: ");
            float G2 = t.nextFloat();
            float media = (G1+G2)/2;
            if (media>=7){
                System.out.printf("Aprovado! Média = %.1f" , media);
            } else {
                System.out.printf("Reprovado! Média = %.1f" , media);
            }
            System.out.println("\nDeseja realizar novo cálculo? [S/N]");
            resp = t.next();
        } while (resp.equals("S"));
    }
}
