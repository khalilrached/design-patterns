package khalilrached.com.builder;

public class User {
    private String id;
    private String name;
    private String role;

    private String image;

    public User(String id, String name, String role, String image) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.image = image;
    }

    public Object getId() {
        return id;
    }

    public Object getName() {
        return name;
    }

    public Object getRole() {
        return role;
    }

    public Object getImage() {
        return image;
    }
}
