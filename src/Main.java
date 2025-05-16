import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // ---------------------- CLASSE CONTA ----------------------

//        Conta contaEx = new Conta(111, "kire", 2032, 500);
//
//        System.out.printf("\nNumero da Conta: %d", contaEx.getNumero());
//        System.out.printf("\nNome: %s", contaEx.getNome());
//        System.out.printf("\nSaldo: R$%.2f", contaEx.getSaldo());
//        System.out.printf("\nLimite: R$%.2f", contaEx.getLimite());// valores vazios   //não mais com o método construtor
//        System.out.println(contaEx); //To String
//
//        System.out.println("Digite o número da sua conta: ");
//        int num = input.nextInt();
//        contaEx.setNumero(num);
//        input.nextLine();
//        System.out.println("Seu nome: ");
//        String nome = input.nextLine();
//        contaEx.setNome(nome);
//
//        System.out.printf("\nNumero da Conta: %d", contaEx.getNumero());
//        System.out.printf("\nNome: %s", contaEx.getNome());
//        System.out.printf("\nSaldo: R$%.2f ", contaEx.getSaldo());
//        System.out.printf("\nLimite: R$%.2f ", contaEx.getLimite());
//
//        while (true) {
//            System.out.println("""
//                    \nEscolha:
//                    0 - Sair
//                    1 - Debitar
//                    2 - Creditar
//                    3 - Definir Limite
//                    """);
//            int opcao = input.nextInt();
//
//            if (opcao == 0) {
//                break;
//            } else if (opcao == 1) {
//                System.out.println("\nQuanto voce quer debitar? ");
//                double deb = input.nextDouble();
//                System.out.println("\nSaldo antes do débito: " + contaEx.getSaldo());
//                if (contaEx.debitarSaldo(deb)) {
//                    System.out.println("Débito realizado com sucesso");
//                } else {
//                    System.out.println("Débito nao foi possivel");
//                }
//                System.out.println("Saldo depois do débito: " + contaEx.getSaldo());
//            } else if (opcao == 2) {
//                System.out.println("Quanto voce quer creditar? ");
//                double cred = input.nextDouble();
//                System.out.println("\nSaldo antes de creditar: R$" + contaEx.getSaldo());
//                contaEx.creditarSaldo(cred);
//                System.out.println("Saldo depois de creditar: R$" + contaEx.getSaldo());
//            } else if (opcao == 3) {
//                System.out.println("Qual é o limite do cartão? ");
//                double limite = input.nextDouble();
//                if (limite > contaEx.getSaldo()) {
//                    System.out.println("Seu saldo é menor do que o limite");
//                }
//            }
//        }
//    }
//}
//         SEGUNDO OBJETO --> Conta 2

//        Conta conta2 = new Conta();
//
//        System.out.println("Numero da conta:");
//        conta2.numero = input.nextInt();//
//        System.out.println("Digite seu nome:");
//        input.nextLine(); // gambiarra para detectar o enter e não pular o nome
//        conta2.nome = input.nextLine();//
//        System.out.println("Seu Saldo:");
//        conta2.saldo = input.nextDouble();//
//        System.out.println("O Limite:");
//        conta2.limite = input.nextDouble();//
//
//        System.out.printf("Numero da Conta: %d\n", conta2.numero);
//        System.out.printf("Nome: %s\n", conta2.nome);
//        System.out.printf("Saldo: R$%.2f\n", conta2.saldo);
//        System.out.printf("Limite: R$%.2f", conta2.limite);


        // ---------------------- CLASSE CLIENTE ----------------------
        // Cliente 2 --> Input
//
//        Cliente clienteEx = new Cliente("0382-99" ,"erik", 'S', 12);

//        System.out.println(clienteEx); // To String
//        System.out.println("Digite seu nome: ");
//        clienteEx.setNome(input.nextLine());
//        System.out.println("Idade: ");
//        int idade = input.nextInt();
//        for (int c = 0; c <= idade; c++) {
//            clienteEx.adicionarIdade();
//        }
//        input.nextLine();
//        System.out.println("Digite seu CPF:");
//        clienteEx.setCPF(input.nextLine());
//        System.out.println("Digite seu Estado Civil:");
//        clienteEx.setEstadoCivil(input.next().charAt(0));

