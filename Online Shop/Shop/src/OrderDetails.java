public class OrderDetails {
    private int orderID;
    private int productID;
    private String productName;
    private int quantity;
    private double unitCost;
    private double total;

    public OrderDetails(int orderID, int productID, String productName, int quantity, double unitCost, double total) {
        this.orderID = orderID;
        this.productID = productID;
        this.productName = productName;
        this.quantity = quantity;
        this.unitCost = unitCost;
        this.total = total;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(double unitCost) {
        this.unitCost = unitCost;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "OrderDetails{" +
                "orderID=" + orderID +
                ", productID=" + productID +
                ", productName='" + productName + '\'' +
                ", quantity=" + quantity +
                ", unitCost=" + unitCost +
                ", total=" + total +
                '}';
    }
}
