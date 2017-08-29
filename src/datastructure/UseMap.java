package datastructure;

import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */
		List<Object> flyingAnimal  = new ArrayList();

		flyingAnimal.add("Eagle");
		flyingAnimal.add("Dove");

		List<Object> landAnimal = new ArrayList<>();

		landAnimal.add("Tiger");
		landAnimal.add("Wolf");

		List<Object> waterAnimal = new ArrayList<>();

		waterAnimal.add("Rhui");
		waterAnimal.add("Tilapia");

		Map<Object,List<Object>> map = new LinkedHashMap<>();

		map.put("Animal lives in Air :", flyingAnimal);
		map.put("Animal lives in land :",landAnimal);
		map.put("Animal lives in water :",waterAnimal);

	// ------------------
		System.out.println("After Insertion:");
		System.out.println(" For Each Loop: \n");
		for(Map.Entry entry : map.entrySet()){
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		System.out.println("Using Iterator: \n");
		Iterator it = map.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry entry = (Map.Entry)it.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

}
