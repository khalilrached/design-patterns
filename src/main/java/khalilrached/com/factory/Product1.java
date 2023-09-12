package khalilrached.com.factory;
/**
 * Created by @khalilrached on 2016-12-04.
 * Product1 class
 * This is the concrete product class example implementation.
 */
public class Product1 implements AbstractProduct {
    private String factoryName;

    public Product1() {
    }

    public Product1(String factoryName) {
        this.factoryName = factoryName;
    }

    @Override
    public String getMessage() {
        return "Product1,"+(factoryName != null ? " from "+factoryName : "");
    }
}