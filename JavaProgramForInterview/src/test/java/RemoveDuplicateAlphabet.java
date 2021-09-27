import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateAlphabet {

	public static void main(String[] args) {
		
		String str="elephant";
		System.out.println(removeDuplicate(str));
	}
	
	public static String removeDuplicate(String str) {
		Set<Character> set= new HashSet<Character>();
	
		StringBuffer sf= new StringBuffer();
		for(int i=0; i<str.length(); i++) {
			Character c=str.charAt(i);
			if(!set.contains(c)) {
				set.add(c);
				sf.append(c);
			}
		}
		
		return sf.toString();
	}
}
