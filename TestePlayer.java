package testes;
import negocio.Contato;
import negocio.Criador;
import negocio.Jogo;
import negocio.Atualizacao;
import negocio.Endereco;
import negocio.Informacao;
public class TestePlayer {

	public static void main(String[] args) {
				
		Contato c = new Contato("jogador@hotmail.com","24856409");
						
		Atualizacao a = new Atualizacao("Primeira atualização");
		a.setAno (2018);
		a.setMes (8);
				
		Endereco e = new Endereco("Rio de Janeiro","RJ");
				
		Criador cr = new Criador();
		cr.setEmpresa("galapagos");
		cr.setAnoFundacao(1940);
		cr.setPatrimonio(10000);
		cr.setContato(c);
		cr.setEndereco(e);
				
		Informacao in = new Informacao(4, 1000);
		in.setAcao(true);
						
		String[] nomes = {"hugo", "joao","jose","maria"};
		Jogo j = new Jogo();
		j.setNome("Zumbiland");
		j.setAnoCriacao(2000);
		j.setJogadores(nomes);
		j.setCriador(cr);
		j.setAtualizacao(a);
		j.setInformacao(in);
		j.divulgar();
		
	}

}
