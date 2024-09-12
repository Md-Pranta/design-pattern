public class Main {

    private static final String[] colors = {"Red", "Green", "Blue", "White", "Black"};
    public static void main(String[] args) {
        System.out.println("Hello world!");

//        Adapter mediaPlayer = new Adapter();
//        mediaPlayer.play("mp3", "beyond the horizon.mp3");
//        mediaPlayer.play("mp4", "alone.mp4");
//        mediaPlayer.play("vlc", "far far away.vlc");
//        mediaPlayer.play("avi", "mind me.avi");  //



//        CompositeEmployee ceo = new CompositeEmployee("john", "ceo", 500000);
//        CompositeEmployee headSales = new CompositeEmployee("hr", "Head Sales", 2000);
//        CompositeEmployee headMarketing = new CompositeEmployee("HM", "marketing", 2000);
//        CompositeEmployee clerk1 = new CompositeEmployee("bob", "cleark", 1000);
//        CompositeEmployee clerk2 = new CompositeEmployee("bob2", "cleark", 1000);
//        CompositeEmployee salesExecutive1 = new CompositeEmployee("richad", "sales",100);
//        CompositeEmployee salesExecutive2 = new CompositeEmployee("richad2", "sales",100);
//        ceo.add(headSales);
//        ceo.add(headMarketing);
//        headSales.add(salesExecutive1);
//        headSales.add(salesExecutive2);
//        headMarketing.add(clerk1);
//        headMarketing.add(clerk2);
//        System.out.println(ceo);
//        for (CompositeEmployee emp: ceo.getSubordinate()){
//            System.out.println(emp);
//            for (CompositeEmployee em: emp.getSubordinate()){
//                System.out.println(em);
//            }
//        }


//        proxyImage image = new proxyImage("test.jpg");
//        image.display();
//        System.out.println("");
//        image.display();



//        for (int i = 0; i < 20; ++i) {
//            Circle circle = (Circle) FlyWeight.getCircle(getRandomColor()) ;
//            circle.setX(getRandomX());
//            circle.setY(getRandomY());
//            circle.setRadius(getRandomR());
//            circle.draw();
//        }


//        TV tv = new TV();
//        Speaker speaker = new Speaker();
//        Projector projector = new Projector();
//        Lighting lighting = new Lighting();
//
//        FacadeTheater homeTheater = new FacadeTheater(tv, speaker, projector, lighting);
//        homeTheater.watchMovie();
//        homeTheater.endMovie();


//        BridgeShape red = new Circle1(new RedColor());
//        BridgeShape green = new Circle1(new GreenColor());
//        red.draw();
//        green.draw();


        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription() + " ₹" + coffee.getCost());

        coffee = new Milk(coffee);
        System.out.println(coffee.getDescription() + " ₹" + coffee.getCost());

        coffee = new Sugar(coffee);
        System.out.println(coffee.getDescription() + " ₹" + coffee.getCost());

    }


    private static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    private static int getRandomX() {
        return (int) (Math.random() * 100);
    }

    private static int getRandomY() {
        return (int) (Math.random() * 100);
    }
    private static int getRandomR() {
        return (int) (Math.random() * 200);
    }

}