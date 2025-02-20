package Ecommerce;

public interface InterfaceProduto {

  public void procurarPorId(int id);
  public void listarTodos();
  public void cadastrar(Produto produto);
  public void atualizar(Produto produto);
  public void deletar(int id);
}
