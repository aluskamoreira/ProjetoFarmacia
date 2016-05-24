// Classe Cliente que herda atributos da super classe Pessoa
package model;

import java.util.ArrayList;

//Classe de Cliente se estende de Pessoa, em JAVA//

public class Cliente extends Pessoa{
	private ArrayList<Pedido> historicoCompras = new ArrayList<Pedido>();

	public Cliente(String nome, String cpf, String endereco, String telefone) {
		super(nome, cpf, endereco, telefone);
	}
	
	public void adicionarPedido(Pedido pedido) {
		historicoCompras.add(pedido);
	}
	
	//Classe cliente finalizada.
}
