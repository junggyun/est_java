package day0613.day_0613_8;

public class AnimalApplication {
    public static void main(String[] args) {
        Animal dog = new Dog("초코", 3);
        Animal cat = new Cat("보리", 4);

        dog.cry();
        cat.cry();

        dog.eat("개껌");
        dog.eat("개껌", 2);
    }
}
