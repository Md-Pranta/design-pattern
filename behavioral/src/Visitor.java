// Visitor ইন্টারফেস
interface ComputerPartVisitor {
    void visit(Keyboard keyboard);
    void visit(Mouse mouse);
    void visit(Monitor monitor);
    void visit(Computer computer); // New method to visit Computer
}

// Concrete Visitor: ComputerPartDisplayVisitor
class ComputerPartDisplayVisitor implements ComputerPartVisitor {
    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Displaying Keyboard.");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Displaying Mouse.");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Displaying Monitor.");
    }

    @Override
    public void visit(Computer computer) { // New method implementation
        System.out.println("Displaying Computer.");
    }
}

// ComputerPart ইন্টারফেস
interface ComputerPart {
    void accept(ComputerPartVisitor visitor);
}

// Concrete Element: Keyboard
class Keyboard implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor visitor) {
        visitor.visit(this);
    }
}

// Concrete Element: Mouse
class Mouse implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor visitor) {
        visitor.visit(this);
    }
}

// Concrete Element: Monitor
class Monitor implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor visitor) {
        visitor.visit(this);
    }
}

// Object Structure: Computer
class Computer implements ComputerPart {
    ComputerPart[] parts;

    public Computer() {
        parts = new ComputerPart[] {new Keyboard(), new Mouse(), new Monitor()};
    }

    @Override
    public void accept(ComputerPartVisitor visitor) {
        for (ComputerPart part : parts) {
            part.accept(visitor);
        }
        visitor.visit(this); // No more error
    }
}


public class Visitor {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
