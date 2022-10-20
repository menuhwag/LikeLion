import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingletonTest {
    @Test
    void getInstance() {
        // Singleton singleton = new Singleton();
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton1);
        System.out.println(singleton2);

        assertSame(singleton1, singleton2);
    }
}