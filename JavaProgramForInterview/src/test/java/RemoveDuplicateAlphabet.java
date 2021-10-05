import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateAlphabet {

	public static void main(String[] args) {
		
		String str="elephanthanttt";
		System.out.println(removeDuplicate(str));
		
		//Approach1:
		StringBuffer sb= new StringBuffer();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			int indx=str.indexOf(ch, i+1);
			if(indx==-1) {
				sb.append(ch);
			}
		}
		
		System.out.println("*********** :"+sb);
		
		//Approach:3
		char[] arr=str.toCharArray();
		StringBuilder sbd= new StringBuilder();
		for(int i=0;i<arr.length;i++) {
			boolean repated= false;
			for(int j=i+1;j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					repated=true;
					break;
				}
			}
			if(!repated) {
				sbd.append(arr[i]);
			}
		}
		System.out.println("StringBulider: "+sbd);
	}
	
	
	
	//Approach2
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

/*
StringBuffer sb= new StringBuffer();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			int idx=str.indexOf(ch, i+1);
			if(idx==-1) {
				sb.append(ch);
				
			}
		}
		System.out.println(sb);

*/

