
public interface AdministrationInterface {
	
	
	/**
	 * sorts in ascending order the given list of persons by name 
	 * @param list given list of persons to be sorted
	 * @return sorted list of persons
	 * @throws NullPointerException if the list of persons is null
	 * @throws IllegalStateException if the list of persons is empty
	 */
	public abstract Person[] sortList(Person[] list) 
			throws NullPointerException, IllegalStateException;
	
	
	/**
	 * calculates number of female students
	 * @return number of female students
	 * @throws NullPointerException if the list of persons is null
	 * @throws IllegalStateException if the list of persons is empty
	 */
	public abstract int countFemale(Person[] list) throws NullPointerException, IllegalStateException;
	

	/**
	 * filters out docents working at a given department
	 * @return list of docents
	 * @throws NullPointerException if the list of persons is null
	 * @throws IllegalStateException if the list of persons is empty
	 * @throws IllegalArgumentException if the department number is not valid
	 */
	public abstract Docent[] getDocents(int department) 
			throws NullPointerException, IllegalStateException, IllegalArgumentException;
	
	
	/**
	 * print a given list of persons
	 * @param list given list of persons
	 * @throws NullPointerException if the list of persons is null
	 */
	public abstract void printList(Person[] list) throws NullPointerException;
	
	
	/**
	 * returns appropriate textual representation of the object administration
	 */
	public String toString();
		
}
