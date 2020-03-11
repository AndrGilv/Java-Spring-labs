import classes.*;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class Transports {
    private final int CAPACITY = 100;
    private static AtomicInteger curFullness = new AtomicInteger(0);
    private ArrayList<Transport> transports = new ArrayList<>();


    public synchronized  void addTransport(Transport transport) {
        if(curFullness.get() < CAPACITY){
            //notifyAll();
            transports.add(transport);
            curFullness.incrementAndGet();
            System.out.println(Thread.currentThread().getName() + ", add, current fullness: " + curFullness);
        }
        else
        {
            System.out.println(Thread.currentThread().getName() + ", can't add, current fullness: " + curFullness);
            //wait();
        }
    }

    public synchronized void removeTransport(){
        if(curFullness.get() > 0){
            //notifyAll();
            transports.remove(0);
            curFullness.decrementAndGet();
            System.out.println(Thread.currentThread().getName() + ", remove, current fullness: " + curFullness);
        }
        else
        {
            System.out.println(Thread.currentThread().getName() + ", can't remove, current fullness: " + curFullness);
            //wait();
        }
    }

    public static Transport produceRandTransport(){
        Random rand = new Random();
        Transport transport = null;
        int switcher = rand.nextInt(4);
        switch (switcher){
            case 0:
                transport = new PassengerCar("GT86", 2, "задний", "купе", "спорт", 2);
                transport.setCost(3_000_000);
                break;
            case 1:
                transport = new SuperCar("aventodor", "полный привод", "среднемоторное купе", 2);
                transport.setCost(9_000_000);
                break;
            case 2:
                transport = new PassengerCar("model 3", 5, "полный привод", "хетчбек", "stok", 5);
                transport.setCost(6_000_000);
                break;
            case 3:
                transport = new Truck("Камаз", 2, "задний", 3000, 3);
                transport.setCost(3_000_000);
                break;
        }
        return transport;
    }
}
