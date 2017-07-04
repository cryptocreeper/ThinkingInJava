package chapter12_error_handling_with_exceptions.task05;

public class Apple {
    private int count;

    public Apple(int count) throws WrongCountException {
        this.count = count;
        if (count < 0) throw new WrongCountException("count is less than zero: " + count);
    }
}
