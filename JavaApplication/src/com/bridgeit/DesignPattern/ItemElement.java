package com.bridgeit.DesignPattern;
import com.bridgeit.DesignPattern.ShoppingCartVisitor;

public interface ItemElement {
	public  int accept(ShoppingCartVisitor visitor);
	
	}

