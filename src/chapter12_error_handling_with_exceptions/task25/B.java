package chapter12.task25;

public class B extends A {
    @Override
    public void method() throws SubException {
        throw new SubException();
    }
}
