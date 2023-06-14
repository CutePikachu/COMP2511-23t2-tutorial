package shape;

public class Rectangle extends Shape {
    public int height;
    public int width;

    // public Rectangle() {
    //     super();
    // }

    public Rectangle(String color) {
        super(color);
    }

    public Rectangle(String name, int width, int height) {
        this(name);
        this.width = width;
        this.height = height;
    }

    @Override
    public void printColor() {
        System.out.print("I have ");
        super.printColor();
    }
}
