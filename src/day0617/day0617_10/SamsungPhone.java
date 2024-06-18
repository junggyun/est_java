package day0617.day0617_10;

public class SamsungPhone implements Phone {
    @Override
    public String getName() {
        return "갤럭시";
    }

    @Override
    public void info() {
        System.out.println(getName() + " 전자기기입니다.");
    }
}
