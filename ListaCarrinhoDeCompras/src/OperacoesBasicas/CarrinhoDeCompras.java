package OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    //Declarando os atributos
    private List<Item> carrinhoDeCompras;

    public CarrinhoDeCompras() {
        this.carrinhoDeCompras = new ArrayList<>();
    }

    public void adicionarProduto(String nome, double preco, int quantidade) {
        carrinhoDeCompras.add(new Item(nome, preco, quantidade));
    }

    public void removerProduto(String nome) {
        List<Item> produtosParaRemover = new ArrayList<>();
        if (!carrinhoDeCompras.isEmpty()) {
            for (Item produto : carrinhoDeCompras) {
                if (produto.getNome().equalsIgnoreCase(nome)) {
                    produtosParaRemover.add(produto);
                }
            }
            carrinhoDeCompras.removeAll(produtosParaRemover);
        } else {
            System.out.println("O carrinho esta vazio");
        }
    }

    public double calcularValorTotalProdutos() {
        double valorTotalProdutos = 0;
        for (int i = 0; i < carrinhoDeCompras.size(); i++) {
            double valorProduto = carrinhoDeCompras.get(i).getPreco() * carrinhoDeCompras.get(i).getQuantidade();
            valorTotalProdutos += valorProduto;
        }

        return valorTotalProdutos;
    }

    public void exibirProdutos() {
        if (!carrinhoDeCompras.isEmpty()) {
            for (int i = 0; i < carrinhoDeCompras.size(); i++) {
                System.out.println(carrinhoDeCompras.get(i).getNome() +
                        ", " + carrinhoDeCompras.get(i).getPreco() +
                        ", Qtd " + carrinhoDeCompras.get(i).getQuantidade());
            }
        } else {
            System.out.println("Você não adicionou nenhum item ao carrinho!");
        }
    }

    public static void main(String[] args) {

        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.exibirProdutos();

        carrinhoDeCompras.adicionarProduto("Camiseta", 70.00, 1);
        carrinhoDeCompras.adicionarProduto("Bermuda", 50.00, 2);
        carrinhoDeCompras.adicionarProduto("Calça", 120.00, 2);
        carrinhoDeCompras.adicionarProduto("Moletom", 100.00, 1);

        System.out.println();
        carrinhoDeCompras.exibirProdutos();

        System.out.println();
        carrinhoDeCompras.removerProduto("Bermuda");
        carrinhoDeCompras.exibirProdutos();

        System.out.println();
        System.out.println(carrinhoDeCompras.calcularValorTotalProdutos());
    }
}
