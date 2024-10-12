package Exceptions;

public class CarrinhoVazio extends RuntimeException {
    public CarrinhoVazio() {
        super("O Carrinho está vazio");
    }
}
