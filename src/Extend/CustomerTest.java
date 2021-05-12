package Extend;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer("문상태");
        Customer vipCustomer = new VIPCustomer("문강태");

        int price = customer.calPrice(320000);
        customer.showInfo();
        System.out.println("지불해야할 금액:" + price);

        System.out.println();

        int vipPrice = vipCustomer.calPrice(320000);
        vipCustomer.showInfo();
        System.out.println("지불해야할 금액:" + vipPrice);
    }
}
