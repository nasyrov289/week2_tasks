import java.util.Date;

public class ShoppingCart {
    private int cartID;
    private int productID;
    private int quantity;
    private String dateAdded;

    public ShoppingCart(int cartID, int productID, int quantity, String dateAdded) {
        this.cartID = cartID;
        this.productID = productID;
        this.quantity = quantity;
        this.dateAdded = dateAdded;
    }

    public int getCartID() {
        return cartID;
    }

    public void setCartID(int cartID) {
        this.cartID = cartID;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(String dateAdded) {
        this.dateAdded = dateAdded;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "cartID=" + cartID +
                ", productID=" + productID +
                ", quantity=" + quantity +
                ", dateAdded=" + dateAdded +
                '}';
    }
}
