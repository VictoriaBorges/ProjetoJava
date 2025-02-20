package model;

public abstract class Produto {
	private String nome;
    private float valor;
    private int quantidade;
	
    public Produto(String nome, float valor, int quantidade) {
		
		this.nome = nome;
		this.valor = valor;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	@Override
    public String toString() {
        return "Nome: " + nome + ", Preço: R$ " + valor + ", Estoque: " + quantidade;
        
	}
}
