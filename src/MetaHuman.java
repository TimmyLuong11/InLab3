/**
 * @author MoSho
 * @version October 4, 2018
 * 
 * Demonstration for Lab 6
 * Class of heroes with super human abilities
 * Nothing to write, just explain and compare to Human 
 */
public class MetaHuman extends Hero 
{
	/** The hero's special super power **/
	private String ability;
	
	/** This is a dummy variable to demonstrate use of the super keyword **/
	public int dummy = 21;
	
	/**
	 * See also {@link Hero#Hero(String, int)}
	 * @param nombre String for the hero's name
	 * @param power String the hero's special ability
	 */
	public MetaHuman(String nombre, String power) 
	{
		super(nombre);
		ability = power;
	}

	/**
	 * See also {@link Hero#Hero(String, int)}
	 * @param nombre String for the hero's name
	 * @param strength power level to initialize the hero with
	 * @param power String the hero's special ability
	 */
	public MetaHuman(String nombre, int strength, String power) 
	{
		super(nombre, strength);
		ability = power;
	}
	
	/**
	 * @return Hero's special power
	 */
	public String getAbility() { return ability; }

	/**
	 * See also {@link Hero#toString()}
	 * @return string representation of the Hero in the following form:
	 * 		   (Meta) name - Strength Level powerlvl
	 */
	@Override
	public String toString()
	{
		String out = String.format("(Meta) %s"
				+ "\tThis dummy val %d. Super dummy val %d\n", 
				super.toString(), this.dummy, super.dummy);
		return out;
	}

}
