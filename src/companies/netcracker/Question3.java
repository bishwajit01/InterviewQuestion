package interview.netcracker;

import java.util.ArrayList;
import java.util.List;

// BUILDER DESIGN PATTERN
public class Question3 {

	public static void main(String[] args) {
		MealBuilder meal = new MealBuilder();
		
		Meal vegMeal = meal.prepareVegMeal();
		System.out.println("Veg Meal");
		System.out.println("--------");
		vegMeal.showItems();
		System.out.println("------------------------------------");
		System.out.println("Total Cost :: \t\t " + vegMeal.getCost());
	}

}

interface Item {
	public String name();

	public Packing packing();

	public float price();
}

interface Packing {
	public String pack();
}

class Bottle implements Packing {

	@Override
	public String pack() {
		return "Bottle";
	}

}

class Wrapper implements Packing {

	@Override
	public String pack() {
		return "Wrapper";
	}

}

abstract class BurgerKing implements Item {

	@Override
	public Packing packing() {
		return new Wrapper();
	}

	@Override
	public abstract float price();

}

abstract class ColdDrink implements Item {
	@Override
	public Packing packing() {
		return new Bottle();
	}

	@Override
	public abstract float price();

}

class VegBurger extends BurgerKing {

	@Override
	public String name() {
		return "Veg Burger";
	}

	@Override
	public float price() {
		return 30.0f;
	}

}

class ChickenBurger extends BurgerKing {

	@Override
	public String name() {
		return "Chicken Burger";
	}

	@Override
	public float price() {
		return 60.0f;
	}

}

class Pepsi extends ColdDrink {

	@Override
	public String name() {
		return "Pepsi";
	}

	@Override
	public float price() {
		return 10.0f;
	}

}

class Coke extends ColdDrink {

	@Override
	public String name() {
		return "Coke";
	}

	@Override
	public float price() {
		return 12.0f;
	}

}

class Meal {
	private List<Item> listItem;// = new ArrayList<Item>();

	public void addItem(Item item) {
		if (listItem == null)
			listItem = new ArrayList<>();
		listItem.add(item);
	}

	public float getCost() {
		float cost = 0.0f;
		if (listItem != null) {
			for (Item item : listItem) {
				cost += item.price();
			}
		}
		return cost;
	}

	public void showItems() {
		if (listItem != null) {
			for (Item item : listItem) {
				System.out.println("Item name  :: " + item.name());
				System.out.println("Packing    :: " + item.packing().pack());
				System.out.println("Item price :: \t \t " + item.price());
			}
		}
	}

}

class MealBuilder {

	public Meal prepareVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Pepsi());
		return meal;
	}
	
	public Meal prepareChickenMeal() {
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Coke());
		return meal;
	}
}
