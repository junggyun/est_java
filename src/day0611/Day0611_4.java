package day0611;

import java.util.Scanner;

public class Day0611_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 계좌 생성
        System.out.print("계좌번호를 입력하세요: ");
        String accountNumber = sc.nextLine();
        System.out.print("소유자 이름을 입력하세요: ");
        String ownerName = sc.nextLine();
        BankAccount account = new BankAccount(accountNumber, ownerName);

        // 입금 및 출금
        account.deposit(100000);
        account.withdraw(150000);
        account.withdraw(50000);

        // 잔액 조회
        account.printBalance();
    }

    public static class BankAccount {
        String accountNumber;
        String ownerName;
        int balance;

        public BankAccount(String accountNumber, String ownerName) {
            this.accountNumber = accountNumber;
            this.ownerName = ownerName;
            this.balance = 0;
        }
        public void printBalance() {
            System.out.println("잔액은 " + balance + "원입니다.");
        }

        public void deposit(int money) {
            balance += money;
            System.out.println(money + "원이 입금되었습니다.");
        }

        public void withdraw(int money) {
            if (balance >= money) {
                balance -= money;
                System.out.println(money + "원이 출금되었습니다.");
            } else {
                System.out.println("잔액이 부족합니다.");
            }
        }
    }
}


