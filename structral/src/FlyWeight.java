import java.util.HashMap;

// Shape ইন্টারফেস
interface Shape {
    void draw();
}

// ConcreteFlyweight: Circle ক্লাস
class Circle implements Shape {
    private String color;
    private int x;
    private int y;
    private int radius;

    public Circle(String color){
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle: Draw() [Color : " + color + ", x : " + x + ", y :" + y + ", radius :" + radius);
    }
}

// FlyweightFactory: ShapeFactory ক্লাস

public class FlyWeight {
    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color){
        Circle circle = (Circle) circleMap.get(color);

        if (circle==null){
            circle = new Circle(color);
            circleMap.put(color,circle);
            System.out.println("creating circle of color : "+color);
        }
        return circle;
    }
}
