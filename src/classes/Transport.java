package classes;

public class Transport {
    private String kind; // машины, самолёты ...
    private String name;
    private String type; // грузовые или легковые авто
    private int numberOfSeats;

    public Transport(String kind, String type) {
        this.kind = kind;
        this.type = type;
    }

    public Transport(String kind, String name, String type, int numberOfSeats) {
        this.kind = kind;
        this.name = name;
        this.type = type;
        this.numberOfSeats = numberOfSeats;
    }

    public String getKind() {
        return kind;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        if(numberOfSeats > 0){
            this.numberOfSeats = numberOfSeats;
        }
        else{
            throw new IllegalArgumentException();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

}
