import java.util.ArrayList;
import java.util.List;

interface Subject{
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
}
interface Observer{
    void update(String msg);
}
class NewsPublisher implements Subject{
    private List<Observer>list = new ArrayList<>();
    private String news;

    public void addObserver(Observer observer){
        list.add(observer);
    }

    public void removeObserver(Observer observer){
        list.remove(observer);
    }
    public void notifyObserver(){
        for (Observer obs: list) {
            obs.update(news);
        }
    }
    public void setNews(String news){
        this.news = news;
        notifyObserver();
    }
}

class Subscriber implements Observer{
    private String name;

    public Subscriber(String name){
        this.name = name;
    }

    public void update(String msg){
        System.out.println(this.name+" updated news : "+msg);
    }
}
public class Observerr {
    public static void main(String []args){
        NewsPublisher news = new NewsPublisher();

        Observer sub1 = new Subscriber("alex");
        Observer sub2 = new Subscriber("robin");

        news.addObserver(sub1);
        news.addObserver(sub2);

        news.setNews("Hello");
    }
}
