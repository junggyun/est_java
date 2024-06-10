package day0605;

import java.util.*;

public class Day0605_1 {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        Random rd = new Random();

//        String[] words = {"apple", "banana", "cherry", "durian"};
//
//        for (int i = 0; i < 3; i++) {
//            for (int j = i+1; j < words.length; j++) {
//                System.out.println(words[i] + " " + words[j]);
//            }
//        }

//        Scanner sc = new Scanner(System.in);
//        System.out.print("정수를 입력해주세요: ");
//        int num = sc.nextInt();
//        sc.nextLine();
//
//        System.out.print("문자열을 입력해주세요: ");
//        String str = sc.nextLine();
//
//        System.out.println(num + " 을 입력하셨습니다.");
//        System.out.println(str + " 을 입력하셨습니다.");
//
//        sc.close();

//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("계절을 맞혀보세요!");
//        System.out.print("1~4의 숫자를 입력하세요: ");
//        int num = sc.nextInt();
//
//        switch (num) {
//            case 1:
//                System.out.println("봄");
//                break;
//            case 2:
//                System.out.println("여름");
//                break;
//            case 3:
//                System.out.println("가을");
//                break;
//            case 4:
//                System.out.println("겨울");
//                break;
//            default:
//                System.out.println("잘못된 입력입니다!");
//                break;
//        }
//
//        sc.close();

//        System.out.println("숫자 맞히기 게임");
//
//        int end = 100;
//        int com = rd.nextInt(end) + 1;
//        int user = 0;
//        while (user != -1) {
//            System.out.printf("숫자를 입력해주세요(1~%d)(종료: -1): ", end);
//            user = sc.nextInt();
//
//            if (user == -1) {
//
//            } else if (user > 0 && user <= end) {
//                String result = user == com ? "정답"
//                        : user > com ? "낮아요" : "높아요";
//                System.out.println(result);
//                if (user == com) break;
//            } else {
//                System.out.printf("1~%d의 숫자만 입력해주세요.", end);
//                System.out.println();
//            }
//        }
//
//        sc.close();

//        int numCount = 0;
//        int[] nums = new int[6];
//        boolean isNew = true;
//
//        while (numCount < 6) {
//            int num = rd.nextInt(45) + 1;
//            for (int n : nums) {
//                if (num == n) {
//                    isNew = false;
//                }
//            }
//            if (isNew) {
//                nums[numCount] = num;
//                numCount++;
//            }
//        }
//
//        for (int num : nums) {
//            System.out.println(num);
//        }


//        List<Integer> nums = new ArrayList<>();
//        while (nums.size() < 6) {
//            int num = rd.nextInt(45) + 1;
//            if (!nums.contains(num)) {
//                nums.add(num);
//            }
//        }
//        Collections.sort(nums);
//        for (int num : nums) {
//            System.out.println(num);
//        }

        Scanner sc = new Scanner(System.in);

        System.out.print("영화 제목: ");
        String title = sc.nextLine();

        System.out.print("관람 인원: ");
        int count = sc.nextInt();
        sc.nextLine();

        System.out.print("예매자 이름: ");
        String name = sc.nextLine();

        System.out.print("예매자 전화번호: ");
        String number = sc.nextLine();

        int total = 10000 * count;

        System.out.println("===== 영화 티켓 예매 정보 =====");
        System.out.println("영화 제목: " + title);
        System.out.println("관람 인원: " + count + "명");
        System.out.println("예매자 이름: " + name);
        System.out.println("예매자 전화번호: " + number);
        System.out.println();
        System.out.println("총 결제 금액: " + total + "원");

        sc.close();
    }
}
