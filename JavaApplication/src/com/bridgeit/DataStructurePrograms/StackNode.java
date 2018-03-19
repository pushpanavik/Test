package com.bridgeit.DataStructurePrograms;

class StackNode {
    

  int data;
   StackNode next;
   public StackNode(int val)
  {
    data = val;
    next = null;
  } 
   public void push(int val)
   {
     StackNode newNode = new StackNode(val);
     newNode.link = head;
     head = newNode;
     stackSize++;
   }
    public StackNode pop()
   {
   	StackNode newNode=new StackNode(val);
     if(head == null)
       return null;
     StackNode temp = head;
     head = head.link;

     return temp;
   }


   public void displayStack()
   {
     if(stackSize == 0)
       {
         System.out.println("Empty Stack");
         return ;
       }
     StackNode temp = head;

     while(temp != null)
     {
       System.out.println(temp.data);
       temp = temp.link;
     }
   }
}
