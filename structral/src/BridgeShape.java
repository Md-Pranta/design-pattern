// Implementor: Color ইন্টারফেস
interface Color {
    void applyColor();
}

// Concrete Implementor: RedColor ক্লাস
class RedColor implements Color {
    public void applyColor() {
        System.out.println("Red color applied.");
    }
}

// Concrete Implementor: GreenColor ক্লাস
class GreenColor implements Color {
    public void applyColor() {
        System.out.println("Green color applied.");
    }
}

// Abstraction: Shape ক্লাস
public abstract class BridgeShape {
    protected Color color; // Composition - Implementor

    public BridgeShape(Color color) {
        this.color = color;
    }

    abstract public void draw(); // Abstract method to draw shape
}

// Refined Abstraction: Circle ক্লাস
class Circle1 extends BridgeShape {
    public Circle1(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.print("Circle drawn with ");
        color.applyColor();
    }
}

// Refined Abstraction: Rectangle ক্লাস
class Rectangle extends BridgeShape {
    public Rectangle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.print("Rectangle drawn with ");
        color.applyColor();
    }
}
