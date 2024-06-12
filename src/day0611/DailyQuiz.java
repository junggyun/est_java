package day0611;

public class DailyQuiz {
    public static void main(String[] args) {
        Person son = new Person("박정균", 26);
        Person dad = new Person("아빠", 56);
        PiggyBank piggyBank = new PiggyBank();
        son.saving(piggyBank, 10000);
        son.spending(piggyBank, 5000);
        dad.spending(piggyBank, 3000);
        son.breaking(piggyBank);
    }

    private static class Person {
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void saving(PiggyBank piggyBank, int money) {
            piggyBank.cash += money;
            System.out.println(name + "이(가) 저금통에 " + money + "원을 넣었다.");
        }

        public void spending(PiggyBank piggyBank, int money) {
            if (money <= piggyBank.cash) {
                piggyBank.cash -= money;
                System.out.println(name + "이(가) 저금통에서 " + money + "원을 꺼냈다.");
            } else {
                System.out.println("그만큼 꺼낼 돈이 없습니다.");
            }

        }

        public void breaking(PiggyBank piggyBank) {
            System.out.println(name + "이(가) " + piggyBank.cash + "원을 완전히 털었다");
            piggyBank.cash = 0;
        }
    }

    private static class PiggyBank {
        int cash;

        public PiggyBank() {
            this.cash = 0;
        }
    }
}
