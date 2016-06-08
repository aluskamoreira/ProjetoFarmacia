// Classe Funcionario que herda super classe Pessoa
package model;

//Class Funcionario estende da Classe Pessa// 
//Classe Publica
public class Funcionario extends Pessoa{
	private double salarioBase, comissao;

	public Funcionario(String nome, String cpf, String endereco, String telefone, double salarioBase) {
		super(nome, cpf, endereco, telefone);
		this.salarioBase = salarioBase;
	}

	public void setComissao(double valor){
		comissao += valor;
	}
	
	public double salario(){
		return salarioBase + comissao;
	}
	
	//Classe funcionario finalizada.
	
}
