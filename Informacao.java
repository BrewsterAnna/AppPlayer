package negocio;

public class Informacao {
	private int qtdeFase;
	private boolean acao;
	private float valor;

	public void divulgar() {
		System.out.println("Quantidade de fases: "+qtdeFase+" Ação: "+ (acao ? "sim": "não")+", Valor: "+valor);
	}
	
	public Informacao(int qtdeFase, int valor) {
		this.qtdeFase = qtdeFase;
		this.valor = valor;
	}
	
	
	
	
	
	
	
	
	
	
	public int getQtdeFase() {
		return qtdeFase;
	}

	public void setQtdeFase(int qtdeFase) {
		this.qtdeFase = qtdeFase;
	}

	public boolean isAcao() {
		return acao;
	}

	public void setAcao(boolean acao) {
		this.acao = acao;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
}
