package Observer.PostOffice;

public interface Subject {
    void attach(Observer o);
    void detach(Observer o);
    void notifyObservers(Post post);

}
