package interview.netcracker;


// SAFE SINGLETON
public class Question2 {
	
	public static void main(String[] args) {
		Singleton ob1 = Singleton.INSTANCE;
		ob1.setValue(30);
		System.out.println(ob1.getValue());
		
		Singleton ob2 = Singleton.INSTANCE;
		System.out.println(ob2.getValue());
		
		System.out.println(ob1 + " \t " + ob2);
		
		if (ob1 == ob2) {
			System.out.println("Instance is same....");
		} else if (ob1 == null || ob2 == null) {
			System.out.println("Either value is null.....");
		} else {
			System.out.println("New objected is created.....");
		}
		
		
		System.out.println("hashcode of first object  :: " + ob1.hashCode());
		System.out.println("hashcode of second object :: " + ob1.hashCode());
		
		
	}

}

enum Singleton {
	INSTANCE;
	int value;
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
}