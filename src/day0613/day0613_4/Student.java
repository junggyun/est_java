package day0613.day0613_4;

public class Student extends Person {
    int studentNo;

    public Student(String name, String ssn, int studentNo) {
        super(name, ssn);
        this.studentNo = studentNo;
    }

    public void say(String name) {
        System.out.println("my name is = " + name);
    }
}
