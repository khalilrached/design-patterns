package khalilrached.com.factory;

public class House {
    private Door door;
    private Wall wall;

    public House(Door door, Wall wall) {
        this.door = door;
        this.wall = wall;
    }

    public Door getDoor() {
        return door;
    }

    public Wall getWall() {
        return wall;
    }
}
