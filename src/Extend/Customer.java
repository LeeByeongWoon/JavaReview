package Extend;

public class Customer {
    private static int id = 1000;
    private final int CustomerId;
    private final String name;
    protected String Grade;
    protected int point;
    protected double bonusRatio;

    Customer(String name){
        CustomerId= id;
        this.name = name;
        Grade = "Silver";
        bonusRatio = 0.1;
        id++;
    }
    protected int calPrice(int price){
        point += price*bonusRatio;
        return price;
    }
    public void showInfo(){
        System.out.println(name+" 회원님의 아이디는 "+CustomerId+"입니다.");
        System.out.println("현재 등급은 "+Grade+" 입니다.");
        System.out.println("현재 포인트는 "+point+" 입니다.");
    }
}
