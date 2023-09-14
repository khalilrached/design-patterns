package khalilrached.com.factoryMethod;

public class RedThemePageFactory implements PageFactory {
    @Override
    public Template createTemplate() {
        return new RedTheme();
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
