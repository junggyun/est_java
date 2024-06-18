package day0617.day0617_3;

public class Test {
    public static void main(String[] args) {
        InterfaceC impleC = new ImpleC();

        InterfaceA interfaceA = impleC;
        interfaceB interfaceB = impleC;
        interfaceA.methodA();
        interfaceB.methodB();
        impleC.methodA();
        impleC.methodB();
        impleC.methodC();
    }
}
