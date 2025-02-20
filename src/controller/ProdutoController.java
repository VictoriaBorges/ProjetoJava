package controller;

import java.util.ArrayList;
import java.util.List;
import model.Produto;
import repository.ProdutoInterface;

public class ProdutoController implements ProdutoInterface {
    private List<Produto> produtos = new ArrayList<>();

    @Override
    public void cadastrar(Produto produto) {
        produtos.add(produto);
        System.out.println("Produto cadastrado com sucesso!");
    }

    @Override
    public void listarTodos() {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
        } else {
            for (Produto produto : produtos) {
                System.out.println(produto);
            }
        }
    }

    @Override
    public Produto buscarProduto(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                return produto;
            }
        }
        return null;
    }

    @Override
    public boolean atualizar(String nome, float novoValor, int novaQuantidade) {
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                produto.setValor(novoValor);
                produto.setQuantidade(novaQuantidade);
                System.out.println("Produto atualizado com sucesso!");
                return true;
            }
        }
        System.out.println("Produto não encontrado.");
        return false;
    }

    @Override
    public boolean removerProduto(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                produtos.remove(produto);
                System.out.println("Produto removido com sucesso!");
                return true;
            }
        }
        System.out.println("Produto não encontrado.");
        return false;
    }

	@Override
	public void atualizar(Produto produto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletar(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Produto> listarProdutos() {
		// TODO Auto-generated method stub
		return null;
	}
}

