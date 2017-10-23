import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HelloWorldTestJUnitTest {

	@Test
	void testDoubleMe() {
		HelloWorldTest hwt = new HelloWorldTest();
		Integer doubleValue = hwt.DoubleMe(3);
		Integer korrValue = 6;
		
		assertEquals("Double von 3", korrValue, doubleValue);
	}

}
