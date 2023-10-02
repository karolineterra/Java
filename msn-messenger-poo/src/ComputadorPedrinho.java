public class ComputadorPedrinho {
    public static void main(String[] args) {
        MSNMessenger msn = new MSNMessenger();
        msn.enviarMensagem();
        msn.receberMensagem();

        FacebookMessenger facebook = new FacebookMessenger();
        facebook.enviarMensagem();
        facebook.receberMensagem();

        TelegramMessenger telegram = new TelegramMessenger();
        telegram.enviarMensagem();
        telegram.receberMensagem();

    }
}
