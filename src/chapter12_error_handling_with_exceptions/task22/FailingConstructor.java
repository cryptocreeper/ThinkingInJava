package chapter12.task22;

public class FailingConstructor {
    public FailingConstructor() throws FailingConstructorException {
        throw new FailingConstructorException();
    }

    public static void main(String[] args) {
        try {
            FailingConstructor fc = new FailingConstructor();
        } catch (FailingConstructorException e) {
            System.out.println("Caught failing constructor exception");
        }
    }
}
