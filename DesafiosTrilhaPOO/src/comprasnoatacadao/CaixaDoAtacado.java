package comprasnoatacadao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CaixaDoAtacado {

    public static void main(String[] args) {
       ArrayList<Produto> produtos = new ArrayList<>();

       Produto prodA = new Produto(1, "Café 1kg", 53.00);
       Produto prodB = new Produto(2, "Sabão em pó", 36.00);
       Produto prodC = new Produto(3, "Caixa de Leite", 82.00);
       Produto prodD = new Produto(4, "Refrigerate", 8.50);

       produtos.add(prodA);
       produtos.add(prodB);
       produtos.add(prodC);
       produtos.add(prodD);

       for (Produto catalogo : produtos) {
          System.out.println(catalogo.getCod() + "|" + catalogo.getNome() + "|" + catalogo.getValor());
       }

       String arquivo = "C:\\Desenvolvimento\\Projeto_Sementes\\DesafiosTrilhaPOO\\src\\comprasnoatacadao\\Compra.csv";
       String linha = "";
       String csvSeparator = ",";


       try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
          while ((linha = br.readLine()) != null) {
          //   String[] compra = linha.split(csvSeparator);
             System.out.println(linha);


          }
       } catch (IOException e) {
          e.printStackTrace();
 /*     } finally {
         try {
            if (br != null)
               br.close();
         } catch (IOException e) {
            e.printStackTrace();
         }
 */     }

          //   DICA DO DESAFIO:
         //   public float computarCompra(){
        //         return valorTotal;
       //    }

       }
    }

