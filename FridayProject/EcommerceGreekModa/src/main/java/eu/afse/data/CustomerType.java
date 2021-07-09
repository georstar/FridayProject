package eu.afse.data;

public enum CustomerType {
    B2C(0),
    B2G(0.5),
    B2B(0.2);

    private double discount;

    CustomerType(double discount) {
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }
}


