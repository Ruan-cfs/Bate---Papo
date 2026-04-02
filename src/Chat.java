import java.util.ArrayList;

public class Chat {
    private ArrayList<Usuario> usuarios;
    private ArrayList<Mensagem> mensagens;

    public Chat() {
        usuarios = new ArrayList<>();
        mensagens = new ArrayList<>();
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public Usuario buscarUsuario(String nome) {
        for (Usuario u : usuarios) {
            if (u.getNome().equalsIgnoreCase(nome)) {
                return u;
            }
        }
        return null;
    }

    public void enviarMensagem(Usuario remetente, Usuario destinatario, String texto) {
        mensagens.add(new Mensagem(remetente, destinatario, texto));
    }

    public void exibirMensagens() {
        System.out.println("\n--- Histórico ---");
        for (Mensagem m : mensagens) {
            System.out.println(m.exibir());
        }
    }

    public void listarUsuarios() {
        System.out.println("\nUsuários cadastrados:");
        for (Usuario u : usuarios) {
            System.out.println("- " + u.getNome());
        }
    }
}
