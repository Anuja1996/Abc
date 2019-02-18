package jbk;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapTest {
	public static void main(String[] args) {
		HashMap<Integer, String> hm=new HashMap<>();
		hm.put(1, "Ind");
		hm.put(2,"Aus");
		
		hm.put(3,"Eng");
		hm.put(4,"Aus");		
		hm.put(4,"Ind");
		hm.put(5,"Us");
		hm.put(6,"Us");

		System.err.println(hm);
		Set s=hm.keySet();
		Iterator itr=s.iterator();
		while(itr.hasNext()){
			//System.err.println("values of iterator"+itr.next());
			int key=(Integer) itr.next();
			System.err.println("key:"+key);
			System.err.println("value:"+hm.get(2));
			
		}
		
		




	}

}
