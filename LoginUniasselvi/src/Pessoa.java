
public abstract class Pessoa {
	private String nome;
	private String login;
	private String senha;
	boolean cadastro;
	
	public Pessoa() {
		this.nome = "";
		this.login = "";
		this.senha = "";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public boolean getCadastro() {
		return cadastro;
	}
	
	public void setCadastro(boolean cadastro) {
		this.cadastro = cadastro;
	}
	
	public void cadastro() {
		this.setCadastro(true);
		System.out.println("Acessando ao Gioconda");
	}
	
	public void semcadastro() {
		this.setCadastro(false);
		System.out.println("Você não possui cadastro no Gioconda");
	}
	
}
