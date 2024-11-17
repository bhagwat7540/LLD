package ObserverDesignPattern.Observable;

import ObserverDesignPattern.Observer.Observer;

public interface ObservableInterface {
    public void attach(Observer obj);
    public void detach(Observer obj);
    public void noti();
    public void setData(int data);
    public int getData();
}
