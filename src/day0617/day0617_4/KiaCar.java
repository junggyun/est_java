package day0617.day0617_4;

public class KiaCar implements Car {
    @Override
    public String showEngine() {
        return "기아차 전용 엔진";
    }

    @Override
    public int amountNavi() {
        return 150000;
    }

    @Override
    public String getTier() {
        return "기아차 전용 타이어";
    }
}
