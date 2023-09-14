package khalilrached.com.factoryMethod;

public class Test {
    public static void main(String[] args) {

        PageFactory factory = new RedThemePageFactory();
        Page page = factory.createPage(); // create page with red theme.

        factory = new DefaultPageFactory();
        page = factory.createPage(); // create page with default theme.

        // now if we want to add a new theme we just need to create a new concrete creator.
        // and implement all the methods of the PageFactory interface.
        // and by adding a new class that extends from Template we can add a new theme.
    }
}
