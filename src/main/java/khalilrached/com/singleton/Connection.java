package khalilrached.com.singleton;

public class Connection {
    private String url;
    private String username;
    private String password;

    private static Connection instance;

    private Connection() {
        url = "";
        username = "";
        password = "";
    }

    private Connection(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    public static Connection getInstance() {
        return instance = (instance == null) ? new Connection() : instance;
    }

    public static Connection getInstance(String url, String username, String password) {
        return instance = (instance == null) ? new Connection(url, username, password) : instance;
    }

    @Override
    public String toString() {
        return "Connection{" + "url=" + url + ", username=" + username + ", password=" + password + '}';
    }


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
