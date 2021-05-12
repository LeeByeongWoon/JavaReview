package StreamApi;

import java.util.ArrayList;
import java.util.List;

public class CusTest {
    public static void main(String[] args) {

        List<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer("first", 20));
        customerList.add(new Customer("second", 17));
        customerList.add(new Customer("third", 15));
        customerList.add(new Customer("fourth", 40));
        customerList.add(new Customer("fifth", 22));

        customerList.forEach(System.out::println);
        System.out.println(customerList.stream().mapToInt(Customer::getPrice).sum());
        customerList.stream().filter(c -> c.getAge() >= 20)
                .map(Customer::getName)
                .sorted()
                .forEach(System.out::println);
    }
}
