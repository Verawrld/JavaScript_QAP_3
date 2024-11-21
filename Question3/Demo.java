package Question3;

public class Demo {
    public static void main(String[] args) {

        System.out.println();
        
        Shape[] shapes = {
                new Circle("Circle1", 7),
                new Ellipse("Ellipse1", 3, 5),
                new Triangle("Triangle1", 4, 5, 7),
                new EquilateralTriangle("EquilateralTriangle1", 6)
        };

        System.out.println("Before scaling:");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }

        scaleShapes((Scalable[]) shapes, 2);

        System.out.println("\nAfter scaling:");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }

    public static void scaleShapes(Scalable[] shapes, double factor) {
        for (Scalable shape : shapes) {
            shape.scale(factor);
        }
    }
}