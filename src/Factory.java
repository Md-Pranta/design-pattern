abstract class Computer{
    public abstract String getRAM();
    public abstract String getHDD();
    public abstract String getCPU();

    @Override
    public String toString(){
        return "RAM= "+this.getRAM()+", HDD="+this.getHDD()+", CPU="+this.getCPU();
    }
}

class Pc extends Computer{
    private String ram;
    private String hdd;
    private String cpu;
    public Pc(String ram, String hdd, String cpu){
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

class Server extends Computer{
    private String ram;
    private String hdd;
    private String cpu;
    public Server(String ram, String hdd, String cpu){
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
public class Factory {
    public static Computer getComputer(String type, String ram, String hdd, String cpu){
        if ("PC".equalsIgnoreCase(type)){
            return new Pc(ram, hdd, cpu);
        } else if ("Server".equalsIgnoreCase(type)) {
            return new Server(ram, hdd, cpu);
        }
        else return null;
    }
}

/*
* Factory design pattern provides approach to code for interface rather than implementation.
Factory pattern removes the instantiation of actual implementation classes from client code. Factory pattern makes our code more robust,
* less coupled and easy to extend. For example, we can easily change PC class implementation because client program is unaware of this.
Factory pattern provides abstraction between implementation and client classes through inheritance.
* */