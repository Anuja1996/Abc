package jbk;

import java.util.ArrayList;

public class ImpPoints {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList();
		al.add(45);
		al.add(65);//it will give error in 1.4, it is correct in 1.5 compiler
		
		/*     al.add(Index, Element);    */ 
		/*here we can add element at specific index or location*/
		al.add(1,23);
		
		
		//cavaj is a decompiler we can use it to see byte code to english coversion, here we have to give .class fileand it will convert in java english code with resect to compiler version-
		
	
	//al.add(new Integer(45));  //this id wrapping to 45 to understand it is integer, it is in 1.4
		
		//ArrayList al1=new ArrayList();// error in 1.4 and correct in 1.5
		
		for(int pp:al){
			System.err.println(pp);
		}
	
		
}
	
}
