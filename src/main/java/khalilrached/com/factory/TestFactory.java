package khalilrached.com.factory;

public class TestFactory {

    public static void main(String[] args) {
        AbstractFactory factory = FactoryProvider.getFactory(FactoryType.Factory1); // get the factory based on the factory type.
        // create the products without knowing the concrete factory.
        Product1 product1 = factory.createProduct1();
        Product2 product2 = factory.createProduct2();
    }
}
