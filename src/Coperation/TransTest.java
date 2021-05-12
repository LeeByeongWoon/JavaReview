package Coperation;

public class TransTest {
    public static void main(String[] args) {
        Customer customer = new Customer("Edward", 20000);
        Taxi taxi = Taxi.getTaxi();

        taxi.UseTaxi(customer, 20);
        customer.showInfo();
        taxi.TotalRevenue();
    }
}
