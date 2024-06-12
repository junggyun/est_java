package day0611;

public class Student {
    int level;

    public Student() {
        this.level = 1;
    }

    public void levelUp() {
        if (level == 10) {
            System.out.println("최고 레벨입니다.");
        } else {
            level += 1;
            System.out.println("레벨이 '1' 상승했습니다.");
            System.out.println("현재 레벨은 '" + level + "' 입니다.");
        }
    }

    public void levelDown() {
        if (level == 1) {
            System.out.println("최저 레벨입니다.");
        } else {
            level -= 1;
            System.out.println("레벨이 '1' 하락했습니다.");
            System.out.println("현재 레벨은 '" + level + "' 입니다.");
        }
    }
}
