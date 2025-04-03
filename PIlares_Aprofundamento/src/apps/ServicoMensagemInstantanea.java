package apps;
public abstract class ServicoMensagemInstantanea { // Classe Pai
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    protected void validarConectadointernet() {
        System.out.println("Validando se está conectado a internet");
    }
}
