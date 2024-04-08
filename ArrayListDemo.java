package com.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
	
	// Collection --> List , Set, Queue
	// List --> ArrayList , LinkedList
	
	public static void main(String[] args) {
		// AL --> Insertion order maintains, duplicates accepts
		
		// Test t = new Test();   creating an object
		
		ArrayList al = new ArrayList();  // Here we are creating  object for ArrayList because these methods(eg.add,add all methods) are instance methods I cannot access instance methods without an object so, we are creating an object

		//List al1 = new ArrayList();      // parent class reference variable can hold child class object.
		
		al.add("priya");
		al.add(24);
		al.add("siva");
		al.add(true);
		al.add(13.3);
		al.add(24);
		al.add("siva");
		al.add(true);
		
		al.add(0,false); // it stores data at starting based on index which we have given
		
		// in arraylist generally data is added at the end
		// if we want to add data from the starting then use index, array index starts from 0
		System.out.println(al);
		
	}

}
