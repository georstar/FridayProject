package eu.afse.service;

import eu.afse.data.CustomerType;
import eu.afse.data.OrderRepository;
import eu.afse.data.PaymentMethod;

public class Discount {


    public double calcDiscount(int i ){
        double discount = 0.0;
        OrderRepository orderRepository = new OrderRepository();
        CustomerType customerType = orderRepository.getOrders().get(i).getCustomer().getCustomerType();
        PaymentMethod paymentMethod = orderRepository.getOrders().get(i).getCustomer().getPaymentMethod();
        if (customerType == CustomerType.B2B) discount = CustomerType.B2B.getDiscount();
        else if (customerType ==CustomerType.B2C) discount = CustomerType.B2C.getDiscount();
        else discount = CustomerType.B2G.getDiscount();

        if (paymentMethod == PaymentMethod.CASH) discount += PaymentMethod.CASH.getDiscount();
        else if (paymentMethod == PaymentMethod.CREDIT_CARD) discount += PaymentMethod.CREDIT_CARD.getDiscount();
        else discount += PaymentMethod.WIRE_TRANSFER.getDiscount();

        return discount;




    }

}
