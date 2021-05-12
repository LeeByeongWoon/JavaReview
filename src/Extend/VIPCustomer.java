package Extend;

public class VIPCustomer extends Customer{

    private double saleRatio;

    VIPCustomer(String name) {
        super(name);
        Grade ="VIP";
        bonusRatio=0.5;
        saleRatio=0.1;
    }
    @Override
    protected int calPrice(int price){
        point += price*bonusRatio;
        price = price-(int)(price*saleRatio);
        return price;
    }

}
