public class ComputadorPedro {
    public static void main(String[] args) {
        System.out.println("MSN: ");
        MSNMessenger msn = new MSNMessenger();
        msn.enviarMensagem();
        msn.receberMensagem();
    
        FacebookMessenger fcb = new FacebookMessenger();
        System.out.println("FACEBOOK MESSENGER: ");
        fcb.enviarMensagem();
        fcb.receberMensagem();
    
        Telegram tlg = new Telegram();
        System.out.println("TELEGRAM: ");
        tlg.enviarMensagem();
        tlg.receberMensagem();
    }
}