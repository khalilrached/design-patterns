package khalilrached.com.factory;

/**
 * Created by @khalilrached on 2016-12-04.
 * This is the abstract factory.
 * It is the interface that defines the methods to be implemented by the concrete factories.
 */

public interface HouseFactory {
    House createHouse();
    Door createDoor();
    Wall createWall();
}
