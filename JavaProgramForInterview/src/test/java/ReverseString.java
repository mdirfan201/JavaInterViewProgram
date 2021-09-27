
public class ReverseString {

	/**
	 * How to reverse String
	 * Input eg: String str="ABCD";
	 * Output :DCBA
	 * 
	 * Difference b/w String and String buffer(SB):
	 * 1. String is Immutable and StringBuffer is mutable
	 * 2. String class we don't have reverse function but in StringBuffer we have reverse function
	 * 
	 */
	
	public static void main(String[] args) {
		
		String str="Selenium";
		String rev="";	
		System.out.println("Actual  String is:: "+ str);
		
		//1. using for loop
		int len=str.length();//7
		for(int i=len-1; i>=0; i--) {
			rev=rev + str.charAt(i);
			//System.out.println("Actual String is:: "+ rev);
		}
		System.out.println("Reverse String is:: "+ rev);
		
		//2. using String Buffer Class
		StringBuffer sf= new StringBuffer(str);
		System.out.println("-------------Reverse using String Buffer-------------");
		System.out.println(sf.reverse());
	}
	
}
