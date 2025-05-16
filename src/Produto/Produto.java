package Produto;

public class Produto {
    private int codigo;
    private String descricao;
    private double custo;
    private int estoque;

    //construtor
    public Produto(int codigo, String descricao, double custo, int estoque) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.custo = custo;
        this.estoque = estoque;
    }
    public Produto(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public Produto(double custo, int estoque){ //sobrecarga
        this.custo = custo;
        this.estoque = estoque;
    }

    //toString
    public String toString(){
        return "código: "+codigo+"\ndescrição: "+descricao+"\ncusto: "+custo+"\nquantidade: "+estoque;
    }

    //getters
    public int getCodigo() {
        return this.codigo;
    }
    public String getDescricao() {
        return this.descricao;
    }
    public double getCusto() {
        return this.custo;
    }
    public int getEstoque() {
        return this.estoque;
    }

    //setters
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setCusto(double custo) {
        this.custo = custo;
    }
    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    //métodos da modelagem
    public void comprar(int quant){
        this.estoque += quant;
    }

    public double comprar(int quant, double precoUnit){ // sobrecarga - mostra quando custou a compra. Porém, retorna double... não sei se ainda é sobrecarga
        double precoTotal;

        this.estoque += quant;
        precoTotal = precoUnit * quant;
        return precoTotal;
    }

    public boolean temEmEstoque(){
        if (this.estoque == 0){
            return false;
        } else {
            return true;
        }
    }

    public double calcularPrecoVenda(double percentual){
        return this.custo + (this.custo * (percentual/100));
    }

    public double calcularPrecoVenda(double percentual, double taxa){ // sobrecarga - adiciona uma taxa por venda
        return this.custo + (this.custo * (percentual/100)) + taxa;
    }

    public boolean vender(){
        if (this.estoque > 0){
            this.estoque--;
            return true;
        }else{
            return false;
        }
    }

    public boolean vender(int quant){
        if (quant <= this.estoque){
            this.estoque -= quant;
            return true;
        }else{
            return false;
        }
    }

    public double vender(int quant, double precoUnit){ // sobrecarga - calcula o tanto de dinheiro que faturou na venda
        double dinheiroTotal = 0;
        if (quant <= this.estoque) {
            dinheiroTotal += quant * precoUnit;
        }
        return dinheiroTotal;
      //return quant * precoUnit; //mais simples
    }

    public boolean atualizarCusto(double perc){
        if (perc < 0){
            this.custo -= custo * -(perc/100);
            return false;
        } else{
            this.custo += custo * (perc/100);
            return true;
        }
    }

}