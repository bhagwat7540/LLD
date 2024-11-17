package ObserverDesignPattern.Observer;

import ObserverDesignPattern.Observable.ObservableInterface;

public class EmailAlertObserver implements Observer{
    private ObservableInterface observable;
    public EmailAlertObserver(ObservableInterface observable){
        this.observable = observable;
    }
    public void update() {
        int data = observable.getData();
        System.out.println("through email data = " + data);
    }
}
