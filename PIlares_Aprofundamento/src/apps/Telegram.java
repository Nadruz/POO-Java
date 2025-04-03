package apps;
public class Telegram extends ServicoMensagemInstantanea { // Classe Filha
    public void enviarMensagem() {
        validarConectadointernet();
        System.out.println("Enviando mensagem pelo Telegram");
    }
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Telegram");
    }
}

