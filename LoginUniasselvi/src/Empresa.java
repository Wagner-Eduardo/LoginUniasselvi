
public class Empresa extends Pessoa {
	private String cnpj;
	
	public Empresa() {
		super();
		this.cnpj = "";
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
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
				System.out.println("Cnpj: " + this.getCnpj());
			}
		}
	}
