package chapter12.task30;

public class Human {
    public static void main(String[] args) {
        Human human = new Human();

        for (int i = 0; i < 3; i++) {
            try {
                human.throwRuntimeException(i);
            } catch (RuntimeException re) {
                try {
                    throw re.getCause();
                } catch (SneezeException e) {
                    System.out.println(e);
                } catch (AnnoyanceException e) {
                    System.out.println(e);
                } catch (Throwable e) {
                    System.out.println(e);
                }
            }
        }
    }

    void throwRuntimeException(int type) {
        try {
            switch (type) {
                case 0: throw new SneezeException();
                case 1: throw new AnnoyanceException();
                default: return;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
