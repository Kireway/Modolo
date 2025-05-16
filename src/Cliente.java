public class Cliente {
    private String cpf;
    private String nome;
    private char estadoCivil;
    private int idade;
    private String nomeObrigatorio = "Chapolin";

    public Cliente(String cpf, String nome, char estadoCivil, int idade){
        this.cpf = cpf;
        this.nome = nome;
        this.estadoCivil = estadoCivil;
        this.idade = idade;
    }
    public Cliente(String cpf, String nome){
        this.cpf = cpf;
        this.nome = nome;
    }
    public Cliente(){

    }


    public String getCPF(){
        return this.cpf;
    }
    public void setCPF(String cpf){
        this.cpf = cpf;
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public char getEstadoCivil(){
        return this.estadoCivil;
    }
    public void setEstadoCivil(char estadoCivil){
        this.estadoCivil = estadoCivil;
    }

    public int getIdade(){
        return this.idade;
    }
    public int adicionarIdade(){
        return this.idade++;
    }

    public String verificarMaiorIdadeCliente(){
        if (this.idade >= 18){
            return "Maior";
        }
        else {
            return "Menor";
        }
    }
    public boolean compararNomes(String nome2) {
        if (this.nome.equals(nomeObrigatorio)){
        return true;
        } else{
            return false;
        }
    }

    public int compararNomes(String nome, String nome2){
        if (nome.equals(this.nome) && nome2.equals(this.nome)) {
            return 3;
        }else if (nome.equals(this.nome)){
            return 1;
        }else if (nome2.equals(this.nome)){
            return 2;
        }else{
            return 0;
        }
    }
    public boolean validarCPF() {
        if (this.cpf.length() == 11){
            return true;
        } else {
            return false;
        }
    }

    //To String
    public String toString(){
        return "\nCPF: "+cpf+"\nNome: "+nome+"\nEstado Civil: "+estadoCivil+"\nIdade: "+idade;
    }
}