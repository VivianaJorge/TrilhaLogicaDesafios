package operadoresaritmeticos;

import java.util.Scanner;

public class OperadoresAritmeticos {

    public static void main(String[] args) {

       /* CALCULA MÉDIA
        int n1 = 3;
        int n2 = 5;
        float m = (n1 + n2)/2;
        System.out.println("A média é igual a " + m);*/

       /* CALCULA DIVISÃO COM RESTO
        int n = 15;
        int d = 2;
        float div = n / d;
        float res = n % d;
        System.out.println("O resultado da divisão é " + div);
        System.out.println("O resto da divisão é " + res);*/

        /* INCREMENTO E DECREMENTO
        int numero = 10;
        int valorMaior = 4 + numero++;
        int valorMenor = 4 + numero--;
        System.out.println("Soma: " + valorMaior);
        System.out.println("Número: " + numero);
        System.out.println("Soma com incremento: " + valorMenor);
        System.out.println("Número com decremento: " + numero);*/

        /*
        int x = 4;
        x += 2; // x = x + 2
        System.out.println(x);

        float v = 8.4f;
        int ar = (int) Math.round(v);
        System.out.println("Valor arredondado: " + ar);

        double ale = Math.random();
        int n = (int) (15 + ale * (50-15));
        System.out.println("Número aleatório entre 15 e 50: " + n);
        */

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        float valor = teclado.nextFloat();
        float restodiv2 = valor % 2;
        float valorabs = Math.abs(valor);
        float raizcub = (float) Math.cbrt(valor);
        float expo = (float) Math.pow(valor,3);
        float raizquad = (float) Math.sqrt(valor);
        System.out.println("Resto da divisão por 2: " + restodiv2);
        System.out.format("Valor Absoluto: %.2f \n", valorabs);
        System.out.format("Raiz Cúbica: %.2f \n", raizcub);
        System.out.format("Elevado ao Cubo: %.2f \n", expo);
        System.out.format("Raiz Quadrada: %.2f \n", raizquad);

    }

}
