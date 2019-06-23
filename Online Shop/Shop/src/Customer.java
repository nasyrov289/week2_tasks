public class Customer extends User {
    private String customerName;
    private String address;
    private String shippingInfo;
    private double accountBalance;

    public Customer(int userID, String loginStatus, String email, String password,
                    String regDate, String customerName, String address, String shippingInfo, double accountBalance) {
        super(userID, loginStatus, email, password, regDate);
        this.customerName = customerName;
        this.address = address;
        this.shippingInfo = shippingInfo;
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getShippingInfo() {
        return shippingInfo;
    }

    public void setShippingInfo(String shippingInfo) {
        this.shippingInfo = shippingInfo;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerName='" + customerName + '\'' +
                ", address='" + address + '\'' +
                ", shippingInfo='" + shippingInfo + '\'' +
                ", accountBalance=" + accountBalance +
                '}';
    }
}
