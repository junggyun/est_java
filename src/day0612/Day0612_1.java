package day0612;

public class Day0612_1 {
    public static void main(String[] args) {
        Person person1 = new Person("정균", 26, "남");
        Person person2 = new Person("수빈", 13, "여");

        person1.sayHello();
        person1.introduce();
        person2.sayHello();
        person2.introduce();

        System.out.println(Person.MAX_VISION);
        System.out.println(Person.MIN_VISION);
        System.out.println(Person.TEAM);
    }
}
