package src.test.java;
import org.junit.jupiter.api.Test;
import upspooejecucion.Actor;

import static org.junit.jupiter.api.Assertions.*;

public class ActorTest {

    @Test
    public void testActor() {

        Actor a = new Actor("Sam Worthington", 40);

        assertEquals("Sam Worthington", a.getNombre());
    }
}
