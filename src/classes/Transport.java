package classes;

public abstract class Transport {
    protected String kind; // машины, самолёты ...
    protected String name;
    protected String type; // грузовые или легковые авто
    protected int numberOfSeats;
    protected int cost;




    public void setKind(String kind) {
        this.kind = kind;
    }

    public void setType(String type) {
        this.type = type;
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

    public String showInfo(){
        String info = "";
        info += "Type: " + type + ", kind = " + kind + ", name = " + name + ", type = " + type + ", number of sits = " + numberOfSeats;
        return info;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }


}
