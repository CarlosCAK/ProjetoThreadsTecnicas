package Exceptions;

public class ClienteVazio extends RuntimeException {
    public ClienteVazio() {
        super("O cliente que realizará o pedido não foi informado");
    }
}
