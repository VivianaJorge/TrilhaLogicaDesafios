package somadevalores;

public class SomaDeValores {
    public static void main(String[] args) {
        int n =1;
        int soma =0;
        while (n<=100){
            soma += n;
            n++;
        }
        System.out.println("Soma de valores inteiros entre 1 e 100: " + soma);
    }
}
