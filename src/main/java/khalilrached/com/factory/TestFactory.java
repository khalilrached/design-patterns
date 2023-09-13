package khalilrached.com.factory;

public class TestFactory {


    public static void main(String[] args) {
        HouseFactory factory = HouseType.getFactory(FactoryType.ModernHouse); // get the factory based on the factory type.
        House house = factory.createHouse(); // create the house based on the factory type.
    }
}
