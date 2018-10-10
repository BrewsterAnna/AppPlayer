package negocio;

public class Criador {
	private String empresa;
	private int anoFundacao;
	private float patrimonio;
	private Contato contato;
	private Endereco endereco;
	
	public void divulgar() {
		System.out.println("Empresa: "+empresa+"\n"+"ano de fundação: "+anoFundacao+", patrimonio: "+patrimonio+"\n"
				);
		contato.divulgar();
		endereco.divulgar();
	}
	

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public int getAnoFundacao() {
		return anoFundacao;
	}

	public void setAnoFundacao(int anoFundacao) {
		this.anoFundacao = anoFundacao;
	}

	public float getPatrimonio() {
		return patrimonio;
	}

	public void setPatrimonio(float patrimonio) {
		this.patrimonio = patrimonio;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}
