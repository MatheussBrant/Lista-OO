import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        List<String> tarefas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nComandos disponíveis:");
            System.out.println("- \"adicionar\" para adicionar uma nova tarefa");
            System.out.println("- \"listar\" para listar as tarefas");
            System.out.println("- \"concluir\" para marcar uma tarefa como concluída");
            System.out.println("- \"sair\" para sair do programa");
            System.out.print("\nDigite um comando: ");
            String comando = scanner.nextLine();

            if (comando.equals("sair")) {
                break;
            } else if (comando.equals("adicionar")) {
                System.out.print("Digite a descrição da tarefa: ");
                String tarefa = scanner.nextLine();
                tarefas.add(tarefa);
                System.out.println("\nTarefa adicionada com sucesso!");
            } else if (comando.equals("listar")) {
                if (tarefas.isEmpty()) {
                    System.out.println("\nTarefas pendentes:");
                    System.out.println("(Nenhuma tarefa pendente)");
                } else {
                    System.out.println("\nTarefas pendentes:");
                    for (int i = 0; i < tarefas.size(); i++) {
                        System.out.println((i + 1) + ". " + tarefas.get(i));
                    }
                }
            } else if (comando.equals("concluir")) {
                System.out.print("Digite o número da tarefa a ser concluída: ");
                int numeroTarefa = scanner.nextInt();
                scanner.nextLine(); 
                if (numeroTarefa > 0 && numeroTarefa <= tarefas.size()) {
                    String tarefaConcluida = tarefas.remove(numeroTarefa - 1);
                    System.out.println("\nTarefa \"" + tarefaConcluida + "\" marcada como concluída.");
                } else {
                    System.out.println("\nNúmero de tarefa inválido.");
                }
            } else {
                System.out.println("\nComando desconhecido.");
            }
        }

        scanner.close();
    }
}
