public class ComputadorPedro {
    public static void main(String[] args) {
        MSNMenssager msn = new MSNMenssager();

        msn.enviarMensagem();
        msn.receberMensagem();
    
        FacebookMenssager fcb = new FacebookMenssager();

        fcb.enviarMensagem();
        fcb.receberMensagem();
    
        Telegram tlg = new Telegram();

        tlg.enviarMensagem();
        tlg.receberMensagem();
    }
}