import com.inventory.Inventory;

public class ECommerceMain {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        inventory.initializeInventory();
        double totalAmount = inventory.totalAmount();
        System.out.println("Total Amount is :"+totalAmount);
    }
}
