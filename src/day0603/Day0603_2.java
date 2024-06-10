package day0603;

public class Day0603_2 {
    public static void main(String[] args) {

//        int a = 1;
//        int b = 4;
//        if (a > b) {
//            System.out.println("a is greater than b");
//        } else if (a == b) {
//            System.out.println("a and b are equal");
//        } else {
//            System.out.println("a is less than b");
//        }

//        System.out.println(a > b ? "a is greater than b"
//                : a == b ? "a and b are equal" : "a is less than b");

//        // 1
//        int x = 10;
//        if (x > 0) {
//            System.out.println(x + "는 양수");
//        } else if (x < 0) {
//            System.out.println(x + "는 음수");
//        } else {
//            System.out.println(x+ "는 0");
//        }
//        System.out.print(x);
//        System.out.println((x > 0) ? "는 양수" : (x < 0) ? "는 음수" : "는 0"); // 삼항연산자
//
//        // 2
//        int score = 75;
//        if (score >= 90) {
//            System.out.println("A");
//        } else if (score >= 80) {
//            System.out.println("B");
//        } else if (score >= 70) {
//            System.out.println("C");
//        } else if (score >= 60) {
//            System.out.println("D");
//        } else {
//            System.out.println("F");
//        }
//
//        // 3
//        int year = 2023;
//        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
//            System.out.println(year + "년은 윤년입니다.");
//        } else {
//            System.out.println(year + "년은 윤년이 아닙니다.");
//        }
//
//        // 4
//        int a = 10;
//        int b = 20;
//        int c = 30;
//        if (a >= b && a>= c) {
//            System.out.println(a);
//        } else if (b >= a && b >= c) {
//            System.out.println(b);
//        } else {
//            System.out.println(c);
//        }
//
//
//
//        // 5
//        int passScore = 60;
//        int myScore = 75;
//        if (myScore >= passScore) {
//            System.out.println("합격");
//        } else {
//            System.out.println("불합격");
//        }
//        System.out.println(myScore >= passScore ? "합격" : "불합격");

//        int a = 10;
//        int b = 5;
//
//        boolean result1 = (a > 5) && (b > 10);
//        boolean result2 = (a > 5) || (b > 10);
//        boolean result3 = !(a > 5);
//        System.out.println(result1);
//        System.out.println(result2);
//        System.out.println(result3);

//        int three = 3;
//        int five = 5;
//        int two = 2;
//
//        boolean result = (five > three) || (five < two) && (five < three);
//        System.out.println(result);

        boolean x = true;
        boolean y = false;
        boolean z = true;

        if (x && !y) {
            System.out.println("조건 1 충족");
        }
        if (y && z || !x && !z) {
            System.out.println("조건 2 충족");
        }
        if (x || y || z) {
            System.out.println("적어도 하나는 참");
        }
        if (!x && !y && !z) {
            System.out.println("모두 거짓");
        }
    }
}
