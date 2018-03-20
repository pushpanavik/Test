package com.bridgeit.DataStructurePrograms;


/**
 *
 * @author PUSHPA
 */
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;


public class QueueArray {

	public ListNode front;
	public ListNode rear;
	public int length;


	public QueueArray()
	{
		this.front = null;
		this.rear = null;
		this.length = 0;
	}
	public boolean isEmpty()
	{
		return length == 0;
	}
	public void enqueue(int data)
	{
		ListNode temp = new ListNode(data);
		if(isEmpty())
		{
			front = temp;
		}
		else
		{
			rear.next =temp;
		}
		rear = temp;
		length++;
	}
	public int dequeue()
	{
		if(isEmpty())
		{
			throw new NoSuchElementException();
		}	
		int result = front.data;
		front = front.next;
		if(front == null)
		{
			rear = null;
		}
		length--;
		return result;
	}

	public void print(){
		if(isEmpty()){
			return;
		}
		ListNode current = front;
		while(current!= null){
			System.out.print(current.data + "--> ");
			current = current.next;
		}
		System.out.println("null");
	}
	
	
}