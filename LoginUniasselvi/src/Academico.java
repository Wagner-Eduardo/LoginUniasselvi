
public class Academico extends Pessoa {
	private String cpf;
	
	public Academico() {
		super();
		this.cpf = "";
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
		
}

public void mudarCadastro() {
	
	if(this.getCadastro() == true) {
		this.setSenha("01234578rjfgst");
		System.out.println("Senha alterada para ");
		
	} else {
		System.out.println("não foi possível alterar sua senha");
		
	}
}

public void criarCadastro() {
	
		if(this.getCadastro() == false) {
			System.out.println("Nome: " + this.getNome());
			System.out.println("Login: " + this.getLogin());
			System.out.println("Senha: " + this.getSenha());
			System.out.println("Cpf: " + this.getCpf());
		}
	}
}