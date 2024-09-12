import java.util.ArrayList;
import java.util.List;

public class ProtoType implements Cloneable {
    private List<String> employeeList;

    public ProtoType(){
        employeeList = new ArrayList<String>();
    }

    public ProtoType(List<String> li){
        this.employeeList = li;
    }

    public void loadData(){
        employeeList.add("a");
        employeeList.add("b");
        employeeList.add("c");
        employeeList.add("d");
        employeeList.add("e");
    }

    public List<String> getEmployeeList(){
        return employeeList;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        List<String> temp = new ArrayList<String>();
        for (String s: this.getEmployeeList()){
            temp.add(s);
        }
        return new ProtoType(temp);
    }
}
