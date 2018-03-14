package com.bridgeit.DataStructurePrograms;
 
public class CashCounterQueue {
	
	private int accountnumber;
    private int initialbal;
    private String name;
    
	public CashCounterQueue() {
		
	}
	public int getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}
	public int getInitialbal() {
		return initialbal;
	}
	public void setInitialbal(int initialbal) {
		this.initialbal = initialbal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public CashCounterQueue(int accountnumber,String name,int initialbal) {
		super();
		this.accountnumber = accountnumber;
		this.initialbal = initialbal;
		this.name = name;
	}
	
@Override
public String toString() {
	return "CashCounterQueue [name=" + name+",accountnumber="+ accountnumber+ ", initialbal= "+ initialbal+"]";

}
}


