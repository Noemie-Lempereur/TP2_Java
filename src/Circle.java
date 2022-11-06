import java.awt.Color;

public class Circle extends Shape{
    private int radius;

    public Circle(Point center, int radius){
        this.setCenter(center);
        this.radius=radius;
        setLineColor(Color.BLACK);
        setLineWidth(1);
    }

    public Circle(Point center, int radius, int lineWidth, Color lineColor){
        this.setCenter(center);
        this.radius=radius;
        setLineColor(lineColor);
        setLineWidth(lineWidth);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void print(){
        System.out.println("Circle - center : "+getCenter()+", radius : "+radius);
    }

    public void draw(Paint paint){
        paint.setColor(getLineColor());
        paint.setLineWidth(getLineWidth());
        paint.drawArc(getCenter().getX(),getCenter().getY(),2*radius,2*radius,0,360);
    }


    public Rectangle getBoundingBoxIndiv() {
        return new Rectangle(this.getCenter(),2*this.getRadius(),2*this.getRadius());
    }
}
