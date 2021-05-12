package Coperation;

public class Taxi {
    private int revenue = 0;
    int payment = 500;
    private Taxi(){}
    private  static Taxi taxi = new Taxi();

    public static Taxi getTaxi(){
        if (taxi == null){
            taxi = new Taxi();
        }
        return taxi;
    }
    void UseTaxi(Customer customer, int distance) {
        int fare = distance * payment;
        customer.useMoney(fare);
        revenue += fare;
    }

    void TotalRevenue() {
        System.out.println("매출: " + revenue);
    }
}
