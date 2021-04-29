import java.util.Comparator;

/** DEMO CLASS
 * @author MoSho
 * @version October 4, 2018
 * 
 * Demonstration for Lab 6
 * Alternate form of comparison of Heroes, based solely on their names
 */
public class HeroComparator implements Comparator<Hero> 
{
	/** Create a hero comparator **/
	public HeroComparator() {}

	/** @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 * Orders the heroes by name, ignoring casing
	 * @param h1 first hero to compare
	 * @param h2 second hero to compare
	 * @return positive, zero, or negative relative to h1
	 */
	@Override
	public int compare(Hero h1, Hero h2) 
	{
		// TODO in lab demonstration
		return h1.getName().toLowerCase().compareTo(h2.getName().toLowerCase());
	}
	
	/** Orders the heroes by name, ignoring casing
	 * @param h1 first hero to compare
	 * @param h2 second hero to compare
	 * @return true or false if the names are the same
	 */
	public boolean equals(Hero h1, Hero h2) 
	{
		// TODO: in demo
		return compare(h1, h2) == 0;
	}
}
