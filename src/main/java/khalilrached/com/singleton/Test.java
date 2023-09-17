package khalilrached.com.singleton;

public class Test {
    public static void main(String[] args) {
        Connection connection = Connection.getInstance("jdbc:mysql://localhost:3306/test", "root", "root");
        connection = Connection.getInstance();
        System.out.println(connection);
    }
}
