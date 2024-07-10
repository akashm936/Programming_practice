//package com.arrays;

public class StoreDriver extends Store{

	public Store s;
	
	public Store getStore() {
		return s;
	}
	
	StoreDriver(Store s){
		this.s=s;
	}
	public static void main(String[] args) {
		
		StoreDriver st = new StoreDriver(new Store());
		
		System.out.println("Information about Store :");
		System.out.println("Name of Store : "+st.getStore().getName());
		System.out.println("Rent of Store : "+st.getStore().getRent());
	}

}
