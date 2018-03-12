package com.bridgeit.DataStructurePrograms;

public class Nodechar {

	  char data;
	  Nodechar link;

	  Nodechar()
	  {
	    data = ' ';
	    link = null;
	  }
	  Nodechar(char c, Nodechar l)
	  {
	    data = c;
	    link = l;
	  }
	  void setLink(Nodechar l)
	  {
	    link = l;
	  }
	  void setData(char val)
	  {
	    data = val;
	  }
	  Nodechar getLink()
	  {
	    return link;
	  }
	  char getData()
	  {
	    return data;
	  }

}
