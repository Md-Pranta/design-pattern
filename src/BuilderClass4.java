class BuildComputer{
    private String HDD;
    private String RAM;

    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;

    public String getHDD() {
        return HDD;
    }

    public String getRAM() {
        return RAM;
    }

    public boolean isGraphicsCardEnabled() {
        return isGraphicsCardEnabled;
    }

    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    private BuildComputer(BuilderClass4 builder){
        this.HDD=builder.HDD;
        this.RAM=builder.RAM;
        this.isGraphicsCardEnabled=builder.isGraphicsCardEnabled;
        this.isBluetoothEnabled=builder.isBluetoothEnabled;
    }

    public static class BuilderClass4 {
        private String HDD;
        private String RAM;

        private boolean isGraphicsCardEnabled;
        private boolean isBluetoothEnabled;

        public BuilderClass4(String HDD, String RAM){
            this.HDD = HDD;
            this.RAM = RAM;
        }

        public BuilderClass4  setGraphicsCardEnabled(boolean isGraphicsCardEnabled){
            this.isGraphicsCardEnabled = isGraphicsCardEnabled;
            return this;
        }
        public BuilderClass4 setBluetoothEnabled(boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        public  BuildComputer build(){
            return new BuildComputer(this);
        }

    }
}





class Meal {
    private String drink;
    private String mainCourse;
    private String side;

    public Meal(String drink, String mainCourse, String side) {
        this.drink = drink;
        this.mainCourse = mainCourse;
        this.side = side;
    }

    @Override
    public String toString() {
        return "Drink: " + this.drink + ", Main Course: " + this.mainCourse + ", Side: " + this.side;
    }
}

class MealBuilder {
    private String drink;
    private String mainCourse;
    private String side;

    public MealBuilder setDrink(String drink) {
        this.drink = drink;
        return this;
    }

    public MealBuilder setMainCourse(String mainCourse) {
        this.mainCourse = mainCourse;
        return this;
    }

    public MealBuilder setSide(String side) {
        this.side = side;
        return this;
    }

    public Meal build() {
        return new Meal(drink, mainCourse, side);
    }
}

class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder builder = new MealBuilder();
        Meal meal = builder.setDrink("Coke")
                .setMainCourse("Burger")
                .setSide("Fries")
                .build();

        System.out.println(meal);
    }
}

//Too Many arguments to pass from client program to the Factory class that can be error prone because most of the time,
//        the type of arguments are same and from client side its hard to maintain the order of the argument.
//Some of the parameters might be optional but in Factory pattern, we are forced to send all the parameters and
// optional parameters need to send as NULL.
//If the object is heavy and its creation is complex, then all that complexity will be part of Factory classes that is confusing.