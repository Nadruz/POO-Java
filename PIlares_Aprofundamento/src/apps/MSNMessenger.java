package apps;
public class MSNMessenger extends ServicoMensagemInstantanea { // Classe Filha
    public void enviarMensagem() {
        validarConectadointernet();
        System.out.println("Enviando mensagem pelo MSN Messenger");
    }
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo MSN Messenger");
    }

}
