public class ShippingInfo {
    private int shippingID;
    private String shippingType;
    private double shippingCost;
    private String shippingRegion;

    public ShippingInfo(int shippingID, String shippingType, int shippingCost, String shippingRegion) {
        this.shippingID = shippingID;
        this.shippingType = shippingType;
        this.shippingCost = shippingCost;
        this.shippingRegion = shippingRegion;
    }

    public int getShippingID() {
        return shippingID;
    }

    public void setShippingID(int shippingID) {
        this.shippingID = shippingID;
    }

    public String getShippingType() {
        return shippingType;
    }

    public void setShippingType(String shippingType) {
        this.shippingType = shippingType;
    }

    public double getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(double shippingCost) {
        this.shippingCost = shippingCost;
    }

    public String getShippingRegion() {
        return shippingRegion;
    }

    public void setShippingRegion(String shippingRegion) {
        this.shippingRegion = shippingRegion;
    }

    @Override
    public String toString() {
        return "ShippingInfo{" +
                "shippingID=" + shippingID +
                ", shippingType='" + shippingType + '\'' +
                ", shippingCost=" + shippingCost +
                ", shippingRegion=" + shippingRegion +
                '}';
    }
}
