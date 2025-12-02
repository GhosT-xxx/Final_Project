import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.nio.file.Paths;

public class GymDataManagerTest {
    private GymDataManager dm;

    @BeforeEach
    public void setup() {
        dm = new GymDataManager(Paths.get("GymUsersData.csv"), Paths.get("GymSessions.csv"), Paths.get("GymPlans.csv"));
    }

    @Test
    public void testAddMember() {
        Member m = new Member("Test Member", "testuser", "pass");
        dm.addMember(m);
        assertNotNull(dm.getMemberByUsername("testuser"));
        assertEquals("testuser", dm.getMemberByUsername("testuser").getUsername());
    }

    @Test
    public void testUsernameExists() {
        Member m = new Member("X", "uniqueUser", "p");
        dm.addMember(m);
        assertTrue(dm.usernameExists("uniqueUser"));
        assertFalse(dm.usernameExists("noSuchUser"));
    }
}
