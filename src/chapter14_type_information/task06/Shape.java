package chapter14_type_information.task06;

public abstract class Shape {
    protected boolean flag;

    void draw() {
        System.out.println(this + ".draw()");
    }

    void setFlag(boolean flag) {
        this.flag = flag;
    }

    public abstract String toString();
}
