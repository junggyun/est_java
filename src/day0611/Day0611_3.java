package day0611;

public class Day0611_3 {
    public static void main(String[] args) {
        Person person = new Person("박정균", "01012345678", 26, 150000);
        person.sayHello();
        person.sayMoney();
        Student student = new Student();
        person.teaching(student);
        person.cheating(student);

    }
}
