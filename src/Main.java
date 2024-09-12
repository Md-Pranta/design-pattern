import java.util.List;

public class Main {
//    private static void testAbs(){
//        Computer1 server = AbstractFactory3.getComputer(new ServerFactory("16 GB","1 TB","2.9 GHz"));
//        Computer1 pc = AbstractFactory3.getComputer(new PCFactory("2 GB","500 GB","2.4 GHz"));
//        System.out.println(pc);
//        System.out.println(server);
//    }
    public static void main(String[] args) throws CloneNotSupportedException {

        System.out.println("Hello world!");
//        singleton b = singleton.getInstance();
//        ThreadSafe a = ThreadSafe.getInstance();
//        System.out.println(a);

//        Computer pc = Factory.getComputer("pc","2 GB","500 GB","2.4 GHz");
//        Computer server = Factory.getComputer("server","16 GB","1 TB","2.9 GHz");
//        System.out.println(pc);
//        System.out.println(server);


//        testAbs();


//        BuildComputer com = new BuildComputer.BuilderClass4("500 GB", "2 GB").setBluetoothEnabled(true).setGraphicsCardEnabled(true).build();



        ProtoType employee = new ProtoType();

        employee.loadData();

        ProtoType newEmployee = (ProtoType) employee.clone();
        ProtoType newEmployee1 = (ProtoType) employee.clone();

        List<String> li = newEmployee.getEmployeeList();
        li.add("xyz");
        List<String> li1 = newEmployee1.getEmployeeList();
        li1.remove("e");

        System.out.println(employee.getEmployeeList());
        System.out.println(li);
        System.out.println(li1);

    }

}

