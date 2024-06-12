package day0611;

public class Person {
    String name;
    String phoneNumber;
    int age;
    int money;

    public Person(String name, String phoneNumber, int age, int money) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.money = money;
    }

    public void sayHello() {
        System.out.println("My name is " + name);
    }
    public void sayMoney() {
        System.out.println("내가 가지고 있는 돈은 " + money + "원이야!");
    }
    public void teaching(Student student) {
        student.levelUp();
    }

    public void cheating(Student student) {
        student.levelDown();
    }
}
