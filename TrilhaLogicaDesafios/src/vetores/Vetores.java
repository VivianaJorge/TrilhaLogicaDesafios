package vetores;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Vetores {

    public static void main(String[] args) {

        Scanner t = new Scanner(System.in);
        int vetor[] = new int[10];
        int impar = 0;
        System.out.println("VETOR DE 10 POSIÇÕES:");

        for(int i=0;i<vetor.length; i++){
            System.out.println("Informe o valor da posição " + i + ": ");
            vetor[i] = t.nextInt();
            if ((vetor[i] % 2) !=0){
                impar += 1;
            }
        }
        for(int i=0;i<vetor.length; i++){
            System.out.print(vetor[i] + " ");
        }
        System.out.println("\nInformados " + impar + " números ímpares.");

    }

}
