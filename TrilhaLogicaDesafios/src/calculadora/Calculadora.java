package calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Informe o primeiro valor:");
        Float v1 = t.nextFloat();
        System.out.println("Informe o segundo valor:");
        Float v2 = t.nextFloat();
        System.out.println("Informe o cálculo que deseja realizar (+, -, x, /):");
        String operacao = t.next();
        float resultado = 0;
        switch (operacao){
            case "+":
                resultado = v1 + v2;
                break;
            case "-":
                resultado = v1-v2;
                break;
            case "x":
                resultado= v1*v2;
                break;
            case "/":
                resultado = v1/v2;
                break;
            default:
                System.out.println("Operador inválido.");
        }
        System.out.printf("Resultado: %.2f", resultado);
    }
}
