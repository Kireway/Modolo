public class Conta {
    private int numero;
    private String nome;
    private double saldo;
    private double limite;

    public Conta(int numero, String nome, double saldo, double limite){
        this.numero = numero;
        this.nome = nome;
        this.saldo = saldo;
        this.limite = limite;
    }
    public Conta(int numero, String nome){
        this.numero = numero;
        this.nome = nome;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public double getLimite(){
        return this.limite;
    }

    public void setLimite(double limite){
        this.limite = limite;
    }

    public boolean debitarSaldo(double quantidade) {
        if (this.saldo + this.limite >= quantidade) {
            this.saldo = this.saldo - quantidade;
            return true;
        } else {
            return false;
        }
    }

    public void creditarSaldo(double quantidade) {
        this.saldo = this.saldo + quantidade;
    }


    public String toString(){
        return " Número: " +numero+ " Nome: " +nome+" Saldo: " +saldo+ " Limite: "+limite;
    }
}