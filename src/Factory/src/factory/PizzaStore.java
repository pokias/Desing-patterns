package factory;

public abstract class PizzaStore {

	abstract Pizza createPizza(String item);
	
	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		//making pizza
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza; 
	}
}
