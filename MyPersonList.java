import java.util.ArrayList;

/** This class is a wrapper around an ArrayList of Persons.
 */

public class MyPersonList {

	public ArrayList<Person> people;

	/**
	 * Instantiates the "people" variable as a new (empty) ArrayList of
	 * Person objects.
	 */
	public MyPersonList(){
		//implement this
	}

	/** Adds the parameter to the end of the list.
	 */
	public void addItem(Person newMember){	
		//implement this
	}

	/** Gives each person in the list a raise of $1000
	 *  YOU MUST IMPLEMENT THIS USING A FOR-EACH LOOP!
	 */
	public void giveRaises(){
//		implement this
	}

	/** Returns the sum of the salaries of all people in the list.
	 *  YOU MUST IMPLEMENT THIS USING A FOR-EACH LOOP!
	 */
	public int getTotalOfSalaries(){
//		implement this
	}

	/** Returns the number of people in the list with a name
	 *  that matches the parameter (possibly 0).
	 *  YOU MUST IMPLEMENT THIS USING A FOR-EACH LOOP!
	 */
	public int count(String name){
//		implement this
	}

	/** Removes ALL people from the list whose names match the parameter.
	 */
	public void remove(String name){
//		implement this
	}

}