//        System.out.printf("Você é " + clienteEx.verificarMaiorIdadeCliente() + " de idade.\n");// verificar maior idade
//
//        int valor = clienteEx.compararNomes("chapolin","erik");
//
//        if (valor==1){
//            System.out.println("O primeiro nome é igual ao da classe");
//        }else if(valor==2){
//            System.out.println("O segundo nome é igual ao da classe");
//        }else if(valor==3){
//            System.out.println("Os dois nome são iguais ao da classe");
//        }else if (valor==0){
//            System.out.println("Nenhum nome é igual ao da classe");
//        }
//
//        if (clienteEx.validarCPF()) {
//            System.out.println("Seu cpf tem 11 digitos!");
//        } else {
//            System.out.println("Seu cpf NÃO tem 11 digitos.");
//        }
//
//        System.out.printf("Nome: %s\n", clienteEx.getNome());
//        System.out.printf("Idade: %d\n", clienteEx.getIdade());
//        System.out.printf("CPF: %s\n", clienteEx.getCPF());
//        System.out.printf("Estado Civil: %c", clienteEx.getEstadoCivil());
//    }
//}
        // ---------------------- CLASSE PERSONAGEM ----------------------
//
        Personagem personagemEx = new Personagem(1012, "Erik", 5, 10, 15, 0);

