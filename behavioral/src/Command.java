interface CommandInterface{
    void execute();
}

class LightOn implements CommandInterface{
    Light light;

    public LightOn(Light light){
        this.light = light;
    }
    public void execute(){
        light.turnOn();
    }
}
class LightOff implements CommandInterface{
    Light light;

    public LightOff(Light light){
        this.light = light;
    }
    public void execute(){
        light.turnOff();
    }
}

class Light{
    public void turnOn(){
        System.out.println("Light is on");
    }
    public void turnOff(){
        System.out.println("Light is Off");
    }
}

class FanStart implements CommandInterface{
    Fan fan;

    public FanStart(Fan fan){
        this.fan = fan;
    }
    public void execute(){
        fan.start();
    }
}
class FanStop implements CommandInterface{
    Fan fan;

    public FanStop(Fan fan){
        this.fan = fan;
    }

    public void execute(){
        fan.stop();
    }
}

class Fan{
    public void start(){
        System.out.println("Fan is on");
    }
    public void stop(){
        System.out.println("Fan is Off");
    }
}

class RemoteControl{
    CommandInterface command;

    public void setCommand(CommandInterface command){
        this.command = command;
    }

    public void pressButton(){
        command.execute();
    }
}

public class Command {
    public static void main(String[] args) {
        Light light = new Light();
        Fan fan = new Fan();

        CommandInterface lightOn = new LightOn(light);
        CommandInterface lightOff = new LightOff(light);

        CommandInterface start = new FanStart(fan);
        CommandInterface stop = new FanStop(fan);

        RemoteControl control = new RemoteControl();

        control.setCommand(lightOn);
        control.pressButton();
        control.setCommand(start);
        control.pressButton();

        control.setCommand(lightOff);
        control.pressButton();
    }
}
