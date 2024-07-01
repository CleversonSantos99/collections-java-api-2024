package OperacoesBasicas;

public class Item {
    //Declarando os atributos
    private String nome;
    private double preco;
    private int quantidade;

    //Construtor
    public Item(String produto, double preco, int quantidade) {
        this.nome = produto;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    //Getters
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    //toString
    public String toString() {
        return nome + ", " + preco + ", " + quantidade;
    }
}
