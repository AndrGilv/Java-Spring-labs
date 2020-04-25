package classes.Buildings;

public class Flat extends BuildingItem {

    private int space;

    public Flat(int space, String name) {
        super( name);
        this.space = space;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Flat ");
        builder.append(name);
        builder.append(", space ");
        builder.append(space);
        return builder.toString();
    }

    @Override
    public void setSpace(int space) {
        this.space = space;
    }

    @Override
    public int getSpace() {
        return space;
    }

}
