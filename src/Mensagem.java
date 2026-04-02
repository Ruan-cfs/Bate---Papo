public class Mensagem {
    private Usuario remetente;
    private Usuario destinatario;
    private String conteudo;

    public Mensagem(Usuario remetente, Usuario destinatario, String conteudo) {
        this.remetente = remetente;
        this.destinatario = destinatario;
        this.conteudo = conteudo;
    }

    public String exibir() {
        return remetente.getNome() + " -> " + destinatario.getNome() + ": " + conteudo;
    }
}
