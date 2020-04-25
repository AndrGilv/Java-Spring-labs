package classes.Buildings;

import java.util.Iterator;

public abstract class BuildingItem {


    protected String name;

    public BuildingItem( String name) {

        this.name = name;
    }

    public BuildingItem add(BuildingItem building){
        throw new UnsupportedOperationException();
    }

    public BuildingItem remove(BuildingItem building){
        throw new UnsupportedOperationException();
    }

    public BuildingItem getChild(int i){
        throw new UnsupportedOperationException();
    }

    public Iterator getIterator(){
        throw new UnsupportedOperationException();
    }


    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract int getSpace();

    public void setSpace(int space) {
        throw new UnsupportedOperationException();
    }
}
