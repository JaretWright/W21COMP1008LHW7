import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(3.7634566);
        Circle circle2 = new Circle(10.2);
        Rectangle rectangle1 = new Rectangle(30.23,82.3);
        Rectangle rectangle2 = new Rectangle(100,72);

        ArrayList<TwoDimensionalShape> shapes = new ArrayList();
        shapes.add(circle1);
        shapes.add(circle2);
        shapes.add(rectangle1);
        shapes.add(rectangle2);

        //loop over the ArrayList and display the area for each shape
        for (TwoDimensionalShape shape : shapes)
            System.out.printf("%s - area: %.2f%n",shape,shape.getArea());
    }
}
