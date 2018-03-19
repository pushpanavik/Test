package com.bridgeit.DataStructurePrograms;

public class ShoppingOnline {
	public static void main(String[] args) {
		ItemElement[] items = new ItemElement[]{new Book(20, "B1234"),new Book(100, "B5678"),
				new Fruit(10, 1, "Banana"), new Fruit(5, 2, "Apple")};
		
		int total = calculatePrice(items);
		System.out.println("Total Cost = "+total);
	}

	private static int calculatePrice(ItemElement[] items) {
		ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
		int sum=0;
		for(ItemElement item : items){
			sum = sum + item.accept(visitor);
		}
		return sum;
	}


}
