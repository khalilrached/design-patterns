package khalilrached.com.factoryMethod;

public class DefaultPageFactory implements PageFactory {
    @Override
    public Template createTemplate() {
        return new Default();
    }

    @Override
    public Body createBody() {
        return new Body();
    }

    @Override
    public Footer createFooter() {
        return new Footer();
    }
}
