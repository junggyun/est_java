package day0617.day0617_10;

public interface Phone extends Electronics { // 인터페이스 상속 - 다중 상속도 가능
    double MAX_INCH = 6.1;
    String getName();
    default void warning() {
        System.out.println("파손주의!");
    }
}
