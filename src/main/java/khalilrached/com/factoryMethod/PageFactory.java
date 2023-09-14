package khalilrached.com.factoryMethod;

public interface PageFactory {

    default Page createPage() {

        Template page = createTemplate();

        page.setTitle(String.valueOf(System.currentTimeMillis()));

        page.setBody(createBody());
        page.setFooter(createFooter());

        return page;
    }

    // if product need other class to be created then we can add other methods
    // and every concrete creator will implement them.
    // also we can implement a default method that will be used by all concrete creators that uses these method.
    Template createTemplate();
    Body createBody();
    Footer createFooter();
}
