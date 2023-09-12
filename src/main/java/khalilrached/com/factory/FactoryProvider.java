package khalilrached.com.factory;

/**
 * Created by @khalilrached on 2016-12-04.
 * FactoryProvider class
 * This is the class that provides the factory based on the factory type.
 */

public class FactoryProvider {

    public static AbstractFactory getFactory(FactoryType factoryType) {
        return switch (factoryType) {
            case Factory1 -> new Factory1();
            case Factory2 -> new Factory2();
        };
    }
}
