package collectionStudy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListStudy {

	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();  //object created of ArrayList
		
		al.add("Velocity");
		al.add(199);
		al.add(99.99);
		al.add(null);
		al.add(null);
		al.add("Velocity");
		al.add(true);
		al.add('A');
		
		System.out.println(al);
		System.out.println("============================================");
		System.out.println(al.size());
		System.out.println("===========");
		System.out.println(al.get(0));
		System.out.println(al.indexOf('A'));
		System.out.println(al.indexOf("Velocity"));
		System.out.println(al.lastIndexOf("Velocity"));
		System.out.println(al.contains("Velocity"));
		System.out.println(al.contains("velocity"));
		System.out.println(al.remove(0));
		System.out.println("============================================");
		System.out.println(al);
		System.out.println("============================================");
		al.add(1, "Pune");
		System.out.println(al);
		System.out.println("============================================");
		System.out.println(al.remove(null));
		System.out.println(al);
		System.out.println("============================================");
		
		System.out.println(al.get(0));
		System.out.println(al.get(1));
		System.out.println(al.get(2));
		System.out.println(al.get(3));
		System.out.println("============================================");
		System.out.println("============================================");

		
		//printing element using for loop(static or hard coding)
		System.out.println("printing element using for loop(static or hardcoding)");
		for(int i=0;i<=6;i++)
		{
			System.out.println(al.get(i));
		}
		System.out.println("============================================");
		
		// printing element using for loop(dynamic coding)
		System.out.println("printing element using for loop(dynamic coding)");
		for(int i=0;i<=al.size()-1;i++)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println("============================================");
		System.out.println("============================================");

		
		//for each loop
		System.out.println("for each loop ");
		
		for(Object m:al)
		{
			System.out.println(m);
		}
		
		System.out.println("============================================");
		
		//iterator
		System.out.println("iterator output");
		
		Iterator it = al.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("============================================");
		
		//listiterator
		System.out.println("listiterator output");
		
		ListIterator li = al.listIterator();
		
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		System.out.println("============================================");


		


		


	}

}
