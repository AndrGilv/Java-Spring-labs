package classes.Buildings;

import java.util.ArrayList;
import java.util.Iterator;

public class Building extends BuildingItem {

    ArrayList<BuildingItem> items = new ArrayList<BuildingItem>();

    public Building( String name) {
        super( name);
    }

    @Override
    public BuildingItem add(BuildingItem building) {

        items.add(building);
        return this;
    }

    @Override
    public BuildingItem remove(BuildingItem building) {

        items.remove(building);
        return this;
    }

    @Override
    public BuildingItem getChild(int i) {
        return items.get(i);
    }

    @Override
    public Iterator getIterator() {
        return items.iterator();
    }

    @Override
    public int getSpace() {
        int space = 0;
        for(BuildingItem item : items){
            space += item.getSpace();
        }
        return space;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("building ");
        stringBuilder.append(name);
        stringBuilder.append(", space ");
        stringBuilder.append(getSpace());
        stringBuilder.append(" m2\n");
        for(BuildingItem item : items) {
            stringBuilder.append("\t" + item.toString());
        }
        stringBuilder.append("\n");
        return stringBuilder.toString();
    }
}
