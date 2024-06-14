package day0613.day0613_2;

public class Child extends Parent {
    public void invest() {
        setMoney(getMoney() - 1000);
    }

    @Override
    void method2() {
        System.out.println("Child 메서드2 호출");
    }

    void method3() {
        System.out.println("Child 메서드3 호출");
    }
}
