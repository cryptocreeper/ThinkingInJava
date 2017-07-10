package chapter12.task19;

public class VeryImportantException extends Exception {
    @Override
    public String toString() {
        return "Очень важное исключение!";
    }
}
