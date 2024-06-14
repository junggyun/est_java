package day0613.day0613_3;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    public void sleep (int times) {
        System.out.println(getName() + " Zzzz.... " + times + " hours");
    }
}
