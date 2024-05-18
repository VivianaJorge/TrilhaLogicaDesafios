package vendaimovel;

import java.util.Scanner;

public class VendaImovel {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Informe o nome do corretor: ");
        String nome = t.next();
        System.out.println("Informe o valor do imóvel: ");
        float valor = t.nextFloat();
        float comissao = 0;
        if (valor >= 50000.00) {
            comissao = (float) (valor * 0.2);
        } else if (valor >= 30000.00) {
            comissao = (float) (valor * 0.15);
        } else {
            comissao = (float) (valor * 0.1);
        }
        System.out.println("Vendedor: " + nome);
        System.out.printf("Valor do imóvel: R$ %.2f \n", valor);
        System.out.printf("Comissão: R$ %.2f", comissao);
    }
}
