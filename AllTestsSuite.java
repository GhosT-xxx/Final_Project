import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectClasses({GymDataManagerTest.class, SessionTest.class, LogTest.class})
public class AllTestsSuite { }
