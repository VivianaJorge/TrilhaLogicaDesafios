package equacaosegundograu;

import java.util.Scanner;

public class EquacaoSegundoGrau {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Informe um valor inteiro de a: ");
        int a = t.nextInt();
        System.out.println("Informe um valor inteiro de b: ");
        int b = t.nextInt();
        System.out.println("Informe um valor inteiro de c: ");
        int c = t.nextInt();
        double d = Math.pow(b,2) - 4 * a * c;
        System.out.println("O valor de delta é: " + d);
        if (d<0){
            System.out.println("Não existem raízes reais.");
        } else {
            System.out.println("Existem raízes reais.");
        }

    }
}
