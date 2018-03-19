package com.bridgeit.DataStructurePrograms;
import com.bridgeit.ObjectOrientedPrograms.ShoppingCartVisitor;

public interface ItemElement {
	public  int accept(ShoppingCartVisitor visitor);
	
	}

