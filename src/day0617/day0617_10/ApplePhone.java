package day0617.day0617_10;

public class ApplePhone implements Phone {
    @Override
    public String getName() {
        return "아이폰";
    }

    @Override
    public void info() {
        System.out.println(getName() + " 전자기기입니다.");
    }
}
