package day0617.day0617_10;

public class PhoneApplication {
    public static void main(String[] args) {
        System.out.println("최대 크기 : " + Phone.MAX_INCH);

        Phone phone = new ApplePhone();
        System.out.println(phone.getName());
        phone.warning();
        phone.info();

        phone = new SamsungPhone(); // 구현체 교체 - 다형성
        System.out.println(phone.getName());
        phone.warning();
        phone.info();

        myPhone(phone);
    }

    public static void myPhone(Phone phone) { // 인터페이스를 매개변수로도 전달가능
        System.out.println(phone.getName());
    }
}
