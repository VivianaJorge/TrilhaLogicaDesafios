package tabuada;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Informe um número inteiro entre 1 e 10: ");
        int num = t.nextInt();
        if (num>=1 && num<=10){
            System.out.println("Tabuada do " + num);
            for (int i=0;i<=10;i++){
                int result = i * num;
                System.out.println(i + " X " + num + " = " + result);
            }
        } else{
            System.out.println("Número inválido.");
        }
    }
}
