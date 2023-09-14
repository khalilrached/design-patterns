package khalilrached.com.factoryMethod;

public abstract class Page {
    private String title;
    private Body body;
    private Footer footer;

    public Page() {
        this.title = "Default title";
        this.body = null;
        this.footer = null;
    }

    public Page(String title, Body body, Footer footer) {
        this.title = title;
        this.body = body;
        this.footer = footer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public Footer getFooter() {
        return footer;
    }

    public void setFooter(Footer footer) {
        this.footer = footer;
    }
}
