package jbk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList_1 {
public static void main(String[] args) {
	ArrayList<Integer> al=new ArrayList();
	
	al.add(11);
	al.add(12);
	al.add(13);
	al.add(14);
	al.add(12);
	al.add(35);

	
System.err.println(al.size());

System.err.println(al);

//ordinary for loop

for(int i=0;i<al.size();i++){
	int ele=al.get(i);
System.err.println(ele);

}

//For each loop 1.5v

for(int x:al){
	System.err.println(x);
	
}

//Iterator

Iterator<Integer> itr=al.iterator();
while(itr.hasNext()){
	int pqr=itr.next();
	System.err.println(pqr);
}
//ListIterator

ListIterator<Integer> ltr=al.listIterator();
while(ltr.hasNext()){
	int rst=ltr.next();
	System.err.println(rst);
}
		
}
}

