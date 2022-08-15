package collectionStudy;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class HashSetStudy {

	public static void main(String[] args) 
	{
		HashSet hs=new HashSet();
		
		hs.add("Pune");
		hs.add(true);
		hs.add(123);
		hs.add(99.99);
		hs.add(123);
		hs.add('A');
		hs.add(null);
		hs.add(null);
		
		System.out.println(hs);		
		
		System.out.println("=============================");
		
		// for each loop
		for(Object m:hs)
		{
			System.out.println(m);
		}
		System.out.println("=============================");
		
		//iterator
		 Iterator it = hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("=============================");

		//listiterator
	

	}

}
