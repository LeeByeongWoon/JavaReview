package Coperation;

public class Customer {
    final private String name;
    private int  money;

    Customer(String name, int money){
        this.name = name;
        this.money = money;
    }
    void useMoney(int expenditure){
        money-=expenditure;
    }
    void showInfo(){
        System.out.println("이름: "+name);
        System.out.println("남은 돈: "+money);
    }
}
