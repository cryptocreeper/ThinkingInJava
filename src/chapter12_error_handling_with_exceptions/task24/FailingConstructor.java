package chapter12.task24;

public class FailingConstructor {
    private SomeClass someClass1;
    private SomeClass someClass2;

    public FailingConstructor(boolean throwException) throws FailingConstructorException {
        try {
            someClass1 = new SomeClass();
            if (throwException) throw new FailingConstructorException();
            someClass2 = new SomeClass();
        } catch (FailingConstructorException e) {
            System.out.println("Exception in constructor");
            someClass1.dispose();
            dispose();
            throw e;
        }
    }

    public void dispose() {
        System.out.println("FailingConstructor.dispose()");
    }

    public static void main(String[] args) {
        try {
            FailingConstructor fc = new FailingConstructor(true);
        } catch (FailingConstructorException e) {
            System.out.println("Exception in main");
        }
    }
}
