package Classes;


public class Food {
    private final String type;
    private final int quantity;
    private final double price;

    
    public Food(String type, int quantity, double price) {
        this.type = type;
        this.quantity = quantity;
        this.price = price;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }
    
    
    
    
    
}
