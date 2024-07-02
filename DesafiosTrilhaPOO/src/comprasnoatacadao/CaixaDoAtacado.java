package comprasnoatacadao;

import java.util.ArrayList;
import java.util.Scanner;

public class CaixaDoAtacado {

    public static void main(String[] args) {

       double valorCompra = 0.00;
       double valorComDesc = 0.00;
       double valorTotal = 0.00;

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

       ArrayList<Compra> compra = new ArrayList<>();
       Compra item1 = new Compra(1,10);
       Compra item2 = new Compra(2,20);
       Compra item3 = new Compra(3,5);


       compra.add(item1);
       compra.add(item2);
       compra.add(item3);

       for (Compra pedido : compra) {
          System.out.println(pedido.getCodProduto() + "," + pedido.getQuantProduto());
       }

       for (Produto catalogo : produtos) {
          for (Compra pedido : compra) {
             if(catalogo.getCod()==pedido.getCodProduto()){
               valorCompra = catalogo.getValor()*pedido.getQuantProduto();
               valorComDesc = catalogo.descontoPorQuantidade(pedido.getQuantProduto(),valorCompra);
        //       System.out.println(catalogo.descontoPorQuantidade(pedido.getQuantProduto(),valorCompra));
        //       System.out.println(catalogo.descontoPorQuantidade(pedido.getQuantProduto(),valorComDesc));
               valorTotal += catalogo.descontoPorQuantidade(pedido.getQuantProduto(),valorComDesc);
             }
          }
       }
       System.out.println("Total das compras com desconto por quantidade: R$ " + valorTotal);


         //INPUT EM TELA

    /*   Scanner t = new Scanner(System.in);
       String resposta;
       double valorCompra = 0.00;
       double valorComDesc = 0.00;
       double valorTotal = 0.00;
       do{
          System.out.println("Informe código do produto desejado");
          int codigo = t.nextInt();
          System.out.println("Informe a quantidade desejada do produto");
          int quantidade = t.nextInt();

          for (Produto catalogo : produtos) {
             if(catalogo.getCod()==codigo){
               valorCompra = catalogo.getValor()*quantidade;
               valorComDesc = catalogo.descontoPorQuantidade(quantidade,valorCompra);
                System.out.println(catalogo.descontoPorQuantidade(quantidade,valorCompra));
             }
          }
          valorTotal += valorComDesc;
          System.out.println("Deseja mais produtos? [S/N]");
          resposta = t.next();
       } while (resposta.equals("S"));
       System.out.println("Total das compras com desconto por quantidade: R$ " + valorTotal);

       System.out.println("Informe o código correspondente à forma de Pagamento:");
       System.out.println("1 - Débito");
       System.out.println("2 - Dinheiro");
       System.out.println("3 - Crédito");
       int pagamento = t.nextInt();
       Compra descPagamento = new Compra();
       double totalFinal = descPagamento.FormaPagamento(pagamento,valorTotal);
       System.out.println("Valor Final: R$ " + totalFinal);
     */

       //TENTATIVA COM ARQUIVO

/*       String arquivo = "C:\\Desenvolvimento\\Projeto_Sementes\\DesafiosTrilhaPOO\\src\\comprasnoatacadao\\Compra.csv";
       String linha = "";
       String csvSeparator = ",";


       try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
          while ((linha = br.readLine()) != null) {
          //   String[] compra = linha.split(csvSeparator);
             System.out.println(linha);


          }
       } catch (IOException e) {
          e.printStackTrace();
      } finally {
         try {
            if (br != null)
               br.close();
         } catch (IOException e) {
            e.printStackTrace();
         }
     }
 */

       }
    }

