package com.tnsif.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetOperations 
{
   public static void operations() 
  {
	Set<Integer>numSet=new HashSet<Integer>();
	//add an element
	numSet.add(12);
	numSet.add(null);
	System.out.println("elemets are"+numSet);
	//add a list of numbers to the set
	numSet.addAll(Arrays.asList(new Integer[] {1,4,6,7,8}));
	System.out.println(" set elements  are "+numSet);
	//size
	System.out.println("size of the elements are "+numSet.size());
	System.out.println("total of the elements are "+numSet.hashCode());//total
	System.out.println("list elements are empty or not "+numSet.isEmpty());//to check empty or not
	//create a new set class and initialize with list of elements
	Set<Integer>oddSet=new HashSet<Integer>();
	oddSet.addAll(Arrays.asList(new Integer [] {1,2,3,5,7,9}));
	System.out.println("set elements are "+oddSet);
	//contains
	System.out.println(" numset contains element 3"+numSet.contains(3));
	System.out.println("odd set contains element 1"+oddSet.contains(1));
	//Intersection 
	Set<Integer>set_intersection=new HashSet<Integer>(numSet);
	set_intersection.retainAll(oddSet);
	System.out.println("Intersection"+set_intersection);
	//difference
	Set<Integer>set_difference=new HashSet<>(numSet);
	set_difference.removeAll(oddSet);
	System.out.println("difference is"+set_difference);
	//union
	Set<Integer> set_union=new HashSet<>(oddSet);
	set_union.addAll(numSet);
	System.out.println("union  "+set_union);
	//call iterator
	Iterator<Integer>iter=numSet.iterator();
	System.out.println("elements of iterator are");
	while(iter.hasNext())
	{
		System.out.println(iter.next());
	}
	Iterator<Integer>iter1=oddSet.iterator();
	System.out.println("elements of iterator are");
	while(iter1.hasNext())
	{
		System.out.println(iter1.next());
	}
   }
}
