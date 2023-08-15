package DesignPattern;

public class Decorator {

	public static void main(String[] args) {
		
	int s=	new Mushroom(new Extrachese(new VegPizza())).cost();
	System.out.println(s);

	}

}

abstract class Base {
	public abstract int cost();
}

abstract class ToppingDeco extends Base {

}

class VegPizza extends Base {

	@Override
	public int cost() {
		System.out.println("veg");
		// TODO Auto-generated method stub
		return 20;
	}

}

class NonVegPizza extends Base {

	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return 40;
	}

}

class Extrachese extends ToppingDeco {
	Base base;

	Extrachese(Base base) {
		this.base = base;
	}

	@Override
	public int cost() {
		// TODO Auto-generated method stub
		System.out.println("Extra chesse");
		return this.base.cost()+10;
	}

}
class Mushroom extends ToppingDeco {
	Base base;

	Mushroom(Base base) {
		this.base = base;
	}

	@Override
	public int cost() {
		System.out.println("Mushroom");
		// TODO Auto-generated method stub
		return this.base.cost()+15;
	}

}