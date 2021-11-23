import java.util.ArrayList;
import java.util.List;

public class NotifyManager {

    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    public void Notify() {
        for (Observer observer : observers) {
                observer.update();
        }
    }
}
