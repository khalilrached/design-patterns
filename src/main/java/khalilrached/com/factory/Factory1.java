package khalilrached.com.factory;

/**
 * Created by @khalilrached on 2016-12-11.
 * First concrete factory example that extending the AbstractFactory interface.
 */
public class Factory1 implements AbstractFactory{
    private final String factoryName = "Factory1";
    @Override
    public Product1 createProduct1() {
        return new Product1(factoryName);
    }

    @Override
    public Product2 createProduct2() {
        return new Product2(factoryName);
    }
}
