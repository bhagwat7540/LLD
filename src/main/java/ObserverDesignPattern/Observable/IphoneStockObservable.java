package ObserverDesignPattern.Observable;

import ObserverDesignPattern.Observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class IphoneStockObservable implements ObservableInterface{
    private List<Observer> listObj = new ArrayList<Observer>();
    private int data = 0;

    public void attach(Observer obj) {
        listObj.add(obj);
    }

    public void detach(Observer obj) {
        listObj.remove(obj);
    }

    public void noti() {
            for(Observer obj : listObj){
                obj.update();
            }
    }

    public void setData(int data) {
        this.data = data;
        if(data != 0) noti();
    }

    public int getData() {
        return this.data;
    }
}
