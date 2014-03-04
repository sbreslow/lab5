package threadinglab.primes;

/** TODO: [Part 3] Fix this class so increment() works concurrently. */

/**
 * Class to wrap an integer. It provides a method to increment the integer.
 * 
 * @author jw19
 *
 */

public class IntegerWrapper {
	private int _value;
	
	/**
	 * 
	 * @param initialValue Starting value
	 */
	public IntegerWrapper(int initialValue){
		_value = initialValue;
	}
	
	/**
	 * 
	 * @return Value stored in the wrapper
	 */
	public int get(){
		return _value;
	}

	/**
	 * 
	 * @param val Value to set the wrapper to
	 */
	public void set(int val){
		_value = val;
	}
	
	/**
	 * Increments the value of the wrapper by 1
	 */
	public void increment() {
		_value++;
	}
}
