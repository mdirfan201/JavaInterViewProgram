import java.util.Arrays;

public class StringsAreAnagramOrNot {

	/**
	 * LISTEN : SILENT
	 * LIVES : ELVIS
	 * CAT: ACT
	 * RAT : ART
	 * @param args
	 */
	public static void main(String[] args) {
		isAnagram("cat", "act ");
		isAnagram("rat", "art");
	}

	public static void isAnagram(String s1, String s2) {
		String str1=s1.replaceAll("\\s","");
		String str2=s2.replaceAll("\\s","");

		if(str1.length() !=str2.length()) {
			System.out.println("This not Anagram");
		}else {
			char c1[]= str1.toLowerCase().toCharArray();
			char c2[]=str2.toLowerCase().toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			System.out.println("This Anagram ::"+Arrays.equals(c1, c2));
		}
	}



}
