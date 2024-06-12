package day0612;

import day0611.Person;

public class Day0612_2 {
    public static void main(String[] args) {
        Person person1 = new Person("정균", "010-4652-4937", 26, 3000);
        day0612.Person person2 = new day0612.Person("정균", 26, "남");
        person2.testMethod();
    }
}
