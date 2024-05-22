package divisaodevalores;

import java.util.Scanner;

public class DivisaoDeValores {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Informe o valor do dividendo");
        float dividendo = t.nextFloat();
        System.out.println("Informe o valor do divisor ");
        float divisor = t.nextFloat();
        while (divisor ==0){
            System.out.println("Divisor não pode ser 0. Informe novo valor:");
            divisor = t.nextFloat();
        }
        int quociente = (int)(dividendo / divisor);
        float resto = (dividendo % divisor);
        System.out.println("Resultado da divisão inteira: " + quociente);
        System.out.println("Resto da divisão: " + resto);
    }

}
