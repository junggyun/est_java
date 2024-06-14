package day0614.day0614_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Quiz1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("첫 번째 정수: ");
            int num1 = sc.nextInt();
            sc.nextLine();
            System.out.print("두 번째 정수: ");
            int num2 = sc.nextInt();
            System.out.println(divide(num1, num2));
        } catch (ArithmeticException e) {
            System.out.println("두 번째 정수는 0이 될 수 없습니다.");
        } catch (InputMismatchException e) {
            System.out.println("정수만 입력가능합니다.");
        } finally {
            sc.close();
        }
    }

    public static double divide(int a, int b) {
        if (b == 0) throw new ArithmeticException();
        return (double) a / b;
    }
}
