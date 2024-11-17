package ObserverDesignPattern.Observer;

import ObserverDesignPattern.Observable.ObservableInterface;

public class MobileAlertObserver implements Observer{
    private ObservableInterface observable;
    public MobileAlertObserver(ObservableInterface observable){
        this.observable = observable;
    }
    public void update() {
        int data = observable.getData();
        System.out.println("through mobile data = " + data);
    }
}
