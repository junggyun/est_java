package day0613.day_0613_8;

public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void cry() {
        System.out.println("멍멍");
    }
}
