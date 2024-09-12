// Handler ইন্টারফেস
interface SupportHandler {
    void setNextHandler(SupportHandler nextHandler);
    void handleRequest(String request);
}

// Concrete Handler: TechnicalSupport ক্লাস
class TechnicalSupport implements SupportHandler {
    private SupportHandler nextHandler;

    @Override
    public void setNextHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(String request) {
        if (request.equals("Technical Issue")) {
            System.out.println("Technical Support handling the request.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}

// Concrete Handler: Supervisor ক্লাস
class Supervisor implements SupportHandler {
    private SupportHandler nextHandler;

    @Override
    public void setNextHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(String request) {
        if (request.equals("Supervisor Issue")) {
            System.out.println("Supervisor handling the request.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}

// Concrete Handler: Manager ক্লাস
class Manager implements SupportHandler {
    @Override
    public void setNextHandler(SupportHandler nextHandler) {
        // No next handler, this is the end of the chain
    }

    @Override
    public void handleRequest(String request) {
        System.out.println("Manager handling the request.");
    }
}

// মেইন ক্লাস
public class ChainOfResponsibility {
    public static void main(String[] args) {
        SupportHandler technicalSupport = new TechnicalSupport();
        SupportHandler supervisor = new Supervisor();
        SupportHandler manager = new Manager();

        // Create the chain of responsibility
        technicalSupport.setNextHandler(supervisor);
        supervisor.setNextHandler(manager);

        // Test the chain with different requests
//        technicalSupport.handleRequest("Technical Issue");
//        technicalSupport.handleRequest("Supervisor Issue");
        technicalSupport.handleRequest("Manager Issue");
    }
}

