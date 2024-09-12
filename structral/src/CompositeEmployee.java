import java.util.ArrayList;
import java.util.List;



public class CompositeEmployee {
    private String name;
    private String dept;
    private int salary;
    private List<CompositeEmployee> subordinates;

    public CompositeEmployee(String name, String dept, int salary){
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        subordinates= new ArrayList<CompositeEmployee>();
    }

    public void add(CompositeEmployee e){
        subordinates.add(e);
    }

    public void remove(CompositeEmployee e){
        subordinates.remove(e);
    }

    public List<CompositeEmployee> getSubordinate(){
        return subordinates;
    }
    public String toString(){
        return ("Employee : [ name : "+name+", dept : "+dept+", salary : "+salary);
    }
}
