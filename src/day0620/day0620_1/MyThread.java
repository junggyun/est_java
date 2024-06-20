package day0620.day0620_1;

public class MyThread extends Thread {
    private String name;

    public MyThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name);
        super.run();
    }
}
