package day0613.day_0613_8;

public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void cry() {
        System.out.println("냐옹");
    }
}
