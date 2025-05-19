import com.example.models.Demo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DemoTest {

    @Test
    void print() {
        Demo demo = new Demo();
        assertEquals("hii", demo.identity("hii"));
    }

    @Test
    void anotherTest() {
        Demo demo = new Demo();
        assertEquals(0, demo.anotherMethod());
    }
}