//        System.out.println("Digite seu codigo:");
//        personagemEx.setCodigo(input.nextInt());
//        input.nextLine();
//        System.out.println("Digite seu nome:");
//        personagemEx.setNome(input.nextLine());
////        System.out.println("Digite sua força:");
////        personagemEx.forca = input.nextInt();
////        System.out.println("Digite sua saúde:");
////        personagemEx.saude = input.nextInt();
////        System.out.println("Digite seu dinheiro:");
////        personagemEx.dinheiro = input.nextDouble();
//
        while (true){

            boolean resultado;

            System.out.println("""
                   \n[1] Andar => +1 Saúde
                   [2] Correr => +1 Saúde e Força
                   [3] Defender => -1 Saúde
                   [4] Atacar => -1 Saúde e Força
                   [5] Inventário
                   [6] Vender
                   [7] Comprar
                   [8] Sair
                   [9] Andar => +Valor
                   [10] Correr => +Valor
                   [11] Vender
                   [12] Comprar""");
            int opcao = input.nextInt();

            if (opcao == 8){
                break;
            }

            else if (opcao == 1) { //andar
                if (personagemEx.andar()) {
                    System.out.printf("Você andou e talvez achou algum item. Confira seu inventário! Saúde atual: %d | Energia atual: %d", personagemEx.getSaude(), personagemEx.getEnergia());
                } else {
                    System.out.printf("Você não tem energia suficiente! Energia atual: %d", personagemEx.getEnergia());
                }
            }

            else if (opcao == 2) {   // correr
                if (personagemEx.correr()) {
                    System.out.printf("Você correu e talvez achou algum item. Confira seu inventário! Saúde atual: %d | Força atual: %d | Energia atual: %d", personagemEx.getSaude(), personagemEx.getForca(), personagemEx.getEnergia());
                } else {
                    System.out.printf("Você não tem energia suficiente! Energia atual: %d", personagemEx.getEnergia());
                }
            }

            else if (opcao == 3) {
                if (personagemEx.defender()) {   //defender
                    System.out.printf("Você defendeu! Saúde atual: %d", personagemEx.getSaude());
                } else {
                    System.out.println("F, VOCÊ MORREU. . .");
                    break;
                }
            }

            else if (opcao == 4) {
                if (personagemEx.atacar()) {   // atacar
                    System.out.printf("Você atacou! Saúde atual: %d | Força atual: %d", personagemEx.getSaude(), personagemEx.getForca());
                } else {
                    System.out.printf("Você não tem Saúde ou Força suficiente! Saúde atual: %d | Força atual: %d", personagemEx.getSaude(), personagemEx.getForca());
                }
            }

            else if (opcao == 5){
                System.out.printf("""
                              INVENTÁRIO

                        [1]    Cafézinho     (%d)
                        [2] Poção de Energia (%d)
                        [3]      Maçã        (%d)
                        [4]  Poção de Saúde  (%d)
                        Saldo atual: R$%.2f
                        """, personagemEx.cafe, personagemEx.pocaoEnergia, personagemEx.maca, personagemEx.pocaoSaude, personagemEx.getDinheiro());
                int escolha = input.nextInt();
                if (personagemEx.inventario(escolha)){
                    System.out.printf("Você usou um item! Saúde atual: %d | Força atual: %d | Energia atual: %d", personagemEx.getSaude(), personagemEx.getForca(), personagemEx.getEnergia());
                } else{
                    System.out.println("Você não tem esse item ou digitou um valor errado!");
                }
            }

            else if (opcao == 6){   // vender
                System.out.printf("""
                        BEM VINDO AO MERCADO NEGRO!
                        O que você tem pra mim hoje?

                        [1]      Graveto   (%d)
                        [2]    Roupa Velha (%d)
                        [3]     Artefato   (%d)
                        Saldo atual: R$%.2f
                        """, personagemEx.graveto, personagemEx.roupaVelha, personagemEx.artefato, personagemEx.getDinheiro());
                int escolha = input.nextInt();
                if (personagemEx.vender(escolha)){
                    System.out.printf("Você vendeu esse item! Dinheiro atual: R$%.2f", personagemEx.getDinheiro());
                } else {
                    System.out.println("Você não tem esse item ou digitou um valor errado!");
                }
            }

            else if (opcao == 7) {   // comprar
                System.out.printf("""
                        BEM VINDO A LOJA!

                        [1] Cafézinho - R$15
                        [2] Poção de Energia - R$45
                        [3] Maçã - R$25
                        [4] Poção de Saúde - R$75
                        Saldo atual: R$%.2f
                        """, personagemEx.getDinheiro());
                int escolha = input.nextInt();
                if (personagemEx.comprar(escolha)){
                    System.out.printf("Compra realizada com sucesso! Saldo atual: R$%.2f", personagemEx.getDinheiro());
                } else {
                    System.out.printf("Você não tem dinheiro suficiente ou digitou um valor errado! Saldo atual: R$%.2f", personagemEx.getDinheiro());
                }
            }
            else if(opcao == 9){
                System.out.println("Digite o valor que voce quer adicionar à Vida");
                int valor = input.nextInt();
                if (personagemEx.andar(valor)){////////////////////////////
                    System.out.printf("O valor foi adicionado a vida! Vida atual: %d", personagemEx.getSaude());
                } else{
                    System.out.printf("Valor inválido digitado! Vida atual: %d", personagemEx.getSaude());
                }
            } else if(opcao == 10){
                int valor = input.nextInt();
                if (personagemEx.correr(valor)){//////////////////////
                    System.out.printf("O valor foi adicionado a vida e força! Vida: %d. Força: %d", personagemEx.getSaude(), personagemEx.getForca());
                } else{
                    System.out.printf("Valor inválido digitado! Vida: %d. Força: %d", personagemEx.getSaude(), personagemEx.getForca());
                }
            } else if(opcao == 11){
                resultado = personagemEx.atacar(10);
                if (resultado){
                    System.out.printf("Valor diminuido na vida e força! Vida: %d. Força: %d", personagemEx.getSaude(), personagemEx.getForca());
                }
            } else if(opcao == 12){
                resultado = personagemEx.atacar(10);
                if (resultado){
                    System.out.printf("Valor diminuido na vida! Vida: %d.", personagemEx.getSaude());
                }
            } else if(opcao == 13){
                resultado = personagemEx.vender(10, 20); // sobrecarga
                int valorVendido = 10 * 20;
                if (resultado){
                    System.out.printf("Você vendeu e ganhou %d", valorVendido);
                }
            }
        }
        System.out.println("\nEstatisticas finais:");
        System.out.printf("Codigo: %d\n", personagemEx.getCodigo());
        System.out.printf("Nome: %s\n", personagemEx.getNome());
        System.out.printf("Força: %d\n", personagemEx.getForca());
        System.out.printf("Saúde: %d\n", personagemEx.getSaude());
        System.out.printf("Dinheiro: R$%.2f", personagemEx.getDinheiro());
    }
}