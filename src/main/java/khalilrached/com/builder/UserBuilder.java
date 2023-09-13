package khalilrached.com.builder;

public interface UserBuilder {

    UserBuilder id(String id);

    UserBuilder name(String name);

    UserBuilder image(String image);

    User build();
}
