package chapter12.task18;

public class VeryImportantException extends Exception {
    @Override
    public String toString() {
        return "Очень важное исключение!";
    }
}
