package com.bridgeit.DataStructurePrograms;
 
public class CashCounterQueue {
	Node temp=new Node();
	Node front,rear;
	public  CashCounterQueue()
	{
		this.rear=null;
		this.front=null;
	}
	 public void insert(int data)
	{
		
		if(rear==null)
		{
			this.rear=this.front=temp;
			return;
		}
			this.rear.nextNode=temp;
			this.rear=temp;
				
	}
	 public void show()
	 {
		if(this.front==null)
		{
			System.out.println("Queue is Empty");
		}
		while(temp.nextNode!=null)
		{
			System.out.println(temp.data);
			temp=temp.nextNode;
			System.out.println(temp.data);
			
		}
	 }
	
	}
	
