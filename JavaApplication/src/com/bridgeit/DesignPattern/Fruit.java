package com.bridgeit.DesignPattern;
import com.bridgeit.DesignPattern.ShoppingCartVisitor;

public class Fruit implements ItemElement{
	int price_per_kg;
	int weight;
	String Name;
	
	public Fruit(int Price_per_kg, int weight, String name) {
		super();
		this.price_per_kg = Price_per_kg;
		this.weight = weight;
		Name = name;
	}
	/*public Fruit() {
		super();
	}*/
	public int getPrice_per_kg() {
		return price_per_kg;
	}
	public void setPrice_per_kg(int Price_per_kg) {
		this.price_per_kg = Price_per_kg;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int accept(ShoppingCartVisitor visitor)
	{
		return visitor.visit(this);
	}

}
