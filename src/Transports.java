import classes.Transport;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Transports {
    private final int CAPACITY = 10;
    private static AtomicInteger curFullness = new AtomicInteger(0);
    private ArrayList<Transport> transports = new ArrayList<>();


    public synchronized  void addTransport(Transport transport) {
        try {
            if(curFullness.get() < 10){
                notifyAll();
                transports.add(transport);
                curFullness.incrementAndGet();
                System.out.println("add, current fullness: " + curFullness);
            }
            else
            {
                System.out.println("can't add, current fullness: " + curFullness);
                wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void removeTransport(){
        try {
            if(curFullness.get() > 0){
                notifyAll();
                transports.remove(0);
                curFullness.decrementAndGet();
                System.out.println("remove, current fullness: " + curFullness);
            }
            else
            {
                System.out.println("can't remove, current fullness: " + curFullness);
                wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
