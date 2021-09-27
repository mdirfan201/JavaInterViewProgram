import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapConcepts {

	/**
	 * What is HashMap?
	 * 1.It does not maintain any indexing and not maintaining any order
	 * 2.Store values on the basis of Key And Value format 	<Key,V>
	 * 3. HashMap cannot contain any duplicate key 
	 * 4. HashMap can store multiple of null values but only one null keys
	 * 5. HashMap is not thread-safe, It is not synchronized /but HashTable is synchronized
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, String> capitalMap= new HashMap<String, String>();
		capitalMap.put("India", "NewDelhi");
		capitalMap.put("USA", "Washington DC");
		capitalMap.put("UK", "London");
		capitalMap.put("UK", "London11");
		capitalMap.put(null, "Karachi");
		capitalMap.put(null, "Dubai");
		capitalMap.put("Russia", null);
		capitalMap.put("Italy", null);
		capitalMap.put("France", null);
		capitalMap.remove("France");
		capitalMap.remove("Italy", null);
		
		System.out.println(capitalMap.get("USA"));
		System.out.println(capitalMap.get("Germany"));
		System.out.println(capitalMap.get("UK"));
		System.out.println(capitalMap.get(null));
		System.out.println(capitalMap.get("Russia"));
		
		
		
		//Iterator: over the keys: by using Keyset();
		System.out.println("**********By using keySet*******");
		Iterator<String>it= capitalMap.keySet().iterator();
		while(it.hasNext()) {
			String key=it.next();
			String value=capitalMap.get(key);
			System.out.println("Keys = "+ key + " Value = " + value);
		}
		
		//Iterator: over the keys: by using entrySet();
		System.out.println();
		System.out.println("**********By using EntrySet*******");
		Iterator<Entry<String, String>>it1= capitalMap.entrySet().iterator();
		
		while(it1.hasNext()) {
			Entry<String, String> entry=	it1.next();
			System.out.println("Keys = "+ entry.getKey() + " and Value = " + entry.getValue());
		}
		
		
	}

}
