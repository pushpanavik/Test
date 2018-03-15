package com.bridgeit.DataStructurePrograms;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

class LinkedListClass						//linked list to arrange the numbers in ascending order.
{
    protected NNewNode start;
   protected NNewNode end ;
    public int size ;
    
    public LinkedListClass()
    {
        start = null;
        end = null;
        size = 0;
    }


    public void insertAtEnd(int val)
    {
        NNewNode nptr = new NNewNode(val,null);
        size++ ;
        if(start==null)
        {
            start=nptr;
            end = start;
        }
        else
        {
            end.setLink(nptr);
            end = nptr;

        }

    }

    public void deleteValue(int key)
    {
      NNewNode temp = start, prev = null;


        if (temp != null && temp.getData() == key)
        {
            start = temp.getLink();
            return;
        }


        while (temp != null && temp.getData() != key)
        {
            prev = temp;
            temp = temp.getLink();
        }


        if (temp == null)
          return;


        prev.setLink(temp.getLink());
        size --;
        }



    public void display()
    {
        System.out.print("\nLinked List = ");
        if (size == 0)
        {
            System.out.print("empty\n");
            return;
        }
        if (start.getLink() == null)
        {
            System.out.println(start.getData() );
            return;
        }

        NNewNode ptr = start;
        System.out.print(start.getData()+ "->");
        ptr = start.getLink();
        while (ptr.getLink() != null)
        {
           System.out.print(ptr.getData()+ "->");
            ptr = ptr.getLink();
        }
        System.out.print(ptr.getData()+ "\n");
    }

    public void sort(NNewNode head) {
     if (size > 1) {
         for (int i = 0; i < size; i++ ) {
             NNewNode currentNode = head;
             NNewNode next = head.getLink();

             for (int j = 0; j < size - 1; j++) {
                 if (currentNode.getData() > next.getData()) {
                     int temp = currentNode.getData();
                     currentNode.data = next.data;
                     next.data = temp;
                 }
                 currentNode = next;
                 next = next.getLink();
             }
         }
     }
    }

    public void updateFile(File file1) throws IOException
    {
      FileOutputStream fos = new FileOutputStream(file1);
      NNewNode temp=start;

      while(temp!=null)
      {

       byte b[] = String.valueOf(temp.getData()).getBytes();

         fos.write(b);
         fos.write(' ');

      temp = temp.getLink();

      }

        fos.close();

    }

    public int searchList(int key)
    {
      int flag = 0;
      NNewNode temp = start;

      while(temp  != null)
      {
        if( temp.getData() == key )
        {
          flag =1;
        }
        temp = temp.getLink();
      }
      return flag;
    }



}

