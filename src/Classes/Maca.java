package Classes;

public class Maca {
    private double valorUnitario;
    private int quantidade;


    public double getValorUnitario() {
        return valorUnitario;
    }
    

    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;

        if (quantidade > 12){
            this.valorUnitario = 1;
        } else {
            this.valorUnitario = 1.3;
        }
    }

    public double getValorTotal() {
        return this.valorUnitario * this.quantidade;
    }
}
