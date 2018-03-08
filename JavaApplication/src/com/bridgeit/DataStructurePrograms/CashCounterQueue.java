package com.bridgeit.DataStructurePrograms;

public class CashCounterQueue {
	private  int rear=-1;
	private int capacity;
	public int queue[];
	private int front =0;
	private int currentSize=0;
	int count=0;
	
	public CashCounterQueue(int queuesize) {
		this.capacity=queuesize;
		queue=new int[this.capacity];
	}
	public void enqueue(int item)
	{
		if(isFull())
		{
			System.out.println("Queus is full" +item+  "cannot be added");
		}
		else
		{
			rear++;
			if(rear==capacity-1)
			{
				rear=0;
			}
			queue[rear]=item;
			count++;
			
			System.out.println("Element" +item+ "is added successfully in the queue");	
		}
	}
	public void dequeue(int item)
	{
		if(isEmpty())
		{
			System.out.println("Queue is Empty" +item+ "cannot be deleted");
		}
		else
		{
			front++;
			if(front==capacity-1)
			{
				System.out.println("Element" +item+ "is removed from the queue:" +queue[front-1]);
				front=0;
				count--;
			}
			else
			{
				System.out.println("queue pop peration is done" +queue[front-1]);
			}currentSize--;
		}
	}
	public boolean isFull()
	{
		boolean status=false;
		if(currentSize==capacity)
		{
			status=true;
			System.out.println("Queue Overflow");
		}
		else
		{
			status=false;
		}
		return status;
	}
	
	public boolean isEmpty()
	{
		boolean status= false;
		if(currentSize==0)
		{
			status= true;
			System.out.println("Queue is Empty");
		}
		else
		{
			status=false;
		}
		return status;
		
	}
	public void display()
	{
		for(int i=0;i<queue.length;i++) {
			System.out.println(queue[i]);
		}
	}
	public int getSize()
	{
		return count;
	}
	
	}
