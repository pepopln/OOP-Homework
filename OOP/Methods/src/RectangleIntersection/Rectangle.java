package RectangleIntersection;


public class Rectangle {
    private String id;
    private double width;
    private double height;
    private double x1;
    private double y1;
    private double x2;
    private double y2;

    public Rectangle(String id, double width, double height, double coordX, double coordY) {
        this.id = id;
        this.width = width;
        this.height = height;
        this.x1 = coordX;
        this.y1 = coordY;
        this.x2=x1+this.width;
        this.y2 = y1+this.height;

    }

    private double getX1() {
        return x1;
    }

    private double getY1() {
        return y1;
    }

    private double getX2() {
        return x2;
    }

    private double getY2() {
        return y2;
    }
    public boolean intersects(Rectangle other){
        return this.getX1()<=other.getX2()&&
                other.getX1()<=this.getX2()&&
                this.getY1()<=other.getY2()&&
                other.getY1()<=this.getY2();
    }
}
