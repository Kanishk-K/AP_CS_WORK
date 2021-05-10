import java.text.NumberFormat;
import java.util.ArrayList;

public class ShoppingCartProject {
    public static class Item
    {
        private String name;
        private double price;
        private int quantity;
        // -------------------------------------------------------
        // Create a new item with the given attributes.
        // -------------------------------------------------------
        public Item (String itemName, double itemPrice, int numPurchased){
            name = itemName;
            price = itemPrice;
            quantity = numPurchased;
        }
        // -------------------------------------------------------
        // Return a string with the information about the item
        // -------------------------------------------------------
        public String toString (){
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
            return (name + "\t" + fmt.format(price) + "\t" + quantity + "\t" + fmt.format(price*quantity));
        }
        // -------------------------------------------------
        // Returns the unit price of the item
        // -------------------------------------------------
        public double getPrice(){
            return price;
        }
        // -------------------------------------------------
        // Returns the name of the item
        // -------------------------------------------------
        public String getName(){
            return name;
        }
        // -------------------------------------------------
        // Returns the quantity of the item
        // -------------------------------------------------
        public int getQuantity(){
            return quantity;
        }
        public void setQuantity(int quantity){
            this.quantity = quantity;
        }
    }
    public static void PrintCart(ArrayList<Item> cart){
        double totalPrice = 0; 
        int totalQuantity = 0;
        for (int i = 0;i<cart.size();i++){
            System.out.println(cart.get(i));
            totalQuantity += cart.get(i).getQuantity();
            totalPrice += cart.get(i).getQuantity() * cart.get(i).getPrice();
        }
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        System.out.println("There are " + totalQuantity + " items in your cart totaling " + fmt.format(totalPrice));
    }
    public static void main(String args[]){
        ArrayList<Item> cart = new ArrayList<Item>();
        // *** create a new item and add it to the cart
        cart.add(new Item("doughnuts", 1.32, 4));
        cart.add(new Item("Tuna", .89, 2));
        cart.add(new Item("mushroom soup", .70, 5));
        cart.add(new Item("cat food", .45, 7));
        cart.add(new Item("steak", 15.86, 3));
        cart.add(new Item("curry", 1.35, 1));
        cart.add(new Item("toilet paper", 15.06, 1));
        // *** print the contents of the cart object using default display
        //from ArrayList
        System.out.println(cart);
        //**Now print the items from cart using the upgrades described in
        //step 2
        System.out.println("----------------");
        PrintCart(cart);
        //removedName contains the item name to the object type Item that
        //is to be removed from the cart
        String removedName = "steak";
        for (int i = 0; i<cart.size();i++){
            if (cart.get(i).getName() == removedName){
                Item removedItem = cart.remove(i);
                removedItem.setQuantity(1);
                cart.add(i, removedItem);
            }
        }
        System.out.println("-----------------");
        PrintCart(cart);
    }
}