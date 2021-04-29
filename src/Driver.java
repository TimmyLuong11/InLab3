import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author MoSho
 * @version February 21, 2019
 * 
 * Demonstration for Lab 6
 * Demonstrate examples of inheritance, static members, interfaces, and Comparable
 * and Comparator interfaces
 * Also, utilize the debugger to step through this code
 */
public class Driver 
{
	/**
	 * @param args command line arguments (not used)
	 */
	public static void main(String[] args) 
	{
		// Static call to static variable
		System.out.println(" 0. Static val " + Hero.staticDummy); 
		
		// Create a bunch of heroes and add them to my list
		Hero per = new Hero("Person");
		Hero arrow = new Human("Green Arrow");
		Hero spidy = new MetaHuman("Spiderman", "Super Strength");
		Human bats = new Human("Batman", 27);
		MetaHuman sups = new MetaHuman("Superman", 32, "Super Strength");
		
		// Example casting
		//MetaHuman d = (MetaHuman) arrow; // runtime error
		Hero a = (Hero) sups; // acceptable
		Human b = (Human) arrow; // acceptable
		MetaHuman c = (MetaHuman) spidy; // acceptable
		
		// Place Break point here
		ArrayList<Hero> myHeroes = new ArrayList<Hero>();
		myHeroes.add(per);
		myHeroes.add(bats);
		myHeroes.add(arrow);
		myHeroes.add(sups);
		myHeroes.add(spidy);
		
		System.out.println("\nPrinting Initial List:");
		printList(myHeroes);
		
		Collections.sort(myHeroes);
		System.out.println("\nPrinting Comparable Ordered List:");
		printList(myHeroes);
		
		Collections.sort(myHeroes, new HeroComparator());
		System.out.println("\nPrinting Comparator Ordered List:");
		printList(myHeroes); 
		
		// Demonstrate static and prefix verses postfix unary operators
		System.out.println("\n 1. Static val " + per.staticDummy); // starts at -52
		System.out.println(" 2. Static val " + --bats.staticDummy);
		System.out.println(" 3. Static val " + sups.staticDummy--);
		System.out.println(" 4. Static val " + Hero.staticDummy);
	}
	
	/**
	 * @param list List to print
	 */
	static <E> void printList(List<E> list)
	{
		for (E item : list) System.out.println("\t" + item);
	}
	
}
