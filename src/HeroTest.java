import static org.junit.Assert.*;
import org.junit.Test;

/** (Demo)
 * @author MoSho
 * @version February 21, 2019
 * 
 * Testing using JUnit. Observe code coverage. Can also use debugger on tests
 */
public class HeroTest {

	/**
	 * Test method for {@link Hero#Hero(java.lang.String)}.
	 */
	@Test
	public void testHeroString() 
	{
		Hero myHero = new Hero("MoSho");
		assertNotNull("Hero constructor failed, resulting in null object", myHero);
		assertEquals("Hero constructor name incorrect", "MoSho", myHero.getName());
		assertEquals("Hero constructor powerlevel initialized incorrect", Hero.ROOKIEPOWER, myHero.getPowerLevel());
		
		
		Hero otherHero = new Hero("TheOther");
		assertNotNull("Hero constructor failed, resulting in null object", otherHero);
		assertEquals("Hero constructor name incorrect", "TheOther", otherHero.getName());
		assertEquals("Hero constructor powerlevel initialized incorrect", Hero.ROOKIEPOWER, otherHero.getPowerLevel());
	}

	/**
	 * Test method for {@link Hero#Hero(java.lang.String, int)}.
	 */
	@Test
	public void testHeroStringInt() 
	{
		Hero myHero = new Hero("MoSho", 55);
		
		assertNotNull("Hero constructor failed, resulting in null object", myHero);
		assertEquals("Hero constructor name incorrect", "MoSho", myHero.getName());
		assertEquals("Hero constructor powerlevel initialized incorrect", 55, myHero.getPowerLevel());
	}

	/**
	 * Test method for {@link Hero#compareTo(Hero)}.
	 */
	@Test 
	public void testCompareTo() 
	{
		Hero myHero = new Hero("MoSho");
		Hero otherHero = new Hero("TheOther");
		
		Hero batman = new Hero("Batman", 65);
		Hero superman = new Hero("Superman", 85);

		// TODO: complete asserts in lab demo
		// Observe this code snippet is yellow. How could we adjust the code and/or tests to change this?
		boolean resMyToOther = myHero.compareTo(otherHero) < 0;
		boolean resSupToBat = superman.compareTo(batman) < 0;
		
		assertTrue("Comparison of Heroes not negative", resMyToOther);
		assertTrue("Comparison of Heroes not negative", resSupToBat);
	}

	/**
	 * Test method for {@link Hero#toString()}.
	 */
	@Test
	public void testToString() 
	{
		// TODO: lab demo
		fail("Not yet implemented");
	}
	
	// Note additional missing test coverage

}
