package day0613.day0613_5;

public class Computer extends Calculator {
    @Override
    double areaCircle(double r) {
        System.out.println("Computer 객체의 areaCircle 메서드 실행");
        return Math.PI * r * r;
    }

    @Override
    void say() {
        System.out.println("This is Computer");
    }
}
