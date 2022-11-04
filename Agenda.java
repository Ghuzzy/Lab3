package agenda;

/**
 * Uma agenda que mantém uma lista de contatos com posições. Podem existir 100
 * contatos.
 * 
 * @author nazareno
 *
 */
public class Agenda {

	private static final int TAMANHO_AGENDA = 100;

	private int[] favoritos = new int [10];

	private Contato[] contatos; // apenas uma simplificacao de contato

	/**
	 * Cria uma agenda.
	 */
	public Agenda() {
		this.contatos = new Contato[TAMANHO_AGENDA];
	}
	

	/**
	 * Acessa a lista de contatos mantida.
	 * 
	 * @return O array de contatos.
	 */
	public String[] getContatos() {
		String[] clone = new String[100];
		for (int i = 0; i < this.contatos.length; i++) {
			if (this.contatos[i] != null) {
				clone[i] = this.contatos[i].toString();
			} else {
				clone[i] = null;
			}
		}
		return clone;
	}

	/**
	 * Acessa os dados de um contato específico.
	 * 
	 * @param posicao Posição do contato na agenda.
	 * @return Dados do contato. Null se não há contato na posição.
	 */
	public String getContato(int posicao) {
		if (contatos[posicao] == null) {
			return null;
		}
		if(estaNosFavoritos(posicao)) {
			return "❤ " + contatos[posicao-1].getNome() + contatos[posicao-1].getSobrenome() + "\n" + contatos[posicao-1].getTelefone();
		}	
		return contatos[posicao-1].getNome() + contatos[posicao-1].getSobrenome() + "\n" + contatos[posicao-1].getTelefone();
	}

	/**
	 * Cadastra um contato em uma posição. Um cadastro em uma posição que já existe
	 * sobrescreve o anterior.
	 * 
	 * @param posicao   Posição do contato.
	 * @param nome      Nome do contato.
	 * @param sobrenome Sobrenome do contato.
	 * @param telefone  Telefone do contato.
	 */
	public void cadastraContato(int posicao, String nome, String sobrenome, String telefone) {
		Contato contato = new Contato(nome, sobrenome, telefone);
		if (nome.equals("")){
			System.out.println("CONTATO INVALIDO");
			throw new IllegalArgumentException("CONTATO INVALIDO AO MENOS O NOME DEVE SER PREENCHIDO");
		}

		if (posicao > 100 || posicao < 1) {
			System.out.println("POSICAO INVALIDA");
		} else if (jaCadastrado(contato)) {
			System.out.println("CONTATO JÁ CADASTRADO");
			throw new IllegalArgumentException("CONTATO JA CADASTRADO");
		} else {
			System.out.println("CADASTRO REALIZADO");
			this.contatos[posicao - 1] = contato;
		}
	}

	public boolean jaCadastrado(Contato contato) {
		for (int i = 0; i < this.contatos.length; i++) {
			if (this.contatos[i] != null) {
				if (this.contatos[i].equals(contato)) {
					return true;
				}
			}
		}
		return false;
	}

	public void adicionarFavorito(int contato, int posicao) {
		this.favoritos[posicao-1] = contato;
		System.out.println("CONTATO FAVORITADO NA POSIÇÃO " + contato + "!");
	}
	public void removerDosFavoritos(int posicao) {
		this.favoritos[posicao - 1] = 0;
	}
	public boolean estaNosFavoritos(int posicao) {
		for(int i = 0; i < 10; i++) {
			if(posicao == favoritos[i] & favoritos[i] != 0){
				return true;
			}
		}
		return false;
	}
	public String[] getFavoritos() {
		String[] clone = new String[10];
		for (int i = 0; i < this.favoritos.length; i++) {
			if (this.favoritos[i] != 0) {
				clone[i] = this.contatos[favoritos[i]-1].toString();
			} else {
				clone[i] = null;
			}
		}
		return clone;
	}

}
