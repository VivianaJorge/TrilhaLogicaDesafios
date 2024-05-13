package idade;

import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Em que ano você nasceu?");
        int nasc = t.nextInt();
        int i = 2024 - nasc;
        System.out.println("Sua idade é: " + i);
        if (i>=18){
            System.out.println("MAIOR DE IDADE");
        } else {
            System.out.println("MENOR DE IDADE");
        }
    }
}
