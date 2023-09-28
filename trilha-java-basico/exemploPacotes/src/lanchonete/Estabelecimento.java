package lanchonete;

import lanchonete.area.cliente.Cliente;
import lanchonete.atendimento.Atendente;
import lanchonete.atendimento.cozinha.*;


public class Estabelecimento {
	public static void main(String[] args) {
		Cozinheiro cozinheiro = new Cozinheiro();
		
		//ações que estabelecimento precisa ter ciência
		cozinheiro.adicionarSucoNoBalcao();;
		cozinheiro.adicionarLancheNoBalcao();
		cozinheiro.adicionarComboNoBalcao();
		
		Almoxarife almoxarife = new Almoxarife();
		//ações que não precisam estarem disponíveis para toda a aplicação
		
		Atendente atendente = new Atendente();
		atendente.receberPagamento();
		atendente.servindoMesa();
		
		Cliente cliente = new Cliente();
		cliente.escolherLanche();
		cliente.fazerPedido();
		cliente.pagarConta();
		
		
	}
}
