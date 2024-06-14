package day0613.day0613_2;

public class Parent {
    private int money;

    public Parent() {
        this.money = 0;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void saveMoney() {
        setMoney(money + 10000);
    }

    public void printMoney() {
        System.out.println("현재 잔액은 " + money + "원입니다.");
    }

    void method1() {
        System.out.println("Parent 메서드1 호출");
    }

    void method2() {
        System.out.println("Parent 메서드2 호출");
    }
}
