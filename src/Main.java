import classes.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Transport> transports = new ArrayList<>();

        for(int i = 0; i < 10; i++)
        {
            Transport transport = Transports.produceRandTransport();
            transports.add(transport);
        }

        for(Transport tr : transports){
            System.out.println(tr.getInfoString());
        }



    }



}



