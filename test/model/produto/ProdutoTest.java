package model.produto;

import static org.junit.Assert.*;
import model.produto.Produto;

import org.junit.Before;
import org.junit.Test;

public class ProdutoTest {
	
	private Produto produto;
	
	@Before
	public void setUp() throws Exception {
		produto = new Produto();
	}

	@Test
	public void deveRetornarCategoriaFormatadaInformaticaParaCategoria0() {
		produto.setCategoria(0);
		assertEquals("Informática", produto.getCategoriaFormatada());
	}

	@Test
	public void deveRetornarCategoriaFormatadaEletronicaParaCategoria1() {
		produto.setCategoria(1);
		assertEquals("Eletrônica", produto.getCategoriaFormatada());
	}

	@Test
	public void deveRetornarCategoriaFormatadaImovelParaCategoria2() {
		produto.setCategoria(2);
		assertEquals("Imóvel", produto.getCategoriaFormatada());
	}
	
	@Test
	public void deveRetornarCategoriaFormatadaImovelParaCategoria99() {
		produto.setCategoria(99);
		assertEquals("Imóvel", produto.getCategoriaFormatada());
	}
}