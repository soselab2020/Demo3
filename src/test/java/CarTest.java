import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class CarTest {

    private Car car;
    private int expectedWheels;
    private int expectedSpeed;

    @BeforeEach
    void setUp() {
        car = new Car();
        expectedWheels = 4;
        expectedSpeed = 100;
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testGetWheels() {
        assertEquals(expectedWheels, car.getWheels());
    }

    @Test
    void testGetSpeed() {
        assertEquals(expectedSpeed, car.getSpeed());
    }
}