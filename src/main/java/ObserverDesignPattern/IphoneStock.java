package ObserverDesignPattern;

import ObserverDesignPattern.Observable.IphoneStockObservable;
import ObserverDesignPattern.Observable.ObservableInterface;
import ObserverDesignPattern.Observer.EmailAlertObserver;
import ObserverDesignPattern.Observer.MobileAlertObserver;
import ObserverDesignPattern.Observer.Observer;


public class IphoneStock {
    public static void main(String[] args) {
        ObservableInterface subject = new IphoneStockObservable();
        Observer mobileObserver = new MobileAlertObserver(subject);
        Observer emailObserver = new EmailAlertObserver(subject);
        subject.attach(mobileObserver);
        subject.attach(emailObserver);
        subject.setData(10);

        subject.setData(0);
    }
}
