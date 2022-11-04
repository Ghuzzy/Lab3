package agenda;

public class Contato {
	
	private String nome;
	private String sobrenome;
	private String telefone;
	
	public Contato(String nome, String sobrenome, String telefone) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.telefone = telefone;
	}
	public String getNome() {
		return nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public String getTelefone() {
		return telefone;
	}
	
	public String nomeCompleto() {
		return nome + " " + sobrenome;
	}
	public boolean equals(Contato contato) {
		if(contato.getNome().equals(this.nome) && contato.getSobrenome().equals(this.sobrenome)) {
		return true;
	}
		return false;
	}
	

}
