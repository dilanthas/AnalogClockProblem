package test;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


import app.ClockAnglesApp;

public class ColockAngleTest {

	ClockAnglesApp app;
	
	@Before
	public void setUp()
	{
		app = new ClockAnglesApp();
	}
	
	@Test
	public void testValidate()
	{
		int [] angles = app.calculate(12, 00, -1, false);
		
		assertTrue(angles[0] == 0);
		
		angles = app.calculate(18, 00, -1, false);
		
		assertTrue(angles[0] == 180);
		
		angles = app.calculate(9, 00, -1, false);
		
		assertTrue(angles[0] == 90);
		
		angles = app.calculate(15, 00, -1, false);
		
		assertTrue(angles[0] == 90);
		
		angles = app.calculate(15, 30, -1, true);
		
		assertTrue(angles[0] == 75);
		
		angles = app.calculate(15, 30, 20, true);
		
		assertTrue(angles[0] == 77);
		
		assertTrue(angles[1] == 62);

	}
}
