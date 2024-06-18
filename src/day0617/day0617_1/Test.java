package day0617.day0617_1;

public class Test {
    public static void main(String[] args) {
        ZooKeeper zooKeeper = new ZooKeeper();
        Tiger tiger = new Tiger();
        zooKeeper.feed(tiger);
    }
}
