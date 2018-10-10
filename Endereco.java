package negocio;

public class Endereco {
	private String cidade;
	private String uf;
	
	public void divulgar() {
		System.out.println("Endereço: "+cidade+", "+uf+".");
	}
	
	public Endereco(String cidade, String uf) {
		this.cidade = cidade;
		this.uf = uf;
	}
	

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}
	
}
