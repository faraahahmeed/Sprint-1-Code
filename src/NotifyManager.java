public interface NotifyManager {
    public void Subscribe(Observer o);
    public void unSubscribe(Observer o);
    public void Notify();
}
