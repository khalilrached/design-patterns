package khalilrached.com.builder;

public class PublicUserBuilder implements UserBuilder {
    private String id;
    private String name;
    private final String role = "PUBLIC_USER";
    private String image;

    public static UserBuilder builder() {
        return new PublicUserBuilder();
    }

    @Override
    public UserBuilder id(String id) {
        this.id = id;
        return this;
    }

    @Override
    public UserBuilder name(String name) {
        this.name = name;
        return this;
    }

    @Override
    public UserBuilder image(String image) {
        this.image = image;
        return this;
    }

    @Override
    public User build() {
        return new User(id, name, role, image);
    }
}
