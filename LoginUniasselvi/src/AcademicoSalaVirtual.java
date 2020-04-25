
public class AcademicoSalaVirtual extends Pessoa {
	private String email;
	
	public AcademicoSalaVirtual() {
		super();
		this.email = "";

}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
			System.out.println("E-mail: " + this.getEmail());
		}
	}
}