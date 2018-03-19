package com.bridgeit.DesignPattern;

//Create a ShopKeeper concrete class that will use MobileShop interface.
/**Purpose: This class use Cake Shop interface
* @author 
* @since 13-03-2018
*/
public class ShopKeeper {
	
	public CakeShop Blackforest;
	public CakeShop MangoMeringue;
      public CakeShop OreoCheese;
      public CakeShop banana;
      
	
	public ShopKeeper()
	{
		 Blackforest=new BlackForest();
		 MangoMeringue=new MangoMeringue();
		 OreoCheese =new OreoCheese();
		 banana=new BananaWithCheese(); 
	}
	
	public void Blackforestsale()
	{
		// TODO Auto-generated method stub
		Blackforest.CakeType();
		Blackforest.price();
	}
	
	public void MangoMeringue() {
		// TODO Auto-generated method stub
		MangoMeringue.CakeType();
		MangoMeringue.price();
	}
      public void OreoCheese() {
		// TODO Auto-generated method stub
		OreoCheese.CakeType();
		OreoCheese.price();
	}
      public void BanaWithCheese() {
		// TODO Auto-generated method stub
		banana.CakeType();
		banana.price();
	}
}