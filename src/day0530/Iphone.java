package day0530;

public class Iphone implements Phone{
    @Override
    public void call() {
        System.out.println("아이폰으로 전화를 겁니다.");
    }

    @Override
    public void name() {
        System.out.println("아이폰입니다.");
    }

    public void icon() {
        System.out.println("사과모양");
    }
}
