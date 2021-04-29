/**
 * @author MoSho
 * @version October 4, 2018
 * 
 * Demonstration for Lab 6
 * Class of heroes with no super human abilities
 * Nothing to write, just explain and compare to MetaHuman 
 */
public class Human extends Hero 
{
	/** This is a dummy variable to demonstrate use of the super keyword **/
	public int dummy = 4;
	
	/**
	 * See also {@link Hero#Hero(String, int)}
	 * @param nombre String for the hero's name
	 */
	public Human(String nombre) 
	{
		super(nombre);
	}

	/**
	 * See also {@link Hero#Hero(String, int)}
	 * @param nombre String for the hero's name
	 * @param strength power level to initialize the hero with
	 */
	public Human(String nombre, int strength) 
	{
		super(nombre, strength);
	}

	/**
	 * See also {@link Hero#toString()}
	 * @return string representation of the Hero in the following form:
	 * 		   (Human) name - Strength Level powerlvl
	 */
	@Override
	public String toString()
	{
		String out = String.format("(Human) %s"
				+ "\tThis dummy val %d. Super dummy val %d\n", 
				super.toString(), this.dummy, super.dummy);
		return out;
	}

}
