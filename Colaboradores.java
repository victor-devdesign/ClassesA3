
public class Colaboradores {
	private String nome;
	private String login;
	private String senha;
	public float numeroDeHoras;
	
	//atributos
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
	public float getNumeroDeHoras() {
		return numeroDeHoras;
	}
	public void setNumeroDeHoras(float numeroDeHoras) {
		this.numeroDeHoras = numeroDeHoras;
	}
	
	//Métodos
	boolean autentica(String senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	

}
