package model.produto;

public class Produto {

	private int codigo;
	private int categoria;
	private String nome;
	private String descricao;
	
	public int getCategoria() {
		return categoria;
	}
	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getCodigo() {
		return codigo;
	}
	
	public String getCategoriaFormatada() {
		if (categoria == 0) {
			return "Informática";
		} else if (categoria == 1) {
			return "Eletrônica";
		} else {
			return "Imóvel";
		}
	}
}