package interview.lulumelon;

public abstract class AbstractClass {
	
	public static String setFullname(String firstName, String middleName) {
		return firstName + " " + middleName;
	}
	
	public abstract String addLastName(String lastname);
	
	/**
	 * This piece of code will always be common and will be used across the application 
	 * @return
	 */
	public static String setDefaultFullname() {
		return "Chandu";
	}

}
