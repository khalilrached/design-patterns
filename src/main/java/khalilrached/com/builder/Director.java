package khalilrached.com.builder;

public class Director {


    public static void main(String[] args) {
        User adminUser = AdminUserBuilder.builder()
            .id("1")
            .name("Khalil")
            .image("image")
            .build();
        System.out.println(adminUser.getRole());
        User publicUser = PublicUserBuilder.builder()
            .id("2")
            .name("Khalil")
            .image("image")
            .build();
        System.out.println(publicUser.getRole());
    }

}
