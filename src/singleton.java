/* Eager singleton
drawback to eager initialization is that the method is created even though
the client application might not be using it.
We should avoid the instantiation unless the client calls the getInstance method.
Also, this method doesn’t provide any options for exception handling.
*/
class singleton {
    private static final singleton instance=new singleton();

    private singleton(){}

    public static singleton getInstance(){
        return instance;
    }
}

/*static block initialization
*Both eager initialization and static block initialization create the instance even before
* it’s being used and that is not the best practice to use.
* */
class StaticBlockInitialization{
    private static StaticBlockInitialization instance;

    private StaticBlockInitialization(){}

    static {
        try{
            instance = new StaticBlockInitialization();
        }catch (Exception err){
            throw new RuntimeException("Exception occurred in creating singleton instance");
        }
    }

    public static StaticBlockInitialization getInstance(){
        return instance;
    }
}

/*Lazy Initialization
* this method to implement the
* singleton pattern creates the instance in the global access method.
* when it comes to multithreaded systems, it can cause issues
* if multiple threads are inside the if condition at the same time.
* It will destroy the singleton pattern and both threads will get
* different instances of the singleton class.
* */

class Lazy{
    private static Lazy instance;

    Lazy(){}

    public static Lazy getInstance(){
        if(instance==null){
            instance = new Lazy();
        }
        return instance;
    }
}

/*thread safe
* the preceding implementation works fine and provides thread-safety, but it reduces the
*  performance because of the cost associated with the synchronized method
* */

class ThreadSafe{
    private static ThreadSafe instance;

    ThreadSafe(){}

    public static ThreadSafe getInstance(){
        if(instance==null){
            synchronized (ThreadSafe.class){
                if(instance==null){
                    instance = new ThreadSafe();
                }

            }

        }
        return instance;
    }
}

/*Bill pugh Singleton
 *the previous approaches used to fail in certain scenarios where too many threads
 * tried to get the instance of the singleton class simultaneously.
 * This is the most widely used approach for the singleton class as it doesn’t
 * require synchronization
 * */

class BillPugh{
    private BillPugh(){}
    private static class Helper{
        private static final BillPugh instance = new BillPugh();
    }
    public static BillPugh getInstance(){
        return Helper.instance;
    }
}