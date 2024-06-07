package weeklyQuiz;

import java.util.Scanner;

public class Week1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int mode = 1;

        while (mode != 0) {
            System.out.println("원하는 기능을 선택하세요");

            System.out.println("1. 덧셈 /2. 뺄셈 /3. 곱셈 /4. 나눗셈 /0. 종료");
            mode = sc.nextInt();
            sc.nextLine();

            if (mode == 0) {
                System.out.println("계산기를 종료합니다.");
            } else if (mode >= 1 && mode <= 4) {
                calculate(sc, mode);
            } else {
                System.out.println("올바른 입력이 아닙니다.");
            }
        }
        sc.close();
    }

    public static void calculate(Scanner sc, int mode) {
        System.out.println("첫번째 값을 입력하고 엔터를 누르세요.");
        int firstNum = sc.nextInt();
        sc.nextLine();

        System.out.println("두번째 값을 입력하고 엔터를 누르세요.");
        int secondNum = sc.nextInt();
        sc.nextLine();

        switch (mode) {
            case 1:
                System.out.println(firstNum + " + " + secondNum + " = " + (firstNum + secondNum));
                break;
            case 2:
                System.out.println(firstNum + " - " + secondNum + " = " + (firstNum - secondNum));
                break;
            case 3:
                System.out.println(firstNum + " * " + secondNum + " = " + (firstNum * secondNum));
                break;
            case 4:
                if (secondNum == 0) {
                    System.out.println("0으로 나눌 수 없습니다");
                    break;
                }
                System.out.println(firstNum + " / " + secondNum + " = " + ((double)firstNum / secondNum));
                break;
        }
    }
}
