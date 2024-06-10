package day0603;

import java.util.Scanner;

public class Day0603_3 {
    public static void main(String[] args) {

//        int data = 11;
//
//        switch (data) {
//            case 1:
//                System.out.println("1입니다.");
//                break;
//            case 2:
//                System.out.println("2입니다");
//                break;
//            case 10:
//                System.out.println("10입니다.");
//                break;
//            case 20:
//                System.out.println("20입니다.");
//                break;
//            default:
//                System.out.println("모릅니다.");
//                break;
//            case 30:
//                System.out.println("30입니다.");
//                break;
//
//        }
//        String day = "토요일";
//
//        switch (day) {
//            case "월요일":
//                System.out.println("책읽기");
//                break;
//            case "화요일":
//                System.out.println("운동하기");
//                break;
//            case "수요일":
//                System.out.println("공부하기");
//                break;
//            case "목요일":
//                System.out.println("청소하기");
//                break;
//            case "금요일":
//                System.out.println("술마시기");
//                break;
//            case "토요일":
//                System.out.println("데이트하기");
//                break;
//            case "일요일":
//                System.out.println("휴식하기");
//                break;
//            default:
//                System.out.println("알 수 없는 요일입니다.");
//                break;
//        }
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("성적을 입력해주세요: ");
//        String grade = scanner.nextLine();
//
//        switch (grade) {
//            case "A":
//                System.out.println("Excellent");
//                break;
//            case "B":
//                System.out.println("Good");
//                break;
//            case "C":
//                System.out.println("Average");
//                break;
//            case "D":
//                System.out.println("Below Average");
//                break;
//            case "F":
//                System.out.println("Fail");
//                break;
//            default:
//                System.out.println("Unknown Grade");
//        }

//        Scanner sc = new Scanner(System.in);
//        System.out.print("num1: ");
//        int num1 = sc.nextInt();
//        sc.nextLine();
//        System.out.print("산술 연산자를 선택하세요(+, -, *, /): ");
//        String operator = sc.nextLine();
//        System.out.print("num2: ");
//        int num2 = sc.nextInt();
//        sc.nextLine();
//
//        switch (operator) {
//            case "+":
//                System.out.println(num1 + num2);
//                break;
//            case "-":
//                System.out.println(num1 - num2);
//                break;
//            case "*":
//                System.out.println(num1 * num2);
//                break;
//            case "/":
//                System.out.println(num1 / num2);
//                break;
//            default:
//                System.out.println("Unknown Operator");
//                break;
//        }

//        Scanner sc = new Scanner(System.in);
//        System.out.print("색상을 선택하세요(red, green, blue): ");
//        String color = sc.nextLine();
//
//        switch (color) {
//            case "red":
//                System.out.println("Apple");
//                break;
//            case "green":
//                System.out.println("Grass");
//                break;
//            case "blue":
//                System.out.println("Sky");
//                break;
//            default:
//                System.out.println("Unknown Color");
//                break;
//        }

//        Scanner sc = new Scanner(System.in);
//        System.out.print("점수를 입력해주세요: ");
//        int score = sc.nextInt();
//
//        switch (score / 10) {
//            case 10, 9:
//                System.out.println("A");
//                break;
//            case 8:
//                System.out.println("B");
//                break;
//            case 7:
//                System.out.println("C");
//                break;
//            case 6:
//                System.out.println("D");
//                break;
//            default:
//                System.out.println("F");
//                break;
//        }

        Scanner sc = new Scanner(System.in);
        System.out.print("언어를 선택해주세요(Java, Python, C++, JavaScript): ");
        String language = sc.nextLine();

        switch (language) {
            case "Java":
                System.out.println("객체 지향 프로그래밍 언어입니다.");
                break;
            case "Python":
                System.out.println("인터프리터를 사용하는 객체 지향 언어입니다.");
                break;
            case "C++":
                System.out.println("C언어 기반의 언어입니다.");
                break;
            case "JavaScript":
                System.out.println("객체 기반의 스크립트 언어입니다.");
                break;
            default:
                System.out.println("알 수 없는 언어입니다.");
                break;
        }
    }
}
