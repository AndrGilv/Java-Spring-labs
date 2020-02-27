import classes.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {





    public static void main(String[] args) {
        //ArrayList<Transport> transports = new ArrayList<>();
        /*
        for(int i = 0; i < 10; i++)
        {
            Transport transport = produceRandTransport();
            transports.add(transport);
        }

        for(Transport tr : transports){
            System.out.println(tr.showInfo());
        }
        */
        Transports transports = new Transports();
        Runnable producer = () -> {
            for(int i = 0; i < 100; i++){
                Transport transport = produceRandTransport();
                transports.addTransport(transport);
            }
        };
        Runnable consumer = () -> {
            for(int i = 0; i < 100; i++){

                transports.removeTransport();
            }
        };
        for(int i = 0; i < 4; i++){
            (new Thread(producer)).start();
            (new Thread(consumer)).start();
        }

    }



    public static Transport produceRandTransport(){
        Random rand = new Random();
        Transport transport = null;
        int switcher = rand.nextInt(4);
        switch (switcher){
            case 0:
                transport = new PassengerCar("GT86", 2, "задний", "купе", "спорт", 2);
                break;
            case 1:
                transport = new SuperCar("aventodor", "полный привод", "среднемоторное купе", 2);
                break;
            case 2:
                transport = new Car("model 3", "хетчбек", 5, "полный привод");
                break;
            case 3:
                transport = new Truck("Камаз", 2, "задний", 3000, 3);
                break;
        }
        return transport;
    }

}



