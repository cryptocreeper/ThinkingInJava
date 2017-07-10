package chapter12.task18;

public class LostMessage {
    void f() throws VeryImportantException {
        throw new VeryImportantException();
    }

    void g() throws UnimportantException {
        throw new UnimportantException();
    }

    void dispose() throws HoHumException {
        throw new HoHumException();
    }

    public static void main(String[] args) {
        try {
            LostMessage lm = new LostMessage();
            try {
                try {
                    lm.f();
                } finally {
                    lm.dispose();
                }
            } finally {
                lm.g();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
