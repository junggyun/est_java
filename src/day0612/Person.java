package day0612;

public class Person {
    String name;
    int age;
    final String gender;
    static final String TEAM = "Ormi";
    static final double MAX_VISION = 2.0;
    static final double MIN_VISION = 0.1;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }



    public void sayHello() {
        System.out.println("Hello my name is " + this.name);
    }

    public void introduce() {
        System.out.println("I am " + this.age + " years old.");
    }
    protected void testMethod() {
        System.out.println("test");
    }
}
