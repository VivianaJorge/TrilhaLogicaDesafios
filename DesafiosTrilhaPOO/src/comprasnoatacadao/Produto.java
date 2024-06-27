package comprasnoatacadao;

public class Produto {
    private int cod;
    private String nome;
    private double valor;
    private double compraComDesc =0;


    public Produto(int cod, String nome, double valor) {
        this.cod = cod;
        this.nome = nome;
        this.valor = valor;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double descontoPorQuantidade(int quantidade, double valorCompra){
        if (quantidade<5){
            compraComDesc = valorCompra;
        } else if(quantidade>=5 && quantidade<15){
            compraComDesc = valorCompra - (valorCompra * 0.10);
        } else if(quantidade>=15 && quantidade<25){
            compraComDesc = valorCompra - (valorCompra * 0.20);
        } else {
            compraComDesc = valorCompra - (valorCompra * 0.25);
        }
        return compraComDesc;
    }
}


