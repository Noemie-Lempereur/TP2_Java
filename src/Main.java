import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        //Test class Point
        /*Point p = new Point(100, 200);
        System.out.println(p.getX());
        p.setX(300);
        System.out.println(p.getX());

        Point p2 = new Point(100, 200);
        System.out.println(p2);*/

        //Test class Shape
        /*Shape s = new Shape(new Point(100, 200));
        s.print();
        Shape[] sTab = new Shape[2];
        sTab[0] = new Circle(new Point(100, 200), 50);
        sTab[1] = new Rectangle(new Point(100, 200), 500,1000);
        Shape.printShapes(sTab);
        Paint p = new Paint(200, 200);
        Shape s2 = new Shape(new Point(100, 200));
        Circle c = new Circle(new Point(100, 100), 100);
        Rectangle r = new Rectangle(new Point(100, 100), 173, 100);
        Shape[] shapes = new Shape[3];
        shapes[0] = c;
        shapes[1] = r;
        shapes[2] = s2;
        Shape.drawShapes(shapes, p);*/


        // Test de la classe Circle
        /*Circle c = new Circle(new Point(100, 200), 50);
        c.print();
        c.setRadius(20);
        c.print();
        Paint p = new Paint(200, 200);
        c.draw(p);*/

        //Test de la classe Rectangle
        /*Rectangle r = new Rectangle(new Point(100, 100), 173, 100);
        r.draw(p);*/

        //Test de la classe Paint
        /*Paint p = new Paint(500, 300);
        p.drawLine(100, 200, 200, 100);
        p.drawArc(300, 200, 200, 200, 0, 90);*/

        Paint p = new Paint(1000, 2000);
        Circle c = new Circle(new Point(100, 100), 100, 5, Color.RED);
        c.draw(p);
        Rectangle r = new Rectangle(new Point(100, 100), 173, 100, 2, Color.BLUE);
        r.draw(p);
        Rectangle r2  = new Rectangle(new Point(10, 100), 13, 10, 2, Color.BLUE);
        Shape[] shapes = new Shape[3];
        shapes[0] = c;
        shapes[1] = r;
        shapes[2] = r2;
        Rectangle r3 = new Rectangle(new Point(10, 100), 13, 10, 2, Color.GREEN);
        r3 = c.getBoundingBox(shapes);
        r3.print();
        r3.draw(p);
        Shape.drawShapes(shapes,p);

    }
}