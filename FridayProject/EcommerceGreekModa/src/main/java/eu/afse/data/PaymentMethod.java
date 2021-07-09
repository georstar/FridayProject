package eu.afse.data;

public enum PaymentMethod {
    CASH(0.0),
    WIRE_TRANSFER(0.1),
    CREDIT_CARD(0.15);

    private double discount;

    PaymentMethod(double discount){this.discount = discount;}

    public double getDiscount() {
        return discount;
    }
}
