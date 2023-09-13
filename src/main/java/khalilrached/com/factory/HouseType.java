package khalilrached.com.factory;

/**
 * Created by @khalilrached on 2016-12-04.
 * FactoryProvider class
 * This is the class that provides the factory based on the factory type.
 */

public class HouseType {

    public static HouseFactory getFactory(FactoryType factoryType) {
        return switch (factoryType) {
            case ClassicHouse -> new ClassicHouseFactory();
            case ModernHouse -> new ModernHouseFactory();
        };
    }
}
