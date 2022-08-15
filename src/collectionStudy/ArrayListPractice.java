package collectionStudy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListPractice {

	public static void main(String[] args)
	{
		ArrayList al= new ArrayList();// object
		
		al.add("Khushi");
		al.add(200);
		al.add(null);
		al.add(null);
		al.add('K');
		al.add("Khushi");
		al.add(12.32);
		System.out.println(al);
		
		System.out.println(al.get(1));
		System.out.println(al.size());
		System.out.println(al.indexOf(12.32));
		System.out.println(al.lastIndexOf("Khushi"));
		System.out.println(al.contains(200));
		System.out.println(al.remove(0));
		System.out.println(al);
		al.add("Tejaswini");
		System.out.println(al);
		al.add(2, "Velocity");
		System.out.println(al);
		System.out.println(al.remove(null));
		System.out.println(al);
		System.out.println("====================================");
		// for loop
		for(int i=0;i<=6;i++)
		{
			System.out.println(al.get(i));
		}
		System.out.println("====================================");
         
		//for each loop
		for(Object a:al)
		{
			
			System.out.println(a);
			
		}
		System.out.println("====================================");

		//iterator
		Iterator it = al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("====================================");

		//list it
		ListIterator li = al.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		
		

	}

}
