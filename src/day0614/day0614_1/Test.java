package day0614.day0614_1;

public class Test {
    public static void main(String[] args) {
        try {
            divide(10, 1);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        } catch (NullPointerException ex) {
            System.out.println("null입니다.");
        }
        System.out.println("정상적으로 종료되었습니다.");
    }

    private static int divide(int a, int b) {
        if (a / b == 0) {
            throw new ArithmeticException();
        } else {
            throw new NullPointerException();
        }
    }
}
