import java.util.Calendar;
import java.util.HashMap;

public class Cliente {
    private String nome;
    private String cpf;
    private String email;
    private Carrinho carrinho;

    public Cliente(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.carrinho = new Carrinho();
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public Carrinho getCarrinho() {
        return carrinho;
    }
    public void fazerPedido(){
        Pedido p1 = new Pedido(this,new HashMap<>(this.carrinho.getItems()));
        this.carrinho.limparCarrinho();
    }
}
