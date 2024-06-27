package comprasnoatacadao;

public class FormaPagamento {

    private double total=0;

    public double FormaPagamento(int pagamento, double totalCompra) {
        if(pagamento == 3){
            total = totalCompra + (totalCompra * 0.03);
        } else if (pagamento==2){
            total = totalCompra - (totalCompra * 0.05);
        } else{
            total = totalCompra;
        }
        return total;
    }
}
