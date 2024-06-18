package day0613.day_0613_8;

public abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat(String foodName) {
        System.out.println(foodName + " 먹기");
    }

    public void eat(String foodName, int count) {
        System.out.println(foodName + " " + count + "개 먹기");
    }

    public abstract void cry();
}
