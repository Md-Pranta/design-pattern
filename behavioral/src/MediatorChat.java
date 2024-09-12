import java.util.ArrayList;
import java.util.List;

interface ChatMediator{
    void sendMessage(String msg, User user);
    void addUser(User user);
}

abstract class User{
    protected ChatMediator mediator;
    protected String name;

    public User(ChatMediator mediator, String name){
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void send(String msg);
    public abstract void receive(String msg);
}


public class MediatorChat implements ChatMediator {
    private List<User>users;
    public MediatorChat(){
        this.users = new ArrayList<User>();
    }
    @Override
    public void addUser(User user){
        this.users.add(user);
    }

    public void sendMessage(String msg, User user){
        for (User u: this.users){
            if(u != user) u.receive(msg);
        }
    }
}

class BasicUser extends User{
    public BasicUser(ChatMediator mediator, String name){
        super(mediator, name);
    }

    public void send(String msg){
        System.out.println(this.name+"sending message : "+msg);
        mediator.sendMessage(msg, this);
    }
    public void receive(String msg){
        System.out.println(this.name+ " : Received message : "+msg);
    }
}
