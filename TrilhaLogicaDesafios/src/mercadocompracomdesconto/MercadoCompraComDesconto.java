package mercadocompracomdesconto;

import java.util.Scanner;

public class MercadoCompraComDesconto {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        System.out.println("Informe o produto desejado: ");
        System.out.println("1 - Arroz ");
        System.out.println("2 - Feijão ");
        System.out.println("3 - Leite ");
        System.out.println("4 - Pão ");
        int prod = p.nextInt();
        if (prod == 1){
            System.out.println("Informe a quantidade de Arroz desejada: ");
            int qtd = p.nextInt();
            double valor = 4.99;
            if (qtd>=1 && qtd<=10){
                double total = (double) (qtd*valor);
                System.out.printf("Valor a pagar: R$ %.2f", total);
            } else if (qtd > 10 && qtd <= 20){
                double total = (double) ((qtd*valor) - (qtd*valor*0.1));
                System.out.printf("Valor a pagar com 10 por cento de desconto: R$ %.2f", total);
            } else if (qtd > 20 && qtd <= 50){
                double total = (double) ((qtd*valor) - (qtd*valor*0.2));
                System.out.printf("Valor a pagar com 20 por cento de desconto: R$ %.2f", total);
            } else if (qtd>50){
                double total = (double) ((qtd*valor) - (qtd*valor*0.25));
                System.out.printf("Valor a pagar com 25 por cento de desconto: R$ %.2f", total);
            } else {
                System.out.println("Quantidade inválida.");
            }
        } else if (prod == 2){
            System.out.println("Informe a quantidade de Feijão desejada: ");
            int qtd = p.nextInt();
            double valor = 7.99;
            if (qtd>=1 && qtd<=10){
                double total = (double) (qtd*valor);
                System.out.printf("Valor a pagar: R$  %.2f", total);
            } else if (qtd > 10 && qtd <= 20){
                double total = (double) ((qtd*valor) - (qtd*valor*0.1));
                System.out.printf("Valor a pagar com 10 por cento de desconto: R$ %.2f", total);
            } else if (qtd > 20 && qtd <= 50){
                double total = (double) ((qtd*valor) - (qtd*valor*0.2));
                System.out.printf("Valor a pagar com 20 por cento de desconto: R$ %.2f", total);
            } else if (qtd>50){
                double total = (double) ((qtd*valor) - (qtd*valor*0.25));
                System.out.printf("Valor a pagar com 25 por cento de desconto: R$ %.2f", total);
            } else {
                System.out.println("Quantidade inválida.");
            }
        } else if (prod == 3){
            System.out.println("Informe a quantidade de Leite desejada: ");
            int qtd = p.nextInt();
            double valor = 3.89;
            if (qtd>=1 && qtd<=10){
                double total = (double) (qtd*valor);
                System.out.printf("Valor a pagar: R$ %.2f", total);
            } else if (qtd > 10 && qtd <= 20){
                double total = (double) ((qtd*valor) - (qtd*valor*0.1));
                System.out.printf("Valor a pagar com 10 por cento de desconto: R$ %.2f", total);
            } else if (qtd > 20 && qtd <= 50){
                double total = (double) ((qtd*valor) - (qtd*valor*0.2));
                System.out.printf("Valor a pagar com 20 por cento de desconto: R$ %.2f", total);
            } else if (qtd>50){
                double total = (double) ((qtd*valor) - (qtd*valor*0.25));
                System.out.printf("Valor a pagar com 25 por cento de desconto: R$ %.2f", total);
            } else {
                System.out.println("Quantidade inválida.");
            }
        } else if (prod == 4){
            System.out.println("Informe a quantidade de Pão desejada: ");
            int qtd = p.nextInt();
            double valor = 0.99;
            if (qtd>=1 && qtd<=10){
                double total = (double) (qtd*valor);
                System.out.format("Valor a pagar: R$ %.2f", total);
            } else if (qtd > 10 && qtd <= 20){
                double total = (double) ((qtd*valor) - (qtd*valor*0.1));
                System.out.printf("Valor a pagar com 10 por cento de desconto: R$ %.2f", total);
            } else if (qtd > 20 && qtd <= 50){
                double total = (double) ((qtd*valor) - (qtd*valor*0.2));
                System.out.printf("Valor a pagar com 20 por cento de desconto: R$ %.2f", total);
            } else if (qtd>50){
                double total = (double) ((qtd*valor) - (qtd*valor*0.25));
                System.out.printf("Valor a pagar com 25 por cento de desconto: R$ %.2f", total);
            } else {
                System.out.println("Quantidade inválida.");
            }
        } else {
            System.out.println("Código de produto inválido.");
        }
    }
}
