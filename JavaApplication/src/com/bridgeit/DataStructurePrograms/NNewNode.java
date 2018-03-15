package com.bridgeit.DataStructurePrograms;

class NNewNode{				/* creating a node */
    protected int data;
    protected NNewNode link;
    public NNewNode()
    {
        link = null;
        data = 0;
    }

    public NNewNode(int val,NNewNode n)
    {
        data = val;
        link = n;
    }
    public void setLink(NNewNode n)
    {
        link = n;
    }


    public void setData(int val)
    {
        data = val;
    }
    public NNewNode getLink()
    {
       return link;
    }
    public int getData()
    {
        return data;
    }
}