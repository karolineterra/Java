public class MSNMessenger extends ServicoMensagemInstantanea {

    @Override
    public void enviarMensagem() {
        System.out.println("Enviando mensagem pelo msn");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo msn");
    }
    
}
