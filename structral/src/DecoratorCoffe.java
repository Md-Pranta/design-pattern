// Component: Coffee ইন্টারফেস
interface Coffee {
    String getDescription();
    double getCost();
}

// Concrete Component: SimpleCoffee ক্লাস
class SimpleCoffee implements Coffee {
    public String getDescription() {
        return "Simple Coffee";
    }

    public double getCost() {
        return 50.0;
    }
}

// Decorator: CoffeeDecorator ক্লাস
public class DecoratorCoffe implements Coffee {
    protected Coffee coffee;

    public DecoratorCoffe(Coffee coffee) {
        this.coffee = coffee;
    }

    public String getDescription() {
        return coffee.getDescription();
    }

    public double getCost() {
        return coffee.getCost();
    }
}

// Concrete Decorator: Milk ক্লাস
class Milk extends DecoratorCoffe {
    public Milk(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Milk";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 20.0;
    }
}

// Concrete Decorator: Sugar ক্লাস
class Sugar extends DecoratorCoffe {
    public Sugar(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Sugar";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 10.0;
    }
}



