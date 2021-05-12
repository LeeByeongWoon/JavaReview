package StreamApi;

public class Customer {
    private final String name;
    private final int age;
    private int price = 0;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int calc() {
        if (getAge() >= 20) {
            return 100;
        } else {
            return 50;
        }
    }

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
        price = calc();
    }

    @Override
    public String toString() {
        return
                "\n" + "이름:'" + name + '\'' +
                        " 나이:" + age +
                        " 비용:" + price
                ;
    }
}
