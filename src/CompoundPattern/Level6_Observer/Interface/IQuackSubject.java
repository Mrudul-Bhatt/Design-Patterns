package CompoundPattern.Level6_Observer.Interface;

public interface IQuackSubject {
    void registerObserver(IObserver IObserver);

    void notifyObservers();
}
