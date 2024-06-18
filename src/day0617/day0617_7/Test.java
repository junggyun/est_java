package day0617.day0617_7;

public class Test {
    public static void main(String[] args) {
        Car<String> genesis = new Car<>();
        genesis.setName("g80");
        System.out.println(genesis.getName());
        System.out.println(genesis.isIns());

        Car<Integer> porsche = new Car<>();
        porsche.setName(911);
        System.out.println(porsche.getName());
        System.out.println(porsche.isIns());



    }
}
