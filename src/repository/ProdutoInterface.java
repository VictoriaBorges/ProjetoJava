package repository;


import model.Produto;
import java.util.List;

public interface ProdutoInterface {
	public void cadastrar(Produto produto);
	public void listarTodos();
	  public void atualizar(Produto produto);
	  public void deletar(int id);
	  
	  Produto buscarProduto(String nome);
	    List<Produto> listarProdutos();
	    boolean atualizar(String nome, float novoValor, int novaQuantidade);
	    boolean removerProduto(String nome);
	
}


