package interview.barclays;

public class InterfaceOverloadImpl  {
	
	public static void main(String[] args) {
		C c = new CC();
		c.getRate();
	}

}


interface A {
	void getRate();

}

class AA implements A {

	@Override
	public void getRate() {
		System.out.println("AA");
		
	}
	
}

interface B {
	void getRate();

	void setRate();

}

class BB implements B {

	@Override
	public void getRate() {
		System.out.println("BB-getRate");
		
	}

	@Override
	public void setRate() {
		// TODO Auto-generated method stub
		System.out.println("BB-setRate");
		
	}
	
}


interface C extends A, B {

	void getName();

	void setName();
}

class CC implements C{

	@Override
	public void getRate() {
		System.out.println("CC - getRate");
		
	}

	@Override
	public void setRate() {
		// TODO Auto-generated method stub
		System.out.println("CC - setrate");
		
	}

	@Override
	public void getName() {
		// TODO Auto-generated method stub
		System.out.println("CC - getName");
		
	}

	@Override
	public void setName() {
		// TODO Auto-generated method stub
		System.out.println("CC - setName");
		
	}
	
}