package com.bridgeit.ObjectOrientedPrograms;
import com.bridgeit.ObjectOrientedPrograms.ShoppingCartVisitor;

public interface ItemElement {
	public  int accept(ShoppingCartVisitor visitor);
	
	}

