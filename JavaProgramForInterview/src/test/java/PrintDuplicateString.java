import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PrintDuplicateString {

	public static void main(String[] args) {
		printDuplicateCharacters(null);
		printDuplicateCharacters("");
		printDuplicateCharacters("A");
		printDuplicateCharacters("Irfan");
		printDuplicateCharacters("JavaTPoint");
		printDuplicateCharacters("JavatPoint");
		printDuplicateCharacters("10000");
		printDuplicateCharacters("007227");
		

	}
	
	public static void printDuplicateCharacters(String str) {
		
		if(str==null) {
			System.out.println("NULL String");
			return;
		}if(str.isEmpty()) {
			System.out.println("Empty String ");
		}if(str.length()==1) {
			System.out.println("Single Chr String /Only One Character is Present :" + str);
			return;
		}
		
		char words[]= str.toCharArray();
		
		Map<Character, Integer> charMap= new HashMap<Character, Integer>();
		for(Character ch:words) {
			if(charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch)+1);
			}else {
				charMap.put(ch, 1);
			}
		}
		
		//Print the map:-
		Set<Map.Entry<Character, Integer>> entrySet =charMap.entrySet();
		
		for(Map.Entry<Character, Integer> entry:entrySet) {
			if(entry.getValue()>1) {
				//System.out.println("Printing Duplicate String are------:");
				System.out.println(entry.getKey() + " : " + entry.getValue());
			}
			
		}
	}

}
