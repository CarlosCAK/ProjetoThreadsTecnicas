import Exceptions.CarrinhoVazio;
import Exceptions.ClienteVazio;

import javax.swing.plaf.TableHeaderUI;
import java.util.Map;

public class Pedido implements Runnable {

    private Cliente cliente;
    private Map<Integer, Item> items;
    private String situacao;

    public Pedido(Cliente cliente, Map<Integer,Item> items) {
        this.cliente = cliente;
        this.items = items;
        this.situacao = "Processando";
        Thread t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        try{
            verificaCliente();
            Thread.sleep(2000);
            verificaItems();
            Thread.sleep(2000);

            System.out.println("Pedido finalizado com sucesso");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    private synchronized void verificaCliente(){

        if (this.cliente != null){
                return;
            }
        throw new ClienteVazio();

    }

    private synchronized void verificaItems(){
        if (!this.items.isEmpty()){
            return;
        }
        throw new CarrinhoVazio();
    }





}
