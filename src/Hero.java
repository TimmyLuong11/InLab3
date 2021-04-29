/** DEMO CLASS
 * @author MoSho
 *
 * Class representing a general hero.
 * Hero's can be regular human or have super powers (meta-human)
 * Or perhaps neither quite categorizes your hero, thus they fall
 * into this general class
 */
public class Hero implements Comparable<Hero>
{
	/** Starting power level for rookies **/
	public final static int ROOKIEPOWER = 5;
	/** Hero's name **/
	private String name;
	/** Hero's strength **/
	private int powerlvl;

	/** This is a dummy variable to demonstrate the meaning of static variables **/
	public static int staticDummy = -52;
	/** This is a dummy variable to demonstrate use of the super keyword **/
	public int dummy = 0;
	
	/**
	 * Create a general hero, with a name and power level is initialize to {@value #ROOKIEPOWER}
	 * @param nombre String for the hero's name
	 */
	public Hero(String nombre) 
	{
		name = nombre;
		powerlvl = ROOKIEPOWER;
	}
	
	/**
	 * @param nombre String for the hero's name
	 * @param strength Initial power level
	 */
	public Hero(String nombre, int strength) 
	{
		name = nombre;
		setPowerLevel(strength);
	}
	
	/** 
	 * @param delta amount be which to adjust the hero's power level. Power levels cannot be negative.
	 * 		  Power levels cannot be changed by more than {@value #ROOKIEPOWER}
	 */
	public void updatePowerLevel(int delta)
	{
		if (delta <= -powerlvl) setPowerLevel(0);
		else if (Math.abs(delta) >= ROOKIEPOWER) setPowerLevel(powerlvl + delta);
		else setPowerLevel(powerlvl + delta);
	}
	
	/**
	 * @param power Amount to change the power level to
	 */
	private void setPowerLevel(int power) { powerlvl = power; }
	
	/**
	 * @return the hero's name
	 */
	public String getName() { return name; }
	
	/**
	 * @return the hero's amount of power
	 */
	public int getPowerLevel() { return powerlvl; }

	/** @see java.lang.Comparable#compareTo(java.lang.Object)
	 * Ranks the heroes, relatively. This hero comes before otherHero 
	 * if this hero has a higher power level. Ties are broken by 
	 * alphabetical ordering of the names. 
	 * @param otherHero Hero to compare this hero to
	 * @return negative if this hero comes before, 
	 * 		   0 if they have the same rank, 
	 * 		   positive if this hero comes after
	 */
	@Override
	public int compareTo(Hero otherHero) 
	{
		// TODO in lab demonstration
		if(this.powerlvl > otherHero.getPowerLevel())
		{
			return -1;
		}
		else if (this.powerlvl < otherHero.getPowerLevel())
		{
			return 1;
		}
		else
		{
			return this.name.compareTo(otherHero.getName());
		}
	}
	
	/**
	 * Adjust the amount in the static dummy variable
	 * @param amt amount by which to adjust the static dummy variable
	 */
	public static void changeStaticDummy(int amt) { staticDummy += amt; }
	
	/**
	 * @return string representation of the Hero in the following form:
	 * 		   name - Strength Level power level
	 */
	@Override
	public String toString()
	{
		return String.format("%s - Strength Level %d\n", name, powerlvl);
	}
}
