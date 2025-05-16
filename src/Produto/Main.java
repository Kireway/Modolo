package Produto;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random gerador = new Random();
        Produto prod1 = new Produto(gerador.nextInt(1000), "Macarrão Instantâneo Turma da Mônica", 2.3, 20); //construtor completo

        //declaração de variáveis
        double precoVenda;

        System.out.println(prod1);

        prod1.setDescricao("Miojo Cancerígeno Turma da Mônica");
        System.out.printf("Descrição do Produto Alterada. Descrição Atual: %s", prod1.getDescricao());

        prod1.comprar(10);
        System.out.printf("\nVocê realizou compras desse produto, seu estoque aumentou! Estoque Atual: %d", prod1.getEstoque());

        if (prod1.temEmEstoque()){
            System.out.printf("\nVocê ainda tem desse Produto no Estoque! Estoque Atual: %d", prod1.getEstoque());
        } else{
            System.out.println("\nVocê não tem mais desses Produtos no Estoque.");
        }

        precoVenda = prod1.calcularPrecoVenda(3);
        System.out.printf("\nO Preço de Venda calculado para este Produto é de R$%f", precoVenda);

        if (prod1.vender()){
            System.out.printf("\nUma unidade do Produto foi Vendida! Estoque Atual: %d", prod1.getEstoque());
        } else{
            System.out.printf("\nNão foi possível Vender uma unidade deste Produto. Estoque Atual: %d", prod1.getEstoque());
        }

        if (prod1.vender(30)){
            System.out.printf("\nEssa quantidade do Produto foi Vendida! Estoque Atual: %d", prod1.getEstoque());
        } else{
            System.out.printf("\nNão foi possível Vender essa quantidade do Produto. Estoque Atual: %d", prod1.getEstoque());
        }

        if (prod1.atualizarCusto(5)){
            System.out.printf("\nO Custo do Produto foi atualizado Positivamente! Custo Atual: %f", prod1.getCusto());
        } else{
            System.out.printf("\nO Custo do Produto foi atualizado Negativamente! Custo Atual: %f", prod1.getCusto());
        }

        //===================================== Produto 2 =====================================
        System.out.println("\n=============== PRODUTO 2 ===============");
        Produto prod2 = new Produto(gerador.nextInt(1000), "Batata Palito do Nisflas"); //segundo construtor

        System.out.println(prod2);

        prod2.setCusto(5.7);
        System.out.printf("Valor de Custo adicionado ao objeto: R$%f", prod2.getCusto());

        prod2.setDescricao("Batata Palha");
        System.out.printf("\nDescrição do Produto Alterada. Descrição Atual: %s", prod2.getDescricao());

        prod2.comprar(15);
        System.out.printf("\nVocê realizou compras desse produto, seu estoque aumentou! Estoque Atual: %d", prod2.getEstoque());

        if (prod2.temEmEstoque()){
            System.out.printf("\nVocê ainda tem desse Produto no Estoque! Estoque Atual: %d", prod2.getEstoque());
        } else{
            System.out.println("\nVocê não tem mais desses Produtos no Estoque.");
        }

        precoVenda = prod2.calcularPrecoVenda(7);
        System.out.printf("\nO Preço de Venda calculado para este Produto é de R$%f", precoVenda);

        if (prod2.vender()){
            System.out.printf("\nUma unidade do Produto foi Vendida! Estoque Atual: %d", prod2.getEstoque());
        } else{
            System.out.printf("\nNão foi possível Vender uma unidade deste Produto. Estoque Atual: %d", prod2.getEstoque());
        }

        if (prod2.vender(14)){
            System.out.printf("\nEssa quantidade do Produto foi Vendida! Estoque Atual: %d", prod2.getEstoque());
        } else{
            System.out.printf("\nNão foi possível Vender essa quantidade do Produto. Estoque Atual: %d", prod2.getEstoque());
        }

        if (prod2.temEmEstoque()){ // repeti esse método
            System.out.printf("\nVocê ainda tem desse Produto no Estoque! Estoque Atual: %d", prod2.getEstoque());
        } else{
            System.out.println("\nVocê não tem mais desses Produtos no Estoque.");
        }

        if (prod2.atualizarCusto(-2)){
            System.out.printf("\nO Custo do Produto foi atualizado Positivamente! Custo Atual: %f", prod2.getCusto());
        } else{
            System.out.printf("\nO Custo do Produto foi atualizado Negativamente! Custo Atual: %f", prod2.getCusto());
        }
    }
}