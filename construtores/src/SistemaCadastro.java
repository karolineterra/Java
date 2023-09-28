public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa karoline = new Pessoa("3209230434", "Karoline");
        karoline.setEndereco("Rua das Marias");

        System.out.println(karoline.getNome() + "-" + karoline.getCpf());
    }
}
