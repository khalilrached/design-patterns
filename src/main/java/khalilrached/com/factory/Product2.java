package khalilrached.com.factory;

/**
 * Created by @khalilrached on 2016-12-04.
 * Product1 class
 * This is the concrete product class example implementation.
 */

public class Product2 implements AbstractProduct {
    private String factoryName;

    public Product2() {
    }

    public Product2(String factoryName) {
        this.factoryName = factoryName;
    }

    @Override
    public String getMessage() {
        return "Product2," + (factoryName != null ? " from " + factoryName : "");
    }
}
