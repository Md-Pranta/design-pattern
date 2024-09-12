interface StateInterface{
    void turnUp(Fan1 fan1);
    void turnDown(Fan1 fan1);
}

class OffState implements StateInterface {
    public void turnUp(Fan1 fan1){
        System.out.println("Fan is set to Low speed");
        fan1.setState(new LowSpeedState());
    }

    public void turnDown(Fan1 fan1){
        System.out.println("Fan is already off");
    }
}
class LowSpeedState implements StateInterface{
    public void turnUp(Fan1 fan1){
        System.out.println("Fan is set to high speed");
        fan1.setState(new HighSpeedState());
    }

    public void turnDown(Fan1 fan1){
        System.out.println("Fan is set to offState");
        fan1.setState(new OffState());
    }
}

class HighSpeedState implements StateInterface{
    public void turnUp(Fan1 fan1){
        System.out.println("Fan is already to high speed");
    }

    public void turnDown(Fan1 fan1){
        System.out.println("Fan is set to Low speed");
        fan1.setState(new LowSpeedState());
    }
}
class Fan1{
    private StateInterface state;

    public Fan1(){
        this.state = new OffState();
    }
    public void setState(StateInterface state){
        this.state = state;
    }

    public void turnUP(){
        state.turnUp(this);
    }
    public void turnDown(){
        state.turnDown(this);
    }

}


public class StatePattern {
    public static void main(String[] args) {
        Fan1 fan1 = new Fan1();

        fan1.turnUP();
        fan1.turnUP();
        fan1.turnUP();


    }
}
