package jbk;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ArrayList_2 {
public static void main(String[] args) {
	ArrayList<Integer> al=new ArrayList<Integer>();
	al.add(12);
	al.add(13);
	al.add(12);
	al.add(15);
	al.add(16);
	al.add(12);
	al.add(18);
	System.err.println(al);
	System.out.println(al.size());
	HashSet<Integer> hs=new HashSet<Integer>(al);
	System.out.println(hs);
	System.out.println(al.get(2));
	
	boolean bb=al.isEmpty();
	System.out.println(bb);
	
	List<Integer> ll=al.subList(2,5);
	System.out.println(ll);
}
}