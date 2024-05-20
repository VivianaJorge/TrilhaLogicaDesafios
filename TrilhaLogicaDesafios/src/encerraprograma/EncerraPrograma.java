package encerraprograma;

import java.sql.SQLOutput;
import java.util.Scanner;

public class EncerraPrograma {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int num = 0;
        String result = "";
        do{
            System.out.println("Informe um número: ");
            num = t.nextInt();
            result += num + " ";
        } while (num!=10);
        System.out.println("Números informados: " + result);
    }
}
