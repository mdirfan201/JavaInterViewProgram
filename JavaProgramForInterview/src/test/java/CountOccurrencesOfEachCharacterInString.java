import java.util.HashMap;
import java.util.Map;

public class CountOccurrencesOfEachCharacterInString {

	public static void main(String[] args) {
		getcharCount("Mohammed Irfan");
		
		
		
	}

	public static void getcharCount(String name) {
		Map<Character, Integer>charMap= new HashMap<Character, Integer>();
		char strArray[]=name.toCharArray();
		for(char c:strArray) {
			//if(!String.valurOf(c).isBlank()){
			if(charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c)+1);
			}else {
				charMap.put(c, 1);
			}
		}
		System.out.println(name + " : "+charMap);
	}
}
