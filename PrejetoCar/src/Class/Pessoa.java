package Class;
public class Pessoa {

	private String nome;
	private String numeroDeTelefone;
	private String email;

	public Pessoa() {

	}

	public Pessoa(String nome, String numeroDeTelefone, String email) {
		setNome(nome);
		setNumeroDeTelefone(numeroDeTelefone);
		setEmail(email);
	}

	public String toString() {
		return "nome: " + this.nome + "\n" + "numero de telefone: " + this.numeroDeTelefone + "\n" + "email: " + this.email;
	}

	public String getNome() {
		return nome;
	}

	public String getNumeroDeTelefone() {
		return numeroDeTelefone;
	}

	public String getEmail() {
		return email;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setNumeroDeTelefone(String numeroDeTelefone) {
		this.numeroDeTelefone = numeroDeTelefone;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
