public class Item {
    private int id;
    private String titulo;
    private String descricao;
    private double preco;

    public Item(int id, String titulo, String descricao, double preco) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }
}
