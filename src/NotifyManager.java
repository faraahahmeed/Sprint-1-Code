import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class  NotifyManager {
    Map<String, List<Observer>> listeners = new HashMap<>();

    public void subscribe(String eventType, Observer listener) {
        List<Observer> users = listeners.get(eventType);
        users.add(listener);
    }

    public void unsubscribe(String eventType, Observer listener) {
        List<Observer> users = listeners.get(eventType);
        users.remove(listener);
    }

    public void notify(float price) {
        List<Observer> users = listeners.get(price);
        for (Observer listener : users) {
            listener.update();
        }
    }
}
