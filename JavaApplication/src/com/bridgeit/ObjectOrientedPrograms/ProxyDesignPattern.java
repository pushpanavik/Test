package com.bridgeit.ObjectOrientedPrograms;

/**
*
* @author PUSHPA
*/
public class ProxyDesignPattern {
   public static void main(String args[])
   {
       //To change body of generated methods, choose Tools | Templates.
           Image image = new ProxyImage("home/bridgeit/Downloads/flower.jpg");

     //image will be loaded from disk
     image.display(); 
     System.out.println("");
     
     //image will not be loaded from disk
     image.display(); 	
      
   }    
}
