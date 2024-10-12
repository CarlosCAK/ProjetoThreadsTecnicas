import java.util.HashMap;
import java.util.Map;

public class Carrinho {
    private Map<Integer,Item>items;


    public Carrinho() {
        this.items = new HashMap<>();
    }
    public void addItem(Item item) {
        this.items.put(item.getId(), item);
    }

    public void setItems(Map<Integer, Item> items) {
        this.items = items;
    }

    public Item getItem(int id) {
        return this.items.get(id);
    }

    public Map<Integer, Item> getItems() {
        return items;
    }
    public void limparCarrinho(){
        this.items.clear();
    }
}
