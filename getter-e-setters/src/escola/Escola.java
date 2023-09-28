package escola;

public class Escola {
    public static void main(String[] args) {
		Aluno karoline = new Aluno();
		karoline.setNome("Karoline");
		karoline.setIdade(22);
		
		System.out.println("A aluna " + karoline.getNome() + " tem " + karoline.getIdade() + " anos ");	
	}
}
