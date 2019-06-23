public class Order {
    private int orderID;
    private int customerID;
    private int shippingID;
    private String dateCreated;
    private String dateShipped;
    private String customerName;

    public Order(int orderID, int customerID, int shippingID, String dateCreated, String dateShipped, String customerName) {
        this.orderID = orderID;
        this.customerID = customerID;
        this.shippingID = shippingID;
        this.dateCreated = dateCreated;
        this.dateShipped = dateShipped;
        this.customerName = customerName;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getShippingID() {
        return shippingID;
    }

    public void setShippingID(int shippingID) {
        this.shippingID = shippingID;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getDateShipped() {
        return dateShipped;
    }

    public void setDateShipped(String dateShipped) {
        this.dateShipped = dateShipped;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderID=" + orderID +
                ", customerID=" + customerID +
                ", shippingID=" + shippingID +
                ", dateCreated='" + dateCreated + '\'' +
                ", dateShipped='" + dateShipped + '\'' +
                ", customerName='" + customerName + '\'' +
                '}';
    }
}
