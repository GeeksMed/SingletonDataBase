package singleton.db;

import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;

public class SingletonDataBaseTest {
    @Test
    public void deveRetornarRoute() {
        SingletonDataBase.getInstance().setRoute("teste");
        assertEquals("teste", SingletonDataBase.getInstance().getRoute());
    }
    @Test
    public void deveRetornarPort() {
        SingletonDataBase.getInstance().setPort(8181);
        assertEquals(Integer.valueOf(8181), SingletonDataBase.getInstance().getPort());
    }
    @Test
    public void deveRetornarUser() {
        SingletonDataBase.getInstance().setUser("administrator");
        assertEquals("administrator", SingletonDataBase.getInstance().getUser());
    }
    @Test
    public void deveRetornarPassword() {
        SingletonDataBase.getInstance().setPassword("M@sterkey");
        assertEquals("M@sterkey", SingletonDataBase.getInstance().getPassword());
    }
}
