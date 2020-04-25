import classes.Buildings.Building;
import classes.Buildings.BuildingItem;
import classes.Buildings.Flat;
import classes.Buildings.Floor;
import classes.SuperCar;

public class Main_Lab9_ComponentAndIterator {
    public static void main(String[] args) {
        BuildingItem building = new Building("Общага на Вершинина 39А");
        BuildingItem floor1 = new Floor("первый этаж");
        BuildingItem floor2 = new Floor("второй этаж");
        BuildingItem floor3 = new Floor("третий этаж");
        BuildingItem floor4 = new Floor("четвёртый этаж");
        BuildingItem floor5 = new Floor("пятый этаж");

        building.add(floor1)
                .add(floor2)
                .add(floor3)
                .add(floor4)
                .add(floor5);

        BuildingItem flat532 = new Flat(22, "k. 532");
        BuildingItem flat234 = new Flat(23, "k. 234");
        BuildingItem flat123 = new Flat(25, "k. 123");
        BuildingItem flat402 = new Flat(24, "k. 402");
        BuildingItem flat503 = new Flat(21, "k. 503");
        BuildingItem flat304 = new Flat(22, "k. 304");
        BuildingItem flat128 = new Flat(22, "k. 128");
        BuildingItem flat403 = new Flat(23, "k. 403");
        BuildingItem flat102 = new Flat(22, "k. 102");

        floor1.add(flat128)
                .add(flat123)
                .add(flat102);

        floor2.add(flat234);

        floor3.add(flat304);

        floor4.add(flat402)
                .add(flat403);

        floor5.add(flat503)
                .add(flat532);

        System.out.println(building);

    }
}
