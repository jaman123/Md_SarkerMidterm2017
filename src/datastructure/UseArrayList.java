package datastructure;

import databases.ConnectDB;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

	public static void main(String[] args) throws Exception {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */

		ArrayList<Object> list = new ArrayList<>();
		list.add("Jaman");
		list.add("Polash");
		list.add("Ibrahim");
		list.add("Sonia");
		list.add("Kahina");
		list.add("Sukantha");
		list.add("Asif");

		System.out.println(" After Insertion :");
		System.out.println(list);


		list.remove(0);
		list.remove("Asif");
		list.remove(list.size()-1);// Removing the last Items

		System.out.println(" After Deletion :");

		// ForEach Loop
		for (Object n : list){
			System.out.println(n);

		}
		// Use Iterator
		System.out.println();
		Iterator it = list.iterator();
		while (it.hasNext()){
			System.out.println(it.next());
		}
		ConnectDB connectDB = new ConnectDB();
		//create the table in pnt called 'tableName'
		// ex: create table Pizza(Ingredients VARCHAR(20));
		connectDB.InsertDataFromArrayListToMySql(list,"Mentoring","Name");
		connectDB.readDataBase("Mentoring","Name");

	}

}
