abstract class Computer1{
    public abstract String getRAM();
    public abstract String getHDD();
    public abstract String getCPU();

    @Override
    public String toString(){
        return "RAM= "+this.getRAM()+", HDD="+this.getHDD()+", CPU="+this.getCPU();
    }
}

class Pc1 extends Computer1{
    private String ram;
    private String hdd;
    private String cpu;
    public Pc1(String ram, String hdd, String cpu){
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
    }
    @Override
    public String getRAM() {
        return this.ram;
    }

    @Override
    public String getHDD() {
        return this.hdd;
    }

    @Override
    public String getCPU() {
        return this.cpu;
    }

}

class Server1 extends Computer1{
    private String ram;
    private String hdd;
    private String cpu;
    public Server1(String ram, String hdd, String cpu){
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
    }
    @Override
    public String getRAM() {
        return this.ram;
    }

    @Override
    public String getHDD() {
        return this.hdd;
    }

    @Override
    public String getCPU() {
        return this.cpu;
    }

}
interface ComputerAbstractFactory{
    public Computer1 createComputer();
}

class PCFactory implements ComputerAbstractFactory{
    private String ram;
    private String hdd;
    private String cpu;

    public PCFactory(String ram, String hdd, String cpu){
        this.ram=ram;
        this.hdd=hdd;
        this.cpu=cpu;
    }

    @Override
    public Computer1 createComputer() {
        return new Pc1(ram,hdd,cpu);
    }
}

class ServerFactory implements ComputerAbstractFactory{
    private String ram;
    private String hdd;
    private String cpu;

    public ServerFactory(String ram, String hdd, String cpu){
        this.ram=ram;
        this.hdd=hdd;
        this.cpu=cpu;
    }

    @Override
    public Computer1 createComputer() {
        return new Server1(ram,hdd,cpu);
    }
}


public class AbstractFactory3 {
    public static Computer1 getComputer(ComputerAbstractFactory factory){
        return factory.createComputer();
    }
}

/*
* Abstract Factory design pattern provides approach to code for interface rather than implementation.
Abstract Factory pattern is “factory of factories” and can be easily extended to accommodate more products,
* for example we can add another sub-class Laptop and a factory LaptopFactory.
Abstract Factory pattern is robust and avoid conditional logic of Factory pattern.
* */
