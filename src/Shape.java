import java.awt.Color;

public class Shape implements Moveable{
    private Point center;
    private int lineWidth;
    private Color lineColor;

    public Shape(Point center){
        this.center=center;
        setLineColor(Color.BLACK);
        setLineWidth(1);
    }

    public Shape(Point center, int lineWidth, Color lineColor){
        this.center=center;
        this.lineWidth=lineWidth;
        this.lineColor=lineColor;
    }

    public Shape() {
        center = new Point(0, 0);
    }

    public Point getCenter(){
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public Color getLineColor() {
        return lineColor;
    }

    public int getLineWidth() {
        return lineWidth;
    }

    public void setLineColor(Color lineColor) {
        this.lineColor = lineColor;
    }

    public void setLineWidth(int lineWidth) {
        this.lineWidth = lineWidth;
    }

    public void print() {
        System.out.println("Shape - center : "+center);
    }

    public static void printShapes(Shape[] shapes){
        for (Shape value:shapes) {
            value.print();
        }
    }
    public void draw(Paint paint) {
        paint.setColor(lineColor);
        paint.setLineWidth(lineWidth);
        paint.drawLine(center.getX(),center.getY(),center.getX(),center.getY());
    }

    public static void drawShapes(Shape[] shapes, Paint paint){
        for (Shape value:shapes) {
            value.draw(paint);
        }
    }


    @Override
    public void moveTo(int x, int y) {
        setCenter(new Point(x,y));
    }

    public Rectangle getBoundingBox(Shape[] shapes){
        Rectangle rectTest = shapes[0].getBoundingBoxIndiv();
        int xMin=rectTest.getCenter().getX()-(rectTest.getWidth()/2);
        int xMax=rectTest.getCenter().getX()+(rectTest.getWidth()/2);
        int yMin=rectTest.getCenter().getY()-(rectTest.getHeight()/2);
        int yMax=rectTest.getCenter().getY()+(rectTest.getHeight()/2);
        for (Shape value:shapes) {
            rectTest = value.getBoundingBoxIndiv();
            int xMinTest=rectTest.getCenter().getX()-(rectTest.getWidth()/2);
            int xMaxTest=rectTest.getCenter().getX()+(rectTest.getWidth()/2);
            int yMinTest=rectTest.getCenter().getY()-(rectTest.getHeight()/2);
            int yMaxTest=rectTest.getCenter().getY()+(rectTest.getHeight()/2);
            if(xMin > xMinTest){
                xMin = xMinTest;
            }
            if(xMax < xMaxTest){
                xMax = xMaxTest;
            }
            if(yMin > yMinTest){
                yMin = yMinTest;
            }
            if(yMax < yMaxTest){
                yMax = yMaxTest;
            }
        }
        Rectangle boite = new Rectangle(new Point((xMax-xMin)/2,(yMax-yMin)/2),xMax-xMin,yMax-yMin);
        return boite;
    }

    public Rectangle getBoundingBoxIndiv() {
        return  new Rectangle(new Point(10, 100), 13, 10, 2, Color.MAGENTA);
    }


}
