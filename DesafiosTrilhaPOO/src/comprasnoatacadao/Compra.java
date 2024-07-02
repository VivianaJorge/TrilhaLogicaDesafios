package comprasnoatacadao;

public class Compra {

    private double total = 0.00;
    private int codProduto;
    private int quantProduto;

    private String formaPagamento;

    public Compra(int codProduto, int quantProduto) {
        this.codProduto = codProduto;
        this.quantProduto = quantProduto;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    public int getQuantProduto() {
        return quantProduto;
    }

    public void setQuantProduto(int quantProduto) {
        this.quantProduto = quantProduto;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

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
