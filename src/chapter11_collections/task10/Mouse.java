package chapter11_collections.task10;

public class Mouse extends Rodent {

    @Override
    public void run() {
        System.out.println("Mouse is running");
    }

    @Override
    public void eat() {
        System.out.println("Mouse is eating");
    }

}
