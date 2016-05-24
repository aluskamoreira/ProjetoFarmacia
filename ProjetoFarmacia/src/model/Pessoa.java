// Super Classe Pessoa 
//Recebe outro nome como Classe Mãe
package model;

public class Pessoa {
	private String nome;
	private String cpf;
	private String endereco;
	private String telefone;
	
	public Pessoa(String nome, String cpf, String endereco, String telefone) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	//Metodo validação de cpf
	public void validarCPF(String cpf){
		
		int[] arrayCPF = new int[11];
		
		int i = 0;
		int calc1 = 0;
		int calc2 = 0;
		int cont1 = 10;
		int cont2 = 11;
		int primeiroDigito;
		int segundoDigito;
		
        //Instancia o array com o CNPJ
		for(i = 0; i < 11; i++){
			arrayCPF[i] = (int)cpf.charAt(i) - 48;
		}
		
		
        //Calculo do primeiro digito verificador
		for(i = 0; i < 9; i++){
			calc1 =  calc1 + (arrayCPF[i] * cont1);
			cont1--;
		}
		primeiroDigito = calc1 % 11;
		if(primeiroDigito < 2){
			primeiroDigito = 0;
		}else{
			primeiroDigito = 11 - primeiroDigito;
		}

		
        //Calculo do segundo digito verificador
		for(i = 0; i < 10; i++){
			calc2 = calc2 + (arrayCPF[i] * cont2);
			cont2--;
		}
		segundoDigito = calc2 % 11;
		if(segundoDigito < 2){
			segundoDigito = 0;
		}else{
			segundoDigito = 11 - segundoDigito;
		}

		
		if(primeiroDigito == arrayCPF[9] && segundoDigito == arrayCPF[10]){
			System.out.println("CPF válido!");
		}else{
			System.out.println("CPF inválido!");
		}
	//Super classe pessoa finalizada.	
	}
	
}
