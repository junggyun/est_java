package day0614.day0614_3;

public class Test {
    public static void main(String[] args) {
        ZooKeeper zooKeeper = new ZooKeeper();

        Tiger tiger = new Tiger();
        zooKeeper.feed(tiger);

        Lion lion = new Lion();
        zooKeeper.feed(lion);

        Rabbit rabbit = new Rabbit();
        zooKeeper.feed2(rabbit);

        Dear dear = new Dear();
        zooKeeper.feed2(dear);
    }
}
