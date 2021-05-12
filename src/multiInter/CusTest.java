package multiInter;

public class CusTest {
    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.buy();
        customer.sell();
        customer.order();

        Buy buy = customer;
        buy.buy();
        buy.order();

        Sell sell = customer;
        sell.sell();
        sell.order();
    }
}
