public class App {
    public static void main(String[] args) throws Exception {
        StartTv televisao = new StartTv();
        
        System.out.println(televisao.aumentarVolume());
        System.out.println(televisao.botaoLigar());
        System.out.println(televisao.aumentarVolume());
        System.out.println(televisao.aumentarVolume());
        System.out.println(televisao.proximoCanal());
        System.out.println(televisao.canal);
        System.out.println(televisao.escolherCanal(12));
    }
}
