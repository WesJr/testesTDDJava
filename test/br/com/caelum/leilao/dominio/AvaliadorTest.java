package br.com.caelum.leilao.dominio;


import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class AvaliadorTest {

	@Test
	public void deveEntenderLancesEmOrdemCrescente() {
		
		Usuario joao = new Usuario("João");
		Usuario jose = new Usuario("Jose");
		Usuario maria = new Usuario("Maria");
		
		Leilao leilao = new Leilao("Playstation 3 Novo");
		
		leilao.propoe(new Lance(maria, 250));
		leilao.propoe(new Lance(joao, 300));
		leilao.propoe(new Lance(jose, 400));
		
		Avaliador leiloeiro = new Avaliador();
		leiloeiro.avalia(leilao);
		
		double maiorEsperado = 400;
		double menorEsperado = 250; 
		
		assertEquals(maiorEsperado, leiloeiro.getMaiorLance(), 00000.1);
		assertEquals(menorEsperado, leiloeiro.getMenorLance(), 00000.1);
		
	}
	
	@Test
	public void TestaMediaDeZeroLance() {
		
		  // cenario
        Usuario ewertom = new Usuario("Ewertom");

        // acao
        Leilao leilao = new Leilao("Iphone 7");
        
        Avaliador avaliador = new Avaliador();
        avaliador.avalia(leilao);
        
      //validacao
        assertEquals(0, avaliador.getMedia(), 0.0001);
	}

}
