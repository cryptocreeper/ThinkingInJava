package chapter12.task25;

public class C extends B {
    @Override
    public void method() throws SubSubException {
        throw new SubSubException();
    }
}
