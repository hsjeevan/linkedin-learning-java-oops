package com.linkedin.learning.modArrayList;

public class ModArrayListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ModArrayList listy = new ModArrayList();
		listy.add(0);	
		listy.add(10);	
		listy.add(20); 	
		listy.add(30);	
		
		 System.out.println(listy.getUsingMod(1));
		 System.out.println(listy.getUsingMod(-2));
		 System.out.println(listy.getUsingMod(40));
	}

}
