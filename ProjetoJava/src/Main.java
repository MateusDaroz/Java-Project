
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Cliente> arrClientes = new ArrayList<>();
        ArrayList<Funcionario> arrFuncionarios = new ArrayList<>();
        ArrayList<Computador> arrComputadores = new ArrayList<>();

        arrClientes.add(new Cliente("Mateus Daroz", 18, "matlicoop@gmail.com", "35035035094", 981509848));
        arrClientes.add(new Cliente("Tânia Basso", 31, "taniab@gmail.com", "55544433322", 991485230));
        arrFuncionarios.add(new Funcionario("Miguel Cyrineu Vale", 22,"12312312312", 1450.5));
        arrFuncionarios.add(new Funcionario("Wendel Tolentino Alves Frota", 24,"00000000000", 1983.2));
        arrComputadores.add(new Computador("H55 DDR3, Intel Core i3-530 e 4GB RAM DDR3 (2x2GB)",1000,"NVIDIA GT210 512Mb DDR3","HD SeaGate 1TB","T-Dagger 500W"));
        arrComputadores.add(new Computador("B760M DDR5, Intel i9-13900KS E 32GB RAM DDR5 (2x16GB)",3000,"NVIDIA GeForce RTX 4080 16GB GDDR6X","SSD Corsair 8TB","Corsair Hx1500i 1500W 80 Plus Platinum"));

        /* TESTES DE EXCEPTION
        arrClientes.add(new Cliente("Ronaldo",34,"romulo", "11111111111", 3232));
        arrClientes.add(new Cliente("Joao",12,"joao@gmail.com","1",5555));
         */


        String scannerString;
        int scannerInt;

        boolean encontrado=false;

        System.out.println("Olá, seja bem vindo a LMComputer Tech, onde você encontrará os melhores produtos para computadores!\nSelecione uma das opções abaixo:");
        while (true) {
            encontrado=false;
            System.out.println("\n1 - Cadastro de Pessoas");
            System.out.println("2 - Exclusão de Pessoas");
            System.out.println("3 - Busca de Pessoas");
            System.out.println("4 - Cadastro de Computadores");
            System.out.println("5 - Exclusão de Computadores");
            System.out.println("6 - Busca de Computadores");
            System.out.println("7 - Métodos de Cliente");
            System.out.println("8 - Métodos de Computadores");
            switch (new Scanner(System.in).nextInt()) {
                case 1:
                    System.out.println("1 - Cadastro de Cliente");
                    System.out.println("2 - Cadastro de Funcionários");
                    System.out.println("3 - Voltar");
                    switch (new Scanner(System.in).nextInt()) {
                        case 1:
                            System.out.println("Insira os dados do cliente nessa ordem: Nome, Idade, Email, CPF e Telefone");
                            arrClientes.add(new Cliente(new Scanner(System.in).nextLine(), new Scanner(System.in).nextInt(), new Scanner(System.in).nextLine(), new Scanner(System.in).nextLine(), new Scanner(System.in).nextInt()));
                            continue;
                        case 2:
                            System.out.println("Insira os dados do funcionário nessa ordem: Nome, Idade, CPF e Salário");
                            arrFuncionarios.add(new Funcionario(new Scanner(System.in).nextLine(), new Scanner(System.in).nextInt(), new Scanner(System.in).nextLine(), new Scanner(System.in).nextDouble()));
                            continue;
                        case 3:
                            continue;
                        default:
                            System.out.println("Opção inválida! Tente novamente");
                            continue;
                    }
                case 2:

                    System.out.println("1 - Exclusão de Cliente");
                    System.out.println("2 - Exclusão de Funcionários");
                    System.out.println("3 - Voltar");
                    switch (new Scanner(System.in).nextInt()) {
                        case 1:
                            System.out.println("Insira o CPF do cliente a ser excluído: ");
                            scannerString = new Scanner(System.in).nextLine();
                            for (Cliente c : arrClientes) {
                                if (c.getCpf().equals(scannerString)) {
                                    arrClientes.remove(c);
                                    encontrado=true;
                                    System.out.println("O cliente com o CPF: "+c.getCpf()+" foi excluído com sucesso!");
                                    break;
                                }
                            }
                            if(!encontrado)
                                System.out.println("O CPF informado não foi encontrado!");
                            continue;

                        case 2:
                            System.out.println("Insira o CPF do funcionário a ser excluído: ");
                            scannerString = new Scanner(System.in).nextLine();
                            for (Funcionario f : arrFuncionarios) {
                                if (f.getCpf().equals(scannerString)) {
                                    arrFuncionarios.remove(f);
                                    encontrado=true;
                                    System.out.println("O funcionário com o CPF: "+f.getCpf()+" foi excluído com sucesso!");
                                    break;
                                }
                            }
                            if(!encontrado)
                                System.out.println("O CPF informado não foi encontrado!");
                            continue;
                        case 3:
                            continue;
                        default:
                            System.out.println("Opção inválida! Tente novamente");
                            continue;
                    }

                case 3:
                    System.out.println("1 - Busca de Cliente");
                    System.out.println("2 - Busca de Funcionários");
                    System.out.println("3 - Voltar");

                    switch (new Scanner(System.in).nextInt()) {
                        case 1:
                            System.out.println("Insira o nome (ou parte dele) do cliente a ser encontrado:");
                            scannerString = new Scanner(System.in).nextLine();
                            for (Cliente c : arrClientes) {
                                if (c.getNome().toLowerCase().startsWith(scannerString.toLowerCase())) {
                                    System.out.println(c.exibirDados()+"\n");
                                    encontrado = true;
                                }
                            }
                                if(!encontrado)
                                    System.out.println("O nome informado não foi encontrado!");
                                continue;
                        case 2:
                            System.out.println("Insira o nome (ou parte dele) do funcionário a ser encontrado:");
                            scannerString = new Scanner(System.in).nextLine();
                            for (Funcionario f : arrFuncionarios) {
                                if (f.getNome().toLowerCase().startsWith(scannerString.toLowerCase())) {
                                    System.out.println(f.exibirDados()+"\n");
                                    encontrado = true;
                                }
                            }
                                if(!encontrado)
                                    System.out.println("O nome informado não foi encontrado!");
                                continue;
                        case 3:
                            continue;
                        default:
                            System.out.println("Opção inválida! Tente novamente");
                            continue;
                    }

                case 4:
                    MetodosProduto.montarComputador(arrComputadores);
                    continue;

                case 5:
                    System.out.println("Digite o ID do computador a ser excluído: ");
                    scannerInt = new Scanner(System.in).nextInt();
                    for(Computador a : arrComputadores){
                        if(a.getCodProduto() == scannerInt) {
                            arrComputadores.remove(a);
                            encontrado = true;
                            System.out.println("O computador com o ID: "+a.getCodProduto()+" foi excluído com sucesso!");
                            break;
                        }
                    }
                    if(!encontrado)
                        System.out.println("O ID inserido não foi encontrado!");
                    continue;

                case 6:
                    System.out.println("1 - Busca por Descrição");
                    System.out.println("2 - Busca por Código");
                    System.out.println("3 - Busca por Preços");
                    System.out.println("4 - Voltar");

                    switch (new Scanner(System.in).nextInt()) {
                        case 1:
                            System.out.println("Digite uma parte da descrição: ");
                            scannerString = new Scanner(System.in).nextLine();
                            for (Computador a : arrComputadores) {
                                if (a.getDescricao().toLowerCase().contains(scannerString.toLowerCase())) {
                                    System.out.println(a.toString()+"\n");
                                    encontrado = true;
                                }
                            }
                            if(!encontrado)
                                System.out.println("Computador não encontrado!");
                            continue;

                        case 2:
                            System.out.println("Digite o código do Computador: ");
                            int escolha = new Scanner(System.in).nextInt();
                            for (Computador a : arrComputadores) {
                                if (escolha == a.getCodProduto()) {
                                    System.out.println(a.toString()+"\n");
                                    encontrado=true;
                                    break;
                                }
                            }
                            if(!encontrado)
                                System.out.println("Computador não encontrado!");
                            continue;

                        case 3:
                            System.out.println("Digite o preço do seu computador: ");
                            scannerInt = new Scanner(System.in).nextInt();
                            for(Computador c : arrComputadores) {
                                if (c.getPreco() == scannerInt) {
                                    System.out.println(c.toString()+"\n");
                                    encontrado = true;
                                }
                            }
                                if(!encontrado)
                                    System.out.println("Computador não encontrado!");
                                continue;

                        case 4:
                            continue;
                        default:
                            System.out.println("Opção inválida! Tente novamente");
                            continue;
                    }

                case 7:
                    System.out.println("1 - Cliente mais velho");
                    System.out.println("2 - Cliente mais jovem");
                    System.out.println("3 - Clientes maiores de 60 anos");
                    System.out.println("4 - Cliente menores de 18 anos");
                    System.out.println("5 - Media das idades dos Clientes");
                    System.out.println("6 - Voltar");
                    switch (new Scanner(System.in).nextInt()){
                        case 1:
                            System.out.println(MetodosCliente.maisVelho(arrClientes).exibirDados());
                            continue;
                        case 2:
                            System.out.println(MetodosCliente.maisJovem(arrClientes).exibirDados());
                            continue;
                        case 3:
                            System.out.println("A quantidade de clientes maiores de 60 anos é: " + MetodosCliente.maiorSessenta(arrClientes));
                            continue;
                        case 4:
                            System.out.println("A quantidade de clientes menores de 18 anos é: " + MetodosCliente.menorDezoito(arrClientes));
                            continue;
                        case 5:
                            System.out.println("A média das idades dos clientes cadastrados no sistema é: " + MetodosCliente.mediaIdades(arrClientes));
                            continue;
                        case 6:
                            continue;
                        default:
                            System.out.println("Opção inválida! Tente novamente");
                            continue;
                    }

                case 8:
                    System.out.println("1 - Computador mais caro");
                    System.out.println("2 - Computador mais barato");
                    System.out.println("3 - Media dos preços dos Computadores");
                    System.out.println("4 - Computadores acima da média dos preços");
                    System.out.println("5 - Voltar");

                    switch (new Scanner(System.in).nextInt()){
                        case 1:
                            System.out.println(MetodosProduto.maisCaro(arrComputadores));
                            continue;
                        case 2:
                            System.out.println(MetodosProduto.maisBarato(arrComputadores));
                            continue;
                        case 3:
                            System.out.println("A média dos preços dos computadores cadastrados no sistema é: " + MetodosProduto.mediaPreco(arrComputadores));
                            continue;
                        case 4:
                            System.out.println("A quantidade de computadores acima da média de preços é: " + MetodosProduto.acimaMedia(arrComputadores));
                            continue;
                        case 5:
                            continue;
                        default:
                            System.out.println("Opção inválida! Tente novamente");
                            continue;
                    }
                default:
                    System.out.println("Opção inválida! Tente novamente");
                    continue;
            }
        }
    }
}