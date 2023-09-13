package khalilrached.com.factory;

/**
 * Created by @khalilrached on 2016-12-11.
 * First concrete factory example that extending the AbstractFactory interface.
 */
public class ClassicHouseFactory implements HouseFactory {
    private final String factoryName = "ClassicHouse";

    @Override
    public House createHouse() {
        return new House(this.createDoor(), this.createWall());
    }

    @Override
    public Door createDoor() {
        return new WoodDoor(factoryName);
    }

    @Override
    public Wall createWall() {
        return new WoodWall(factoryName);
    }
}
