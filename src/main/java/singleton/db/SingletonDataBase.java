package singleton.db;

public class SingletonDataBase {
    private SingletonDataBase() {};
    private static SingletonDataBase instance = new SingletonDataBase();
    public static SingletonDataBase getInstance() { return instance; };

    private String route;
    private Integer port;
    private String user;
    private String password;

    public void setRoute(String route) { this.route = route; }
    public String getRoute() { return route; }

    public void setPort(Integer port) { this.port = port; }
    public Integer getPort() { return port; }

    public void setUser(String user) { this.user = user; }
    public String getUser() { return user; }

    public void setPassword(String password) { this.password = password; }
    public String getPassword() { return password; }
}
