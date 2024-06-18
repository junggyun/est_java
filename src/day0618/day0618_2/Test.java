package day0618.day0618_2;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Course<Person> personCourse = new Course<>("일반인", 5);
        personCourse.add(new Person("일반인"));
        personCourse.add(new Worker("직장인"));
        personCourse.add(new Student("학생"));
        personCourse.add(new HighStudent("고등학생"));

        Course<Worker> workerCourse = new Course<>("직장인과정", 5);
        workerCourse.add(new Worker("직장인"));

        Course<Student> studentCourse = new Course<>("학생과정", 5);
        studentCourse.add(new Student("학생"));
        studentCourse.add(new HighStudent("고등학생"));

        Course<HighStudent> highStudentCourse = new Course<>("고등학생과정", 5);
        highStudentCourse.add(new HighStudent("고등학생"));

        registerCourse(workerCourse);
        registerCourse(studentCourse);
        registerCourse(highStudentCourse);

        System.out.println("==================");
        System.out.println("==================");
        System.out.println("==================");

        registerStudentCourse(studentCourse);
        registerStudentCourse(highStudentCourse);

        System.out.println("==================");
        System.out.println("==================");
        System.out.println("==================");

        registerWorkerCourse(personCourse);
        registerWorkerCourse(workerCourse);
    }

    public static void registerCourse(Course<?> course) {
        System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));
    }

    public static void registerStudentCourse(Course<? extends Student> course) {
        System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));
    }

    public static void registerWorkerCourse(Course<? super Worker> course) {
        System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));
    }
}

