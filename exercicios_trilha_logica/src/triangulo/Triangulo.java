package triangulo;

import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Informe o lado A do triângulo: ");
        int a = t.nextInt();
        System.out.println("Informe o lado B do triângulo: ");
        int b = t.nextInt();
        System.out.println("Informe o lado C do triângulo: ");
        int c = t.nextInt();
        if (a<b+c && b<a+c && c<a+b) {
            System.out.print("Forma um triângulo ");
            if (a==b && b==c) {
                System.out.println("EQUILÁTERO.");
            } else if (a!=b && b!=c && a!=c){
                System.out.println("ESCALENO.");
            } else {
                System.out.println("ISÓSCELES.");
            }
        } else {
            System.out.println("Não forma um triângulo.");
        }

    }

}
