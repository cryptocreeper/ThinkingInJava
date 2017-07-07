package chapter12_error_handling_with_exceptions.task09;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        try {
            dangerousMethod();
        } catch (Exception exception) {
            System.out.println("Caught " + exception);
        }
    }

    static void dangerousMethod() throws Exception1, Exception2, Exception3 {
        Random random = new Random();
        int randomNumber = random.nextInt(3);

        switch (randomNumber) {
            case 0: throw new Exception1();
            case 1: throw new Exception2();
            case 2: throw new Exception3();
        }
    }
}
