import java.util.Scanner;

public class CRUD {
    static final int MAX = 100;
    static String[] registros = new String[MAX];
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("Opções:");
            System.out.println("[0] - Sair");
            System.out.println("[1] - Cadastrar");
            System.out.println("[2] - Pesquisar");
            System.out.println("[3] - Alterar");
            System.out.println("[4] - Excluir");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 0:
                    System.out.println("Saindo...");
                    break;
                case 1:
                    cadastrar();
                    break;
                case 2:
                    pesquisar();
                    break;
                case 3:
                    alterar();
                    break;
                case 4:
                    excluir();
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }

    static void cadastrar() {
        System.out.print("Digite o registro para cadastrar: ");
        String registro = scanner.next();
        for (int i = 0; i < registros.length; i++) {
            if (registros[i] == null) {
                registros[i] = registro;
                System.out.println("Registro cadastrado com sucesso!");
                return;
            }
        }
        System.out.println("Limite de registros atingido!");
    }

    static void pesquisar() {
        System.out.print("Digite o registro a pesquisar: ");
        String registro = scanner.next();
        for (int i = 0; i < registros.length; i++) {
            if (registro.equals(registros[i])) {
                System.out.println("Registro encontrado na posição " + i);
                return;
            }
        }
        System.out.println("Registro não encontrado!");
    }

    static void alterar() {
        System.out.print("Digite o registro a ser alterado: ");
        String registroAntigo = scanner.next();
        System.out.print("Digite o novo registro: ");
        String novoRegistro = scanner.next();
        for (int i = 0; i < registros.length; i++) {
            if (registroAntigo.equals(registros[i])) {
                registros[i] = novoRegistro;
                System.out.println("Registro alterado com sucesso!");
                return;
            }
        }
        System.out.println("Registro não encontrado!");
    }

    static void excluir() {
        System.out.print("Digite o registro a ser excluído: ");
        String registro = scanner.next();
        for (int i = 0; i < registros.length; i++) {
            if (registro.equals(registros[i])) {
                registros[i] = null;
                System.out.println("Registro excluído com sucesso!");
                return;
            }
        }
        System.out.println("Registro não encontrado!");
    }
}
