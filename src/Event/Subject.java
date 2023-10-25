package Event;

import java.util.LinkedList;
import java.util.List;
//import java.util.Observer;
//import java.util.Observer;

public class Subject {
    //观察者数组
    private List<Observe> vector = new LinkedList<>();


    //增加一个观察者
    public void addObserver(Observe observer) {
        vector.add(observer);
    }

    //删除一个观察者
    public void deleteObserver(Observe observer) {
        vector.remove(observer);
    }

    //通知所有观察者
    public void notifyAllObserver() {
        for(Observe observer : vector) {
            observer.toDo();
        }
    }

    // 通知特定观察者
    public void notifyOneObserver(int i) {
        vector.get(i).toDo();
    }
}
