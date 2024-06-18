package day0614.day0614_4;

public class Test {
    public static void main(String[] args) {
        Ormi ormi = new Ormi();

        try {
            ormi.complete();
        } catch (InsufficientProgressException e) {
            System.out.println(e.getMessage());
        }
    }

    public static class Ormi {
        int progress;

        public void complete() throws InsufficientProgressException {
            if (progress < 100) {
                throw new InsufficientProgressException("진행도가 부족합니다.");
            }
            System.out.println("오르미 수료하셨습니다. 축하드립니다!");
        }
    }

    public static class InsufficientProgressException extends Exception {
        public InsufficientProgressException(String message) {
            super(message);
        }
    }
}
