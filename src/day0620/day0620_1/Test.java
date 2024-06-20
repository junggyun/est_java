package day0620.day0620_1;

public class Test {
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread("스레드1");
        MyThread myThread2 = new MyThread("스레드2");
        MyThread myThread3 = new MyThread("스레드3");
        MyThread myThread4 = new MyThread("스레드4");
        MyThread myThread5 = new MyThread("스레드5");

        myThread1.start();
        myThread2.start();
        myThread3.start();
        myThread4.start();
        myThread5.start();
    }
}
