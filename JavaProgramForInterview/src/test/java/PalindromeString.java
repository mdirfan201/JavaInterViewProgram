import java.util.Scanner;

public class PalindromeString {

	/**
	 * Palindrome String :MADAM =MADAM
	 * @param args
	 */
	public static void main(String[] args) {
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter the String :: ");
//		String str1=sc.next();
		String str="WELCOME";
		String Org_Str=str;
		String rev="";
		int len=str.length();//7
		for(int i=len-1; i>=0; i--) {
			rev=rev + str.charAt(i);
			
		}
		System.out.println("Actual String is:: "+ str);
		System.out.println("Revese String is:: "+ rev);
		System.out.println();
		if(Org_Str.equals(rev)) {
			System.out.println(Org_Str +"is a Palindrom String");
		}else {
			System.out.println(Org_Str +"is not a Palindrom String");
		}
	}

}
