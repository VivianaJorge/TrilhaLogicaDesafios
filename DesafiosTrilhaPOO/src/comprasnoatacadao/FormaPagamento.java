package comprasnoatacadao;

public class FormaPagamento {

    private double total=0;

    public double FormaPagamento(String pagamento, double valorCompra) {
        if(pagamento.equals("credito")){
            total = valorCompra + (valorCompra * 0.03);
        } else if (pagamento.equals("dinheiro")){
            total = valorCompra - (valorCompra * 0.05);
        } else{
            total = valorCompra;
        }
        return total;
    }
}
