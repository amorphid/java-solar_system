import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlanetTest {
    private Planet subject;

    @Before
    public void before() {
        subject = new Planet("Vulcan", 5);
    }

    @Test
    public void testName() {
        String name = "Vulcan";
        assertEquals(subject.name, name);
    }

    @Test
    public void orbitId() {
        int orbitId = 5;
        assertEquals(subject.orbitId, orbitId);
    }
}