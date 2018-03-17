package com.bridgeit.ObjectOrientedPrograms;


/**
 *
 * @author PUSHPA
 */
public class RealImage implements Image {
  public  String filename;
  public  RealImage(String filename)
  {
      this.filename=filename;
      loadFromDisk(filename);
      
  }
  
  @Override
   public void display()
  {
      System.out.println("RealImage is "+filename);
  }
  public void loadFromDisk(String filename)
  {
      System.out.println("Loadimage From file" +filename);
      
  }

    
}