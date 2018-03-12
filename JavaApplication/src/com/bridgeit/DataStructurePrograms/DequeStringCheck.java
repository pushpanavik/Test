package com.bridgeit.DataStructurePrograms;

import java.util.NoSuchElementException;

//question no-5 Palindrome Checker
public class DequeStringCheck {

int size;
Nodechar rear,front;

DequeStringCheck()
{
  size = 0;
  front = null;
  rear = null;
}
boolean isEmpty()
{
  return (size == 0);
}

void insertAtFront(char val)
{
     Nodechar newPtr = new Nodechar(val,null);
  size++;

  if( front == null)
  {
    front = newPtr;
    rear = front;
  }
  else
  {
    newPtr.setLink(front);
    front = newPtr;
  }

}

void insertAtRear(char val)
{
  Nodechar newPtr = new Nodechar(val,null);
  size++;

  if(rear == null)
  {
    rear = newPtr;
    front = newPtr;
  }
  else
  {
    rear.setLink(newPtr);
    rear = newPtr;
  }
}

char removeAtFront()
{
  if(isEmpty())
  {
    System.out.println("Empty Deque");
    throw new NoSuchElementException("");
  }
  Nodechar temp = front;
  front = front.getLink();
  char data1 = temp.getData();
  if(front == null)
  {
    rear = null;
  }
  size--;

  return data1;
}

char removeAtRear()
{
  if(isEmpty())
  {
    System.out.println("Empty Deque");
    throw new NoSuchElementException("");
  }

  char data1 = rear.getData();
  Nodechar temp,temp1;

  temp1 = temp = front;

  while(temp!=rear)
  {
    temp1 = temp;
    temp = temp.getLink();
  }
  rear = temp1;

  rear.setLink(null);

  size--;
  return data1;
}

void display()
{
  if(isEmpty())
  {
    System.out.println("Empty Deque");
    return ;
  }
  Nodechar temp = front;

  while( temp!= null )
  {
    System.out.print(temp.getData()+"\t");
    temp = temp.getLink();
  }
  System.out.println();
}
}