package khalilrached.com.factory;

/**
 * Created by @khalilrached on 2016-12-11.
 * Second concrete factory example that extending the AbstractFactory interface.
 */
public class ModernHouseFactory implements HouseFactory {
    private final String name = "ModernHouse";

    @Override
    public House createHouse() {
        return new House(this.createDoor(), this.createWall());
    }

    @Override
    public Door createDoor() {
        return new AluminiumDoor(name);
    }

    @Override
    public Wall createWall() {
        return new BricksWall(name);
    }
}
