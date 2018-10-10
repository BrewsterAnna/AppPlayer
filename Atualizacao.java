package negocio;

public class Atualizacao {

	private String motivo;
	private int ano;
	private int mes;

	public void divulgar() {
		System.out.println("Atualização\n"+"Motivo: "+motivo+"\n"+"ano: "+ano+"\n"+"mês: "+mes+"\n");
	}
	
	public Atualizacao(String motivo) {
		this.motivo = motivo;
	}
	
	
	
	
	
	
	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}
}
