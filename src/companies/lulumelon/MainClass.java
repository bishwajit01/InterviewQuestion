package interview.lulumelon;

public class MainClass extends AbstractClass {
	
	public static void main(String[] args) {
		
		String lastName = "A.E.";
		String firstname = "Chandu";
		String middleName = "Champion";
		
		String halfName = setDefaultFullname();//setFullname(firstname, middleName);
		String fullName = halfName + new MainClass().addLastName(lastName);
		
		System.out.println(fullName);
		
		
	}

	@Override
	public String addLastName(String lastname) {
		// TODO Auto-generated method stub
		return " " + lastname;
	}

}
