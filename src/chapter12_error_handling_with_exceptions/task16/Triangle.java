package chapter12_error_handling_with_exceptions.task16;

public class Triangle extends Shape {
    Triangle(int i) {
        super(i);
        System.out.println("Drawing Triangle");
    }

    void dispose() {
        System.out.println("Erasing Triangle");
        super.dispose();
    }
}
