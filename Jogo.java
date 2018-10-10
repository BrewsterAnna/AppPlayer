package negocio;

public class Jogo {
	
	private String nome;
	private int anoCriacao;
	private String[] jogadores;
	private Criador criador;
	private Atualizacao atualizacao;
	private Informacao informacao;
	
	public void divulgar() {
		System.out.println("nome: "+nome+", ano de criação: "+anoCriacao+", jogadores: "+jogadores.length+");"
				);
		
		informacao.divulgar();
		atualizacao.divulgar();
		criador.divulgar();
	}
	
		
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getAnoCriacao() {
		return anoCriacao;
	}


	public void setAnoCriacao(int anoCriacao) {
		this.anoCriacao = anoCriacao;
	}


	public String[] getJogadores() {
		return jogadores;
	}


	public void setJogadores(String[] jogadores) {
		this.jogadores = jogadores;
	}


	public Criador getCriador() {
		return criador;
	}


	public void setCriador(Criador criador) {
		this.criador = criador;
	}


	public Atualizacao getAtualizacao() {
		return atualizacao;
	}


	public void setAtualizacao(Atualizacao atualizacao) {
		this.atualizacao = atualizacao;
	}


	public Informacao getInformacao() {
		return informacao;
	}


	public void setInformacao(Informacao informacao) {
		this.informacao = informacao;
	}
}
