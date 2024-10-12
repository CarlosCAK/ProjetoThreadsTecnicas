import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criar um cliente
        System.out.print("Digite o nome do cliente: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o CPF do cliente: ");
        String cpf = scanner.nextLine();
        System.out.print("Digite o email do cliente: ");
        String email = scanner.nextLine();
        Cliente cliente = new Cliente(nome, cpf, email);

        // Criar itens disponíveis
        Item item1 = new Item(1, "Livro de Java", "Aprenda Java do zero", 59.90);
        Item item2 = new Item(2, "Curso de Python", "Curso completo de Python", 199.90);
        Item item3 = new Item(3, "Livro de Design Patterns", "Aprenda Design Patterns em Java", 79.90);

        // Menu de interação
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar item ao carrinho");
            System.out.println("2. Fazer pedido");
            System.out.println("3. Visualizar carrinho");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Itens disponíveis:");
                    System.out.println("1. " + item1.getTitulo() + ": R$" + item1.getPreco());
                    System.out.println("2. " + item2.getTitulo() + ": R$" + item2.getPreco());
                    System.out.println("3. " + item3.getTitulo() + ": R$" + item3.getPreco());
                    System.out.print("Escolha o item a adicionar (1-3): ");
                    int escolha = scanner.nextInt();

                    switch (escolha) {
                        case 1:
                            cliente.getCarrinho().addItem(item1);
                            System.out.println("Item adicionado: " + item1.getTitulo());
                            break;
                        case 2:
                            cliente.getCarrinho().addItem(item2);
                            System.out.println("Item adicionado: " + item2.getTitulo());
                            break;
                        case 3:
                            cliente.getCarrinho().addItem(item3);
                            System.out.println("Item adicionado: " + item3.getTitulo());
                            break;
                        default:
                            System.out.println("Escolha inválida.");
                            break;
                    }
                    break;
                case 2:
                    cliente.fazerPedido();
                    break;
                case 3:
                    System.out.println("Itens no carrinho de " + cliente.getNome() + ":");
                    for (Item item : cliente.getCarrinho().getItems().values()) {
                        System.out.println("- " + item.getTitulo() + ": R$" + item.getPreco());
                    }
                    break;
                case 4:
                    System.out.println("Saindo...");
                    scanner.close();
                    return; // Termina a execução do programa
                default:
                    System.out.println("Escolha inválida.");
                    break;
            }
        }
    }
}
