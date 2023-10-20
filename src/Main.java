import com.desafio.IPhone;

public class Main {
    public static void main(String[] args) {
        IPhone iPhone = new IPhone();

        // Acessar Internet
        iPhone.adicionarNovaAba();
        iPhone.exibirPagina();

        // Pausar Música
        iPhone.pausar();

        // Fazer ligação
        iPhone.ligar();
        iPhone.iniciarCorreioDeVoz();

        // Ouvir Música
        iPhone.selecionarMusica("O Telefone tocou novamente - Jorge Ben Jor");
        iPhone.tocar();
    }
}
