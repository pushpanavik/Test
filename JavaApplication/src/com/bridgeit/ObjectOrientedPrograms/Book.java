package com.bridgeit.ObjectOrientedPrograms;

public class Book implements ItemElement{
	 public int price;
	 public String isbnNumber;
	
	public Book(int price,String isbnNumber)
	{
		this.price=price;
		this.isbnNumber=isbnNumber;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getIsbnNumber() {
		return isbnNumber;
	}

	public void setIsbnNumber(String isbnNumber) {
		this.isbnNumber = isbnNumber;
	}
	public String toString()
	{
		return "Book price:="+this.getPrice()+"\nBook isbnNumber:="+this.getIsbnNumber();
	}
	public int accept(ShoppingCartVisitor visitor)
	{
		return visitor.visit(this);
	}

}
