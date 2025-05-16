import java.util.Random;
public class Personagem {
    Random gerador = new Random();
    //Personagem
    private int codigo;
    private String nome;
    private int forca;
    private int saude;
    private int energia;
    private double dinheiro;
    //Medicamento
    int cafe;
    int pocaoEnergia;
    int maca;
    int pocaoSaude;
    //Itens de venda
    int graveto;
    int roupaVelha;
    int artefato;

    public Personagem(int codigo, String nome, int forca, int saude, int energia, double dinheiro) {
        this.codigo = codigo;
        this.nome = nome;
        this.forca = forca;
        this.saude = saude;
        this.energia = energia;
        this.dinheiro = dinheiro;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getForca() {
        return this.forca;
    }

    public int getSaude() {
        return this.saude;
    }

    public int getEnergia() {
        return this.energia;
    }

    public double getDinheiro() {
        return this.dinheiro;
    }

    public boolean andar() {
        if (this.energia > 0) {
            int aleatorio = gerador.nextInt(1, 10);
            this.energia--;
            this.saude++;
            if (aleatorio <= 1) { //10% artefato
                this.artefato++;
                return true;
            } else if (aleatorio <= 4) { //30% roupa
                this.roupaVelha++;
                return true;
            } else if (aleatorio >= 7) { //40% graveto
                this.graveto++;
                return true;
            }
            return true;
        } else {
            return false;
        }
    }

    public boolean andar(int valor) { // sobrecarga
        if (valor > 0) {
            this.saude += valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean correr() {
        if (this.energia > 0) {
            int aleatorio = gerador.nextInt(1, 10);
            this.energia -= 2;
            this.saude++;
            this.forca++;
            if (aleatorio <= 1) { //20% artefato
                this.artefato++;
                return true;
            } else if (aleatorio <= 4) { //30% roupa
                this.roupaVelha++;
                return true;
            } else if (aleatorio >= 7) { //40% graveto
                this.graveto++;
                return true;
            }
            return true;
        } else {
            return false;
        }
    }

    public boolean correr(int valor) {// sobrecarga
        if (valor > 0) {
            this.saude += valor;
            this.forca += valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean defender() {
        if (this.saude > 0) {
            this.saude--;
            return true;
        } else {
            return false;
        }
    }

    public boolean defender(int valor) { //sobrecarga
        if (valor > 0 && this.saude >= valor) {
            this.saude -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean atacar() {
        if (this.saude > 0 && this.forca > 0) {
            this.saude--;
            this.forca--;
            return true;
        } else {
            return false;
        }
    }

    public boolean atacar(int valor) { // sobrecarga
        if (valor > 0 && this.saude > valor && this.forca > valor) {
            this.saude -= valor;
            this.forca -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean inventario(int item) {
        if (item == 1) {
            if (this.cafe > 0) {
                this.cafe--;
                this.energia++;
                return true;
            } else {
                return false;
            }
        } else if (item == 2) {
            if (this.pocaoEnergia > 0) {
                this.pocaoEnergia--;
                this.energia += 3;
                return true;
            } else {
                return false;
            }
        } else if (item == 3) {
            if (this.maca > 0) {
                this.maca--;
                this.saude += 2;
                return true;
            } else {
                return false;
            }
        } else if (item == 4) {
            if (this.pocaoSaude > 0) {
                this.pocaoSaude--;
                this.saude += 3;
                return true;
            } else {
                return false;
            }
        }
        return true;
    }

    public boolean vender(int item) {
        if (item == 1) { //graveto
            if (this.graveto > 0) {
                this.graveto--;
                this.dinheiro += 10;
                return true;
            } else {
                return false;
            }
        } else if (item == 2) { //roupa velha
            if (this.roupaVelha > 0) {
                this.roupaVelha--;
                this.dinheiro += 40;
                return true;
            } else {
                return false;
            }
        } else if (item == 3) { //artefato
            if (this.artefato > 0) {
                this.artefato--;
                this.dinheiro += 100;
                return true;
            } else {
                return false;
            }
        }
        return true;
    }

    public boolean vender(int valor, int qntd){ //sobrecarga
        valor = valor * qntd;
        if (valor > 0){
            this.dinheiro += valor * qntd;
            return true;
        }else{
            return false;
        }
    }

    public boolean comprar(int item) {
        if (item == 1) { //cafe
            if (this.dinheiro >= 15) {
                this.dinheiro -= 15;
                this.cafe++;
                return true;
            } else {
                return false;
            }
        } else if (item == 2) { //poção de energia
            if (this.dinheiro >= 45) {
                this.dinheiro -= 45;
                this.pocaoEnergia++;
                return true;
            } else {
                return false;
            }
        } else if (item == 3) { // maçã
            if (this.dinheiro >= 25) {
                this.dinheiro -= 25;
                this.maca++;
                return true;
            } else {
                return false;
            }
        } else if (item == 4) { // poção de saúde
            if (this.dinheiro >= 75) {
                this.dinheiro -= 75;
                this.pocaoSaude++;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public boolean comprar(int valor, int qntd){ //sobrecarga
        valor = valor * qntd;
        if (valor > 0 && this.dinheiro >= valor){
            this.dinheiro -= valor * qntd;
            return true;
        }else{
            return false;
        }
    }

        // To String
//        public String toString() {
//            return "Personagem{" +
//                    "codigo=" + codigo +
//                    ", nome='" + nome + '\'' +
//                    ", forca=" + forca +
//                    ", saude=" + saude +
//                    ", energia=" + energia +
//                    ", dinheiro=" + dinheiro +
//                    '}';
//        }
}

