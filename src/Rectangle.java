import java.awt.Color;

public class Rectangle extends Shape{
    private int width;
    private int height;

    public Rectangle(Point center, int width, int height){
        setCenter(center);
        this.width=width;
        this.height=height;
        setLineColor(Color.BLACK);
        setLineWidth(1);
    }

    public Rectangle(Point center, int width, int height, int lineWidth, Color lineColor){
        setCenter(center);
        this.width=width;
        this.height=height;
        setLineColor(lineColor);
        setLineWidth(lineWidth);
    }

    public int getHeight() {
        return height;
    }

    public int getWidth(){
        return width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void print(){
        System.out.println("Rectangle - center : "+getCenter()+", width : "+width+", height : "+height);
    }

    public void draw(Paint paint){

        paint.setColor(getLineColor());
        paint.setLineWidth(getLineWidth());

        int xStart = getCenter().getX()-(width/2);
        int xEnd = getCenter().getX()+(width/2);
        int yStart = getCenter().getY()+(height/2);
        int yEnd = getCenter().getY()+(height/2);
        paint.drawLine(xStart,yStart,xEnd,yEnd);

        xStart = getCenter().getX()-(width/2);
        xEnd = getCenter().getX()+(width/2);
        yStart = getCenter().getY()-(height/2);
        yEnd = getCenter().getY()-(height/2);
        paint.drawLine(xStart,yStart,xEnd,yEnd);

        xStart = getCenter().getX()-(width/2);
        xEnd = getCenter().getX()-(width/2);
        yStart = getCenter().getY()-(height/2);
        yEnd = getCenter().getY()+(height/2);
        paint.drawLine(xStart,yStart,xEnd,yEnd);

        xStart = getCenter().getX()+(width/2);
        xEnd = getCenter().getX()+(width/2);
        yStart = getCenter().getY()-(height/2);
        yEnd = getCenter().getY()+(height/2);
        paint.drawLine(xStart,yStart,xEnd,yEnd);
    }

    public Rectangle getBoundingBoxIndiv() {
        return this;
    }
}
