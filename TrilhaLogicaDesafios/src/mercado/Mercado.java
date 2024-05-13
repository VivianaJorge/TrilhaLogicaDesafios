package mercado;

import java.util.Scanner;

public class Mercado {
    public static void main(String[] args) {
        System.out.println("Informe o código do produto desejado:");
        System.out.println("1 - cerveja");
        System.out.println("2 - refrigerante");
        System.out.println("3 - água");
        Scanner t = new Scanner(System.in);
        int cod = t.nextInt();
        if (cod==1){
            System.out.println("Informe sua idade");
            int idade = t.nextInt();
            if (idade < 18){
                System.out.println("Compra negada.");
            } else {
                System.out.println("Compra efetuada com sucesso.");
            }
        } else if (cod==2 || cod==3){
            System.out.println("Compra efetuada com sucesso.");
        } else {
            System.out.println("Código inválido");
        }
    }
}
