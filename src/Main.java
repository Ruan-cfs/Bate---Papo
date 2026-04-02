import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Chat chat = new Chat();

        int opcao;

        do {
            System.out.println("\n1 - Criar usuário");
            System.out.println("2 - Enviar mensagem");
            System.out.println("3 - Ver mensagens");
            System.out.println("4 - Listar usuários");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = scan.nextInt();
            scan.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    System.out.print("Nome do usuário: ");
                    String nome = scan.nextLine();
                    chat.adicionarUsuario(new Usuario(nome));
                    break;

                case 2:
                    System.out.print("Remetente: ");
                    String rem = scan.nextLine();

                    System.out.print("Destinatário: ");
                    String dest = scan.nextLine();

                    Usuario remetente = chat.buscarUsuario(rem);
                    Usuario destinatario = chat.buscarUsuario(dest);

                    if (remetente != null && destinatario != null) {
                        System.out.print("Mensagem: ");
                        String msg = scan.nextLine();
                        chat.enviarMensagem(remetente, destinatario, msg);
                    } else {
                        System.out.println("Usuário não encontrado!");
                    }
                    break;

                case 3:
                    chat.exibirMensagens();
                    break;

                case 4:
                    chat.listarUsuarios();
                    break;
            }

        } while (opcao != 0);

        scan.close();
    }
}
