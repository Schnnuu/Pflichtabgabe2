
public interface AdministrationInterface {
	
	
	/**
	 * sorts in ascending order the list of persons by name 
	 * @return sorted list of persons
	 * @throws NullPointerException if the list of persons is null
	 * @throws IllegalStateException if the list of persons is empty
	 */
	public abstract Person[] sortList() 
			throws NullPointerException, IllegalStateException;
	
	
	/**
	 * calculates number of female students in the list of persons
	 * @return number of female students
	 * @throws NullPointerException if the list of persons is null
	 * @throws IllegalStateException if the list of persons is empty
	 */
	public abstract int countFemale() throws NullPointerException, IllegalStateException;
	

	/**
	 * filters out docents working at a given department from the list of persons
	 *
	 * @return list of docents
	 * @throws NullPointerException     if the list of persons is null
	 * @throws IllegalStateException    if the list of persons is empty
	 * @throws IllegalArgumentException if the department number is not valid
	 */
	public abstract Person[] getDocents(int department)
			throws NullPointerException, IllegalStateException, IllegalArgumentException;
	
	
	/**
	 * print a given list of persons
	 * @param list a given list of persons
	 * @throws NullPointerException if the list of persons is null
	 */
	public abstract void printList() throws NullPointerException;
	
	
	/**
	 * returns appropriate textual representation of the object administration
	 */
	public String toString();
		
}
