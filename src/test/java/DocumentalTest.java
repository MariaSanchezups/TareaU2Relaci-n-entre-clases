package src.test.java;
import org.junit.jupiter.api.Test;
import upspooejecucion.Documental;

import static org.junit.jupiter.api.Assertions.*;

public class DocumentalTest {

    @Test
    public void testDocumental() {

        Documental d = new Documental(
                "Cosmos",
                45,
                "Science",
                "Astronomy"
        );

        assertEquals("Cosmos", d.getTitulo());
        assertEquals("Astronomy", d.getTema());
    }
}