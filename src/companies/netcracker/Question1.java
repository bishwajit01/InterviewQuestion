package interview.netcracker;


// FACTORY DESIGN PATTERN
public class Question1 {

	public static void main(String[] args) {
		String shapeType = "CIRCLE";

		Shape shape = new Question1().getShape(shapeType);
		shape.draw();

	}

	public Shape getShape(String shapeType) {
		
		switch (shapeType) {
		case "CIRCLE":
			return new Circle();
		case "RECTANGLE":
			return new Rectangle();
		default:
			return null;
		}
		
	}
}

interface Shape {
	void draw();
}

class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("FROM  ************RECTANGLE***************");
	}

}

class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("FROM  ***************CIRCLE***************");
	}

}