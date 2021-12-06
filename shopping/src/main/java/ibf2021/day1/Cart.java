package ibf2021.day1;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<String> cart = new ArrayList<>();

    public String listCart() {
        return cart.toString();
    }
    public int numberOfItemsInCart(){
        return cart.size();
    }
    public void addItem(String item) {
        cart.add(item);
    }
    public boolean isItemInCart(String item){
        return cart.contains(item);
    }
    public String deleteItem(int i){
        if (i >=cart.size()) {
            return "Out of Bounds";
        }
        if (!cart.isEmpty()) {
            cart.remove(i);
            return "Item removed";
        }
        return "Your cart is empty";
    }
    public List<String> getCart() {
        return cart;
    }
    
}
