import classes.*;

import java.util.Random;

public class Main_lab2_Threads {
    public static void main(String[] args) {

        Transports transports = new Transports();
        Runnable producer = () -> {
            for(int i = 0; i < 100; i++){
                Transport transport = Transports.produceRandTransport();
                transports.addTransport(transport);
            }
        };
        Runnable consumer = () -> {
            for(int i = 0; i < 100; i++){

                transports.removeTransport();
            }
        };
        for(int i = 0; i < 2; i++){
            (new Thread(producer)).start();
            (new Thread(consumer)).start();
        }

    }

}
