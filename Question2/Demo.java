package Question2;

public class Demo {
    public static void main(String[] args) {

        System.out.println();
        
        Point point = new Point(1.5f, 2.5f);
        System.out.println("Point: " + point);

        MovablePoint movablePoint = new MovablePoint(1.5f, 2.5f, 0.5f, 0.5f);
        System.out.println("MovablePoint before move: " + movablePoint);
        movablePoint.move();
        System.out.println("MovablePoint after move: " + movablePoint);
    }
}


